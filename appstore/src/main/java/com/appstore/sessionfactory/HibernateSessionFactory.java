package com.appstore.sessionfactory;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.appstore.exception.DataAccessException;

public class HibernateSessionFactory {
	private static SessionFactory factory;

	private HibernateSessionFactory() {
	}

	public static SessionFactory getSessionfactory() {

		try {
			if (factory == null) {
				StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
						.configure("hibernate.cfg.xml").build();

				factory = new MetadataSources(serviceRegistry).buildMetadata().buildSessionFactory();
			}
		} catch (HibernateException e) {
			throw new DataAccessException(e.getCause().getMessage());
		}
		return factory;
	}

	public SessionFactory getfactory() {
		return factory;
	}

}