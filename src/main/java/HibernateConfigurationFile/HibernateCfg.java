package HibernateConfigurationFile;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.AddressEmp;
import com.entity.Emp2;
import com.entity.Employee;

public class HibernateCfg {

	
	public static SessionFactory sessionFactoryconfigure()
	{
		Configuration configuration=new Configuration();
		configuration.configure().addAnnotatedClass(AddressEmp.class).addAnnotatedClass(Employee.class).addAnnotatedClass(Emp2.class);
		SessionFactory factory=configuration.buildSessionFactory();
		
		return factory;
	}
	
	
	
	
}
