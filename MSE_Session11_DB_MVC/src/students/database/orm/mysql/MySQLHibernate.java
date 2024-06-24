package students.database.orm.mysql;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import students.database.SimpleDatabase;
import students.mvc.model.Assistent;

public class MySQLHibernate implements SimpleDatabase {

	// Database information
	static final String USER = "mse";
	static final String PASSWORD = "mse";
	static final String SERVERNAME = "188.165.195.206";
	static final String DATABASENAME = "uni_db";

	SessionFactory factory;

	public MySQLHibernate() {
		setupDatabase();
	}

	@Override
	public void insertDataset(Assistent a) {
		Session s = factory.openSession();
		s.beginTransaction();
		// TODO: TASK7: Implement the method insertDataset() - use session
		System.out.println("MySQLHibernate: insertDataset");
		System.out.println("MySQLHibernate: Not implemented yet!");
		s.getTransaction().commit();
		s.close();

	}

	@Override
	public void deleteDataset(Assistent a) {
		Session s = factory.openSession();
		s.beginTransaction();
		// TODO: TASK8: Implement the method deleteDataset() - use session
		System.out.println("MySQLHibernate: deleteDataset");
		System.out.println("MySQLHibernate: Not implemented yet!");
		s.getTransaction().commit();
		s.close();
		
	}

	@Override
	public List<Assistent> getAllDatasets() {
		Session s = factory.openSession();
		s.beginTransaction();
		// TODO: TASK6: Implement the method getAllDatasets() - use session
		System.out.println("MySQLHibernate: insertDataset");
		System.out.println("MySQLHibernate: Not implemented yet!");
		s.getTransaction().commit();
		s.close();
		return null;
	}

	@Override
	public void setupDatabase() {
		System.out.println("MySQLHibernate: setupDatabase");
		// Database configuration hibernate based
		Configuration cfg = new Configuration();
		cfg.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
		cfg.setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");
		cfg.setProperty("hibernate.connection.url", "jdbc:mysql://" + SERVERNAME + ":3306/" + DATABASENAME);
		cfg.setProperty("hibernate.connection.username", USER);
		cfg.setProperty("hibernate.connection.password", PASSWORD);
		// looking for annotated classes for object relational mapping
		cfg.addAnnotatedClass(students.mvc.model.Assistent.class);

		// Creation of our sessionFactory, this allows us to open and close
		// sessions with the help of the database driver
		StandardServiceRegistry builder = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();
		factory = cfg.buildSessionFactory(builder);
		System.out.println("MySQLHibernate: Connection established!");

	}
}
