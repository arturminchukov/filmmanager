package by.artur.filmanager.controllers;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import by.artur.filmanager.dao.DaoClient;
import by.artur.filmanager.dao.DaoFilms;
import by.artur.filmanager.dao.DaoOrders;
import by.artur.filmanager.dao.DaoSellStatus;
import by.artur.filmanager.entity.Client;
import by.artur.filmanager.entity.Film;
import by.artur.filmanager.entity.Orders;
import by.artur.filmanager.entity.SellStatus;

@Controller
public class ClientController {
	
	@RequestMapping(value="/showClientOrders")
	public String getOrders(HttpSession session,Model model) {
		Client client = getClientByIdUser(session);
		if (client != null) {
			List<Orders> orders = new DaoOrders().getOrdersByIdClient(client.getId_client());
			model.addAttribute("orders", orders);
		} else
			model.addAttribute("orders", null);
		return "common/orders";
	}
	
	@RequestMapping(value="/showProcessOrders")
	public String getProcessOrders(HttpSession session, Model model) {
		Client client = getClientByIdUser(session);
		if (client != null) {
			List<Orders> orders = new DaoOrders().getProcessOrdersByIdClient(client.getId_client());
			model.addAttribute("orders", orders);
		} else
			model.addAttribute("orders", null);
		return "common/processOrders";
	}
	
	@RequestMapping(value="/getOrderForm")
	public String sendDoOrderForm(Model model) {
		List<Film> films=new DaoFilms().getAllFilms();
		model.addAttribute("films",films);
		return "forms/FormDoOrder";
	}
	
	@RequestMapping (value="/doOrder")
	public String doOrder(@RequestParam String film,Model model,HttpSession session) {
		//try {
			System.out.println(film);
			Film orderFilm = new DaoFilms().getFilmByName(film);
			Date date = new Date();
			SellStatus sellStatus=new DaoSellStatus().get(1);
			Orders order= new Orders(orderFilm, getClientByIdUser(session), date, sellStatus);
			System.out.println(order);
			new DaoOrders().insert(order);
			
		/*} catch (Exception e) {
			model.addAttribute("result", "Fail!!!");
			return "common/result";
		}*/
		model.addAttribute("result", "Success!!!");
		return "common/result";
	}
	
	
	
	public Client getClientByIdUser(HttpSession session) {
		int id_user = session.getAttribute("id_user") != null
				? Integer.valueOf(String.valueOf(session.getAttribute("id_user")))
				: 0;
		return new DaoClient().getByIdUser(id_user);
	}
	
	
}
