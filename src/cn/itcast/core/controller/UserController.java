package cn.itcast.core.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.itcast.core.pojo.User;
import cn.itcast.core.service.IUserService;
import cn.itcast.core.service.impl.UserServiceImpl;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Resource(name="userServiceImpl")
	private IUserService userService;
	
	@RequestMapping("/toaddUser")
	public String toAddUser() {
		return "insert";
	}
	
	@RequestMapping("/addUser")
	public String addUser(User user,HttpServletRequest request) {
		userService.addUser(user);
		return "forward:findAllUser.htm";
	}
	
	
	@RequestMapping("/findAllUser")
	public String findAllUser(Model model) {
		List<User> users = userService.findAllUsers();
		model.addAttribute("userList", users);
		return "list";
	}
	

}
