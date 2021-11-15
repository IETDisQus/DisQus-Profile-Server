package dao;

import java.math.BigInteger;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import dto.Profile;
import dto.User;

public class Test {
	public static void main(String args[]) {
		
//		Profile p = new Profile();
//		p.setContact("987634521");
//		p.setBranch("CS");
//		p.setSection("A");
//		p.setSkills("java");
//		
//		ProfileDAO pr = new ProfileDAO();
//		boolean x = pr.saveProfile(p);
//		if(x == true) System.out.println("success");
		
		
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session s = factory.openSession();
		
		User u = (User)s.get(User.class,"poorbi");
		
		
		ProfileDAO pr = new ProfileDAO();
		
		Profile p1 = pr.fetchProfile(u);
		System.out.println(p1.toString());
		
		s.close();
	}
}
