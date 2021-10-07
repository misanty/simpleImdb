package org.egitim.gui.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.egitim.db.ConnecttoDB;
import org.egitim.db.SelectActorMovie;
import org.egitim.gui.model.Model;
import org.egitim.gui.view.View;

/* The controller controls the view and model.
 * Based on the user action, the Controller calls methods in the View and Model
 * to accomplish the requested action.
 */


/*
 * okuyup domaine veriyor
 * view bunu controllera gönderiyor*/
public class Controller implements ActionListener {

	private final Model model;
	private final View view;

	 public Controller(View view, Model model) {
		this.model = model;
		this.view = view;
		view.createAndShowGui(model);
		view.getSelectedFileButton().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		File file = view.getFile();
		model.setFile(file == null ? "No File Selected" : file.getName());
		view.update();

	}
	
	
		
	
	

}
