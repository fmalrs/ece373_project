package Arcade.GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.Color;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class TicketOptionGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicketOptionGUI frame = new TicketOptionGUI();
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
	public TicketOptionGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),},
			new RowSpec[] {
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,}));
		
		JLabel lblTicketOptions = new JLabel("Ticket Options");
		lblTicketOptions.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblTicketOptions, "4, 2");
		
		JLabel lblNewLabel = new JLabel("Current ITEM1 price:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel, "2, 6");
		
		JLabel lblCurrentItemPrice = new JLabel("Current ITEM2 price:");
		lblCurrentItemPrice.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblCurrentItemPrice, "4, 6");
		
		JLabel lblNewLabel_1_1 = new JLabel("Current ITEM3 price:");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel_1_1, "6, 6");
		
		JLabel lblNewLabel_3 = new JLabel("ITEM1 PRICE");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel_3, "2, 8");
		
		JLabel lblNewLabel_3_1 = new JLabel("ITEM2 PRICE");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel_3_1, "4, 8");
		
		JLabel lblNewLabel_3_1_1 = new JLabel("ITEM3 PRICE");
		lblNewLabel_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel_3_1_1, "6, 8");
		
		JLabel lblNewLabel_1_2 = new JLabel("New price:");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel_1_2, "2, 12");
		
		JLabel lblNewLabel_1_2_1 = new JLabel("New price:");
		lblNewLabel_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel_1_2_1, "4, 12");
		
		JLabel lblNewLabel_1_2_2 = new JLabel("New price:");
		lblNewLabel_1_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel_1_2_2, "6, 12");
		
		textField = new JTextField();
		textField.setColumns(10);
		contentPane.add(textField, "2, 14, fill, default");
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		contentPane.add(textField_1, "4, 14, fill, default");
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		contentPane.add(textField_2, "6, 14, fill, default");
		
		JButton btnNewButton = new JButton("Done");
		contentPane.add(btnNewButton, "2, 16");
		
		JButton btnNewButton_1 = new JButton("Done");
		contentPane.add(btnNewButton_1, "4, 16");
		
		JButton btnNewButton_2 = new JButton("Done");
		contentPane.add(btnNewButton_2, "6, 16");
	}

}
