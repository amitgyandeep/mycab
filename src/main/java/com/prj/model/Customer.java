package com.prj.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.Parameter;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

@SuppressWarnings("serial")
@Entity
@Table(name = "car_customer")
@TypeDef(name = "statusTypeEnum", typeClass = GenericEnumUserType.class, parameters = { @Parameter(name = "enumClassName", value = "com.prj.model.StatusEnum") ,
	@Parameter(name = "identifierMethod", value = "toInt") , @Parameter(name = "valueOfMethod", value = "fromInt") })
public class Customer extends BaseEntity implements Serializable {

	@Column(name = "customer_dob")
	private String dob;

	@Column(name = "customer_dlExpiryDate")
	private Date dlExpiryDate;

	@Column(name = "customer_name")
	private String customerName;

	@Column(name = "customer_sex")
	private String sex;

	@Column(name = "customer_mobile")
	private String mobileNumber;

	@Column(name = "customer_email")
	private String email;

	@Column(name = "customer_address")
	private String address;

	@Column(name = "customer_adhar")
	private String adharNumber;

	@Column(name = "customer_passport")
	private String passportNumber;

	@Column(name = "customer_dl_number")
	private String dlNumber;

	@Column(name = "customer_security_question")
	private String securityQuestion;

	@Column(name = "customer_security_answer")
	private String securityAnswer;

	@Column(name = "customer_contact_person")
	private String contactPerson;

	@Column(name = "customer_contact_number")
	private String contactNumber;

	@Column(name = "customer_pickup_location")
	private String pickupLocation;

	@Column(name = "customer_prefered_car")
	private String preferedCar;

	@Column(name = "dl_issuing_authority")
	private String drivingLicenceauthority;

	@Column(name = "dl_issuing_state")
	private String drivingLicenceLocation;

	@Column(name = "request_status")
	@Type(type = "statusTypeEnum")
	private StatusEnum status;

	@Column(name = "customer_docs_path")
	private String userDirectory;

	private Date created_date;

	private Date updated_date;

	@Transient
	List<Document> docs = new ArrayList<Document>();

	public String getDob() {

		return dob;
	}

	public void setDob( String dob ) {

		this.dob = dob;
	}

	public Date getDlExpiryDate() {

		return dlExpiryDate;
	}

	public void setDlExpiryDate( Date dlExpiryDate ) {

		this.dlExpiryDate = dlExpiryDate;
	}

	public String getCustomerName() {

		return customerName;
	}

	public void setCustomerName( String customerName ) {

		this.customerName = customerName;
	}

	public String getSex() {

		return sex;
	}

	public void setSex( String sex ) {

		this.sex = sex;
	}

	public String getMobileNumber() {

		return mobileNumber;
	}

	public void setMobileNumber( String mobileNumber ) {

		this.mobileNumber = mobileNumber;
	}

	public String getEmail() {

		return email;
	}

	public void setEmail( String email ) {

		this.email = email;
	}

	public String getAddress() {

		return address;
	}

	public void setAddress( String address ) {

		this.address = address;
	}

	public String getAdharNumber() {

		return adharNumber;
	}

	public void setAdharNumber( String adharNumber ) {

		this.adharNumber = adharNumber;
	}

	public String getPassportNumber() {

		return passportNumber;
	}

	public void setPassportNumber( String passportNumber ) {

		this.passportNumber = passportNumber;
	}

	public String getDlNumber() {

		return dlNumber;
	}

	public void setDlNumber( String dlNumber ) {

		this.dlNumber = dlNumber;
	}

	public String getSecurityQuestion() {

		return securityQuestion;
	}

	public void setSecurityQuestion( String securityQuestion ) {

		this.securityQuestion = securityQuestion;
	}

	public String getContactPerson() {

		return contactPerson;
	}

	public void setContactPerson( String contactPerson ) {

		this.contactPerson = contactPerson;
	}

	public String getContactNumber() {

		return contactNumber;
	}

	public void setContactNumber( String contactNumber ) {

		this.contactNumber = contactNumber;
	}

	public String getPickupLocation() {

		return pickupLocation;
	}

	public void setPickupLocation( String pickupLocation ) {

		this.pickupLocation = pickupLocation;
	}

	public String getPreferedCar() {

		return preferedCar;
	}

	public void setPreferedCar( String preferedCar ) {

		this.preferedCar = preferedCar;
	}

	public String getSecurityAnswer() {

		return securityAnswer;
	}

	public void setSecurityAnswer( String securityAnswer ) {

		this.securityAnswer = securityAnswer;
	}

	public StatusEnum getStatus() {

		return status;
	}

	public void setStatus( StatusEnum status ) {

		this.status = status;
	}

	public String getDrivingLicenceauthority() {

		return drivingLicenceauthority;
	}

	public void setDrivingLicenceauthority( String drivingLicenceauthority ) {

		this.drivingLicenceauthority = drivingLicenceauthority;
	}

	public String getDrivingLicenceLocation() {

		return drivingLicenceLocation;
	}

	public void setDrivingLicenceLocation( String drivingLicenceLocation ) {

		this.drivingLicenceLocation = drivingLicenceLocation;
	}

	public String getUserDirectory() {

		return userDirectory;
	}

	public void setUserDirectory( String userDirectory ) {

		this.userDirectory = userDirectory;
	}

	public List<Document> getDocs() {

		return docs;
	}

	public void setDocs( List<Document> docs ) {

		this.docs = docs;
	}

	public Date getCreated_date() {

		return created_date;
	}

	public void setCreated_date( Date created_date ) {

		this.created_date = created_date;
	}

	public Date getUpdated_date() {

		return updated_date;
	}

	public void setUpdated_date( Date updated_date ) {

		this.updated_date = updated_date;
	}

}
