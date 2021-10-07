package org.egitim.gui.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import org.egitim.gui.model.Model;

public class View {
	
	private Model model;
	private JFrame frame;
	private JButton selectedButton;
	private JTextField textField;
	private JPanel contentPanel;
	private JTextArea detailedText;
	
	/*
	 * iş katmanı ve veri katmanı arasında */
	
	public void createAndShowGui(Model model) {
		this.model = model;
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int height = screenSize.height * 2 / 8;
		int width = screenSize.width * 2 / 16;
		
		frame = new JFrame("Movie");
		frame.setPreferredSize(new Dimension(width, height));

		textField = new JTextField(25);
		textField.setBounds(100,100,200,40);
		frame.add(textField, BorderLayout.NORTH);
		/*
		detailedText = new JTextArea();
		detailedText.setEditable(false);
		frame.add(detailedText,BorderLayout.CENTER);
		*/
		selectedButton = new JButton("Open File");
		frame.add(selectedButton, BorderLayout.SOUTH);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.pack();
		frame.setVisible(true);
	}
	
	void createPanel(JFrame frame) {
		//	contentPanel = new JPanel();
		
	}
	
	public File getFile() {
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
		
		fileChooser.showOpenDialog(frame);
		return fileChooser.getSelectedFile();
	}
	
	public void update( ) {
		textField.setText(model.getFile());
	}
	
	public JButton getSelectedFileButton( ) {
		return selectedButton;
	}

}
