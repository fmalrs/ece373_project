package Arcade.GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class GameOptionGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameOptionGUI frame = new GameOptionGUI();
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
	public GameOptionGUI() {
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
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,}));
		
		JLabel lblGameOptions = new JLabel("Game Options");
		lblGameOptions.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblGameOptions, "4, 2");
		
		JLabel lblNewLabel = new JLabel("Current ITEM1 Difficulty:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel, "2, 6");
		
		JLabel lblCurrentItemDifficulty = new JLabel("Current ITEM2 Difficulty:");
		lblCurrentItemDifficulty.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblCurrentItemDifficulty, "4, 6");
		
		JLabel lblNewLabel_1_1 = new JLabel("Current ITEM3 Difficulty:");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel_1_1, "6, 6");
		
		JLabel lblNewLabel_3 = new JLabel("ITEM1 DIFFICULTY");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel_3, "2, 8");
		
		JLabel lblNewLabel_3_1 = new JLabel("ITEM2 DIFFICULTY");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel_3_1, "4, 8");
		
		JLabel lblNewLabel_3_1_1 = new JLabel("ITEM3 DIFFICULTY");
		lblNewLabel_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel_3_1_1, "6, 8");
		
		JLabel lblNewLabel_1 = new JLabel("New Difficulty:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel_1, "2, 10");
		
		JLabel lblNewLabel_1_2 = new JLabel("New Difficulty:");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel_1_2, "4, 10");
		
		JLabel lblNewLabel_1_3 = new JLabel("New Difficulty:");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel_1_3, "6, 10");
		
		textField = new JTextField();
		textField.setColumns(10);
		contentPane.add(textField, "2, 12, fill, default");
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		contentPane.add(textField_1, "4, 12, fill, default");
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		contentPane.add(textField_2, "6, 12, fill, default");
		
		JLabel lblNewLabel_2 = new JLabel("Current ITEM1 price:");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel_2, "2, 14");
		
		JLabel lblCurrentItemPrice = new JLabel("Current ITEM2 price:");
		lblCurrentItemPrice.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblCurrentItemPrice, "4, 14");
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Current ITEM3 price:");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel_1_1_1, "6, 14");
		
		JLabel lblNewLabel_3_2 = new JLabel("ITEM1 PRICE");
		lblNewLabel_3_2.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel_3_2, "2, 16");
		
		JLabel lblNewLabel_3_1_2 = new JLabel("ITEM2 PRICE");
		lblNewLabel_3_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel_3_1_2, "4, 16");
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("ITEM3 PRICE");
		lblNewLabel_3_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel_3_1_1_1, "6, 16");
		
		JLabel lblNewLabel_1_4 = new JLabel("New price:");
		lblNewLabel_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel_1_4, "2, 18");
		
		JLabel lblNewLabel_1_2_1 = new JLabel("New price:");
		lblNewLabel_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel_1_2_1, "4, 18");
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("New price:");
		lblNewLabel_1_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel_1_2_1_1, "6, 18");
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		contentPane.add(textField_3, "2, 20, fill, default");
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		contentPane.add(textField_4, "4, 20, fill, default");
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		contentPane.add(textField_5, "6, 20, fill, default");
		
		JButton btnNewButton = new JButton("Done");
		contentPane.add(btnNewButton, "2, 22");
		
		JButton btnNewButton_1 = new JButton("Done");
		contentPane.add(btnNewButton_1, "4, 22");
		
		JButton btnNewButton_2 = new JButton("Done");
		contentPane.add(btnNewButton_2, "6, 22");
	}

}
