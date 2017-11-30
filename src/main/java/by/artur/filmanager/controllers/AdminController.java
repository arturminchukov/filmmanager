package by.artur.filmanager.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.WebRequest;

import by.artur.filmanager.dao.DaoRoles;
import by.artur.filmanager.dao.DaoStatuses;
import by.artur.filmanager.dao.DaoUsers;
import by.artur.filmanager.entity.Roles;
import by.artur.filmanager.entity.Statuses;
import by.artur.filmanager.entity.Users;

@Controller
public class AdminController {
	
	@RequestMapping("/addUserForm")
	public String addUserForm(Model model){
		List<Statuses> statuses = new DaoStatuses().getAllGenres();
		List<Roles> roles = new DaoRoles().getAllRoles();
		model.addAttribute("statuses", statuses);
		model.addAttribute("roles", roles);		
		return "forms/addUserForm";
	}
	
	@RequestMapping("/addUser")
	public String addUser(WebRequest request,Model model) {
		String email= request.getParameter("email");
		String password = request.getParameter("email");
		Roles role = new DaoRoles().getRoleByName(request.getParameter("role"));
		Statuses status= new DaoStatuses().getStatusByName(request.getParameter("status"));
		try {
			Users user = new Users(email, password, role, status);
			new DaoUsers().insert(user);
			model.addAttribute("result", "Новый пользователь успешно добавлен!");
		} catch (Exception e) {
			model.addAttribute("result", "Ошибка при добавлении пользователя");
		}
		return "common/result";
	}
}
