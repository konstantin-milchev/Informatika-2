package students.database.mysql;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
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
		// TODO: TASK1: Implement the method getAllDatasets() - use connection
		// and statement
		try {
			Statement s = connection.createStatement();
			s.execute("SELECT * from Assistenten");
			ResultSet rs = s.getResultSet();
			LinkedList<Assistent> list = new LinkedList<Assistent>();
			while (rs.next()) {
				Assistent a = new Assistent();
				a.setPersNr(rs.getInt(1));
				a.setName(rs.getString(2));
				a.setFachgebiet(rs.getString(3));
				a.setBoss(rs.getInt(4));
				list.add(a);
			}
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public void insertDataset(Assistent a) {
		System.out.println("MySQL: insertDataset");
		// TODO: TASK2: Implement the method insertDataset() - use connection
		// and statement
		Statement s;
		try {
			s = connection.createStatement();
			s.execute("INSERT INTO Assistenten(PersNr, Name, Fachgebiet, Boss) VALUES ('" 
					+ a.getPersNr() + "' , '" 
					+ a.getName() + "' , '"
					+ a.getFachgebiet() + "' , '" 
					+ a.getBoss() + "');");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void deleteDataset(Assistent a) {
		System.out.println("MySQL: deleteDataset");
		// TODO: TASK3: Implement the method deleteDataset() - use connection
		// and statement
		Statement s;
		try {
			s = connection.createStatement();
			s.execute("DELETE FROM Assistenten WHERE PersNr = '" + a.getPersNr() + "';");
		} catch (SQLException e) {

			e.printStackTrace();
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
