package com.prj.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Parameter;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

@Entity
@Table(name = "tbl_customer_doc")
@TypeDef(name = "FileTypeEnumMapping", typeClass = GenericEnumUserType.class, parameters = { @Parameter(name = "enumClassName", value = "com.prj.model.FileTypeEnum") ,
	@Parameter(name = "identifierMethod", value = "toInt") , @Parameter(name = "valueOfMethod", value = "fromInt") })
public class Document extends BaseEntity {

	private static final long serialVersionUID = 1L;

	private String path;

	@ManyToOne
	@JoinColumn(name = "customer_id", referencedColumnName = "id")
	private Customer customer;

	@Type(type = "FileTypeEnumMapping")
	private FileTypeEnum fileType;

	public String getPath() {

		return path;
	}

	public void setPath( String path ) {

		this.path = path;
	}

	public FileTypeEnum getFileType() {

		return fileType;
	}

	public void setFileType( FileTypeEnum fileType ) {

		this.fileType = fileType;
	}

	public Customer getCustomer() {

		return customer;
	}

	public void setCustomer( Customer customer ) {

		this.customer = customer;
	}

}
