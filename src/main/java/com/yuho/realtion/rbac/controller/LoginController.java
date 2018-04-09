package com.yuho.realtion.rbac.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**  
* @author yuho  
* @date 2018-04-09  
*/
@Api(tags = "平台登录操作")
@Controller
public class LoginController {

	@ApiOperation(value = "登录页面", notes = "", produces = MediaType.TEXT_HTML_VALUE)
	@RequestMapping(value = { "/login", "/" }, method = { RequestMethod.GET, RequestMethod.POST })
	public String tologin(ModelMap map) {
		return "/login";
	}
}
