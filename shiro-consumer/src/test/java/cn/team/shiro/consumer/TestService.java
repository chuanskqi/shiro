package cn.team.shiro.consumer;


import javax.security.auth.login.LoginException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.alibaba.dubbo.config.annotation.Reference;

import cn.team.shiro.api.service.IAuthenticationService;
import cn.team.shiro.api.service.IAuthorizationService;
import cn.team.shiro.api.service.IEmpService;

//@ContextConfiguration(locations= {"classpath:spring/spring-*.xml"})
@ContextConfiguration(locations = { "classpath:spring/spring-*.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class TestService {
	@Reference
	private IAuthenticationService authService ;
	@Reference
	private IAuthorizationService authedService ;
	@Test
	public void testService() {
		try {
			System.err.println(authService.login("admin", "hello"));
		} catch (LoginException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.err.println(authedService.getPremission("admin"));
	}
}
