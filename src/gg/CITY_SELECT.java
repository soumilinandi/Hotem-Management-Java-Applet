package gg;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.time.Duration;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import org.joda.time.DateMidnight;
import org.joda.time.Days;
import java.util.*;
import javax.swing.JTextField;
import java.awt.Color;
import com.toedter.calendar.JDateChooser;
import javax.swing.DefaultComboBoxModel;

@SuppressWarnings("deprecation")
public class CITY_SELECT extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */

	JFrame frame;
	public long days;
	public String id;
	public String city;
	private JTextField textField;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CITY_SELECT window = new CITY_SELECT();
					window.frame.setVisible(true);
				} catch (Exception e) {
					System.out.println("HERE");
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CITY_SELECT() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(240, 248, 255));
		frame.setBounds(100, 100, 655, 524);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblSelectCity = new JLabel("Select city ");
		lblSelectCity.setBounds(132, 150, 70, 28);
		frame.getContentPane().add(lblSelectCity);
		
		JLabel lblNewLabel_1 = new JLabel("Check In");
		lblNewLabel_1.setBounds(132, 217, 61, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel label = new JLabel("Check Out");
		label.setBounds(132, 276, 77, 16);
		frame.getContentPane().add(label);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select", "Udupi", "Jaipur", "Mumbai"}));
		comboBox.setBounds(270, 151, 117, 27);
		frame.getContentPane().add(comboBox);
		
		JDateChooser dateChooser1 = new JDateChooser();
		dateChooser1.setDateFormatString("yyyy-MM-dd");
		dateChooser1.setBounds(270, 217, 117, 26);
		frame.getContentPane().add(dateChooser1);
		
		JDateChooser dateChooser2 = new JDateChooser();
		dateChooser2.setDateFormatString("yyyy-MM-dd");
		dateChooser2.setBounds(270, 276, 117, 26);
		frame.getContentPane().add(dateChooser2);
		
		JLabel lblNoOfNights = new JLabel("No. of Nights");
		lblNoOfNights.setBounds(132, 345, 70, 14);
		frame.getContentPane().add(lblNoOfNights);
		
		textField = new JTextField();
		textField.setBounds(270, 334, 117, 28);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		
		
		JButton btnGo = new JButton("GO");
		btnGo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
		
			   
			   Random rnd = new Random();
			   int f=1;
			   int n = 100000 + rnd.nextInt(900000);
			   try {
				   
				   Date d1=dateChooser1.getDate();
				   Date d2=dateChooser2.getDate();
					Class.forName("oracle.jdbc.driver.OracleDriver");  
					Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","soumili");
					Statement sss=con.createStatement();
					while(f==1) {
					String sql="Select * from reservation where ="+n;
					ResultSet rs=sss.executeQuery(sql);
					if(rs.next())
					{
						n = 100000 + rnd.nextInt(900000);
					}
					else
						f=0;
						
					}
					
				Object o=comboBox.getSelectedItem();
				city=String.valueOf(o);
				 Login ll=new Login();
				 id=ll.ss;
				 
				 String query="INSERT INTO RESERVATION VALUES ("+n+","+id+","+lblNoOfNights.getText()+")";
					sss.executeQuery(query);
				hotel_info hf = new hotel_info();
				hf.frame.setVisible(true);
				frame.setVisible(false);
			} catch(Exception e1)
			   {
				   System.out.println(e1);
			   }
			   hotel_info hf = new hotel_info();
				hf.frame.setVisible(true);
				frame.setVisible(false);
			}});
		btnGo.setBounds(270, 388, 117, 23);
		frame.getContentPane().add(btnGo);
			
	}
}
