package Arcade.GUI;

import java.util.ArrayList;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

/* Demo by Lahiru Ariyananda and Peter Hall  
   Note :  this is very simple program  used as a  demo on  Serilizing and GUIs. 
   It does not test for faults or errors (  which needs to be implemented) 
 */



public class HRGUI extends JFrame 
{ 
	
	private JMenuBar menuBar;		//the horizontal container
	private JMenu adminMenu;
	private JMenu userMenu;//JMenu objects are added to JMenuBar objects as the "tabs"

	// File submenus

	// Admin 
	
	private JMenuItem adminPrintAll; 		//JMenuItem objects are added to JMenu objects as the drop down selections.
	private JMenuItem adminSetPayRate; 
	private JMenuItem userSave;
	private JMenuItem userLoad;
	
	
	public HRGUI(String windowTitle) 
	{
		super(windowTitle);

		

		setSize(300, 100);
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		add(new JLabel("<HTML><center>Welcome to Human Resource System" +
				"<BR>Choose an action from the above menus.</center></HTML>"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buildGUI();	
		setVisible(true);
	}
	
	
	public void buildGUI() 
	{
		menuBar = new JMenuBar();
     	
		// Employee Student Menu
		
		adminMenu = new JMenu("Administrator");
		userMenu = new JMenu("File");
		
		
		adminSetPayRate = new JMenuItem ("Set PayRate" );
		adminPrintAll = new JMenuItem("Print Employee Info");
		userSave = new JMenuItem("Save");
		userLoad = new JMenuItem("Load");

		adminSetPayRate.addActionListener(new MenuListener());		//JMenuItem's, via AbstractButton, have a method addActionListener(ActionListener)
		adminPrintAll.addActionListener(new MenuListener());		//The innerclass is implementing ActionListener, so it can take action when the JMenuItem is clicked.
	    userSave.addActionListener(new MenuListener());
		userLoad.addActionListener(new MenuListener());
	    
		
		adminMenu.add(adminSetPayRate);
		adminMenu.add(adminPrintAll);
		userMenu.add(userSave);
		userMenu.add(userLoad);
		
		menuBar.add(userMenu);
	    menuBar.add(adminMenu);
	
		setJMenuBar(menuBar);
	}
	
	private class MenuListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e) //this is the method MenuListener must implement, as it comes from the ActionListener interface.
		{
			JMenuItem source = (JMenuItem)(e.getSource());
			
			if(source.equals(adminSetPayRate))
			{
				//handleAdminSetPayRate();	
			}

		}
		
		

	}
	

	
}
