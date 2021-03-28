package com.sample.controller;

import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sample.service.testService;
import com.sample.vo.testVO;

@Controller
public class testController {

	@Autowired
	private testService testservice;
	
	@RequestMapping(value = "/userInfo", method = RequestMethod.GET)
	public List<testVO> userInfo() throws Exception {
		return testservice.selectUserList();
	}

}
