package raksh.laptop.Laptop_Details.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import raksh.laptop.Laptop_Details.entity.LaptoEntity;

public class LaptopDAOimpl implements LaptoDAO {
private SessionFactory factory = null;
Session session = null;
	@Override
	public void save(List <LaptoEntity> entity) {
try {
		factory = Singleton.getFactory();
		session = factory.openSession();
		session.beginTransaction();
		session.save(entity);
		session.getTransaction().commit();
	}
		catch(HibernateException he) {
			he.printStackTrace();
		}
		finally {
			session.close();
		}
	}

	@Override
	public LaptoEntity retrieveById(int id) {
	try {
		factory = Singleton.getFactory();
	
		session = factory.openSession();
		session.beginTransaction();
		LaptoEntity entity = session.get(LaptoEntity.class, id);
	}
	catch (HibernateException e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	finally {
		session.close();
	}
	return null;
	}
	@Override
	public void updateRow(String newName, int id) {
		try {
			factory = Singleton.getFactory();
			session = factory.openSession();
			session.beginTransaction();
			LaptoEntity entity = session.get(LaptoEntity.class, id);
			if(entity != null) {
				System.out.println("Entity Founded");
				entity.setName(newName);
				session.update(entity);
			}else {
				System.out.println("Entity Not Found, Use Diffrent Programming Language.");
			}
			session.getTransaction().commit();
			System.out.println("tranzaction commited");
		}
		catch (HibernateException e) {
			e.printStackTrace();
		}
		finally {
			session.close();
		}
		
	}

	@Override
	public void deleteRowById(int id) {
		try {
			factory = Singleton.getFactory();
			session = factory.openSession();
			session.beginTransaction();
			LaptoEntity removableEntity = session.load(LaptoEntity.class, id);
			
			if(removableEntity != null) {
				System.out.println("Entity Founded, JVM Is Great Now JVM able to update it.");
				session.delete(removableEntity);
				System.out.println("deleted");
			}else {
				System.out.println("Entity Not Found, Use Diffrent Programming Language.");
			}
			
			session.getTransaction().commit();
			System.out.println("tranzaction commited");
		
	}
		catch (HibernateException e) {
			e.printStackTrace();
		}
		finally {
			session.close();
		}

		}

}
