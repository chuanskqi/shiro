package cn.team.action;
import java.util.Map;
import javax.security.auth.login.LoginException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.dubbo.config.annotation.Reference;

import cn.mldn.util.action.AbstractAction;
import cn.team.shiro.api.service.IAuthenticationService;
import cn.team.shiro.api.service.IAuthorizationService;

@Controller
public class MemberLoginAction extends AbstractAction {
	@Reference
	private IAuthenticationService authen;
	@Reference
	private IAuthorizationService author;

	@RequestMapping("/login_pre")
	public String longinPre() {
		// [WEB-INF/pages/] xxx [.jsp]
		return super.getMessage("login.page");
	}

	// /pages/**/*.action
	@RequestMapping("/login")
	public ModelAndView login(String mid, String password) {
		ModelAndView mav = new ModelAndView(super.getMessage("login.index"));
		try {
			Map<String, Object> info = authen.login(mid, password);
			Map<String, Object> premission = author.getPremission(mid);
			mav.addAllObjects(info) ;
			mav.addAllObjects(premission) ;
		} catch (LoginException e) {
			mav.setViewName(super.getMessage("login.page"));
			mav.addObject("msg", e.getMessage());
		}
		return mav;
	}

}
