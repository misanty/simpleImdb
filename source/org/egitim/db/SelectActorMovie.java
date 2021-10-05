package org.egitim.db;

import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectActorMovie {
	static final String QUERY = "SELECT actor_id, first_name, last_name, film_info FROM public.actor_info LIMIT 5";
	private static ResultSet result;

	public static ResultSet actorMovieDetail() {
		try {
			Statement st = ConnecttoDB.connectDB().createStatement();
			result = st.executeQuery(QUERY);
			ConnecttoDB.closeConnection();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return result;
	}

}
