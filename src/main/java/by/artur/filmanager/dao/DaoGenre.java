package by.artur.filmanager.dao;

import java.util.List;

import org.hibernate.Session;
import by.artur.filmanager.entity.Genre;

public class DaoGenre extends Dao<Genre> {

	@Override
	public Genre get(int id) {
		Session session = HibernateUtil.getSession();
		Genre genre= session.get(Genre.class, id);
		HibernateUtil.closeSession(session);
		return genre;
	}
	
	@SuppressWarnings("unchecked")
	public List<Genre> getAllGenres(){
		Session session=HibernateUtil.getSession();
		List<Genre> genres= session.createQuery("from Genre").list();
		HibernateUtil.closeSession(session);
		return genres;
	}

	@SuppressWarnings("unchecked")
	public Genre getGenreByName(String name) {
		Session session = HibernateUtil.getSession();
		List<Genre> genres= session.createQuery("from Genre where name='"+name+"'").list();
		HibernateUtil.closeSession(session);
		if(genres.size()>0)
			return genres.get(0);
		else
			return null;
	}
}
