package com.prj.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "tbl_user")
public class User extends BaseEntity {

	@Column(name = "user_emailId")
	private String emailId;

	@Column(name = "user_password")
	private String password;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "user_role", referencedColumnName = "id")
	private Role role;

	public String getEmailId() {

		return emailId;
	}

	public void setEmailId( String emailId ) {

		this.emailId = emailId;
	}

	public String getPassword() {

		return password;
	}

	public void setPassword( String password ) {

		this.password = password;
	}

	public Role getRole() {

		return role;
	}

	public void setRole( Role role ) {

		this.role = role;
	}

}
