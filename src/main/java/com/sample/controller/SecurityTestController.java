package com.sample.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SecurityTestController {
	
	private static final Logger logger = LoggerFactory.getLogger(SecurityTestController.class);

	@RequestMapping(value = "/security/login", method = RequestMethod.GET)
	public String login() throws Exception {
		return "login";
	}
	
	@RequestMapping(value = "/security", method = RequestMethod.GET)
	public String security() throws Exception {
		return "security";
	}
	
	@RequestMapping(value = "/page", method = RequestMethod.GET)
	public String guest() throws Exception {
		return "guest";
	}
	
	@RequestMapping(value = "/user/page", method = RequestMethod.GET)
	public String user() throws Exception {
		return "user";
	}
	
	@RequestMapping(value = "/member/page", method = RequestMethod.GET)
	public String member() throws Exception {
		return "member";
	}
	
	@RequestMapping(value = "/admin/page", method = RequestMethod.GET)
	public String admin() throws Exception {
		return "admin";
	}
}
