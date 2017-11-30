package by.artur.filmanager.dao;



import java.util.List;
import org.hibernate.Session;
import by.artur.filmanager.entity.Statuses;

public class DaoStatuses extends Dao<Statuses>{

	@Override
	public Statuses get(int id) {
		Session session =HibernateUtil.getSession();
		Statuses status = session.get(Statuses.class, id);
		HibernateUtil.closeSession(session);
		return status;
	}
	
	@SuppressWarnings("unchecked")
	public Statuses getStatusByName(String name) {
		Session session =HibernateUtil.getSession();
		List <Statuses> status = session.createQuery("from Statuses where name='"+name+"'").list();
		HibernateUtil.closeSession(session);
		return status.get(0);
	}
	
	@SuppressWarnings("unchecked")
	public List<Statuses> getAllGenres(){
		Session session=HibernateUtil.getSession();
		List<Statuses> statuses= session.createQuery("from Statuses").list();
		HibernateUtil.closeSession(session);
		return statuses;
	}
	
}
