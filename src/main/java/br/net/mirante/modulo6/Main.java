package br.net.mirante.modulo6;

import java.sql.*;

public class Main {
	public static void main(String args[]) {
		JDBCConnectionPool pool = new JDBCConnectionPool("org.hsqldb.jdbcDriver", "jdbc:hsqldb://localhost/mydb", "sa",
				"secret");
		Connection con = pool.checkOut();
		pool.checkIn(con);
	}
}