package one_to_one_unidirectional_entity.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import one_to_one_unidirectional_entity.Employee;
import one_to_one_unidirectional_entity.Passport;
import utils.HibernateUtils;

public class LinkPassportToEmployeeExampleMain {

	public static void main(String[] args) {
		try(
				SessionFactory factory = HibernateUtils.getSessionFactroy();
						Session sessionRef = factory.openSession();
						){

			Class<Passport> passportType = Passport.class;
			Class<Employee> employeeType  = Employee.class;
			
			Passport p1 = sessionRef.find(passportType, "P123");
			
			Passport p2 = sessionRef.find(passportType,"P432");
			
			Employee e1 = sessionRef.find(employeeType, 123);
			Employee e2 = sessionRef.find(employeeType, 432);
			
			Transaction tx = sessionRef.beginTransaction();
			e1.setPassportRef(p1);
			e2.setPassportRef(p2);
			tx.commit();
			System.out.println("Passport linked to Employee");
	}catch(Exception ex)
		{
		ex.printStackTrace();
	}

}

	
	}

