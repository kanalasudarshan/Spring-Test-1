package org.ksr;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {

	private static SessionFactory sessionFactory;
	private HibernateUtil(){		
	}
	static{
		Configuration cfg=new Configuration().configure();
		ServiceRegistry serviceRegistry=new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();
		sessionFactory=cfg.buildSessionFactory(serviceRegistry);
	}
	public static SessionFactory getSessionFactory(){
		return sessionFactory;
	}
}
