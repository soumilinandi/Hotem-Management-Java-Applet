package gg;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JFormattedTextField;



public class hotel_info {

	 JFrame frame;
	 private ButtonGroup bg = new ButtonGroup();
	 private ButtonGroup bg1 = new ButtonGroup();
	 private ButtonGroup bg2 = new ButtonGroup();
	 public cityy;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hotel_info window = new hotel_info();
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
	public hotel_info() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(240, 248, 255));
		frame.setBounds(100, 100, 617, 587);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("City Selected");
		lblNewLabel.setBounds(54, 46, 102, 29);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CITY_SELECT cs = new CITY_SELECT();
				cs.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnNewButton.setBounds(352, 508, 117, 29);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Next");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				payment_ py = new payment_();
				py.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnNewButton_1.setBounds(474, 508, 117, 29);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblFacilities = new JLabel("Room Facilities");
		lblFacilities.setBounds(54, 330, 96, 16);
		frame.getContentPane().add(lblFacilities);
		
		JLabel lblRoomtype = new JLabel("Room type");
		lblRoomtype.setBounds(54, 246, 78, 16);
		frame.getContentPane().add(lblRoomtype);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("single");
		rdbtnNewRadioButton.setBounds(170, 242, 141, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnTwin = new JRadioButton("twin");
		rdbtnTwin.setBounds(170, 289, 141, 23);
		frame.getContentPane().add(rdbtnTwin);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(193, 52, 61, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblSelectHotel = new JLabel("Select Hotel");
		lblSelectHotel.setBounds(54, 105, 86, 16);
		frame.getContentPane().add(lblSelectHotel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(170, 100, 84, 27);
		frame.getContentPane().add(comboBox);
		
		JLabel lblNewLabel_2 = new JLabel("Address");
		lblNewLabel_2.setBounds(305, 105, 86, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(428, 105, 154, 16);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblHotelfacilities = new JLabel("Hotel facilities");
		lblHotelfacilities.setBounds(305, 148, 102, 16);
		frame.getContentPane().add(lblHotelfacilities);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBounds(428, 148, 154, 16);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNoOfRooms = new JLabel("No. of rooms available");
		lblNoOfRooms.setBounds(54, 196, 148, 16);
		frame.getContentPane().add(lblNoOfRooms);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setBounds(305, 196, 61, 16);
		frame.getContentPane().add(lblNewLabel_5);
		
		JRadioButton radioButton = new JRadioButton("0");
		radioButton.setBounds(170, 400, 141, 23);
		frame.getContentPane().add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("1");
		radioButton_1.setBounds(170, 437, 141, 23);
		frame.getContentPane().add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("0");
		radioButton_2.setBounds(305, 400, 141, 23);
		frame.getContentPane().add(radioButton_2);
		
		JRadioButton radioButton_3 = new JRadioButton("1");
		radioButton_3.setBounds(305, 435, 141, 23);
		frame.getContentPane().add(radioButton_3);
		
		JLabel lblNewLabel_6 = new JLabel("Mattress");
		lblNewLabel_6.setBounds(170, 370, 61, 16);
		frame.getContentPane().add(lblNewLabel_6);
		
		JRadioButton radioButton_6 = new JRadioButton("2");
		radioButton_6.setBounds(170, 473, 141, 23);
		frame.getContentPane().add(radioButton_6);
		
		JLabel lblMinibar = new JLabel("Minibar");
		lblMinibar.setBounds(305, 370, 61, 16);
		frame.getContentPane().add(lblMinibar);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setBounds(305, 246, 61, 16);
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setBounds(305, 293, 61, 16);
		frame.getContentPane().add(lblNewLabel_8);
		
		bg.add(radioButton);
		bg.add(radioButton_1);
		bg.add(radioButton_6);
		
		bg1.add(radioButton_2);
		bg1.add(radioButton_3);
		
		bg2.add(rdbtnNewRadioButton);
		bg2.add(rdbtnTwin);
		
		
		
		
		
	}
}