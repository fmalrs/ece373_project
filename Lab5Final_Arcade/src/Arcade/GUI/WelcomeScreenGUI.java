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
import javax.swing.JButton;
import java.awt.Canvas;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import Arcade.Location.*;

public class WelcomeScreenGUI extends JFrame {

	private JPanel contentPane;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					WelcomeScreenGUI frame = new WelcomeScreenGUI();
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
	public WelcomeScreenGUI() {
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
		
		btnNewButton = new JButton("Login");
		contentPane.add(btnNewButton, "cell 0 2,alignx center,aligny top");
		
		btnNewButton_1 = new JButton("Register");
		btnNewButton_1.setVerticalAlignment(SwingConstants.TOP);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.add(btnNewButton_1, "cell 2 2,alignx center,aligny top");
	}

}
