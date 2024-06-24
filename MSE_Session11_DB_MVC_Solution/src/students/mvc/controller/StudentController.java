package students.mvc.controller;

import java.sql.SQLException;
import java.util.List;

import javax.swing.DefaultListModel;

import students.database.mysql.MySQL;
import students.database.orm.mysql.MySQLHibernate;
import students.mvc.model.Assistent;

public class StudentController {
	MySQLHibernate mysqlhibernate = new MySQLHibernate();

	public StudentController() throws SQLException {

	}

	public void insertDataset(Assistent a, DefaultListModel<Assistent> listModel) {
		System.out.println("StudentController: insertDataset");
		//TODO: TASK11: Implement the method insertDataset()
		// Write Assistant to database;
		mysqlhibernate.insertDataset(a);
		// Load all assistants from database and refresh/update the list
		listModel.addElement(a);

	}

	public void deleteDataset(Assistent a, DefaultListModel<Assistent> listModel) {
		System.out.println("StudentController: deleteDataset");
		//TODO: TASK13: Implement the method deleteDataset()
		// Delete Assistant from database;
		mysqlhibernate.deleteDataset(a);
		// Load all assistants from database and refresh/update the list
		listModel.removeElement(a);

	}

	public void refreshDataset(DefaultListModel<Assistent> listModel) {
		System.out.println("StudentController: refreshDataset");
		//TODO: TASK12: Implement the method refreshDataset()
		listModel.removeAllElements();
		// Load all assistants from database and refresh/update the list
		List<Assistent> assis = mysqlhibernate.getAllDatasets();
		for (Assistent a : assis) {
			listModel.addElement(a);
		}
	}

}
