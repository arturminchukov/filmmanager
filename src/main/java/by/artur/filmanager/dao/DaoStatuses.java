package by.artur.filmanager.dao;

import java.util.List;

import org.hibernate.Session;

import by.artur.filmanager.entity.Statuses;

public class DaoStatuses implements DaoInterface<Statuses>{

	@Override
	public void insert(Statuses ob) {
		Session session = HibernateUtil.getSession();
		session.save(ob);
		HibernateUtil.closeSession(session);
	}

	@Override
	public void delete(Statuses ob) {
		Session session = HibernateUtil.getSession();
		session.delete(ob);
		HibernateUtil.closeSession(session);
	}

	@Override
	public void update(Statuses ob) {
		Session session=HibernateUtil.getSession();
		session.update(ob);
		HibernateUtil.closeSession(session);
	}

	@Override
	public Statuses get(int id) {
		Session session=HibernateUtil.getSession();
		Statuses status= (Statuses)session.get("Statuses", id);
		HibernateUtil.closeSession(session);
		return status;
	}

	@Override
	public List<Statuses> getAllByRequest(String sql) {
		
		return null;
	}

}
