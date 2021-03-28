package com.sample.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.dao.TestDAO;
import com.sample.service.TestService;
import com.sample.vo.TestVO;

@Service
public class TestServiceImpl implements TestService {

	@Autowired
	private TestDAO testDao;
	
	/**
	 * 유저 정보 조회
	 * @param	
	 * @return	List<testVO>
	 * @throws	Exception
	 */

	@Override
	public List<TestVO> selectUserList() throws Exception {
		return testDao.selectUserList();
	}

}
