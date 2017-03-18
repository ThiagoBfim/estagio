package br.net.mirante.modulo6;

import java.sql.*;

public class Main {
	/**
	 * Adicionando comentario, pois não havia nenhum para ser removido.
	 * @param args
	 */
	public static void main(String args[]) {
		JDBCConnectionPool pool = new JDBCConnectionPool("org.hsqldb.jdbcDriver", "jdbc:hsqldb://localhost/mydb", "sa",
				"secret");
		Connection con = pool.checkOut();
		pool.checkIn(con);
	}
}