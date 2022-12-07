package Arcade.GUI;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import net.miginfocom.swing.MigLayout;

public class UserGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserGUI frame = new UserGUI();
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
	public UserGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[406px]", "[14px][14px][47.00px][49.00px][23px,grow][23px,grow]"));
		
		JLabel lblNewLabel = new JLabel("Hello, USER");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel, "cell 0 0,growx,aligny top");
		
		JLabel lblNewLabel_1 = new JLabel("What would you like to do today?");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel_1, "cell 0 1,growx,aligny top");
		
		JButton termOptionsButton = new JButton("Play Games");
		contentPane.add(termOptionsButton, "cell 0 2,growx,aligny top");
		
		JButton barOptionsButton = new JButton("Go to Ticket shop");
		contentPane.add(barOptionsButton, "cell 0 3,growx,aligny top");
		
		JButton gameOptionsButton = new JButton("Go to Bar");
		contentPane.add(gameOptionsButton, "cell 0 4,growx,aligny top");
		
		JButton btnTicketOptions = new JButton("Go to Terminal");
		contentPane.add(btnTicketOptions, "cell 0 5,growx,aligny top");
	}

}
