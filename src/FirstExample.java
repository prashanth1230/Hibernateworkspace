
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.*;

public class FirstExample
 {
	public static void main(String[] args) 
	{
		try
		{			
			SessionFactory sf = new Configuration().configure().buildSessionFactory();
			 Session s =sf.openSession();
				
			 System.out.println("Inserting Record");
			Contact contact = new Contact();
			contact.setFirstName("Deepak");
			contact.setLastName("Kumar");
			contact.setEmail("deepak_38@yahoo.com");
			
			s.save(contact);

			Transaction t = s.beginTransaction();
			t.commit();

			System.out.println("Done");
			s.close();
			s.flush();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		
	}
}
