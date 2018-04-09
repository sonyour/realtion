package com.yuho.realtion.rbac.role.domain;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("角色实体类")
public class Role implements Serializable {

	private static final long serialVersionUID = -1911236558803130462L;
	
	@ApiModelProperty(name = "id", dataType = "java.lang.String", value = "角色ID", hidden = false)
	private String id;
	
	@ApiModelProperty(name = "state", dataType = "java.lang.String", value = "角色状态", hidden = false)
	private String state;
	
	@ApiModelProperty(name = "name", dataType = "java.lang.String", value = "角色名称", hidden = false)
	private String name;
	
	@ApiModelProperty(name = "rolekey", dataType = "java.lang.String", value = "系统唯一标识", hidden = false)
	private String rolekey;
	
	@ApiModelProperty(name = "description", dataType = "java.lang.String", value = "描述 ", hidden = false)
	private String description;
	
	@ApiModelProperty(name = "isdelete", dataType = "java.lang.Integer", value = "是否删除 ", hidden = true)
	private Integer isdelete;
	
	@ApiModelProperty(name = "parentid", dataType = "java.lang.Integer", value = "父级角色ID ", hidden = true)
	private String parentid;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRolekey() {
		return rolekey;
	}

	public void setRolekey(String rolekey) {
		this.rolekey = rolekey;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getIsdelete() {
		return isdelete;
	}

	public void setIsdelete(Integer isdelete) {
		this.isdelete = isdelete;
	}

	public String getParentid() {
		return parentid;
	}

	public void setParentid(String parentid) {
		this.parentid = parentid;
	}

	@Override
	public String toString() {
		return "Role [id=" + id + ", state=" + state + ", name=" + name + ", rolekey=" + rolekey + ", description="
				+ description + ", isdelete=" + isdelete + ", parentid=" + parentid + "]";
	}

}