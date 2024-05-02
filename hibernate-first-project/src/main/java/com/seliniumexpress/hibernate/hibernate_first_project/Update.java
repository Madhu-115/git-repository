package com.seliniumexpress.hibernate.hibernate_first_project;

import java.io.ObjectInputStream.GetField;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.seliniumexpress.Entity.Song;
import com.seliniumexpress.utils.HibernateUtils;

public class Update 
{

	public static void main( String[] args )
    {
		SessionFactory sessionFactory =HibernateUtils.getSessionFactory();
		if(sessionFactory != null) {
		Session session=sessionFactory.openSession();
		
		
//		Song song =session.get(Song.class,2);
//		
//		session.beginTransaction();
//		song.setSongName("Beliver123");
//		session.getTransaction().commit();
		
		session.beginTransaction();
		
		Song song =session.get(Song.class,2);
		
		System.out.println(song);
	    session.getTransaction().commit();
    }
    }
	
}
