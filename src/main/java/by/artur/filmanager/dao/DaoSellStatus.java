package by.artur.filmanager.dao;

import java.util.List;

import org.hibernate.Session;

import by.artur.filmanager.entity.SellStatus;

public class DaoSellStatus extends Dao<SellStatus> {

	@Override
	public SellStatus get(int id) {
		Session session = HibernateUtil.getSession();
		SellStatus status= session.get(SellStatus.class, id);
		HibernateUtil.closeSession(session);
		return status;
	}

	
	@SuppressWarnings("unchecked")
	public SellStatus getSellStatusByName(String name) {
		Session session = HibernateUtil.getSession();
		List<SellStatus> statuses= session.createQuery("FROM sell_status where name='"+name+"'").list();
		HibernateUtil.closeSession(session);
		if(statuses.size()>0)
			return statuses.get(0);
		else
			return null;
	}
}
