package by.artur.filmanager.dao;





import java.util.List;

import org.hibernate.Session;

import by.artur.filmanager.entity.Roles;

public class DaoRoles extends Dao<Roles>{

	@Override
	public Roles get(int id) {
		Session session =HibernateUtil.getSession();
		Roles role = session.get(Roles.class, id);
		HibernateUtil.closeSession(session);
		return role;
	}
	
	@SuppressWarnings("unchecked")
	public Roles getRoleByName(String name) {
		Session session =HibernateUtil.getSession();
		List <Roles> role = session.createQuery("from Roles where name='"+name+"'").list();
		HibernateUtil.closeSession(session);
		return role.get(0);
	}
	

}
