package Mid_Calculator;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.math.BigDecimal;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import java.awt.Color;

public class MIDCAL {

	private JFrame frame;
	private JTextField textFieldMain;
	private JButton btnNewButton0;
	private JButton btnNewButton1;
	private JButton btnNewButton6;
	private JButton btnNewButtonClear;
	private JButton btnNewButton5;
	private JButton btnNewButton7;
	private JButton btnNewButton2;
	private JButton btnNewButtonX2;
	private JButton btnNewButton00;
	private JButton btnNewButton8;
	private JButton btnNewButton3;
	private JButton btnNewButtonEqu;
	private JButton btnNewButton9;
	private JButton btnNewButton4;
	private JButton btnNewButtonAdd;
	private JButton btnNewButtonSub;
	private JButton btnNewButtonMul;
	private JButton btnNewButtonDiv;
	private JButton btnNewButtonPenc;
	private char opcode = '1';
	double frist,second,result;
	String operation,answer;
	private JTextField textFieldOperator;
	private JTextField textFieldOperations;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MIDCAL window = new MIDCAL();
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
	public MIDCAL() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Calculator");
		frame.setBounds(0, 0, 347, 396);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setResizable(false);
	    frame.setSize(260,383); 
	    frame.setVisible(true); 
	    
	    ImageIcon image =new ImageIcon("frame_icon.png"); 
        frame.setIconImage(image.getImage());
        frame.getContentPane().setLayout(null);

        textFieldOperator = new JTextField();
        textFieldOperator.setEditable(false);
       // textFieldOperator.setBackground(new Color(255, 255, 255));
        textFieldOperator.setSelectionColor(new Color(255, 255, 255));
        textFieldOperator.setForeground(new Color(0, 0, 0));
        textFieldOperator.setHorizontalAlignment(SwingConstants.CENTER);
        textFieldOperator.setFont(new Font("Calibri", Font.PLAIN, 15));
        textFieldOperator.setColumns(10);
        textFieldOperator.setBounds(196, 11, 38, 63);
        frame.getContentPane().add(textFieldOperator);
        
        textFieldMain = new JTextField();
        textFieldMain.setEditable(false);
        textFieldMain.setHorizontalAlignment(SwingConstants.RIGHT);
        textFieldMain.setFont(new Font("Calibri", Font.BOLD, 18));
        textFieldMain.setBounds(9, 33, 188, 41);
        frame.getContentPane().add(textFieldMain);
        textFieldMain.setColumns(10);
        
        JButton btnNewButtonBackspace = new JButton("\uF0E7");
        btnNewButtonBackspace.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		String delete=null;
        		if(textFieldMain.getText().length()>0) {
        			StringBuilder str =new StringBuilder(textFieldMain.getText());
        			str.deleteCharAt(textFieldMain.getText().length()-1);
        			delete=str.toString();
        			textFieldMain.setText(delete);
        		}
        	}
        });
        btnNewButtonBackspace.setToolTipText("delete");
        btnNewButtonBackspace.setFont(new Font("Wingdings", Font.BOLD, 18));
        btnNewButtonBackspace.setBounds(9, 85, 58, 51);
        frame.getContentPane().add(btnNewButtonBackspace);
        
        btnNewButton0 = new JButton("0");
        btnNewButton0.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		String num = textFieldMain.getText()+btnNewButton0.getText();
        		textFieldMain.setText(num);
        	}
        });
        btnNewButton0.setToolTipText("0");
        btnNewButton0.setFont(new Font("Tahoma", Font.BOLD, 18));
        btnNewButton0.setBounds(10, 285, 58, 51);
        frame.getContentPane().add(btnNewButton0);
        
        btnNewButton1 = new JButton("1");
        btnNewButton1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		String num = textFieldMain.getText()+btnNewButton1.getText();
        		textFieldMain.setText(num);
        	}
        });
        btnNewButton1.setToolTipText("1");
        btnNewButton1.setFont(new Font("Tahoma", Font.BOLD, 18));
        btnNewButton1.setBounds(10, 235, 58, 51);
        frame.getContentPane().add(btnNewButton1);
        
        btnNewButton6 = new JButton("6");
        btnNewButton6.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		String num = textFieldMain.getText()+btnNewButton6.getText();
        		textFieldMain.setText(num);
        	}
        });
        btnNewButton6.setToolTipText("6");
        btnNewButton6.setFont(new Font("Tahoma", Font.BOLD, 18));
        btnNewButton6.setBounds(122, 185, 56, 51);
        frame.getContentPane().add(btnNewButton6);
        
        btnNewButtonClear = new JButton("AC");
        btnNewButtonClear.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		textFieldMain.setText(null);
        		textFieldOperator.setText(null);
        		textFieldOperations.setText(null);
        	}
        });
        btnNewButtonClear.setToolTipText("clear");
        btnNewButtonClear.setFont(new Font("Tahoma", Font.BOLD, 18));
        btnNewButtonClear.setBounds(66, 85, 58, 51);
        frame.getContentPane().add(btnNewButtonClear);
        
        btnNewButton5 = new JButton("5");
        btnNewButton5.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		String num = textFieldMain.getText()+btnNewButton5.getText();
        		textFieldMain.setText(num);
        	}
        });
        btnNewButton5.setToolTipText("5");
        btnNewButton5.setFont(new Font("Tahoma", Font.BOLD, 18));
        btnNewButton5.setBounds(66, 185, 57, 51);
        frame.getContentPane().add(btnNewButton5);
        
        btnNewButton7 = new JButton("7");
        btnNewButton7.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		String num = textFieldMain.getText()+btnNewButton7.getText();
        		textFieldMain.setText(num);
        	}
        });
        btnNewButton7.setToolTipText("7");
        btnNewButton7.setFont(new Font("Tahoma", Font.BOLD, 18));
        btnNewButton7.setBounds(10, 135, 58, 51);
        frame.getContentPane().add(btnNewButton7);        
        
        btnNewButton2 = new JButton("2");
        btnNewButton2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		String num = textFieldMain.getText()+btnNewButton2.getText();
        		textFieldMain.setText(num);
        	}
        });
        btnNewButton2.setToolTipText("2");
        btnNewButton2.setFont(new Font("Tahoma", Font.BOLD, 18));
        btnNewButton2.setBounds(65, 235, 58, 51);
        frame.getContentPane().add(btnNewButton2);
        
        btnNewButtonX2 = new JButton(".");
        btnNewButtonX2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		operation=".";

        		
        		if ((textFieldMain).toString().matches("\\d*(\\.\\d+)?")) {
        			   // number has one decimal
        			  }
        			else{
        			   // number has more than one decimal
        			}
        		
        		textFieldOperator.setText(operation);
        		String secondDisplay =(frist + operation + second+" = "+ result);
    			textFieldOperations.setText(secondDisplay);
        		
        	}
        });
        btnNewButtonX2.setToolTipText("raise to the power of 2");
        btnNewButtonX2.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnNewButtonX2.setBounds(65, 284, 58, 51);
        frame.getContentPane().add(btnNewButtonX2);
        
        btnNewButton00 = new JButton("00");
        btnNewButton00.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		String num = textFieldMain.getText()+btnNewButton00.getText();
        		textFieldMain.setText(num);
        	}
        });
        btnNewButton00.setToolTipText("00");
        btnNewButton00.setFont(new Font("Tahoma", Font.BOLD, 18));
        btnNewButton00.setBounds(120, 85, 58, 51);
        frame.getContentPane().add(btnNewButton00);
        
        btnNewButton8 = new JButton("8");
        btnNewButton8.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		String num = textFieldMain.getText()+btnNewButton8.getText();
        		textFieldMain.setText(num);
        	}
        });
        btnNewButton8.setToolTipText("8");
        btnNewButton8.setFont(new Font("Tahoma", Font.BOLD, 18));
        btnNewButton8.setBounds(65, 135, 58, 51);
        frame.getContentPane().add(btnNewButton8);
        
        btnNewButton3 = new JButton("3");
        btnNewButton3.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		String num = textFieldMain.getText()+btnNewButton3.getText();
        		textFieldMain.setText(num);
        	}
        });
        btnNewButton3.setToolTipText("3");
        btnNewButton3.setFont(new Font("Tahoma", Font.BOLD, 18));
        btnNewButton3.setBounds(120, 235, 58, 51);
        frame.getContentPane().add(btnNewButton3);
        
        btnNewButtonEqu = new JButton("=");
        btnNewButtonEqu.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		if(operation.equals("+")) {
        			second=Double.parseDouble(textFieldMain.getText());
        			result= frist + second;
        			answer= String.format("%.0f", result);
        			textFieldMain.setText(answer);	
        			
        			String secondDisplay =(frist +operation+second+"="+result);
        			textFieldOperations.setText(secondDisplay);
        		} 
        		else if(operation.equals("-")) {
        			second=Double.parseDouble(textFieldMain.getText());
        			result= frist - second;
        			answer= String.format("%.0f", result);
        			textFieldMain.setText(answer);	
        			
        			String secondDisplay =(frist +operation+second+"="+result);
        			textFieldOperations.setText(secondDisplay);
        		} 
        		else if(operation.equals("*")) {
        			second=Double.parseDouble(textFieldMain.getText());
        			result= frist * second;
        			answer= String.format("%.0f", result);
        			textFieldMain.setText(answer);	
        			
        			String secondDisplay =(frist +operation+second+"="+result);
        			textFieldOperations.setText(secondDisplay);
        		}
        		else if(operation.equals("/")) {
        			second=Double.parseDouble(textFieldMain.getText());
        			result= frist / second;
        			answer= String.format("%.3f", result);
        			textFieldMain.setText(answer);	
        			
        			String secondDisplay =(frist +operation+second+"="+result);
        			textFieldOperations.setText(secondDisplay);
        		}
        		else if(operation.equals(".")) {
        			second=Double.parseDouble(textFieldMain.getText());
        			result= frist + second;
        			answer= String.format("%.3f", result);
        			textFieldMain.setText(answer);	
        		}
        	}
        });
        btnNewButtonEqu.setToolTipText("equals");
        btnNewButtonEqu.setFont(new Font("Tahoma", Font.BOLD, 18));
        btnNewButtonEqu.setBounds(120, 284, 58, 51);
        frame.getContentPane().add(btnNewButtonEqu);
        
        btnNewButton9 = new JButton("9");
        btnNewButton9.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		String num = textFieldMain.getText()+btnNewButton9.getText();
        		textFieldMain.setText(num);
        	}
        });
        btnNewButton9.setToolTipText("9");
        btnNewButton9.setFont(new Font("Tahoma", Font.BOLD, 18));
        btnNewButton9.setBounds(120, 135, 58, 51);
        frame.getContentPane().add(btnNewButton9);
        
        btnNewButton4 = new JButton("4");
        btnNewButton4.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		String num = textFieldMain.getText()+btnNewButton4.getText();
        		textFieldMain.setText(num);
        	}
        });
        btnNewButton4.setToolTipText("4");
        btnNewButton4.setFont(new Font("Tahoma", Font.BOLD, 18));
        btnNewButton4.setBounds(10, 185, 58, 51);
        frame.getContentPane().add(btnNewButton4);
        
        btnNewButtonAdd = new JButton("+");
        btnNewButtonAdd.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		operation="+";
        		frist=Double.parseDouble(textFieldMain.getText());
        		textFieldMain.setText("");
        		textFieldOperator.setText(operation);
        		
        	}
        });
        btnNewButtonAdd.setToolTipText("addtion");
        btnNewButtonAdd.setFont(new Font("Tahoma", Font.BOLD, 18));
        btnNewButtonAdd.setBounds(177, 85, 58, 51);
        frame.getContentPane().add(btnNewButtonAdd);
        
        btnNewButtonSub = new JButton("-");
        btnNewButtonSub.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		operation="-";
        		frist=Double.parseDouble(textFieldMain.getText());
        		textFieldMain.setText("");
        		textFieldOperator.setText(operation);
        	}
        });
        btnNewButtonSub.setToolTipText("subtration");
        btnNewButtonSub.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnNewButtonSub.setBounds(177, 135, 58, 51);
        frame.getContentPane().add(btnNewButtonSub);
        
        btnNewButtonMul = new JButton("x");
        btnNewButtonMul.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		operation="*";
        		frist=Double.parseDouble(textFieldMain.getText());
        		textFieldMain.setText("");
        		textFieldOperator.setText(operation);
        	}
        });
        btnNewButtonMul.setToolTipText("multiplcation");
        btnNewButtonMul.setFont(new Font("Tahoma", Font.BOLD, 18));
        btnNewButtonMul.setBounds(176, 185, 58, 51);
        frame.getContentPane().add(btnNewButtonMul);
        
        btnNewButtonDiv = new JButton("/");
        btnNewButtonDiv.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		operation="/";
        		frist=Double.parseDouble(textFieldMain.getText());
        		textFieldMain.setText("");
        		textFieldOperator.setText(operation);
        	}
        });
        btnNewButtonDiv.setToolTipText("division");
        btnNewButtonDiv.setFont(new Font("Tahoma", Font.BOLD, 18));
        btnNewButtonDiv.setBounds(176, 235, 58, 51);
        frame.getContentPane().add(btnNewButtonDiv);
        
        btnNewButtonPenc = new JButton("%");
        btnNewButtonPenc.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		operation="%";
        		frist=Double.parseDouble(textFieldMain.getText());
        		textFieldMain.setText("");
        		
        		if(operation.equals("%")) {
         			result= (frist*1)/100;
         			answer= String.format("%.1f", result);
         			textFieldMain.setText(answer);	
        		}
        		
        		textFieldOperator.setText(operation);
        		String secondDisplay =(frist +operation+second+"="+result);
    			textFieldOperations.setText(secondDisplay);
        	}
        });
        btnNewButtonPenc.setToolTipText("pencentage");
        btnNewButtonPenc.setFont(new Font("Tahoma", Font.BOLD, 18));
        btnNewButtonPenc.setBounds(176, 284, 58, 51);
        frame.getContentPane().add(btnNewButtonPenc);               
        
        JButton btnNewButtonDecimal = new JButton(".");
        btnNewButtonDecimal.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {        		
        		textFieldMain.setText(".");
    
        	}
        });
        btnNewButtonDecimal.setToolTipText("raise to the power of 2");
        btnNewButtonDecimal.setFont(new Font("Tahoma", Font.BOLD, 18));
        btnNewButtonDecimal.setBounds(66, 355, 58, 26);
        frame.getContentPane().add(btnNewButtonDecimal);
        
        textFieldOperations = new JTextField();
        textFieldOperations.setHorizontalAlignment(SwingConstants.CENTER);
        textFieldOperations.setFont(new Font("Calibri", Font.BOLD, 12));
        textFieldOperations.setEditable(false);
        textFieldOperations.setColumns(10);
        textFieldOperations.setBounds(9, 11, 188, 26);
        frame.getContentPane().add(textFieldOperations);
        
	}
}
