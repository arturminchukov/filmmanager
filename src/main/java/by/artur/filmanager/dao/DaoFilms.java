package by.artur.filmanager.dao;

import java.util.List;

import org.hibernate.Session;

import by.artur.filmanager.entity.Film;

public class DaoFilms extends Dao<Film> {

	@Override
	public Film get(int id) {
		Session session=HibernateUtil.getSession();
		Film film= session.get(Film.class, id);
		HibernateUtil.closeSession(session);
		return film;
	}
	
	@SuppressWarnings("unchecked")
	public List<Film> getAllFilms(){
		Session session=HibernateUtil.getSession();
		List<Film> films= session.createQuery("from Film").list();
		HibernateUtil.closeSession(session);
		return films;
	}
	
	@SuppressWarnings("unchecked")
	public Film getFilmByName(String name) {
		Session session=HibernateUtil.getSession();
		List<Film> films= session.createQuery("from Film where name='"+name+"'").list();
		HibernateUtil.closeSession(session);
		if(films.size()>0)
			return films.get(0);
		else
			return null;
	}

}
