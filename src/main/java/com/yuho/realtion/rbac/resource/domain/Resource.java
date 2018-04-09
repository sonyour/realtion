package com.yuho.realtion.rbac.resource.domain;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("菜单类实体")
public class Resource implements Serializable {

	private static final long serialVersionUID = -8990353087139542849L;
	@ApiModelProperty(name = "id", dataType = "java.lang.String", value = "编号")
	private String id;
	@ApiModelProperty(name = "name", dataType = "java.lang.String", value = "菜单名称")
	private String name;
	@ApiModelProperty(name = "parentid", dataType = "java.lang.String", value = "父级编号")
	private String parentid;
	@ApiModelProperty(name = "reskey", dataType = "java.lang.String", value = "菜单标识")
	private String reskey;
	@ApiModelProperty(name = "type", dataType = "java.lang.String", value = "菜单种类 1 目录，2菜单 ，3 按钮")
	private String type;
	@ApiModelProperty(name = "type", dataType = "java.lang.String", value = "菜单地址")
	private String resurl;
	@ApiModelProperty(name = "level", dataType = "java.lang.Integer", value = "菜单等级（暂时 没用)")
	private Integer level;
	@ApiModelProperty(name = "icon", dataType = "java.lang.String", value = "菜单图标（暂时 没用)")
	private String icon;
	@ApiModelProperty(name = "ishide", dataType = "java.lang.String", value = "是否隐藏")
	private Integer ishide;
	@ApiModelProperty(name = "description", dataType = "java.lang.String", value = "描述")
	private String description;
	@ApiModelProperty(name = "isdelete", dataType = "java.lang.Integer", value = "描述")
	private Integer isdelete;
	@ApiModelProperty(name = "colorid", dataType = "java.lang.Integer", value = "颜色ID")
	private Integer colorid;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getParentid() {
		return parentid;
	}

	public void setParentid(String parentid) {
		this.parentid = parentid;
	}

	public String getReskey() {
		return reskey;
	}

	public void setReskey(String reskey) {
		this.reskey = reskey;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getResurl() {
		return resurl;
	}

	public void setResurl(String resurl) {
		this.resurl = resurl;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public Integer getIshide() {
		return ishide;
	}

	public void setIshide(Integer ishide) {
		this.ishide = ishide;
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

	public Integer getColorid() {
		return colorid;
	}

	public void setColorid(Integer colorid) {
		this.colorid = colorid;
	}

	@Override
	public String toString() {
		return "ResourcesI [id=" + id + ", name=" + name + ", parentid=" + parentid + ", reskey=" + reskey + ", type="
				+ type + ", resurl=" + resurl + ", level=" + level + ", icon=" + icon + ", ishide=" + ishide
				+ ", description=" + description + ", isdelete=" + isdelete + ", colorid=" + colorid + "]";
	}

}
