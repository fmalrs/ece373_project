package Arcade.GUI;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import Arcade.Location.Arcade;

import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import net.miginfocom.swing.MigLayout;

public class GameOptionGUI extends JPanel implements ActionListener {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private Arcade Arcade;

	/**
	 * Launch the application.   
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameOptionGUI frame = new GameOptionGUI(null);
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
	public GameOptionGUI(Arcade arcade) {
		this.Arcade = arcade;
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		contentPane.setLayout(new MigLayout("", "[135px][136px][135px]", "[14px][14px][14px][14px][42.00px][14px][14px][14px][20px][23px]"));
		
		JLabel lblGameOptions = new JLabel("Game Options");
		lblGameOptions.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblGameOptions, "cell 1 0,growx,aligny top");
		
		JLabel lblNewLabel = new JLabel("Current ITEM1 Difficulty:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel, "cell 0 1,growx,aligny top");
		
		JLabel lblCurrentItemDifficulty = new JLabel("Current ITEM2 Difficulty:");
		lblCurrentItemDifficulty.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblCurrentItemDifficulty, "cell 1 1,growx,aligny top");
		
		JLabel lblNewLabel_1_1 = new JLabel("Current ITEM3 Difficulty:");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel_1_1, "cell 2 1,growx,aligny top");
		
		JLabel lblNewLabel_3 = new JLabel("ITEM1 DIFFICULTY");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel_3, "cell 0 2,growx,aligny top");
		
		JLabel lblNewLabel_3_1 = new JLabel("ITEM2 DIFFICULTY");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel_3_1, "cell 1 2,growx,aligny top");
		
		JLabel lblNewLabel_3_1_1 = new JLabel("ITEM3 DIFFICULTY");
		lblNewLabel_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel_3_1_1, "cell 2 2,growx,aligny top");
		
		JLabel lblNewLabel_1 = new JLabel("New Difficulty:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel_1, "cell 0 3,growx,aligny top");
		
		JLabel lblNewLabel_1_2 = new JLabel("New Difficulty:");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel_1_2, "cell 1 3,growx,aligny top");
		
		JLabel lblNewLabel_1_3 = new JLabel("New Difficulty:");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel_1_3, "cell 2 3,growx,aligny top");
		
		textField = new JTextField();
		textField.setColumns(10);
		contentPane.add(textField, "cell 0 4,growx,aligny top");
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		contentPane.add(textField_1, "cell 1 4,growx,aligny top");
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		contentPane.add(textField_2, "cell 2 4,growx,aligny top");
		
		JLabel lblNewLabel_2 = new JLabel("Current ITEM1 price:");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel_2, "cell 0 5,growx,aligny top");
		
		JLabel lblCurrentItemPrice = new JLabel("Current ITEM2 price:");
		lblCurrentItemPrice.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblCurrentItemPrice, "cell 1 5,growx,aligny top");
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Current ITEM3 price:");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel_1_1_1, "cell 2 5,growx,aligny top");
		
		JLabel lblNewLabel_3_2 = new JLabel("ITEM1 PRICE");
		lblNewLabel_3_2.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel_3_2, "cell 0 6,growx,aligny top");
		
		JLabel lblNewLabel_3_1_2 = new JLabel("ITEM2 PRICE");
		lblNewLabel_3_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel_3_1_2, "cell 1 6,growx,aligny top");
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("ITEM3 PRICE");
		lblNewLabel_3_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel_3_1_1_1, "cell 2 6,growx,aligny top");
		
		JLabel lblNewLabel_1_4 = new JLabel("New price:");
		lblNewLabel_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel_1_4, "cell 0 7,growx,aligny top");
		
		JLabel lblNewLabel_1_2_1 = new JLabel("New price:");
		lblNewLabel_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel_1_2_1, "cell 1 7,growx,aligny top");
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("New price:");
		lblNewLabel_1_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel_1_2_1_1, "cell 2 7,growx,aligny top");
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		contentPane.add(textField_3, "cell 0 8,growx,aligny top");
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		contentPane.add(textField_4, "cell 1 8,growx,aligny top");
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		contentPane.add(textField_5, "cell 2 8,growx,aligny top");
		
		JButton btnNewButton = new JButton("Done");
		contentPane.add(btnNewButton, "cell 0 9,growx,aligny top");
		
		JButton btnNewButton_1 = new JButton("Done");
		contentPane.add(btnNewButton_1, "cell 1 9,growx,aligny top");
		
		JButton btnNewButton_2 = new JButton("Done");
		contentPane.add(btnNewButton_2, "cell 2 9,growx,aligny top");
	}
	public void actionPerformed(ActionEvent e) {
		JButton source = (JButton)(e.getSource());
	}
}
