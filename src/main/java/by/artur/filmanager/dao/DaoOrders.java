package by.artur.filmanager.dao;

import java.util.List;
import org.hibernate.Session;
import by.artur.filmanager.entity.Orders;

public class DaoOrders extends Dao<Orders> {

	@Override
	public Orders get(int id) {
		Session session =HibernateUtil.getSession();
		Orders order = session.get(Orders.class, id);
		HibernateUtil.closeSession(session);
		return order;
	}
	
	
	@SuppressWarnings("unchecked")
	public List<Orders> getOrdersByIdClient(int id) {
		Session session=HibernateUtil.getSession();
		List<Orders> orders = session.createQuery("From Selling where id_client='"+id+"'").list();
		HibernateUtil.closeSession(session);
		return orders;
	}
	
	/*@SuppressWarnings("unchecked")
	public List<Orders> getOrdersByIdUser(int id) {
		Session session=HibernateUtil.getSession();
		Client client=new DaoClient().getByIdUser(id);
		List<Orders> orders=new DaoOrders().getOrdersByIdClient(client.getId_client());
		client.getOrders()
		List<Orders> orders = session.createQuery("From Selling where id_client='"+id+"'").list();
		HibernateUtil.closeSession(session);
		return orders;
	}*/
	
	@SuppressWarnings("unchecked")
	public List<Orders> getProcessOrdersByIdClient(int id){
		Session session=HibernateUtil.getSession();
		List<Orders> orders = session.createQuery("From Selling where id_client='"+id+"' AND process_date IS NULL").list();
		HibernateUtil.closeSession(session);
		return orders;
	}
	
	@SuppressWarnings("unchecked")
	public List<Orders> getProcessOrders(){
		Session session=HibernateUtil.getSession();
		List<Orders> orders = session.createQuery("From Selling where process_date IS NULL").list();
		HibernateUtil.closeSession(session);
		return orders;
	}
}
