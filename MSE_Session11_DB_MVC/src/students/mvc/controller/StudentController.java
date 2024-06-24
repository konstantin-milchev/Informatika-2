package students.mvc.controller;

import java.sql.SQLException;
import java.util.List;

import javax.swing.DefaultListModel;

import students.database.mysql.MySQL;
import students.mvc.model.Assistent;

public class StudentController {
	
	MySQL mysql = new MySQL();

	public StudentController() throws SQLException {

	}

	public void insertDataset(Assistent a, DefaultListModel<Assistent> listModel) {

		System.out.println("StudentController: insertDataset");
		//TODO: TASK11: Implement the method insertDataset()
		// Write Assistant to database;
		// Load all assistants from database and refresh/update the list
		mysql.insertDataset(a);
		listModel.addElement(a);
		//System.out.println("StudentController: Not implemented yet!");
	}

	public void deleteDataset(Assistent a, DefaultListModel<Assistent> listModel) {
		//TODO: TASK13: Implement the method deleteDataset()
		System.out.println("StudentController: deleteDataset");
		// Delete Assistant from database;
		// Load all assistants from database and refresh/update the list
		mysql.deleteDataset(a);
		listModel.removeElement(a);
		//System.out.println("StudentController: Not implemented yet!");
	}

	public void refreshDataset(DefaultListModel<Assistent> listModel) {
		//TODO: TASK12: Implement the method refreshDataset()
		System.out.println("StudentController: refreshDataset");
		// Load all assistants from database and refresh/update the list
		listModel.removeAllElements();
		for(Assistent a : mysql.getAllDatasets()) {
			listModel.addElement(a);
		}
		//System.out.println("StudentController: Not implemented yet!");
	}

}
