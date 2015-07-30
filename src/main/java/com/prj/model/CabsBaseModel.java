package com.prj.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;

@MappedSuperclass
public class CabsBaseModel implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false, unique = true)
	private Integer id;

	@Column(name = "updated_date")
	private Date lastUpdateTime;

	@Column(name = "created_date")
	private Date creationTime;

	private User updatedUser;

	private User createdUser;

	@Transient
	private LTSP ltsp;

	@Transient
	private Client client;

	public Integer getId() {

		return id;
	}

	public void setId( Integer id ) {

		this.id = id;
	}

	public Date getLastUpdateTime() {

		return lastUpdateTime;
	}

	public void setLastUpdateTime( Date lastUpdateTime ) {

		this.lastUpdateTime = lastUpdateTime;
	}

	public Date getCreationTime() {

		return creationTime;
	}

	public void setCreationTime( Date creationTime ) {

		this.creationTime = creationTime;
	}

	public User getUpdatedUser() {

		return updatedUser;
	}

	public void setUpdatedUser( User updatedUser ) {

		this.updatedUser = updatedUser;
	}

	public User getCreatedUser() {

		return createdUser;
	}

	public void setCreatedUser( User createdUser ) {

		this.createdUser = createdUser;
	}

	public LTSP getLtsp() {

		return ltsp;
	}

	public void setLtsp( LTSP ltsp ) {

		this.ltsp = ltsp;
	}

	public Client getClient() {

		return client;
	}

	public void setClient( Client client ) {

		this.client = client;
	}

}
