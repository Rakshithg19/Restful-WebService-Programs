package raksh.laptop.Laptop_Details.dao;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Singleton {
	private static SessionFactory factory;
	public static SessionFactory  getFactory() {
		return factory;
		
	}
	static {
		try {
			Configuration cfg = new Configuration();
			cfg.configure("resources/hibernate.cfg.xml");
		}
		catch (HibernateException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		}
	}

