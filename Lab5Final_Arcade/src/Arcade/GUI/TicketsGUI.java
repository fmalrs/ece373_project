package Arcade.GUI;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JButton;

public class TicketsGUI extends JPanel implements ActionListener  {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */ 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicketsGUI frame = new TicketsGUI();
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
	public TicketsGUI() {
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		contentPane.setLayout(new MigLayout("", "[][grow][grow]", "[][][][][][][][][]"));
		
		JLabel lblNewLabel = new JLabel("Hello, INSERTUSERHERE .");
		contentPane.add(lblNewLabel, "cell 0 0");
		
		JLabel lblNewLabel_1 = new JLabel("What would you like to spend your tickets on?");
		contentPane.add(lblNewLabel_1, "cell 0 1");
		
		JButton btnBouncyBall = new JButton("Bouncy Ball");
		contentPane.add(btnBouncyBall, "cell 0 3");
		
		JLabel lblNewLabel_2 = new JLabel("10 Tickets");
		contentPane.add(lblNewLabel_2, "cell 0 4");
		
		JButton btnRubiksCube = new JButton("Rubiks Cube");
		contentPane.add(btnRubiksCube, "cell 0 6");
		
		JButton btnPs = new JButton("PS5");
		contentPane.add(btnPs, "cell 1 6");
		
		JLabel lblNewLabel_3 = new JLabel("30 Tickets");
		contentPane.add(lblNewLabel_3, "cell 0 7");
		
		JLabel lblNewLabel_3_1 = new JLabel("50 Tickets");
		contentPane.add(lblNewLabel_3_1, "cell 1 7");
	}
	public void actionPerformed(ActionEvent e) {
		JButton source = (JButton)(e.getSource());
	}
}
