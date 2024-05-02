package com.seliniumexpress.hibernate.hibernate_first_project;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.seliniumexpress.Entity.Song;
import com.seliniumexpress.utils.HibernateUtils;

public class CreateApp 
{
    public static void main( String[] args )
    {
//    	//create configuration
//    	//configuration is a class that which will gives you to bootstrap  hibernate application
//    	Configuration configuration = new Configuration();
//    	configuration.configure("hibernate.cfg.xml");
//    	configuration.addAnnotatedClass(Song.class);
//    
//    	
//    	//create session factory(datasuorce=session factory)
//    	//data source(which will gives you to connect with database) is the session factory 
//    	// to create the session factory we need some configuration.
//       SessionFactory sessionFactory = configuration.buildSessionFactory();//singleton
//       
    	
    	//initialize the session object
    	//to create the session object we need  session factory
    	//In hibernate we have a helper class that is session
    	//session which will gives API methods such as save(),update().--save the objects in db
       SessionFactory sessionFactory =HibernateUtils.getSessionFactory();
       Session session = sessionFactory.openSession();
       
       Song song1 =new Song();//transient//persistent//detached
       
       //song1.setSongId(2);
       song1.setSongName("little bit pshyco");
       song1.setArtist("unknown");
       
       session.beginTransaction();
       session.save(song1);
       session.getTransaction().commit();
       
       System.out.println("song saves..check db!!");
       session.close();
       }
    
    //TRASNASCTION:to generate the query
    //hibernate.show_sql showing the query in  sql it will insert internally my data to my database
}
