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

	@Column(name = "customer_name")
	private String customerName;

	@Column(name = "customer_sex")
	private String sex;

	@Column(name = "customer_mobile")
	private String mobileNumber;

	@Column(name = "customer_email")
	private String email;

	@Column(name = "request_status")
	@Type(type = "statusTypeEnum")
	private StatusEnum status;

	@Column(name = "customer_docs_path")
	private String userDirectory;

	private Date created_date;

	private Date updated_date;

	@Transient
	List<Document> docs = new ArrayList<Document>();

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

	public StatusEnum getStatus() {

		return status;
	}

	public void setStatus( StatusEnum status ) {

		this.status = status;
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
