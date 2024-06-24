package students.database.mysql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import students.database.SimpleDatabase;
import students.mvc.model.Assistent;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

public class MySQL implements SimpleDatabase {

	// Database information
	static final String USER = "mse";
	static final String PASSWORD = "mse";
	static final String SERVERNAME = "188.165.195.206";
	static final String DATABASENAME = "uni_db";

	MysqlDataSource ds = null;
	Connection connection = null;

	public MySQL() throws SQLException {
		setupDatabase();
	}

	@Override
	public List<Assistent> getAllDatasets() {
		System.out.println("MySQL: getAllDatasets");
		List<Assistent> assistantList = new LinkedList<Assistent>();
		try {
			Statement stmt = connection.createStatement();
			ResultSet result = stmt.executeQuery("select * from Assistenten;");
			//prepare return object
			int persNr, boss;
			String name, fachgebiet;
			Assistent a;
			while(result.next()) {
				persNr = result.getInt(1);
				name = result.getString(2);
				fachgebiet = result.getString(3);
				boss = result.getInt(4);
				a = new Assistent(persNr, name, fachgebiet, boss);
				assistantList.add(a);
			}
			stmt.close();
		} catch (Exception e) {
			System.err.println("Error: " + e);
			System.exit(-1);
		}
		
		return assistantList;
	}

	@Override
	public void insertDataset(Assistent a) {
		System.out.println("MySQL: insertDataset");
		
		try {
			Statement s = connection.createStatement();
			String query = String.format("INSERT INTO Assistenten(persNr, name, "
					+ "fachgebiet, boss) VALUES (\"%d\", \"%s\", \"%s\", \"%d\");",
					a.getPersNr(), a.getName(), a.getFachgebiet(), a.getBoss());
			s.execute(query);
			s.close();
		} catch (SQLException e) {
			System.err.println("Error: " + e);
		}
	}

	@Override
	public void deleteDataset(Assistent a) {
		System.out.println("MySQL: deleteDataset");
		try {
			Statement s = connection.createStatement();
			String query = String.format("DELETE FROM Assistenten WHERE persNr = '%d';",
					a.getPersNr());
			s.execute(query);
			s.close();
		} catch (SQLException e) {
			System.err.println("Error: " + e);
		}
	}

	@Override
	public void setupDatabase() {
		System.out.println("MySQL: setupDatabase");
		ds = new MysqlDataSource();
		ds.setServerName(SERVERNAME);
		ds.setPortNumber(3306);
		ds.setDatabaseName(DATABASENAME);
		ds.setUser(USER);
		ds.setPassword(PASSWORD);
		try {
			connection = ds.getConnection();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		System.out.println("MySQL: Connection established!");
	}
}
