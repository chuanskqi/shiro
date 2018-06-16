package cn.team.shiro.provider.service.impl;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import cn.team.shiro.api.service.IAuthorizationService;
import cn.team.shiro.provider.dao.IActionDAO;
import cn.team.shiro.provider.dao.IRoleDAO;
@Service
public class AuthorizationServiceImpl implements IAuthorizationService {
	@Autowired
	private IActionDAO actionDAO; 
	@Autowired
	private IRoleDAO roleDAO ;
	@Override
	public Map<String, Object> getPremission(String mid) {
		Map<String,Object> map = new HashMap<>() ;
		map.put("allRoles", roleDAO.findAllByMember(mid)) ;
		map.put("allActions", actionDAO.findAllByMember(mid)) ;
		return map;
	}

}
