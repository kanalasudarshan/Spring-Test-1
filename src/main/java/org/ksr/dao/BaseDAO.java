package org.ksr.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("baseDao")
public class BaseDAO {
	@Autowired
	SessionFactory sessionFactory;
	
	public void getData(){
		Session session=sessionFactory.openSession();
		Transaction tx= session.beginTransaction();
		UserDTO dto=(UserDTO)session.get(UserDTO.class, 1l);
		System.out.println(dto.getUserName());
		dto.setUserName("Sudarshan reddy");
		tx.commit();
		session.close();
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	
}
