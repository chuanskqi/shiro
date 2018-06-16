package cn.team.shiro.api.service;

import java.util.Map;
/**
 * 查询用户的所有角色和权限
 * @author QDL
 */
public interface IAuthorizationService {
	public Map<String,Object> getPremission(String mid) ;
}
