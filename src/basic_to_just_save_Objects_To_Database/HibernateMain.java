package basic_to_just_save_Objects_To_Database;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class HibernateMain {

	
	public static void main(String[] args) {
 
	  
	  @SuppressWarnings("deprecation")
	  SessionFactory sf=new AnnotationConfiguration().configure().buildSessionFactory();
	  Session session=sf.openSession();
	  session.beginTransaction(); 
	  for(int i=1 ;i<=10;i++){
		  UserDetails userDetails=new UserDetails();
		  userDetails.setName("user "+i);
	  session.save(userDetails);
	  }
	  
	  session.getTransaction().commit();
	  
	 
			 
	  

	}

}
