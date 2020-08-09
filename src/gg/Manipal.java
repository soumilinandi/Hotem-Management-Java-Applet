package gg;

import java.awt.EventQueue;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.DropMode;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class Manipal extends JFrame {

	/**
	 * 
	 */
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Manipal window = new Manipal();
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
	public Manipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblManipal = new JLabel("MANIPAL");
		lblManipal.setBounds(181, 26, 46, 14);
		frame.getContentPane().add(lblManipal);
		
		JLabel lblCountryInnBy = new JLabel("Country inn BY RADDISON AND BLU");
		lblCountryInnBy.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblCountryInnBy.setBounds(120, 40, 198, 14);
		frame.getContentPane().add(lblCountryInnBy);
		
		JLabel lblCheckIn = new JLabel("Check in  (yyyy-MM-dd)");
		lblCheckIn.setBounds(106, 101, 121, 14);
		frame.getContentPane().add(lblCheckIn);
		
		JLabel lblCheckOut = new JLabel("Check out(yyyy-MM-dd)");
		lblCheckOut.setBounds(106, 126, 121, 14);
		frame.getContentPane().add(lblCheckOut);
		
		textField = new JTextField();
		textField.setBounds(247, 98, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(247, 123, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblN = new JLabel("Number of Nights");
		lblN.setBounds(114, 151, 113, 14);
		frame.getContentPane().add(lblN);
		
		textField_2 = new JTextField();
		textField_2.setBounds(247, 148, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("User_ID");
		lblNewLabel.setBounds(134, 76, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		textField_3 = new JTextField();
		textField_3.setBounds(247, 73, 86, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton = new JButton("GO");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String days=textField_2.getText();
				String id=textField_3.getText();	
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");  
					Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","soumili");
					Statement s=con.createStatement();
					String query1="INSERT INTO reservation VALUES (111111,"+id+","+days+")";
					s.executeQuery(query1);
					frame.setVisible(false);
					hotel_info hh=new hotel_info();
					hh.frame.setVisible(true);
					
			}
				catch(Exception e)
				{
					System.out.println(e);
				}
		}});
		btnNewButton.setBounds(169, 194, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		
	}

}
