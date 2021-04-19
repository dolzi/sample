package com.sample.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.dao.TestDao;
import com.sample.service.TestService;
import com.sample.vo.TestVo;

@Service
public class TestServiceImpl implements TestService {

	@Autowired
	private TestDao testDao;

	@Override
	public TestVo selectUser(TestVo testVo) throws Exception {
		return testDao.selectUser(testVo);
	}
	
	@Override
	public List<TestVo> selectUserList() throws Exception {
		return testDao.selectUserList();
	}

	@Override
	public int insertUser(TestVo testVo) throws Exception {
		
		return testDao.insertUser(testVo);
	}

	@Override
	public int updateUser(TestVo testVo) throws Exception {
		
		return testDao.updateUser(testVo);
	}

	@Override
	public int deleteUser(TestVo testVo) throws Exception {
		
		return testDao.deleteUser(testVo);
	}
	
	

}
