package students;

import java.sql.SQLException;
import java.util.List;

import mvc.MVC;
import students.database.mysql.MySQL;
import students.database.orm.mysql.MySQLHibernate;
import students.mvc.controller.StudentController;
import students.mvc.model.Assistent;

public class Main {

	public static void main(String[] args) throws SQLException {

		
		/**
		 * Welcome to Session 12
		 * In this session we want to create our first graphical user interface application
		 * containing a database connection to retrieve and manipulate data.
		 * 
		 * You have to work on the following steps to get the full project running.
		 * 
		 * To easily jump to your Classes/Tasks setup the Tasks menu:
		 * Window -> Show View -> Tasks
		 * Select the little downarrow (on the right in the task bar) -> Configure Contents
		 * Deselect "show all items" and select : "On any Element in the same Project"
		 * 
		 * 1.) Setup your MySQL Connection the "manual" way.
		 * 1.1) TASK1: Implement the method getAllDatasets()
		 * 1.2) TASK2: Implement the method insertDataset()
		 * 1.3) TASK3: Implement the method deleteDataset()
		 * 1.4) TASK4: Test your implementation in his main class!
		 * 
		 * 2.) Setup your MySQLHibernate Connection the "easy" way.
		 * 2.1) TASK5: Annotate the Assistent Class with the minimum Annotations @Entity and @Id for your persNr Id field
		 * 2.2) TASK6: Implement the method getAllDatasets()
		 * 2.3) TASK7: Implement the method insertDataset()
		 * 2.4) TASK8: Implement the method deleteDataset()
		 * 2.5) TASK9: Test your implementation in his main class!
		 * 
		 * 
		 * 3.) TASK10: Remove the MVC comment below and start your application.
		 * 3.1) After pressing the refresh, insert, and delete buttons you will see outputs
		 * that certain functionalities haven't been implemented yet.
		 * 3.2) TASK11: Implement the method insertDataset() in your StudentController - use MySQLHibernate or MySQL
		 * 3.3) TASK12: Implement the method refreshDataset() in your StudentController - use MySQLHibernate or MySQL
		 * 3.4) TASK13: Implement the method deleteDataset() in your StudentController  -use MySQLHibernate or MySQL
		 */
		
		
		//TODO: TASK4: Test your implementation in his main class!
		//TODO: TASK9: Test your implementation in his main class!
		
		
		// Start our MySQL Service, setupDatabase() is called in Constructor.
		//Your database is ready but you have to implement some methods see above
		MySQL mysql = new MySQL();
		List<Assistent> assistentenList = mysql.getAllDatasets();
		for(Assistent a : assistentenList) {
			System.out.println(a);
		}
		System.out.println("------- Test INSERT --------");
		Assistent b = new Assistent(5678, "Boltzmann", "TD", 2125);
		System.out.println(b);
		mysql.insertDataset(b);
		assistentenList = mysql.getAllDatasets();
		for(Assistent a : assistentenList) {
			System.out.println(a);
		}
		System.out.println("------- Ende INSERT --------");
		
		System.out.println("------- Test DELETE --------");
		mysql.deleteDataset(b);
		assistentenList = mysql.getAllDatasets();
		for(Assistent a : assistentenList) {
			System.out.println(a);
		}
		System.out.println("------- Ende DELETE --------");
		
		// Start our MySQL Service, setupDatabase() is called in Constructor.
		//Your database is ready but you have to implement some methods see above
		MySQLHibernate mysqlhibernate = new MySQLHibernate();
		
		
		/**
		 * Start the MVC Framework example, you need to pass a StudentController
		 * as Parameter, StudentController is a wrapper for the normal MVC
		 * concept and hides the complexity of model view and controller setup.
		 * 
		 * You should be familiar with the Model View Controller principle so if
		 * you are interested in the code please download the mvc.source.zip
		 * provided in moodle.
		 * 
		 */
		//TODO: TASK10: Remove the MVC comment below and start your application.
		MVC mvc = new MVC(new StudentController());
		
		
		
		
		
		/**
		 * 
		 * Due to time constrains we are most likely not able to cover nosql and the according orm
		 * in this session. The comments should help you to work on it on your own.
		 */
		// Start our NOSQL Service, setupDatabase() is called in Constructor.
		//NoSQL nosql = new NoSQL();
		// Start our NOSQL Service, setupDatabase() is called in Constructor.
		//NoSQLMorphia nosqlmorphia = new NoSQLMorphia();

		
		
	}

}
