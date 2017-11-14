package by.artur.filmanager.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import by.artur.filmanager.dao.DaoRoles;
import by.artur.filmanager.dao.DaoUsers;
import by.artur.filmanager.dao.HibernateUtil;
import by.artur.filmanager.entity.Roles;
import by.artur.filmanager.entity.Users;

@Controller
public class IndexController {
	
	@RequestMapping(value="/")
	public String goToIndexPage() {
		System.out.println("poshlo");
		DaoUsers du = new DaoUsers();
		List <Users> list = du.getAllByRequest("FROM Users");
		int count=list.size();
		Users user = list.get(0);
		System.out.println(user.getRole().toString());
		System.out.println("OK");
		while(--count>=0) {
			System.out.println(list.get(count).toString());
		}
/*		DaoRoles dr = new DaoRoles();
		Roles roles = new Roles(4, "prosto");
		System.out.println(roles.toString());
		dr.insert(roles);*/
		return "index";
	}
	
	@RequestMapping(value="login")
	public void test() {
		System.out.println("Working login");
	}

}
