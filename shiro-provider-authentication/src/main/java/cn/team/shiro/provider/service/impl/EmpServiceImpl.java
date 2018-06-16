package cn.team.shiro.provider.service.impl;


import com.alibaba.dubbo.config.annotation.Service;

import cn.team.shiro.api.service.IEmpService;
import cn.team.shiro.api.vo.Emp;

@Service
public class EmpServiceImpl implements IEmpService {
	@Override
	public Emp get(Long empno) {
		Emp vo = new Emp() ;
		vo.setName("远程方法调用");
		return vo;
	}

}
