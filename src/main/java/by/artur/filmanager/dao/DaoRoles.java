package by.artur.filmanager.dao;

import java.util.List;

import org.hibernate.Session;

import by.artur.filmanager.entity.Roles;

public class DaoRoles implements DaoInterface<Roles>{

	@Override
	public void insert(Roles ob) {
		System.out.println("1");
		Session session = HibernateUtil.getSession();
		System.out.println("2");
		session.save(ob);
		System.out.println("3");
		HibernateUtil.closeSession(session);
		System.out.println("4");
	}

	@Override
	public void delete(Roles ob) {
		Session session = HibernateUtil.getSession();
		session.delete(ob);
		HibernateUtil.closeSession(session);
	}

	@Override
	public void update(Roles ob) {
		Session session = HibernateUtil.getSession();
		session.update(ob);
		HibernateUtil.closeSession(session);
	}

	@Override
	public Roles get(int id) {
		Session session = HibernateUtil.getSession();
		Roles role = (Roles)session.get("Role",id);
		HibernateUtil.closeSession(session);
		return role;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Roles> getAllByRequest(String sql) {
		Session session = HibernateUtil.getSession();
		List <Roles> list = session.createQuery(sql).list();
		return list;
	}
	

}
