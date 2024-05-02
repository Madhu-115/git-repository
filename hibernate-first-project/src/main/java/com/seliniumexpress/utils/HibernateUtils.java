package com.seliniumexpress.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.seliniumexpress.Entity.Song;

public class HibernateUtils {
	
	private static SessionFactory sessionFactory=null;
	
	public static SessionFactory getSessionFactory() {
		
		try
		{
		if(sessionFactory == null){
			
		Configuration configuration = new Configuration();
    	configuration.configure();
    	configuration.addAnnotatedClass(Song.class);
    
        sessionFactory = configuration.buildSessionFactory();//singleton
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("session factory object did not craeted because of some issue");
		}
        return sessionFactory;
}

}
