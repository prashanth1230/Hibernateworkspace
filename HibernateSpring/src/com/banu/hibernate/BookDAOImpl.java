package com.banu.hibernate;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;

public class BookDAOImpl {
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	
	public void addObjects() {
		HibernateTemplate ht = new HibernateTemplate(this.sessionFactory);
		ht.save(new Book("Spring", "Banu", new Date(), 600.00));
		ht.save(new Book("Hibernate", "Rahul", new Date(), 500.00));
		ht.save(new Book("Hibernate", "ManingPubl", new Date(), 500.00));
	}

	public List getBooks() {
		HibernateTemplate ht = new HibernateTemplate(this.sessionFactory);
		return  ht.find("from com.banu.hibernate.Book");
	}
	public Collection loadProducts() {
		HibernateTemplate ht = new HibernateTemplate(this.sessionFactory);
		return (Collection) ht.execute(new HibernateCallback() {
			public Object doInHibernate(Session session)
					throws HibernateException {
				Query query = session
						.createQuery("from Book book");
				return query.list();
			}
		});
	}
}
