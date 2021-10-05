package org.egitim.gui;
import javax.swing.JFrame;
import javax.swing.JPanel;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
/*
 * In this stage 3 beans are created, one of which takes 2 different objects as a constructor arguments.
 * If I had more time I could've implemented all other beans and print result set from the db on the swing gui.
 * I lack of knowledge of Swing library, that's why I made very simple app.
 * I tried to connect my localhost and retrieve the data, and it worked.
 * 
 * App opens a file dialog box, and select a file name and prints it on the textbox.
 */
	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		System.out.println(context.getBean("controller",Controller.class));
		context.close();

	}

}
