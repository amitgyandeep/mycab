package com.prj.action;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.interceptor.RequestAware;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.opensymphony.xwork2.ActionSupport;
import com.prj.model.ApplicationConstants;
import com.prj.model.Customer;
import com.prj.model.Document;
import com.prj.model.FileTypeEnum;
import com.prj.model.StatusEnum;
import com.prj.model.User;
import com.prj.service.interfaces.ICustomerService;
import com.prj.service.interfaces.IDocumentService;
import com.prj.service.interfaces.IMailService;
import com.prj.service.interfaces.ISmsService;
import com.prj.service.interfaces.IUserService;
import com.prj.service.serviceHelper.SMSMessageHelper;

@SuppressWarnings("serial")
public class RegistrationAction extends ActionSupport implements RequestAware {

	private Customer customer;

	private ICustomerService customerService;

	private IMailService mailService;

	private IUserService userService;

	private IDocumentService documentService;

	private ISmsService smsService;

	private File adhar;

	private String adharFileName;

	private String adharContentType;

	private File passport;

	private String passportFileName;

	private String passportContentType;

	private File drivingLicence;

	private String drivingLicenceFileName;

	private String drivingLicenceContentType;

	private Map<String,Object> request;

	private Customer customerDB;

	private String inputText;

	private String ajaxResponse;

	private static final Logger LOGGER = LoggerFactory.getLogger( RegistrationAction.class );

	public String registerCustomer() {

		try {
			if ( verifyEmailAvailability( customer.getEmail() ) ) {

				if ( verifyMobileNumberAvailability( customer.getMobileNumber() ) ) {
					String userDirectory = customer.getCustomerName() + System.currentTimeMillis();

					customer.setStatus( StatusEnum.NEW );
					customer.setUserDirectory( userDirectory );

					customerDB = customerService.save( customer );

					LOGGER.info( "NEW CUSTOMER REQUEST SAVED" );

					String smsText = SMSMessageHelper.getRegisterMessage( customerDB.getCustomerName() );

					smsService.sendSms( smsText , "91" + customerDB.getMobileNumber() , ApplicationConstants.CLIENT_ID , ApplicationConstants.SYSTEM_ID ,
						ApplicationConstants.VEHICLE_ID );

					LOGGER.info( "NEW CUSTOMER REQUEST SMS SENT" );

					mailService.sendEmail( "Requested for OSD " , smsText , customerDB.getEmail() , ApplicationConstants.SYSTEM_ID , ApplicationConstants.VEHICLE_ID );

					LOGGER.info( "NEW CUSTOMER REQUEST EMAIL SENT" );

					fileUpload( userDirectory , customerDB );

					LOGGER.info( "NEW CUSTOMER REQUEST FILE UPLOADED" );

					request.put( "saved" , "saved" );
					return SUCCESS;
				} else {
					request.put( "inuseMobile" , "inuseMobile" );
					request.put( "customer" , customer );
					return INPUT;
				}

			} else {
				request.put( "inuseEmail" , "inuseEmail" );
				request.put( "customer" , customer );
				return INPUT;
			}
		} catch ( Exception e ) {

			request.put( "errorOccured" , "errorOccured" );
			LOGGER.info( "error wile creating customer : " + e.getMessage() );
			return INPUT;
		}
	}

	private boolean verifyMobileNumberAvailability( String mobileNumber ) {

		if ( customerService.getCustomerByMobileNumber( mobileNumber ) == null ) {

			return true;
		} else {

			return false;
		}
	}

	public String getCustomerList() {

		List<Customer> customerList = customerService.getAllCustomers();
		request.put( "customerList" , customerList );

		return SUCCESS;
	}

	public void fileUpload( String userDirectory , Customer customer ) {

		File destFile;

		if ( adhar != null ) {
			String path = userDirectory + File.separator + "ADHAR" + File.separator + adharFileName;
			destFile = new File( ApplicationConstants.FILE_PATH_DIR + File.separator + path );
			fileUpload( adhar , destFile , customer , path , FileTypeEnum.ADHAR );
			LOGGER.info( "ADHAR FILE UPLOADED" );
		}
		if ( passport != null ) {
			String path = userDirectory + File.separator + "PASSPORT" + File.separator + passportFileName;
			destFile = new File( ApplicationConstants.FILE_PATH_DIR + File.separator + path );
			fileUpload( passport , destFile , customer , path , FileTypeEnum.PASSPORT );

			LOGGER.info( "PASSPORT FILE UPLOADED" );
		}
		if ( drivingLicence != null ) {
			String path = userDirectory + File.separator + "DRIVING_LICENCE" + File.separator + drivingLicenceFileName;
			destFile = new File( ApplicationConstants.FILE_PATH_DIR + File.separator + path );
			fileUpload( drivingLicence , destFile , customer , path , FileTypeEnum.DRIVING_LICENCE );
			LOGGER.info( "DRIVING LICENCE FILE UPLOADED" );
		}
	}

	/**
	 * 
	 * @param file
	 * @param destString
	 * @param customer
	 * @param path
	 * @param fileTypeEnum
	 */
	public void fileUpload( File file , File destString , Customer customer , String path , FileTypeEnum fileTypeEnum ) {

		try {
			FileUtils.copyFile( file , destString );
			Document doc = new Document();
			path = path.replace( "\\" , "/" );
			doc.setCustomer( customer );
			doc.setFileType( fileTypeEnum );
			doc.setPath( path );
			documentService.save( doc );
		} catch ( IOException e ) {

			e.printStackTrace();
		}
	}

	public String approveUser() {

		Customer customer = customerService.get( Integer.parseInt( inputText ) );

		User user = userService.createUser( customer );

		if ( user != null ) {

			customer.setStatus( StatusEnum.APPROVED );

			customerService.save( customer );

			LOGGER.info( "Customer get Approved" );

			String smsText = SMSMessageHelper.getActivateMessage( customer.getCustomerName() );

			smsService.sendSms( smsText , "91" + customer.getMobileNumber() , ApplicationConstants.CLIENT_ID , ApplicationConstants.SYSTEM_ID ,
				ApplicationConstants.VEHICLE_ID );

			LOGGER.info( "SMS SENT FOR APPROVED CUSTOMER" );

			mailService.sendEmail( "User Aprroved For OSD" , smsText + ". Your password is " + user.getPassword() , customer.getEmail() , ApplicationConstants.SYSTEM_ID ,
				ApplicationConstants.VEHICLE_ID );

			LOGGER.info( "EMAIL SENT FOR APPROVED CUSTOMER" );

			request.put( "newUser" , user );
			return SUCCESS;

		} else {
			return INPUT;
		}

	}

	public boolean verifyEmailAvailability( String inputText ) {

		if ( customerService.isCustomerByEmailId( inputText ) ) {

			return true;
		} else {

			return false;
		}

	}

	public Customer getCustomer() {

		return customer;
	}

	public void setCustomer( Customer customer ) {

		this.customer = customer;
	}

	public ICustomerService getCustomerService() {

		return customerService;
	}

	public void setRequest( Map<String,Object> request ) {

		this.request = request;
	}

	public String getInputText() {

		return inputText;
	}

	public void setInputText( String inputText ) {

		this.inputText = inputText;
	}

	public IMailService getMailService() {

		return mailService;
	}

	public void setMailService( IMailService mailService ) {

		this.mailService = mailService;
	}

	public ISmsService getSmsService() {

		return smsService;
	}

	public void setSmsService( ISmsService smsService ) {

		this.smsService = smsService;
	}

	public void setCustomerService( ICustomerService customerService ) {

		this.customerService = customerService;
	}

	public File getAdhar() {

		return adhar;
	}

	public void setAdhar( File adhar ) {

		this.adhar = adhar;
	}

	public String getAdharFileName() {

		return adharFileName;
	}

	public void setAdharFileName( String adharFileName ) {

		this.adharFileName = adharFileName;
	}

	public String getAdharContentType() {

		return adharContentType;
	}

	public void setAdharContentType( String adharContentType ) {

		this.adharContentType = adharContentType;
	}

	public File getPassport() {

		return passport;
	}

	public void setPassport( File passport ) {

		this.passport = passport;
	}

	public String getPassportFileName() {

		return passportFileName;
	}

	public void setPassportFileName( String passportFileName ) {

		this.passportFileName = passportFileName;
	}

	public String getPassportContentType() {

		return passportContentType;
	}

	public void setPassportContentType( String passportContentType ) {

		this.passportContentType = passportContentType;
	}

	public File getDrivingLicence() {

		return drivingLicence;
	}

	public void setDrivingLicence( File drivingLicence ) {

		this.drivingLicence = drivingLicence;
	}

	public String getDrivingLicenceFileName() {

		return drivingLicenceFileName;
	}

	public void setDrivingLicenceFileName( String drivingLicenceFileName ) {

		this.drivingLicenceFileName = drivingLicenceFileName;
	}

	public String getDrivingLicenceContentType() {

		return drivingLicenceContentType;
	}

	public void setDrivingLicenceContentType( String drivingLicenceContentType ) {

		this.drivingLicenceContentType = drivingLicenceContentType;
	}

	public Map<String,Object> getRequest() {

		return request;
	}

	public IUserService getUserService() {

		return userService;
	}

	public void setUserService( IUserService userService ) {

		this.userService = userService;
	}

	public IDocumentService getDocumentService() {

		return documentService;
	}

	public void setDocumentService( IDocumentService documentService ) {

		this.documentService = documentService;
	}

}