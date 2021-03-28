package com.sample.service;

import java.util.List;

import com.sample.vo.TestVO;

public interface TestService {

	List<TestVO> selectUserList() throws Exception;
	
}
