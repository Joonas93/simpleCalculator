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
import java.util.ArrayList;
import javax.swing.JToggleButton;
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
private String calculation = "";
double tmp;
private String doer ="";
private String tmpDoer = "";
private String tmp1;
private JTextArea txtrSaas;
	public GUI() {
		
		getContentPane().setLayout(new BorderLayout(5, 5));
		
		 txtrSaas = new JTextArea();
		 txtrSaas.setColumns(2);
		 txtrSaas.setFont(new Font("Monospaced", Font.PLAIN, 20));
		txtrSaas.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		txtrSaas.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		txtrSaas.setEditable(false);
		txtrSaas.setRows(2);
		txtrSaas.setMinimumSize(new Dimension(100, 100));
		txtrSaas.setPreferredSize(new Dimension(2, 70));
		txtrSaas.setBorder(new EmptyBorder(4, 4, 4, 4));
		getContentPane().add(txtrSaas, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(4, 9, 4, 4));
		
		 btnNewButton_1 = new JButton("1");
		btnNewButton_1.setRequestFocusEnabled(false);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 32));
		panel.add(btnNewButton_1);
		
		 btnNewButton_2 = new JButton("2");
		btnNewButton_2.setRequestFocusEnabled(false);
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 32));
		panel.add(btnNewButton_2);
		
		 btnNewButton_3 = new JButton("3");
		btnNewButton_3.setRequestFocusEnabled(false);
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 32));
		panel.add(btnNewButton_3);
		
		btnNewButton_12 = new JButton("*");
		btnNewButton_12.setRequestFocusEnabled(false);
		btnNewButton_12.setFont(new Font("Tahoma", Font.PLAIN, 24));
		panel.add(btnNewButton_12);
		
		 btnNewButton_4 = new JButton("4");
		btnNewButton_4.setRequestFocusEnabled(false);
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 32));
		panel.add(btnNewButton_4);
		
		 btnNewButton_5 = new JButton("5");
		btnNewButton_5.setRequestFocusEnabled(false);
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 32));
		panel.add(btnNewButton_5);
		
		 btnNewButton_6 = new JButton("6");
		btnNewButton_6.setRequestFocusEnabled(false);
		btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 32));
		panel.add(btnNewButton_6);
		
		 btnNewButton_10 = new JButton("/");
		btnNewButton_10.setRequestFocusEnabled(false);
		btnNewButton_10.setFont(new Font("Tahoma", Font.PLAIN, 24));
		panel.add(btnNewButton_10);
		
		btnNewButton_7 = new JButton("7");
		btnNewButton_7.setRequestFocusEnabled(false);
		btnNewButton_7.setFont(new Font("Tahoma", Font.PLAIN, 32));
		panel.add(btnNewButton_7);
		
		btnNewButton_8 = new JButton("8");
		btnNewButton_8.setRequestFocusEnabled(false);
		btnNewButton_8.setFont(new Font("Tahoma", Font.PLAIN, 32));
		panel.add(btnNewButton_8);
		
		 btnNewButton_9 = new JButton("9");
		btnNewButton_9.setRequestFocusEnabled(false);
		btnNewButton_9.setFont(new Font("Tahoma", Font.PLAIN, 32));
		panel.add(btnNewButton_9);
		
		 btnNewButton_11 = new JButton("+");
		btnNewButton_11.setRequestFocusEnabled(false);
		btnNewButton_11.setFont(new Font("Tahoma", Font.PLAIN, 24));
		panel.add(btnNewButton_11);
		
		 btnNewButton_13 = new JButton(".");
		btnNewButton_13.setRequestFocusEnabled(false);
		btnNewButton_13.setFont(new Font("Tahoma", Font.PLAIN, 24));
		panel.add(btnNewButton_13);
		
		 btnNewButton = new JButton("0");
		btnNewButton.setRequestFocusEnabled(false);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 32));
		panel.add(btnNewButton);
		
		 btnNewButton_14 = new JButton("=");
		btnNewButton_14.setRequestFocusEnabled(false);
		btnNewButton_14.setFont(new Font("Tahoma", Font.PLAIN, 24));
		panel.add(btnNewButton_14);
		
		 btnNewButton_15 = new JButton("-");
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
	ArrayList<String>whole = new ArrayList<String>();
	ArrayList<String>result = new ArrayList<String>();
	boolean is = true;
	boolean empty = true;
	boolean multi = false;
	int size = result.size();
	double res;
	public boolean check(int size) {
		boolean into;
		if (size!=0) {
			 into = false;
			
		}
		else {
			into = true;
		}
		return into;
	}
	
	
	public void calculator( double num) {
		res=tmp;
		tmp=num;
		
		whole.add(Integer.toString((int)tmp));
	if (!is) {
			tmp = res*10+num;
		}
		is = false;
	}
	
	public void things(String x) {
		
		is = true;
		if(tmp!=0 || tmp == 0 && !check(size) ) {
		
		result.add(Double.toString(tmp));
		tmp = 0;
		}
		int tmp;
		String last;
		if (result.size()!=0) {
		 tmp = result.size()-1;
		 last = result.get(tmp);
			if(!last.equals("+")&& !last.equals("-") && !last.equals("*") && !last.equals("/") ) {
				whole.add(x);
				result.add(x);
					}
			else if (last.equals("+")|| last.equals("-") || last.equals("*") || last.equals("/") ) {
				whole.remove(tmp);
				whole.add(x);
			}
		}

		}
		
			
		
	
	

	
	public void result() {
		
		//check if user have inputed last value to calculator and add it to array
		if(!is) {
		
		result.add(Double.toString(tmp));
		System.out.println("**"+result + "***");
		}
		// checks if the array ends with operator and removes it
		int tmp1 = 0;
		String last;
		if (result.size()!=0) {
		 tmp1 = result.size()-1;
		 last = result.get(tmp1);
			if(last.equals("+")|| last.equals("-") || last.equals("*") || last.equals("/") ) {
				
				result.remove(tmp1);
				System.out.print("*/*");
					}
		}

		

		System.out.println(result);
		
		
		int kerroin, jako, plus, miinus;
		
		do {
		kerroin = result.indexOf("*");
		jako = result.indexOf("/");
		System.out.println(kerroin + " " + jako);
		//goes through array to find multiplys and diversions
		if ((kerroin < jako && kerroin !=-1) || (kerroin > jako && jako ==-1)) {
			System.out.println("kerto");
		double tmp = Double.parseDouble(result.get(kerroin-1)) * Double.parseDouble(result.get(kerroin+1));
		// removes old values and add calculated value
		result.remove(kerroin-1);
		result.add(kerroin-1, Double.toString(tmp));
		result.remove(kerroin);
		result.remove(kerroin);
		
		}
		else if((jako < kerroin && jako !=-1) || (jako >kerroin && kerroin ==-1)) {
			System.out.println("jako");
			double tmp = Double.parseDouble(result.get(jako-1)) / Double.parseDouble(result.get(jako+1));
			result.remove(jako-1);
			result.add(jako-1, Double.toString(tmp));
			result.remove(jako);
			result.remove(jako);
			
		}
		} while (kerroin != -1 || jako != -1);

		do {
			plus = result.indexOf("+");
			miinus = result.indexOf("-");
		System.out.println(plus + " " +miinus);
		
		if ((plus < miinus && plus != -1) ||( plus > miinus && miinus == -1)) {
			System.out.println("plus");
		double tmp = Double.parseDouble(result.get(plus-1)) + Double.parseDouble(result.get(plus+1));
		result.remove(plus-1);
		result.add(plus-1, Double.toString(tmp));
		result.remove(plus);
		result.remove(plus);
		
		
		}
		else if ((miinus<jako && miinus !=-1) || (miinus > plus && plus == -1)) {
			System.out.println("miinus");
			double tmp = Double.parseDouble(result.get(miinus-1)) - Double.parseDouble(result.get(miinus+1));
			result.remove(miinus-1);
			result.add(miinus-1, Double.toString(tmp));
			result.remove(miinus);
			result.remove(miinus);
			
		}
		System.out.println(result.indexOf("+"));
		} while (plus > -1 || miinus > -1 );
		
		// Array to memorize answers
		int y = 0;
		ArrayList<String> results = new ArrayList<String>();
		results.add(result.get(0));
		
		System.out.println(result);
// checks if outcome contais somenthing afte dot.
		double d = Double.parseDouble(results.get(y));
		if (d%1 == 0) {
		txtrSaas.setText(Integer.toString((int)d));
		}
		else {
			txtrSaas.setText(results.get(y));
		}
		y++;
		//reset variable so program can continue calculating from result
		tmp = 0;
	}
		
	public void updateText() {
		String txt="";
		for (int x = 0; x < whole.size(); x++) {
		txt = txt  + whole.get(x);
	
		
	}
		txtrSaas.setText(txt);
	}
	
	private class MyEventHandler implements ActionListener {
		
		public void actionPerformed (ActionEvent event) {
			
			
		
	if (event.getSource()==btnNewButton) {
		calculator(0);
		
	}
	else if (event.getSource()==btnNewButton_1) {
		calculator(1);	
		updateText();
	}
	else if (event.getSource()==btnNewButton_2) {
		calculator(2);
		updateText();
	}
	else if (event.getSource()==btnNewButton_3) {
		calculator(3);
		updateText();
	}
	else if (event.getSource()==btnNewButton_4) {
		calculator(4);
		updateText();
	}
	else if (event.getSource()==btnNewButton_5) {
		calculator(5);
		updateText();
	}
	else if (event.getSource()==btnNewButton_6) {
		calculator(6);
		updateText();
	}
	else if (event.getSource()==btnNewButton_7) {
		calculator(7);
		updateText();
	}
	else if (event.getSource()==btnNewButton_8) {
		calculator(8);
		updateText();
	}
	else if (event.getSource()==btnNewButton_9) {
		calculator( 9);
		updateText();
	}
	else if (event.getSource()==btnNewButton_10) {
		things("/");
		updateText();
	}
	else if (event.getSource()==btnNewButton_11) {
		things("+");
		updateText();
	}
	else if (event.getSource()==btnNewButton_12) {
		things("*");
		updateText();
	}
	else if (event.getSource()==btnNewButton_13) {
		
	}
	else if (event.getSource()==btnNewButton_14) {
		result();
		
	}
	else if (event.getSource()==btnNewButton_15) {
		things("-");
		updateText();
	}
	else {
		System.out.print("*");
	}
	
		}
		
	}


public static void main(String[] args) {
	GUI frame = new GUI();
	frame.setSize(400, 500);
	frame.setLocationRelativeTo(null);
	frame.setVisible(true);

}
}