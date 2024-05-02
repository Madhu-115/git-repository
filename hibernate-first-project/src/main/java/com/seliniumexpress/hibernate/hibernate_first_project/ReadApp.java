package com.seliniumexpress.hibernate.hibernate_first_project;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.seliniumexpress.Entity.Song;
import com.seliniumexpress.utils.HibernateUtils;

public class ReadApp 
{

	public static void main( String[] args )
    {
		
		SessionFactory sessionFactory =HibernateUtils.getSessionFactory();

    	Session session =sessionFactory.openSession();
    	session.beginTransaction();
    	session.getTransaction();
    	Song song=session.load(Song.class, 1);
    	
    	//System.out.println("does song object managed by session - "+session.contains(song));
    	//session.getTransaction().commit();
    	
    	System.out.println(song);
    	session.close();
    	//session.detach(song);//removed that song object from session
    	//false
    	//System.out.println("does song object managed by session -"+session.contains(song));
    }

	
}
