package by.artur.filmanager.dao;


import java.util.List;

import org.hibernate.Session;

import by.artur.filmanager.entity.Client;

public class DaoClient extends Dao<Client>{

	@Override
	public Client get(int id) {
		Session session=HibernateUtil.getSession();
		Client client = session.get(Client.class, id);
		HibernateUtil.closeSession(session);
		return client;
	}
	
	@SuppressWarnings("unchecked")
	public Client getByIdUser(int id) {
		Session session=HibernateUtil.getSession();
		List<Client> client = session.createQuery("From Client where id_user='"+id+"'").list();
		HibernateUtil.closeSession(session);
		if(client.size()!=0)
			return client.get(0);
		else
			return null;
	}
	
}
