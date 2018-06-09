/**
 * @Description:TODO
 * @author:20155875_张轩
 * @date2018-5-17上午8:54:41
 */
package com.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.mapper.LoginMapper;
import com.ssm.pojo.Login;
import com.ssm.service.LoginService;

/**
 * @ClassName:LoginServiceImpl
 * @Description:TODO
 * @author:20155875_张轩
 * @date2018-5-17上午8:54:41
 */
@Service
public class LoginServiceImpl implements LoginService{
	@Autowired
	LoginMapper loginMapper;
	/* (non-Javadoc)
	 * @see com.ssm.service.LoginService#list()
	 */
	@Override
	public List<Login> list() {
		// TODO Auto-generated method stub
		return loginMapper.list();
	}
}
