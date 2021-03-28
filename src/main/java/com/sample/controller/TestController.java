package com.sample.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sample.service.TestService;
import com.sample.vo.TestVO;

@Controller
public class TestController {
	
	private static final Logger logger = LoggerFactory.getLogger(TestController.class);

	@Autowired
	private TestService testService;
	
	@RequestMapping(value = "/userInfo", method = RequestMethod.GET)
	public List<TestVO> userInfo() throws Exception {
		return testService.selectUserList();
	}

}
