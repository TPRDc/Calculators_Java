package SIMPLE_CALCULATOR;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Simple_Calculator {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	
	double num1;
	double num2;
	 double total;
	 private JTextField textFieldNum1;
	 private JTextField textFieldNum2;
	 private JTextField textFieldTotal;
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Simple_Calculator window = new Simple_Calculator();
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
	public Simple_Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setResizable(false);
	    frame.setSize(371,281); 
	    frame.setVisible(true); 
	    
	    ImageIcon image =new ImageIcon("frame_icon.png"); 
        frame.setIconImage(image.getImage());

        //frame.getContentPane().setBackground(Color.gray); // change background color (defaults colors)
        frame.getContentPane().setBackground(new Color(64, 128, 128));
        frame.getContentPane().setLayout(null);
        
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        panel.setBounds(10, 11, 324, 46);
        frame.getContentPane().add(panel);
        
        JLabel lblNewLabel = new JLabel("CALCULATOR");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblNewLabel.setBounds(96, 11, 144, 35);
        panel.add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("Enter Number");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblNewLabel_1.setBounds(10, 97, 111, 14);
        frame.getContentPane().add(lblNewLabel_1);
        
        textFieldNum1 = new JTextField();
        textFieldNum1.setFont(new Font("Tahoma", Font.PLAIN, 13));
        textFieldNum1.setColumns(10);
        textFieldNum1.setBounds(124, 92, 98, 26);
        frame.getContentPane().add(textFieldNum1);
        
        JButton btnAc = new JButton("AC");
        btnAc.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		textFieldTotal.setText(null);
        		textFieldNum1.setText(null);
        		textFieldNum2.setText(null);
        	}
        });
        btnAc.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnAc.setBounds(251, 93, 55, 23);
        frame.getContentPane().add(btnAc);
        
        JButton btnNewButtonTotalAdd1 = new JButton("+");
        btnNewButtonTotalAdd1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		num1= Double.parseDouble(textFieldNum1.getText());
        		num2= Double.parseDouble(textFieldNum1.getText());
        		total= num1+num2;
        	}
        });
        btnNewButtonTotalAdd1.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnNewButtonTotalAdd1.setBounds(251, 130, 55, 23);
        frame.getContentPane().add(btnNewButtonTotalAdd1);
        
        JButton btnNewButtonTotal1 = new JButton("=");
        btnNewButtonTotal1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		String tot =String.format("%.0f", total);
        		textFieldTotal.setText(tot);
        	}
        });
        btnNewButtonTotal1.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnNewButtonTotal1.setBounds(251, 172, 55, 23);
        frame.getContentPane().add(btnNewButtonTotal1);
        
        textFieldNum2 = new JTextField();
        textFieldNum2.setFont(new Font("Tahoma", Font.PLAIN, 13));
        textFieldNum2.setColumns(10);
        textFieldNum2.setBounds(124, 129, 98, 26);
        frame.getContentPane().add(textFieldNum2);
        
        JLabel lblNewLabel_1_1 = new JLabel("Enter Number");
        lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblNewLabel_1_1.setBounds(10, 133, 111, 14);
        frame.getContentPane().add(lblNewLabel_1_1);
        
        JLabel lblNewLabel_1_2 = new JLabel("Total");
        lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblNewLabel_1_2.setBounds(10, 172, 98, 14);
        frame.getContentPane().add(lblNewLabel_1_2);
        
        textFieldTotal = new JTextField();
        textFieldTotal.setFont(new Font("Tahoma", Font.PLAIN, 13));
        textFieldTotal.setColumns(10);
        textFieldTotal.setBounds(124, 167, 98, 26);
        frame.getContentPane().add(textFieldTotal);
        
       
	}
	

}
