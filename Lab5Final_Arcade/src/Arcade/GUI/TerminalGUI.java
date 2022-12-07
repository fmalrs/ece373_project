package Arcade.GUI;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;

public class TerminalGUI extends JPanel implements ActionListener {

	private JPanel contentPane;

	/**
	 * Launch the application.  
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TerminalGUI frame = new TerminalGUI();
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
	public TerminalGUI() {
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		contentPane.setLayout(new MigLayout("", "[151.00,grow,center][grow][grow]", "[][][][][]"));
		
		JLabel lblNewLabel = new JLabel("Hello, INSERTUSERHERE .");
		contentPane.add(lblNewLabel, "cell 0 0");
		
		JLabel lblNewLabel_1 = new JLabel("What would you like to do today?");
		contentPane.add(lblNewLabel_1, "cell 0 1,aligny top");
		
		JButton btnNewButton = new JButton("Add Credits");
		contentPane.add(btnNewButton, "cell 0 4");
		
		JButton btnCheckCredits = new JButton("Check Credits");
		contentPane.add(btnCheckCredits, "cell 1 4");
		
		JButton btnNewButton_1_1 = new JButton("Check Tickets");
		contentPane.add(btnNewButton_1_1, "cell 2 4");
	}
	public void actionPerformed(ActionEvent e) {
		JButton source = (JButton)(e.getSource());
	}
}
