package br.net.mirante.modulo6;

import java.sql.*;

public class Main {
	public static void main(String args[]) throws SQLException {
		// Do something...
		try {
			Class.forName("org.hsqldb.jdbcDriver").newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// Create the Connection:
		Connection connection = DriverManager.getConnection("jdbc:hsqldb:/localhost/mydb", "sa", "secret");
		System.out.println("opened");
		// Use the connection...
		// Close the connection:
		connection.close();
		System.out.println("closed");
	}
}