package students.database.orm.nosql;

import java.net.UnknownHostException;
import java.util.List;

import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

import students.database.SimpleDatabase;
import students.mvc.model.Assistent;

import com.mongodb.MongoClient;

public class NoSQLMorphia implements SimpleDatabase {

	// Database information
	static final String SERVERNAME = "188.165.195.206";
	static final String DATABASENAME = "uni_db";

	static Morphia morphia;
	static MongoClient mongo;

	public NoSQLMorphia() {
		setupDatabase();
	}

	@Override
	public void insertDataset(Assistent a) {
		System.out.println("NoSQLMorphia: insertDataset");
		// TODO: OPTIONAL NoSQLMorphia: insertDataset
		System.out.println("NoSQLMorphia: Not implemented yet!");

	}

	@Override
	public void deleteDataset(Assistent a) {
		System.out.println("NoSQLMorphia: deleteDataset");
		// TODO: OPTIONAL NoSQLMorphia: deleteDataset
		System.out.println("NoSQLMorphia: Not implemented yet!");

	}

	@Override
	public List<Assistent> getAllDatasets() {
		System.out.println("NoSQLMorphia: getAllDatasets");
		// TODO: OPTIONAL NoSQLMorphia: getAllDatasets
		System.out.println("NoSQLMorphia: Not implemented yet!");
		return null;
	}

	
	
	
	
	@Override
	public void setupDatabase() {
		System.out.println("NoSQLMorphia: setupDatabase");
		morphia = new Morphia();
		try {
			mongo = new MongoClient(SERVERNAME);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		Datastore datastore = morphia.createDatastore(mongo, DATABASENAME);
		morphia.mapPackage("model");
		datastore.ensureIndexes();
		System.out.println("NoSQLMorphia: Connection established!");

	}
}
