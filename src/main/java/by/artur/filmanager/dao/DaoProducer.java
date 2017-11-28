package by.artur.filmanager.dao;

import java.util.List;

import org.hibernate.Session;
import by.artur.filmanager.entity.Producer;

public class DaoProducer extends Dao<Producer> {

	@Override
	public Producer get(int id) {
		Session session = HibernateUtil.getSession();
		Producer producer= session.get(Producer.class, id);
		HibernateUtil.closeSession(session);
		return producer;
	}
	
	@SuppressWarnings("unchecked")
	public List<Producer> getAllProducers(){
		Session session=HibernateUtil.getSession();
		List<Producer> producers= session.createQuery("from Producer").list();
		System.out.println(producers.get(0));
		HibernateUtil.closeSession(session);
		return producers;
	}

}
