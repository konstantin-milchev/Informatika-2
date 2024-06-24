package students.database.nosql;

import java.net.UnknownHostException;
import java.util.LinkedList;
import java.util.List;

import students.database.SimpleDatabase;
import students.mvc.model.Assistent;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

public class NoSQL implements SimpleDatabase {

	// Database information
	static final String SERVERNAME = "188.165.195.206";
	static final String DATABASENAME = "uni_db";
	DBCollection assistenten;

	public NoSQL() {
		setupDatabase();
	}

	@Override
	public void setupDatabase() {
		System.out.println("NoSQL: setupDatabase");
		MongoClient mongoClient = null;

		DB db;
		try {
			mongoClient = new MongoClient(SERVERNAME, 27017);
		} catch (UnknownHostException e) {

			e.printStackTrace();
		}
		db = mongoClient.getDB(DATABASENAME);
		assistenten = db.createCollection("Assistenten", null);
		System.out.println("MySQL: Connection established!");
	}

	@Override
	public void insertDataset(Assistent a) {
		System.out.println("NoSQL: insertDataset");
		// TODO: OPTIONAL NoSQL: insertDataset - use assistenten collection and BasicDBObject
		System.out.println("NoSQL: Not implemented yet!");
	}

	@Override
	public void deleteDataset(Assistent a) {
		System.out.println("NoSQL: deleteDataset");
		// TODO: OPTIONAL NoSQL: deleteDataset - use assistenten collection and BasicDBObject
		System.out.println("NoSQL: Not implemented yet!");
		

	}

	@Override
	public List<Assistent> getAllDatasets() {
		System.out.println("NoSQL: getAllDatasets");
		// TODO: OPTIONAL NoSQL: getAllDatasets - use assistenten collection
		
		/**
		 * Iterate over a DBCursor by calling assistenten.find(); retrieve
		 * object properties by their name and cast them to String/Integer
		 */
		System.out.println("NoSQL: Not implemented yet!");
		return null;
	}

}
