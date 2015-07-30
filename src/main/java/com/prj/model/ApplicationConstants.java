package com.prj.model;

public class ApplicationConstants {

	public static final String EMAIL_URL = "http://www.t4udevice.com:8080/TelematicsRESTService/services/ServiceProcess/pushEmailDetails?Subject={subject}&Body={body}&EmailIds={emailList}&SystemId={systemId}&RegistrationNo={registrationNo}";

	public static final String SMS_URL = "http://www.t4udevice.com:8080/TelematicsRESTService/services/ServiceProcess/pushSmsDetails?PhoneNo={phoneNumber}&Message={smsBody}&ClientId={clientId}&SystemId={systemId}&VehicleNo={vehicleNo}";

	public static final Integer CLIENT_ID = 4318;

	public static final Integer SYSTEM_ID = 246;

	public static final Integer VEHICLE_ID = 12;

	/*public static final String FILE_PATH_DIR = "D:/CUSTOMER";*/
	public static final String FILE_PATH_DIR = "C:/Users/tejomaya/orangeCabUserDocs";

	/*for demo only*/
	public static final Integer SystemId = 12;

	public static final Integer ClientId = 782;

	public static String getAvailableCarsURL = "http://www.t4udevice.com:8080/TelematicsRESTService/services/ServiceProcess/ getAvailableCars";

	public static String getCarsURL = "http://www.t4udevice.com:8080/TelematicsRESTService/services/ServiceProcess/getCars?SystemId={systemId}&ClientId={clientId}";

	public static String getPreferedCarsURL = "http://www.t4udevice.com:8080/TelematicsRESTService/services/ServiceProcess/ getPrefferedCars";
}
