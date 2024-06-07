package one_to_one_unidirectional_entity.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import one_to_one_unidirectional_entity.Employee;

import utils.HibernateUtils;

public class CreateEmployeeExampleMain {

	public static void main(String[] args) {
	
		try(
				SessionFactory factory = HibernateUtils.getSessionFactroy();
						Session sessionRef = factory.openSession();
						){
			Employee e1 = new Employee(123,"Divya Pawar",2030, null);
			Employee e2 = new Employee(432,"Shiv Pawar",2029, null);
			
			Transaction tx = sessionRef.beginTransaction();
			sessionRef.persist(e1);
			sessionRef.persist(e2);
			tx.commit();
			System.out.println("Employee Added....");
	}catch(Exception ex)
		{
		ex.printStackTrace();
	}

}
}