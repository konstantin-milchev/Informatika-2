package de.tum.ls1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Exercise1 {
	public static void main(String[] argv) {
		Statement statement = null;
		Connection connection = null;
		
		// Open connection
		try {
			Class.forName("org.h2.Driver");
			connection = DriverManager.getConnection("jdbc:h2:~/info2", "sa", "");
			statement = connection.createStatement();
		} catch (Exception e) {
			System.err.println("Error: " + e);
			System.exit(-1);
		}
		
		// TODO: Put your own queries here
		
		// Clean up
		try {
			statement.close();
			connection.close();
		} catch (SQLException e) {
			System.out.println("Error when closing DB connection: " + e);
		}
	}
}
