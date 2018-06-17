package cn.team.shiro.api.service;

import java.util.Map;

public interface IAuthorizationService {
	/**
	 * 查询用户的所有角色和权限
	 * allRoles
	 * allMembers 
	 * @author QDL
	 */
	public Map<String,Object> getPremission(String mid) ;
}
