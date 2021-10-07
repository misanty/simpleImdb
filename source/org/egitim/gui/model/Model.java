package org.egitim.gui.model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Model {
	private String openFile;

	public String getFile() {
		return openFile;
	}

	public void setFile(String doSomething) {
		this.openFile = doSomething;
	}
	
	

}
