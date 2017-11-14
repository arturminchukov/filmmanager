package by.artur.filmanager.dao;

import java.util.List;

import org.hibernate.Session;

import by.artur.filmanager.entity.Users;

public class DaoUsers implements DaoInterface<Users>{

	@Override
	public void insert(Users ob) {
		Session session = HibernateUtil.getSession();
		session.save(ob);
		HibernateUtil.closeSession(session);
	}

	@Override
	public void delete(Users ob) {
		Session session = HibernateUtil.getSession();
		session.delete(ob);
		HibernateUtil.closeSession(session);
	}

	@Override
	public void update(Users ob) {
		Session session = HibernateUtil.getSession();
		session.update(ob);
		HibernateUtil.closeSession(session);
	}

	@Override
	public Users get(int id) {
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Users> getAllByRequest(String sql) {
		Session session = HibernateUtil.getSession();
		System.out.println("got Session");
		List <Users> list = session.createQuery(sql).list();
		System.out.println("got Session End");
		return list;
	}

}
