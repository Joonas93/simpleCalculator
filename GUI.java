package simpleCalculator;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.awt.TextArea;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JTextPane;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.CardLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JToolBar;
import net.miginfocom.swing.MigLayout;
import javax.swing.BoxLayout;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Dimension;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.ComponentOrientation;
import java.awt.Cursor;
public class GUI extends JFrame {
	/**
	 * @wbp.nonvisual location=73,14
	 */
private JButton btnNewButton;
private JButton btnNewButton_1;
private JButton btnNewButton_2;
private JButton btnNewButton_3;
private JButton btnNewButton_4;
private JButton btnNewButton_5;
private JButton btnNewButton_6;
private JButton btnNewButton_7;
private JButton btnNewButton_8;
private JButton btnNewButton_9;
private JButton btnNewButton_10;
private JButton btnNewButton_11;
private JButton btnNewButton_12;
private JButton btnNewButton_13;
private JButton btnNewButton_14;
private JButton btnNewButton_15;
private String calculation;
double result, tmp;
private String doer ="";
private String tmpDoer = "";
private String tmp1;
private JTextArea txtrSaas;
	public GUI() {
		
		getContentPane().setLayout(new BorderLayout(5, 5));
		
		JTextArea txtrSaas = new JTextArea();
		txtrSaas.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		txtrSaas.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		txtrSaas.setColumns(3);
		txtrSaas.setEditable(false);
		txtrSaas.setRows(1);
		txtrSaas.setMinimumSize(new Dimension(2, 54));
		txtrSaas.setPreferredSize(new Dimension(2, 70));
		txtrSaas.setBorder(new EmptyBorder(4, 4, 4, 4));
		getContentPane().add(txtrSaas, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(4, 9, 4, 4));
		
		JButton btnNewButton_1 = new JButton("1");
		btnNewButton_1.setRequestFocusEnabled(false);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 32));
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("2");
		btnNewButton_2.setRequestFocusEnabled(false);
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 32));
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("3");
		btnNewButton_3.setRequestFocusEnabled(false);
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 32));
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_12 = new JButton("*");
		btnNewButton_12.setRequestFocusEnabled(false);
		btnNewButton_12.setFont(new Font("Tahoma", Font.PLAIN, 24));
		panel.add(btnNewButton_12);
		
		JButton btnNewButton_4 = new JButton("4");
		btnNewButton_4.setRequestFocusEnabled(false);
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 32));
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("5");
		btnNewButton_5.setRequestFocusEnabled(false);
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 32));
		panel.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("6");
		btnNewButton_6.setRequestFocusEnabled(false);
		btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 32));
		panel.add(btnNewButton_6);
		
		JButton btnNewButton_10 = new JButton("/");
		btnNewButton_10.setRequestFocusEnabled(false);
		btnNewButton_10.setFont(new Font("Tahoma", Font.PLAIN, 24));
		panel.add(btnNewButton_10);
		
		JButton btnNewButton_7 = new JButton("7");
		btnNewButton_7.setRequestFocusEnabled(false);
		btnNewButton_7.setFont(new Font("Tahoma", Font.PLAIN, 32));
		panel.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("8");
		btnNewButton_8.setRequestFocusEnabled(false);
		btnNewButton_8.setFont(new Font("Tahoma", Font.PLAIN, 32));
		panel.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("9");
		btnNewButton_9.setRequestFocusEnabled(false);
		btnNewButton_9.setFont(new Font("Tahoma", Font.PLAIN, 32));
		panel.add(btnNewButton_9);
		
		JButton btnNewButton_11 = new JButton("+");
		btnNewButton_11.setRequestFocusEnabled(false);
		btnNewButton_11.setFont(new Font("Tahoma", Font.PLAIN, 24));
		panel.add(btnNewButton_11);
		
		JButton btnNewButton_13 = new JButton(".");
		btnNewButton_13.setRequestFocusEnabled(false);
		btnNewButton_13.setFont(new Font("Tahoma", Font.PLAIN, 24));
		panel.add(btnNewButton_13);
		
		JButton btnNewButton = new JButton("0");
		btnNewButton.setRequestFocusEnabled(false);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 32));
		panel.add(btnNewButton);
		
		JButton btnNewButton_14 = new JButton("=");
		btnNewButton_14.setRequestFocusEnabled(false);
		btnNewButton_14.setFont(new Font("Tahoma", Font.PLAIN, 24));
		panel.add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("-");
		btnNewButton_15.setRequestFocusEnabled(false);
		btnNewButton_15.setFont(new Font("Tahoma", Font.PLAIN, 24));
		panel.add(btnNewButton_15);
		
		MyEventHandler command = new MyEventHandler();
		btnNewButton.addActionListener(command);
		btnNewButton_1.addActionListener(command);
		btnNewButton_2.addActionListener(command);
		btnNewButton_3.addActionListener(command);
		btnNewButton_4.addActionListener(command);
		btnNewButton_5.addActionListener(command);
		btnNewButton_6.addActionListener(command);
		btnNewButton_7.addActionListener(command);
		btnNewButton_8.addActionListener(command);
		btnNewButton_9.addActionListener(command);
		btnNewButton_10.addActionListener(command);
		btnNewButton_11.addActionListener(command);
		btnNewButton_12.addActionListener(command);
		btnNewButton_13.addActionListener(command);
		btnNewButton_14.addActionListener(command);
		btnNewButton_15.addActionListener(command);
		
	}
	
	public void calculator(String calc, double num) {
		if (doer.equals("+")) {
			result += num;
			doer = "";
		}
		if (doer.equals("-")) {
			result -=num;
			doer = "";
		}
		if (doer.equals("*")) {
			result *= num;
			doer="";
		}
		if (doer.equals("/")) {
			result /= num;
			doer="";
		}
		if (doer.equals("")) {
			calculation += calc;
			if (calculation.equals("")) {
				tmp = num;
			}
			else {
				calculation += calc;
				tmp=tmp*10+num;
				
				if (tmpDoer.equals("+")) {
					result += tmp;
				}
				if (tmpDoer.equals("-")) {
					result-= tmp;
				}
				if (tmpDoer.equals("*")) {
					result *= tmp;
				}
				if (tmpDoer.equals("/")) {
					result /= tmp;
				}
				tmpDoer = "";
			}
			
		}
		else {
			calculation += calc;
		}
		
	}
	
	public void Doer(String xx) {
		
		int x = calculation.length() - 2;
		
		doer = xx;
		tmpDoer = xx;
		if (calculation.lastIndexOf("+") != x || calculation.lastIndexOf("-") != x || calculation.lastIndexOf("*") != x || calculation.lastIndexOf("/")!=x) {
			calculation += " " + xx + " ";
		}
		else {
			String tmp = calculation.substring(x);
			tmp += " " + xx + " ";
			calculation = tmp;
			
		}
		
	}
	
	public void result() {
		String tmp = Double.toString(result);
		txtrSaas.append(tmp);
	}
	public void updateText() {
		txtrSaas.append(calculation);
	}
	
	private class MyEventHandler implements ActionListener {
		
		public void actionPerformed (ActionEvent event) {
			
			
		
	if (event.getSource()==btnNewButton) {
		calculator("0", 0);
		
	}
	else if (event.getSource()==btnNewButton_1) {
		calculator("1", 1);	
		
	}
	else if (event.getSource()==btnNewButton_2) {
		calculator("2", 2);
	}
	else if (event.getSource()==btnNewButton_3) {
		calculator("3", 3);
	}
	else if (event.getSource()==btnNewButton_4) {
		calculator("4", 4);
	}
	else if (event.getSource()==btnNewButton_5) {
		calculator("5", 5);
	}
	else if (event.getSource()==btnNewButton_6) {
		calculator("6", 6);
	}
	else if (event.getSource()==btnNewButton_7) {
		calculator("7", 7);
	}
	else if (event.getSource()==btnNewButton_8) {
		calculator("8", 8);
	}
	else if (event.getSource()==btnNewButton_9) {
		calculator("9", 9);
	}
	else if (event.getSource()==btnNewButton_10) {
		Doer("/");
	}
	else if (event.getSource()==btnNewButton_11) {
		Doer("+");
	}
	else if (event.getSource()==btnNewButton_12) {
		Doer("*");
	}
	else if (event.getSource()==btnNewButton_13) {
		
	}
	else if (event.getSource()==btnNewButton_14) {
		result();
	}
	else if (event.getSource()==btnNewButton_15) {
		Doer("-");
	}
	else {
		System.out.print("*");
	}
	
		}
		
	}


public static void main(String[] args) {
	GUI frame = new GUI();
	frame.setVisible(true);
	
}
}