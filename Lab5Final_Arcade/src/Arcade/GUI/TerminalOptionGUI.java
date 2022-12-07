package Arcade.GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import com.jgoodies.*;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import net.miginfocom.swing.MigLayout;

public class TerminalOptionGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TerminalOptionGUI frame = new TerminalOptionGUI();
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
	public TerminalOptionGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[418px]", "[48.00px][14px][48.00px][14px][20px][23px]"));
		
		JLabel lblNewLabel = new JLabel("Terminal Options");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel, "cell 0 0,growx,aligny top");
		
		JLabel lblNewLabel_1 = new JLabel("Current credit/money ratio:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel_1, "cell 0 1,growx,aligny top");
		
		JLabel lblNewLabel_2 = new JLabel("INSERTRATIO");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel_2, "cell 0 2,growx,aligny top");
		
		JLabel lblNewLabel_3 = new JLabel("Change ratio:");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel_3, "cell 0 3,growx,aligny top");
		
		textField = new JTextField();
		contentPane.add(textField, "cell 0 4,alignx center,aligny top");
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Done");
		contentPane.add(btnNewButton, "cell 0 5,alignx center,aligny top");
	}

}
