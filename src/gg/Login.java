package gg;
import java.awt.*;
import java.awt.EventQueue;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	JFrame frame;
	public JTextField textField;
	private JPasswordField passwordField;
	public String ss;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					Login window = new Login();
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
	public Login() {
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
		
		JLabel lblLogin = new JLabel("LOGIN");
		lblLogin.setForeground(Color.DARK_GRAY);
		lblLogin.setFont(new Font("Sitka Text", Font.BOLD, 16));
		lblLogin.setBounds(175, 35, 132, 14);
		frame.getContentPane().add(lblLogin);
		
		JLabel lblUserId = new JLabel("User  ID");
		lblUserId.setForeground(Color.DARK_GRAY);
		lblUserId.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblUserId.setBounds(72, 67, 90, 14);
		frame.getContentPane().add(lblUserId);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(Color.DARK_GRAY);
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPassword.setBounds(72, 111, 90, 14);
		frame.getContentPane().add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(173, 65, 134, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(173, 109, 134, 20);
		frame.getContentPane().add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
				Class.forName("oracle.jdbc.driver.OracleDriver");  
				Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","soumili");
				Statement s=con.createStatement();
				@SuppressWarnings("deprecation")
				
				String sql="Select * from customer where id='"+textField.getText()+"' and password= '"+passwordField.getText()+"'";
				ResultSet rs=s.executeQuery(sql);
				if(rs.next())
				{
					ss=textField.getText();
					JOptionPane.showMessageDialog(null, "Login Successful...");
					textField.setText(null);
					passwordField.setText(null);
					CITY_SELECT cc=new CITY_SELECT();
					frame.setVisible(false);
					cc.frame.setVisible(true);	
					}
				else
				{
						JOptionPane.showMessageDialog(null, "Invalid login Details","Login error",JOptionPane.ERROR_MESSAGE);
						textField.setText(null);
						passwordField.setText(null);
			
				}
			}
				catch(Exception e)
				{
					System.out.print(e);
				}
				
				
			}
		});
		btnLogin.setBounds(175, 140, 89, 23);
		frame.getContentPane().add(btnLogin);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new register().frame.setVisible(true);
			}

		
		});
		btnRegister.setBounds(175, 202, 89, 23);
		frame.getContentPane().add(btnRegister);
		
		JLabel lblNewUserRegister = new JLabel("New User? Register now!");
		lblNewUserRegister.setForeground(Color.DARK_GRAY);
		lblNewUserRegister.setBounds(145, 174, 232, 14);
		frame.getContentPane().add(lblNewUserRegister);
	}
}
