package Arcade.GUI;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Color;
import net.miginfocom.swing.MigLayout;

public class AdminGUI extends JPanel implements ActionListener {

	private JPanel contentPane;

	/**
	 * Launch the application. test  
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminGUI frame = new AdminGUI();
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
	public AdminGUI() {
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		contentPane.setLayout(new MigLayout("", "[406px]", "[14px][14px][47.00px][49.00px][23px,grow][23px,grow]"));
		
		JLabel lblNewLabel = new JLabel("Hello, Admin");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel, "cell 0 0,growx,aligny top");
		
		JLabel lblNewLabel_1 = new JLabel("What would you like to do today?");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel_1, "cell 0 1,growx,aligny top");
		
		JButton termOptionsButton = new JButton("Terminal Options");
		contentPane.add(termOptionsButton, "cell 0 2,growx,aligny top");
		
		JButton barOptionsButton = new JButton("Bar Options");
		contentPane.add(barOptionsButton, "cell 0 3,growx,aligny top");
		
		JButton gameOptionsButton = new JButton("Game Options");
		contentPane.add(gameOptionsButton, "cell 0 4,growx,aligny top");
		
		JButton btnTicketOptions = new JButton("Ticket Options");
		contentPane.add(btnTicketOptions, "cell 0 5,growx,aligny top");
	}
	public void actionPerformed(ActionEvent e) {
		JButton source = (JButton)(e.getSource());
	}
}
