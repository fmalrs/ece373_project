package Arcade.GUI;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Arcade.Location.Arcade;
import Arcade.People.Person;
import net.miginfocom.swing.MigLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;

public class PlayGUI extends JFrame implements ActionListener {

	private JPanel contentPane;
	private Arcade Arcade;
	JButton btnTictactoe = new JButton("TicTacToe");
	JButton btndchess = new JButton("4dChess");
	JButton btnStreetracer = new JButton("StreetRacer");

	/**
	 * Launch the application.  
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PlayGUI frame = new PlayGUI(null);
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
	public PlayGUI(Arcade arcade) {
		this.Arcade = arcade;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][grow][grow]", "[][][][][][]"));
		
		JLabel lblNewLabel = new JLabel("Hello, INSERTUSERHERE .");
		contentPane.add(lblNewLabel, "cell 0 0");
		
		JLabel lblNewLabel_1 = new JLabel("What would you like to play today?");
		contentPane.add(lblNewLabel_1, "cell 0 1");
		
		btnTictactoe.addActionListener(this);
		contentPane.add(btnTictactoe, "cell 0 4");
		
		btnStreetracer.addActionListener(this);
		contentPane.add(btnStreetracer, "cell 1 4");
		
		btndchess.addActionListener(this);
		contentPane.add(btndchess, "cell 2 4");
		
		JLabel lblNewLabel_2 = new JLabel("1 Credit");
		contentPane.add(lblNewLabel_2, "cell 0 5");
		
		JLabel lblNewLabel_2_1 = new JLabel("3 Credits");
		contentPane.add(lblNewLabel_2_1, "cell 1 5");
		
		JLabel lblNewLabel_2_2 = new JLabel("5 Credits");
		contentPane.add(lblNewLabel_2_2, "cell 2 5");
	}

	public void actionPerformed(ActionEvent e) {
		JButton source = (JButton)(e.getSource());
		if  (source.equals(btnTictactoe)) {
			for (Person per : Arcade.getPeople()) {
				System.out.println(per.getName());
			}
		}
		if  (source.equals(btnStreetracer)) {
			for (Person per : Arcade.getPeople()) {
				System.out.println(per.getName());
			}
		}
		if  (source.equals(btndchess)) {
			for (Person per : Arcade.getPeople()) {
				System.out.println(per.getName());
			}
		}
	}
	
}
