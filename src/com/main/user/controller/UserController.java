package com.main.user.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.main.user.bean.UserBean;
import com.main.user.dao.IUserDao;
import com.main.user.model.User;

/**
 * 
 * <p>Title:   HelloWorldController</p>
 * <p>Description: HelloWorld������  </p>
 * <p>Company:   www.edu24ol.com</p>
 * @author   pc-zw
 * @date     2015��8��6������2:49:06
 * @version  1.0
 */
@Controller
public class UserController {
	
	@Resource
	private IUserDao userDaoImpl;
	
	@RequestMapping("/searchUser.do")
	public String searchUser(UserBean queryBean,ModelMap map){
		List<User> users= userDaoImpl.searchUser(queryBean);
		map.put("users", users);
		map.put("pageBean", queryBean);
		map.put("queryBean", queryBean);
		return "jsp/listUser";
	}

	



	

}
