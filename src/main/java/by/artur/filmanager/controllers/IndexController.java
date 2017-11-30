package by.artur.filmanager.controllers;


import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.WebRequest;

import by.artur.filmanager.dao.DaoClient;

import by.artur.filmanager.dao.DaoRoles;
import by.artur.filmanager.dao.DaoStatuses;
import by.artur.filmanager.dao.DaoUsers;
import by.artur.filmanager.entity.Client;

import by.artur.filmanager.entity.Roles;
import by.artur.filmanager.entity.Statuses;
import by.artur.filmanager.entity.Users;

@Controller
public class IndexController {
	
	@RequestMapping(value="/")
	public String goToIndexPage() {
		return "index";
	}
	
	@RequestMapping(value="/registration")
	public String register(WebRequest request) {
		String email=request.getParameter("email");
		DaoUsers dao_user =new DaoUsers();
		
		List<Users> list= dao_user.getAllByRequest("From Users where email='"+email+"'");
		if(list.size()==0) {
			DaoStatuses dao_status=new DaoStatuses();
			DaoRoles dao_role=new DaoRoles();
			
			String password = request.getParameter("password");
			Statuses status = dao_status.getStatusByName("active");
			System.out.println("status "+status.toString());
			
			Roles role = dao_role.getRoleByName("client");
			System.out.println("role "+role.toString());
			
			Users user= new Users(email, password, role, status);
			System.out.println(user.toString());
			
			dao_user.insert(user);
			user=dao_user.getUserByEmail(user.getEmail());
			System.out.println(user.toString());
			Client client= new Client(request.getParameter("company"), request.getParameter("first_name")+" "+request.getParameter("last_name")
									, request.getParameter("phone"),request.getParameter("country")+","+request.getParameter("address")
									, user);
			new DaoClient().insert(client);
			System.out.println("Success");
			return "AJAXresponse/SuccessfullRegistration";
		}
		return "AJAXresponse/SuchUserAlreadyExist";
	}
	
	@RequestMapping(value="/authorize")
	public String authorize(@RequestParam String email, @RequestParam String password, Model model,HttpSession session) {
		DaoUsers daoUsers = new DaoUsers();
		Users user = daoUsers.verifyUser(email, password);
		if (user!=null) {
				session.setAttribute("id_user", user.getId_user());
				session.setAttribute("Role", user.getRole().getName());
				model.addAttribute("email", email);
				Client client = user.getClient();
				if(client!=null) {
					session.setAttribute("client", client);
				}
				return user.getRole().getName();
		}
		else
			return "AJAXresponse/SuchUserDoesNotExist";
		
	}
}
