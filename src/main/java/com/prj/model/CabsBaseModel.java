package com.prj.model;

import java.util.Date;

public class CabsBaseModel { 
	
	private int id;
	
	private Date lastUpdateTime;
	
	private Date creationTime;
	
	private User updatedUser;
	
	private User createdUser;
	
	private LTSP ltsp;
	
	private Client client;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getLastUpdateTime() {
		return lastUpdateTime;
	}

	public void setLastUpdateTime(Date lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}

	public Date getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(Date creationTime) {
		this.creationTime = creationTime;
	}

	public User getUpdatedUser() {
		return updatedUser;
	}

	public void setUpdatedUser(User updatedUser) {
		this.updatedUser = updatedUser;
	}

	public User getCreatedUser() {
		return createdUser;
	}

	public void setCreatedUser(User createdUser) {
		this.createdUser = createdUser;
	}

	public LTSP getLtsp() {
		return ltsp;
	}

	public void setLtsp(LTSP ltsp) {
		this.ltsp = ltsp;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	
	
	

}
