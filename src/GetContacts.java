import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class GetContacts {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s =sf.openSession();
			
		System.out.println("Inserting Record");
		Contact contact = new Contact();
		

		System.out.println("Done");
		s.close();
		s.flush();

	}

}
