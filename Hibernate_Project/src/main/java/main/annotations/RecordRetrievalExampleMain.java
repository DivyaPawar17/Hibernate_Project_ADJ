package main.annotations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import entertainment.entity.annotations.Movie;
import utils.HibernateUtils;

public class RecordRetrievalExampleMain {

	public static void main(String[] args) {
		try(
				SessionFactory sf = HibernateUtils.getSessionFactroy();
						Session sessionRef = sf.openSession();
						){
			Class<Movie> entityType = Movie.class;
			Object identity = 103;  //identity = new integer(101)
			Movie foundMovie = sessionRef.find(entityType, identity);
			//select * from movie_master_details where movie_id = ?
			//? ----> 101
			if(foundMovie != null) {
			System.out.println(foundMovie);
			System.out.println("Movie Title: "+foundMovie.getTitle());
		}
			else
			System.out.println("Movie with given id Does Not Exist....");
				}catch(Exception ex)
				{
					ex.printStackTrace();
				}
			}
	}


