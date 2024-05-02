package com.seliniumexpress.hibernate.hibernate_first_project;

import java.io.ObjectInputStream.GetField;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.seliniumexpress.Entity.Song;
import com.seliniumexpress.utils.HibernateUtils;

public class DeleteApp 
{

	public static void main( String[] args )
	{
		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
		Session session=sessionFactory.openSession();
		
		Song song =session.get(Song.class,1);
		song.setSongName("telusa manasa--updatedd");
		
		session.beginTransaction();
		//load the object i wanna delete
		session.load(Song.class,1);
		//deleting the object that i just loaded
		session.delete(song);
		session.getTransaction().commit();
      
		//.out.println(song);
	}
}
