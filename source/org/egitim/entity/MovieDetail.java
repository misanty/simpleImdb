package org.egitim.entity;

import java.util.EnumSet;
import java.util.Map;
/*
 * A casting member can be an actor and director, and also a writer, 
 * therefor PersonRoles typed EnumSet is set as a value pair of the Map object
 */
public class MovieDetail extends Movie {
	
	private Map<Cast,EnumSet<PersonRoles>> casting;
	private double rank;
	

	public Map<Cast,EnumSet<PersonRoles>> getCasting() {
		return casting;
	}

	public void setCasting(Map<Cast,EnumSet<PersonRoles>> casting) {
		this.casting = casting;
	}

	public double getRank() {
		return rank;
	}

	public void setRank(double rank) {
		
		this.rank = (rank >= 1 && rank <= 10 ? rank : (rank % 10));
	}
	

}
