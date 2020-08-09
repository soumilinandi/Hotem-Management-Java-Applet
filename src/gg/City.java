package gg;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import java.awt.Label;
import com.toedter.calendar.JDateChooser;
import java.awt.TextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;

public class City {

	private JFrame frame;
    public String id;
    private JTextField textField_1;
    private JTextField textField_2;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					City window = new City();
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
	public City() {
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
		
		JLabel lblCity = new JLabel("MANIPAL");
		lblCity.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCity.setBounds(130, 22, 111, 14);
		frame.getContentPane().add(lblCity);
		
		Label label = new Label("Check_in");
		label.setBounds(83, 90, 62, 22);
		frame.getContentPane().add(label);
		
		Label label_1 = new Label("Check_out");
		label_1.setBounds(83, 118, 62, 22);
		frame.getContentPane().add(label_1);
		
		Label label_2 = new Label("Nights:");
		label_2.setBounds(83, 179, 62, 22);
		frame.getContentPane().add(label_2);
		
		TextField textField = new TextField();
		textField.setBounds(170, 179, 117, 22);
		frame.getContentPane().add(textField);
		
		JButton btnGo = new JButton("GO");
		btnGo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");  
					Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","soumili");
					Statement s=con.createStatement();
				
					
					 Login ll=new Login();
					 id=ll.ss;
					 
						 String days=textField.getText();
						 
						 String query="INSERT INTO RESERVATION VALUES ("+111111+","+1111+","+days+")";
							s.executeQuery(query);
						hotel_info hf = new hotel_info();
						frame.setVisible(false);
						hf.frame.setVisible(true);
						
					
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
		});
		btnGo.setBounds(184, 227, 89, 23);
		frame.getContentPane().add(btnGo);
		
		textField_1 = new JTextField();
		textField_1.setBounds(170, 92, 117, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(170, 118, 117, 20);
		frame.getContentPane().add(textField_2);
		
		JLabel lblCountyInn = new JLabel("County inn");
		lblCountyInn.setFont(new Font("MS Reference Sans Serif", Font.BOLD | Font.ITALIC, 11));
		lblCountyInn.setBounds(128, 38, 199, 14);
		frame.getContentPane().add(lblCountyInn);
	}
}
