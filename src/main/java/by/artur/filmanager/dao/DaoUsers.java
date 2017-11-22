package by.artur.filmanager.dao;

import java.util.List;

import org.hibernate.Session;

import by.artur.filmanager.entity.Users;

public class DaoUsers extends Dao<Users>{

	@Override
	public Users get(int id) {
		Session session= HibernateUtil.getSession();
		Users user=session.get(Users.class, id);
		HibernateUtil.closeSession(session);
		return user;
	}
	
	@SuppressWarnings("unchecked")
	public Users getUserByEmail(String email) {
		Session session =HibernateUtil.getSession();
		List <Users> user = session.createQuery("from Users where email='"+email+"'").list();
		HibernateUtil.closeSession(session);
		return user.get(0);
	}
	
	@SuppressWarnings("unchecked")
	public Users verifyUser(String email,String password) {
		Session session = HibernateUtil.getSession();
		List<Users> user = session.createQuery("from Users where email='" + email + "' AND password='" + password + "'").list();
		HibernateUtil.closeSession(session);
		return user.size() > 0 ? user.get(0) : null;
	}


}
