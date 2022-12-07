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

public class BarGUI extends JPanel implements ActionListener {

	private JPanel contentPane;

	/**
	 * Launch the application. 
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BarGUI frame = new BarGUI();
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
	public BarGUI() {
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		contentPane.setLayout(new MigLayout("", "[][grow][grow]", "[][][][][][]"));
		
		JLabel lblNewLabel = new JLabel("Hello, INSERTUSERHERE .");
		contentPane.add(lblNewLabel, "cell 0 0");
		
		JLabel lblNewLabel_1 = new JLabel("What would you like to enjoy today?");
		contentPane.add(lblNewLabel_1, "cell 0 1");
		
		JButton btnFrenchFries = new JButton("French Fries");
		contentPane.add(btnFrenchFries, "cell 0 4");
		
		JButton btnJuice = new JButton("Juice");
		contentPane.add(btnJuice, "cell 1 4");
		
		JButton btnPizza = new JButton("Pizza");
		contentPane.add(btnPizza, "cell 2 4");
		
		JLabel lblNewLabel_2 = new JLabel("10 Credits");
		contentPane.add(lblNewLabel_2, "cell 0 5");
		
		JLabel lblNewLabel_2_1 = new JLabel("15 Credits");
		contentPane.add(lblNewLabel_2_1, "cell 1 5");
		
		JLabel lblNewLabel_2_2 = new JLabel("20 Credits");
		contentPane.add(lblNewLabel_2_2, "cell 2 5");
	}
	public void actionPerformed(ActionEvent e) {
		JButton source = (JButton)(e.getSource());
	}
}
