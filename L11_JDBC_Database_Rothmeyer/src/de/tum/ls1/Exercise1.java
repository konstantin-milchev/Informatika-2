package de.tum.ls1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
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
		// ----- TABLES -----
		try {
			ResultSet result = statement.executeQuery("show tables;");
			while(result.next()) {
				System.out.println("asdf\t" + result.getString("TABLE_NAME"));
			}
		} catch (SQLException sqle) {
			System.err.println("Error retrieving data: " + sqle);
		}

		// ----- STUDENTS -----
		try {
			ResultSet result = statement.executeQuery("select * from STUDENT where SEMESTER <= 8;");
			while(result.next()) {
				System.out.println("greenhorn\t" + result.getString("NAME"));
			}
		} catch (SQLException sqle) {

		}

		// ----- STUDENTS -----
		try {
			ResultSet result = statement.executeQuery("select count(*) from professor where RANK = 'C4';");
			while(result.next()) {
				System.out.println("bonzenzahl\t" + result.getInt("COUNT(*)"));
			}
		} catch (SQLException sqle) {

		}

		// Clean up
		try {
			statement.close();
			connection.close();
		} catch (SQLException e) {
			System.out.println("Error when closing DB connection: " + e);
		}
	}
}
