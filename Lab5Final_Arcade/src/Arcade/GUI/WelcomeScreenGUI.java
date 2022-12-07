package Arcade.GUI;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import net.miginfocom.swing.MigLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.SwingConstants;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Canvas;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import Arcade.Location.*;
import Arcade.Logistics.Card;
import Arcade.People.Person;
import Arcade.People.User;


//test
public class WelcomeScreenGUI extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JButton btnLogin;
	private JButton btnRegister;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private Arcade Arcade;

	/**
	 * Launch the application.    
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WelcomeScreenGUI frame = new WelcomeScreenGUI(new Arcade(new ArrayList<Item>(),new ArrayList<Item>(),new ArrayList<Person>(),new ArrayList<Game>()));
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public WelcomeScreenGUI(Arcade arcade) {
		this.Arcade = arcade;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[143px][133px][165px]", "[14px,grow,fill][14px][23px]"));
		
		lblNewLabel_1 = new JLabel("Welcome to the Arcade!");
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel_1, "cell 1 0,growx,aligny top");
		
		lblNewLabel = new JLabel(new ImageIcon("Path/To/Your/Image.png"));
		contentPane.add(lblNewLabel, "cell 2 0,growx,aligny center");
		
		lblNewLabel_2 = new JLabel("Are you an existing user?");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel_2, "cell 0 1,growx,aligny top");
		
		lblNewLabel_3 = new JLabel("Or are you a new user?");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel_3, "cell 2 1,growx,aligny top");
		
		btnLogin = new JButton("Login");
		btnLogin.addActionListener(this);
		contentPane.add(btnLogin, "cell 0 2,alignx center,aligny top");
		
		btnRegister = new JButton("Register");
		btnRegister.setVerticalAlignment(SwingConstants.TOP);
		btnRegister.addActionListener(this);
		contentPane.add(btnRegister, "cell 2 2,alignx center,aligny top");
	}
	
	public void actionPerformed(ActionEvent e) {
		JButton source = (JButton)(e.getSource());
		
		if (source.equals(btnLogin)) {
			JPanel loginPanel = new JPanel();
			GridLayout g1 = new GridLayout(4,1);
			JLabel Name = new JLabel("Username:");
			JLabel Password = new JLabel("Password:");
			JTextField inputName = new JTextField(6);
			JTextField inputPassword = new JTextField(6);
			loginPanel.setLayout(g1);
			loginPanel.add(Name);
			loginPanel.add(inputName);
			loginPanel.add(Password);
			loginPanel.add(inputPassword);
			int result = JOptionPane.showConfirmDialog(null, loginPanel, "Login:", JOptionPane.OK_CANCEL_OPTION);
			if(result == JOptionPane.OK_OPTION){
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							PlayGUI frame = new PlayGUI(Arcade);
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
				
			}
		}
		if (source.equals(btnRegister)) {
			JPanel registerPanel = new JPanel();
			GridLayout g1 = new GridLayout(6,1);
			JLabel Name = new JLabel("Username:");
			JLabel Password = new JLabel("Password:");
			JLabel age = new JLabel("Age:");
			JTextField inputName = new JTextField(6);
			JTextField inputPassword = new JTextField(6);
			JTextField inputAge = new JTextField(6);
			registerPanel.setLayout(g1);
			registerPanel.add(Name);
			registerPanel.add(inputName);
			registerPanel.add(Password);
			registerPanel.add(inputPassword);
			registerPanel.add(age);
			registerPanel.add(inputAge);
			int result = JOptionPane.showConfirmDialog(null, registerPanel, "New User:", JOptionPane.OK_CANCEL_OPTION);
			if(result == JOptionPane.OK_OPTION){
			String name = inputName.getText();
			String password = inputPassword.getText();
			Boolean access = false;
			System.out.println(inputAge.getText());
			int userAge = Integer.parseInt(inputAge.getText());
			User newUser = new User();
			Card newCard = new Card();
			newUser.setCard(newCard);
			newUser.setName(name);
			newUser.setAccess(access);
			newUser.setPassword(password);
			newUser.setAge(userAge);
			Arcade.addPerson(newUser);
			}
		}
		

	}
}


