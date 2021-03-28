package com.sample.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sample.dao.testDAO;
import com.sample.service.testService;
import com.sample.vo.testVO;

@Repository
public class testServiceImpl implements testService {

	@Autowired
	private testDAO testDao;
	
	/**
	 * 유저 정보 조회
	 * @param	
	 * @return	List<testVO>
	 * @throws	Exception
	 */

	@Override
	public List<testVO> selectUserList() throws Exception {
		return testDao.selectUserList();
	}

}
