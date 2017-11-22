package by.artur.filmanager.dao;

import java.util.List;

import org.hibernate.Session;

public abstract class Dao <T>{
	
	public void insert(T ob) {
		Session session = HibernateUtil.getSession();
		session.save(ob);
		HibernateUtil.closeSession(session);
	}
	
	public void delete(T ob) {
		Session session = HibernateUtil.getSession();
		session.delete(ob);
		HibernateUtil.closeSession(session);
	}
	
	public void update(T ob) {
		Session session = HibernateUtil.getSession();
		session.update(ob);
		HibernateUtil.closeSession(session);
	}
	
	public abstract T get(int id) ;
	
	@SuppressWarnings("unchecked")
	public List<T> getAllByRequest(String sql) {
		Session session = HibernateUtil.getSession();
		System.out.println("got Session");
		List <T> list = session.createQuery(sql).list();
		System.out.println("got Session End");
		HibernateUtil.closeSession(session);
		return list!=null?list:null;
	}
}
