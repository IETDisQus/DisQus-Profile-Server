package dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import dto.Profile;
import dto.User;

public class ProfileDAO {
	
	public static SessionFactory getSessionFactory() {
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		return factory;
		
	}
	
	public boolean saveProfile(Profile p) {
		boolean success = false;
		SessionFactory f = ProfileDAO.getSessionFactory();
		Session s = f.openSession();
		Transaction tx = s.beginTransaction();
		try {
		s.save(p);
		success = true;
		tx.commit();
		}
		catch (Exception e) {
			e.printStackTrace();
			return false;
			
		}
		finally {
			s.close();
		}
		
		return success;
	}
	
	public Profile fetchProfile(User u) {
		Profile p = null;
		SessionFactory f = ProfileDAO.getSessionFactory();
		Session s = f.openSession();
		try {
		p = (Profile)s.get(Profile.class,u.getProfile().getProfileId());
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
			
		}
		finally {
			s.close();
		}
		
		return p;
	}

}
