package cn.team.shiro.consumer;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.dubbo.config.annotation.Reference;

import cn.team.shiro.api.service.IAuthenticationService;
import cn.team.shiro.api.service.IEmpService;


@ContextConfiguration(locations= {"classpath:spring/spring-*.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class TestService {
	@Reference
	private IEmpService empService ;
	@Test
	public void testService() {
		System.err.println(empService.get(1L));
	}
}
