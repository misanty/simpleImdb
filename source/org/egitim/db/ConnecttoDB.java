package org.egitim.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnecttoDB {

	private static Connection connection;

	public static Connection connectDB() {
		connectionInit();
		return getConnection();
	}

	private static Connection getConnection() {
		return connection;
	}

	private static void setConnection(Connection connection) {
		ConnecttoDB.connection = connection;
	}

	private ConnecttoDB() {

	}

	/*
	 * https://www.postgresqltutorial.com/postgresql-sample-database/ sample DB is used to retrieve the sample movie infos.
	 * 
	 */
	private static void connectionInit() {
		if (getConnection() == null) {
			String url = "jdbc:postgresql://localhost/dvdrental";
			Properties props = new Properties();
			props.setProperty("user", "yazilimkoyu");
			props.setProperty("password", "password");
			props.setProperty("ssl", "false");
			try {
				setConnection(DriverManager.getConnection(url, props));
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
	}

	public static void closeConnection() {
		try {
			getConnection().close();
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

}
