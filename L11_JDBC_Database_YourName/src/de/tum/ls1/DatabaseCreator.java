package de.tum.ls1;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DatabaseCreator {

	public static void setupDatabase() throws IOException {
		String[] statements = SQLFileParser.parseSQLFile("/uni_mysql.sql");
		
		Connection connection = null;
		try {
			Class.forName("org.h2.Driver");
			connection = DriverManager.getConnection("jdbc:h2:~/info2", "sa", "");
			for (int i = 0; i < statements.length; i++) {
				Statement statement = connection.createStatement();
				statement.executeUpdate(statements[i]);
				statement.close();
			}
		} catch (Exception e) {
			System.err.println("Error: " + e);
			System.exit(-1);
		}
	}
	
	public static void main(String[] args) throws IOException {
		DatabaseCreator.setupDatabase();
	}
	
}
