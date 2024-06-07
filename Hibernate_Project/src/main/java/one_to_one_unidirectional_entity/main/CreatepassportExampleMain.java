package one_to_one_unidirectional_entity.main;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import one_to_one_unidirectional_entity.Passport;
import utils.HibernateUtils;

public class CreatepassportExampleMain {

	public static void main(String[] args) {
		try(
				SessionFactory factory = HibernateUtils.getSessionFactroy();
						Session sessionRef = factory.openSession();
						){
			Passport p1 = new Passport("P123","Divya Pawar",LocalDate.of(2030, 6, 12));
			Passport p2 = new Passport("P432","Shiv Pawar",LocalDate.of(2029, 12, 12));
			
			
			Transaction tx = sessionRef.beginTransaction();
			sessionRef.persist(p1);
			sessionRef.persist(p2);
			tx.commit();
			System.out.println("Passports Created....");
	}catch(Exception ex)
		{
		ex.printStackTrace();
	}

}
}