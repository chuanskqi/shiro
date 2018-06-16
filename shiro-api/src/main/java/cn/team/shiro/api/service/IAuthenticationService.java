package cn.team.shiro.api.service;

import java.util.Map;

import javax.security.auth.login.LoginException;

/**
 * 进行登录的微服务的验证操作
 * 
 * @param mid
 *            用户编号
 * @param password
 *            登录密码
 * @return 返回全部登录信息： 1、key = name、value = 用户真实姓名
 * @throws LoginException
 *             登录异常，该异常可能产生有如下几种情况： 1、用户名不存在则抛出：“MemberNotExistException”；
 *             2、用户密码输入错误则抛出：“PasswordInvlidateException”；
 *             3、用户被锁定异常：“MemberLockedException”
 */
public interface IAuthenticationService {
	public Map<String, Object> login(String mid, String password) throws LoginException ;;
}
