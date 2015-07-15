package com.prj.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_role")
public class Role extends BaseEntity {

	public final static Integer CUSTOMER = 2;

	public final static Integer ADMIN = 1;

	@Column(name = "role_type")
	private String roleType;

	public String getRoleType() {

		return roleType;
	}

	public void setRoleType( String roleType ) {

		this.roleType = roleType;
	}

}
