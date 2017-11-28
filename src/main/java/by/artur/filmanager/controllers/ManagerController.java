package by.artur.filmanager.controllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.WebRequest;

import by.artur.filmanager.dao.DaoFilms;
import by.artur.filmanager.dao.DaoGenre;
import by.artur.filmanager.dao.DaoOrders;
import by.artur.filmanager.dao.DaoProducer;
import by.artur.filmanager.dao.DaoSellStatus;
import by.artur.filmanager.entity.Film;
import by.artur.filmanager.entity.Genre;
import by.artur.filmanager.entity.Orders;
import by.artur.filmanager.entity.Producer;
import by.artur.filmanager.entity.SellStatus;

@Controller
public class ManagerController {
	@RequestMapping("/orders")
	public String getAllOrders(Model model) {
		DaoOrders daoOrders=new DaoOrders();
		List<Orders> orders=daoOrders.getAllByRequest("From Selling");
		if(orders.size()>0) {
			System.out.println(orders.get(0).toString());
			model.addAttribute("orders", orders);
		}
		else
			model.addAttribute("orders", null);
		return "common/orders";
	}
	
	
	@RequestMapping("/loadFormFilm")
	public String sendFormFilm(Model model) {
		model.addAttribute("genres", new DaoGenre().getAllGenres());
		model.addAttribute("producers", new DaoProducer().getAllProducers());
		System.out.println(new DaoProducer().getAllProducers().get(0));
		System.out.println(new DaoProducer().getAllProducers().get(1));
		System.out.println(new DaoProducer().get(1));
		return "forms/formAddFilm";
	}
	
	@RequestMapping("/addFilm")
	public String addNewFilm(WebRequest request, Model model) {
		Film film=null;
		try {
			film = createFilm(request);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		if(film==null) {
			model.addAttribute("result", "Fail!!!");
		}
		else {
			DaoFilms daoFilms = new DaoFilms();
			daoFilms.insert(film);
			model.addAttribute("result", "Success!!!");
		}
		return "common/result";
	}
	
	@RequestMapping("/processOrders")
	public String processOrders(Model model) {
		List<Orders> orders=new  DaoOrders().getProcessOrders();
		model.addAttribute("orders", orders);
		return "forms/FormProcessOrder";
	}
	
	@RequestMapping("/acceptOrder")
	public String acceptOrder(@RequestParam String order,Model model) {
		
		try {
			Orders orderProcess=new DaoOrders().get(Integer.valueOf(order.split(" ")[0]));
			Date date = new Date();
			SellStatus status = new DaoSellStatus().getSellStatusByName("Accept");
			orderProcess.setProcess_date(date);
			orderProcess.setId_status(status);
			new DaoOrders().update(orderProcess);
		} catch (Exception e) {
			model.addAttribute("result", "Fail!!!");
			return "common/result";
		}
		model.addAttribute("result", "Success!!!");
		return "common/result";
	}
	
	@RequestMapping("/declineOrder")
	public String declineOrder(@RequestParam String order,Model model) {
		
		return "common/result";
	}
	
	@RequestMapping("/selectOrder")
	public String selectOrder(@RequestParam String order,Model model) {
		
		Orders orderProcess=new DaoOrders().get(Integer.valueOf(order.split("<td>")[1].split("</td>")[0]));
		model.addAttribute("order", orderProcess);
		return "common/order";
	}
	
	@RequestMapping ("/loadAllFilms")
	public String loadAllFilms(Model model) {
		List<Film> films= new DaoFilms().getAllFilms();
		model.addAttribute("films", films);
		return "forms/filmsTable";
	}
	
	@RequestMapping ("/selectFilm")
	public String selectFilm(@RequestParam String film, Model model){
		Film filmProcess=new DaoFilms().get(Integer.valueOf(film.split("<td>")[1].split("</td>")[0]));
		model.addAttribute("film", filmProcess);
		model.addAttribute("genres", new DaoGenre().getAllGenres());
		model.addAttribute("producers", new DaoProducer().getAllProducers());
		return "forms/processFilm";
	}
	
	@RequestMapping("/updateFilm")
	public String updateFilm(WebRequest request,Model model) {
			Film film = null;
			try {
				film = createFilm(request);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			if(film==null) {
				System.out.println("Cannot update a film");
				model.addAttribute("result", "Ошибка,фильм не изменен");
			}
			else {
				new DaoFilms().update(film);
				model.addAttribute("result", "Фильм успешно отредактирован");
			}
			return "common/result";

	}
	
	@RequestMapping("/deleteFilm")
	public String deleteFilm(@RequestParam String id_film,Model model) {
		DaoFilms daoFilms = new DaoFilms();
		Film film = daoFilms.get(Integer.valueOf(id_film));
		if(film == null) {
			System.out.println("Cannot delete a film");
			model.addAttribute("result", "Невозможно удалить фильм!");
		}
		else {
		daoFilms.delete(film);
		model.addAttribute("result", "Фильм успешно удален!");
		}
		return "common/result";
	}
	
	private Film createFilm(WebRequest request) throws ParseException {
		Film film = null;
		String name = request.getParameter("name");
		SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd");
		Date release_date = dateFormat.parse(request.getParameter("release_date"));
		Genre genre = new DaoGenre().getGenreByName(request.getParameter("genre"));
		Producer producer = new DaoProducer().get(Integer.valueOf(request.getParameter("producer").split(" ")[0]));
		double price = Double.valueOf(request.getParameter("price"));
		if (request.getParameter("id_film") == null)
			film = new Film(name, release_date, genre, producer, price);
		else {
			int id_film = Integer.valueOf(request.getParameter("id_film"));
			film = new Film(id_film, name, release_date, genre, producer, price);
		}
		System.out.println(film);
		return film;
	}
			
}
