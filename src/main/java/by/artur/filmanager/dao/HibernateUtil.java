package by.artur.filmanager.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	private static SessionFactory sessionFactory;
	
	static {
		sessionFactory = new Configuration().configure().buildSessionFactory();
	}
	
	public static Session getSession() {
		System.out.println("Hibernateutil 1");
		Session session = sessionFactory.openSession();
		System.out.println("Hibernateutil 2");
		session.beginTransaction();
		System.out.println("Hibernateutil 3");
		return session;
	}
	
	public static void closeSession(Session session) {
		session.getTransaction().commit();
		session.close();
	}
	

}
