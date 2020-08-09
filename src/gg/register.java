package gg;
import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.TextArea;
import javax.swing.JPasswordField;
import javax.swing.ButtonGroup;
import javax.swing.ComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import java.awt.Scrollbar;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.List;
import java.awt.Choice;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Locale;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;

public class register {

	JFrame frame;
	public JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel label_3;
	private JLabel label_4;
	private JPasswordField passwordField;
	private JTextField textField_1;
	private JLabel lblNewLabel_2;
	private JLabel label_5;
	private JTextArea txtrrequiredFields;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnNewRadioButton_1;
	private JRadioButton rdbtnNewRadioButton_2;
	private ButtonGroup bg = new ButtonGroup();
	private JLabel lblCountry;
	private JComboBox box;
	private JTextField textField_5;
	private JLabel lblNewLabel_4;
	private JTextField textField_4;
	private JTextField textField_7;
	private JTextField city;
	private JLabel label11;
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					register window = new register();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public register() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public String[] get_all_countries() {
		 String[] countries = new String[Locale.getISOCountries().length];
		    String[] countryCodes = Locale.getISOCountries();
		    for (int i = 0; i < countryCodes.length; i++) {
		        Locale obj = new Locale("", countryCodes[i]);
		        countries[i] = obj.getDisplayCountry();
		    }
		    return countries;
	}
	@SuppressWarnings("unchecked")
	private void initialize() {
		frame = new JFrame();
		frame.setForeground(Color.WHITE);
		frame.getContentPane().setForeground(Color.WHITE);
		frame.getContentPane().setBackground(new Color(240, 248, 255));
		frame.getContentPane().setFont(new Font("TechnicBold", Font.PLAIN, 11));
		frame.setBounds(100, 100, 615, 430);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Registration");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(254, 13, 149, 31);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Your ID");
		lblNewLabel_1.setBounds(10, 56, 70, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel label = new JLabel("Password*");
		label.setBounds(10, 81, 70, 14);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("First Name*");
		label_1.setBounds(10, 106, 82, 14);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("Last Name");
		label_2.setBounds(10, 137, 70, 14);
		frame.getContentPane().add(label_2);
		
		textField = new JTextField();
		textField.setBounds(90, 53, 130, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(90, 103, 130, 20);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(90, 134, 130, 20);
		frame.getContentPane().add(textField_3);
		
		label_3 = new JLabel("Phone No.*");
		label_3.setBounds(10, 168, 70, 14);
		frame.getContentPane().add(label_3);
		
		label_4 = new JLabel("Gender*");
		label_4.setBounds(341, 56, 70, 14);
		frame.getContentPane().add(label_4);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(90, 78, 130, 20);
		frame.getContentPane().add(passwordField);
		
		textField_1 = new JTextField();
		textField_1.setBounds(90, 166, 130, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		lblNewLabel_2 = new JLabel("City");
		lblNewLabel_2.setBounds(10, 256, 46, 17);
		frame.getContentPane().add(lblNewLabel_2);
		
		label_5 = new JLabel("State");
		label_5.setBounds(10, 285, 46, 17);
		frame.getContentPane().add(label_5);
		
		txtrrequiredFields = new JTextArea();
		txtrrequiredFields.setBackground(new Color(240, 248, 255));
		txtrrequiredFields.setFont(new Font("Monospaced", Font.ITALIC, 12));
		txtrrequiredFields.setText("*required fields");
		txtrrequiredFields.setBounds(488, 380, 121, 22);
		frame.getContentPane().add(txtrrequiredFields);
		
		rdbtnNewRadioButton = new JRadioButton("Male");
		rdbtnNewRadioButton.setBounds(423, 51, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		rdbtnNewRadioButton_1 = new JRadioButton("Female");
		rdbtnNewRadioButton_1.setBounds(423, 76, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		rdbtnNewRadioButton_2 = new JRadioButton("Others");
		rdbtnNewRadioButton_2.setBounds(423, 101, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_2);
		
		bg.add(rdbtnNewRadioButton);
		bg.add(rdbtnNewRadioButton_1); 
		bg.add(rdbtnNewRadioButton_2);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");  
					Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","soumili");
					Statement s=con.createStatement();
					String idd=textField.getText();
					char[] pass=passwordField.getPassword();
					String fname=textField_2.getText();
					String lname=textField_3.getText();
					String phone= textField_1.getText();
					String city1=city.getText();
					String state=textField_5.getText();
					Object countr=box.getSelectedItem();
					String country=String.valueOf(countr);
					String pin=textField_4.getText();
					String passs=String.valueOf(pass);
					char g='F';
					 if (rdbtnNewRadioButton.isSelected())
					 { 
		                    g='F';
		             } 
					 if (rdbtnNewRadioButton_1.isSelected()) 
					 {   
		                    g='M';
		             } 
		             if (rdbtnNewRadioButton_2.isSelected())
		             {   
		                    g='O';

		             }
		                    
						{
							String query="INSERT INTO CUSTOMER VALUES ("+idd+",'"+passs+"','"+fname+"','"+lname+"',"+phone+",'"+g+"','"+city1+"','"+state+"','"+country+"',"+pin+")";
							s.executeQuery(query);
							
							JOptionPane.showMessageDialog(null, "Registered!");
						}
						
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
				frame.setVisible(false);
				Login hh=new Login();
				hh.frame.setVisible(true);
				
			}
		});
		btnNewButton.setBounds(444, 314, 89, 39);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("Address");
		lblNewLabel_3.setBounds(6, 215, 74, 16);
		frame.getContentPane().add(lblNewLabel_3);
		

		lblCountry = new JLabel("Country");
		lblCountry.setBounds(10, 324, 61, 16);
		frame.getContentPane().add(lblCountry);
		
		 box=new JComboBox(get_all_countries());
		 box.setBounds(90, 320, 130, 27);
		frame.getContentPane().add(box);

		
		
		textField_5 = new JTextField();
		textField_5.setBounds(90, 280, 130, 26);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		city = new JTextField();
		city.setBounds(90, 251, 130, 26);
		frame.getContentPane().add(city);
		city.setColumns(10);
		
		lblNewLabel_4 = new JLabel("Pincode");
		lblNewLabel_4.setBounds(364, 256, 61, 16);
		frame.getContentPane().add(lblNewLabel_4);
		
		textField_4 = new JTextField();
		textField_4.setBounds(423, 251, 130, 26);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(90, 198, 484, 38);
		frame.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		label11 = new JLabel("");
		label11.setBounds(231, 56, 103, 14);
		frame.getContentPane().add(label11);
		
		
		

	 
	}
}





