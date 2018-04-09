package com.yuho.realtion.rbac.user.domain;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "用户实体类", description = "")
public class User implements Serializable {

	private static final long serialVersionUID = 7769120099665707841L;

	@ApiModelProperty(name = "id", dataType = "java.lang.String", value = "用户编码")
	private String id;

	@ApiModelProperty(name = "username", dataType = "java.lang.String", value = "账号")
	private String username;

	@ApiModelProperty(name = "email", dataType = "java.lang.String", value = "电子邮箱")
	private String email;

	@ApiModelProperty(name = "phone", dataType = "java.lang.String", value = "手机")
	private String phone;

	@ApiModelProperty(name = "password", dataType = "java.lang.String", value = "密码")
	private String password;

	@ApiModelProperty(name = "state", dataType = "java.lang.String", value = "状态")
	private String state;

	@ApiModelProperty(name = "createtime", dataType = "java.lang.String", value = "创建时间")
	private String createtime;

	@ApiModelProperty(name = "isdelete", dataType = "java.lang.Integer", value = "是否删除")
	private Integer isdelete;

	@ApiModelProperty(name = "credentialssalt", dataType = "java.lang.String", value = "加密盐", hidden = true)
	private String credentialssalt;
	
	public String getCredentialssalt() {
		return credentialssalt;
	}
	
	public void setCredentialssalt(String credentialssalt) {
		this.credentialssalt = credentialssalt;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public String getCreatetime() {
		return createtime;
	}
	
	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}
	
	public Integer getIsdelete() {
		return isdelete;
	}
	
	public void setIsdelete(Integer isdelete) {
		this.isdelete = isdelete;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", email=" + email + ", phone=" + phone + ", password=" + password + ", state=" + state + ", createtime=" + createtime + ", isdelete=" + isdelete + ", credentialssalt=" + credentialssalt + "]";
	}
	

}
