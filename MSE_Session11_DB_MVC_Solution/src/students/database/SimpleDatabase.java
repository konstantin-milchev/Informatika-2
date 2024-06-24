package students.database;

import java.util.List;

import students.mvc.model.Assistent;

public interface SimpleDatabase {

	public void setupDatabase();
	public void insertDataset(Assistent a);
	public void deleteDataset(Assistent a);
	public List<Assistent> getAllDatasets();
}
