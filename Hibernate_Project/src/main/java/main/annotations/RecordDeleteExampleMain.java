package main.annotations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import entertainment.entity.annotations.Movie;
import utils.HibernateUtils;

public class RecordDeleteExampleMain {

	public static void main(String[] args) {

		try(
				SessionFactory sf = HibernateUtils.getSessionFactroy();
						Session sessionRef = sf.openSession();
						){
			Class<Movie> entityType = Movie.class;
			Object identity = 102; 
			Movie foundMovie = sessionRef.find(entityType, identity);
			
			Transaction tx = sessionRef.beginTransaction();
			sessionRef.remove(foundMovie);
			tx.commit();
			System.out.println("Record Deleted....");
			
			
				}catch(Exception ex)
				{
					ex.printStackTrace();
				}
			}
	}