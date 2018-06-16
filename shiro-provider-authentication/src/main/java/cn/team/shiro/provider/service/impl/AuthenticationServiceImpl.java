package cn.team.shiro.provider.service.impl;

import java.util.HashMap;
import java.util.Map;
import javax.security.auth.login.AccountLockedException;
import javax.security.auth.login.AccountNotFoundException;
import javax.security.auth.login.FailedLoginException;
import javax.security.auth.login.LoginException;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;

import cn.team.shiro.api.service.IAuthenticationService;
import cn.team.shiro.api.vo.Member;
import cn.team.shiro.provider.dao.IMemberDAO;

@Service
public class AuthenticationServiceImpl implements IAuthenticationService {
	@Autowired
	private IMemberDAO memberDAO; 
	@Override
	public Map<String, Object> login(String mid, String password) throws LoginException {
		Member vo = memberDAO.findById(mid) ;
		if(vo == null) {
			throw new AccountNotFoundException("用户名不存！");
		}
		if(vo.getPassword() != password) {
			throw new FailedLoginException("用户名密码不正确") ;
		}
		if(vo.getLocked() == 1) {
			throw new AccountLockedException("账户被锁定") ;
		}
		Map<String,Object> map = new HashMap<>() ;
		map.put("name", vo.getName()) ;
		return map;
	}
	
}
