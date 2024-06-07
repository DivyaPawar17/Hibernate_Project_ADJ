package main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import entertainment.entity.Movie;


public class RecordInsertionExampleMain {

	public static void main(String[] args) {
		
		//Step 1 Configure Hibernate Using Configuration class
		Configuration hibernateConfig = new Configuration();
		hibernateConfig = hibernateConfig.configure();
		
		//Step 2 Obtain SessionFactory using this configuration
		SessionFactory hibernateFactory = hibernateConfig.buildSessionFactory();
		
		//Step 3 Obtain session using this sessionFactroy 
		//hibernatefactory is a session factory.
		Session hibernateSession = hibernateFactory.openSession();
		
		//Step 4 Create Entity Class Object
		Movie movieObj = new Movie(102,"PK", "Fantasy", 2014);
		
		//Step 5 Start and Obtain transaction using session
		Transaction hibernateTransaction = hibernateSession.beginTransaction();
		
		//Step 6 Save the object using session
		hibernateSession.persist(movieObj);
		
		//Step 7 Commit the Transaction
		 hibernateTransaction.commit();
		 
		 //Step 8 Close the Session
		 hibernateSession.close();
		 
		 //Step 9 Close the SesssionFactory
		 hibernateFactory.close();
		 
		 System.out.println("Record Inserted....");
		
		
	}

}
