package com.sample.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sample.vo.testVO;

@Service
public interface testService {

	List<testVO> selectUserList() throws Exception;
	
}
