import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Minicalculadora {

	private JFrame frame;
	private JTextField textField;
	public float primernumero;
	public float segundonumero;
	public String operador;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Minicalculadora window = new Minicalculadora();
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
	public Minicalculadora() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 343, 255);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setForeground(Color.BLACK);
		textField.setBackground(Color.WHITE);
		textField.setBounds(36, 27, 267, 31);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "1");
			}
		});
		btn1.setForeground(Color.BLACK);
		btn1.setBackground(Color.GRAY);
		btn1.setBounds(36, 69, 43, 23);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "2");
	
			}
		});
		btn2.setBackground(Color.GRAY);
		btn2.setBounds(95, 69, 43, 23);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "3");
			}
		});
		btn3.setBackground(Color.GRAY);
		btn3.setBounds(154, 69, 43, 23);
		frame.getContentPane().add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "4");
		
			}
		});
		btn4.setBackground(Color.GRAY);
		btn4.setBounds(36, 105, 43, 23);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "5");

			}
		});
		btn5.setBackground(Color.GRAY);
		btn5.setBounds(95, 105, 43, 23);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "6");
			}
		});
		btn6.setBackground(Color.GRAY);
		btn6.setBounds(154, 105, 43, 23);
		frame.getContentPane().add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "7");
		
			}
		});
		btn7.setBackground(Color.GRAY);
		btn7.setBounds(36, 139, 43, 23);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "8");

			}
		});
		btn8.setBackground(Color.GRAY);
		btn8.setBounds(95, 139, 43, 23);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "9");

			}
		});
		btn9.setBackground(Color.GRAY);
		btn9.setBounds(154, 139, 43, 23);
		frame.getContentPane().add(btn9);
		
		JButton btnPunto = new JButton(".");
		btnPunto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!(textField.getText().contains("."))) {textField.setText(textField.getText()+ ".");
			}
			}});
		btnPunto.setBackground(Color.GRAY);
		btnPunto.setBounds(154, 173, 43, 23);
		frame.getContentPane().add(btnPunto);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "0");
			}
		});
		btn0.setBackground(Color.GRAY);
		btn0.setBounds(36, 173, 102, 23);
		frame.getContentPane().add(btn0);
		
		JButton btnLimpiar = new JButton("C");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		btnLimpiar.setBackground(Color.GRAY);
		btnLimpiar.setBounds(207, 69, 43, 59);
		frame.getContentPane().add(btnLimpiar);
		
		JButton btnSuma = new JButton("+");
		btnSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				primernumero= Float.parseFloat(textField.getText());
				operador = "+";
				textField.setText("");
			}}
		);
		btnSuma.setBackground(Color.GRAY);
		btnSuma.setBounds(260, 69, 43, 25);
		frame.getContentPane().add(btnSuma);
		
		JButton btnResta = new JButton("-");
		btnResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				primernumero= Float.parseFloat(textField.getText());operador = "-";textField.setText("");
			}
		});
		btnResta.setBackground(Color.GRAY);
		btnResta.setBounds(260, 105, 43, 23);
		frame.getContentPane().add(btnResta);
		
		JButton btnMultiplicación = new JButton("*");
		btnMultiplicación.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				primernumero= Float.parseFloat(textField.getText());operador = "*";textField.setText("");
			}
		});
		btnMultiplicación.setBackground(Color.GRAY);
		btnMultiplicación.setBounds(260, 173, 43, 23);
		frame.getContentPane().add(btnMultiplicación);
		
		JButton btnDivisión = new JButton("/");
		btnDivisión.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				primernumero= Float.parseFloat(textField.getText());operador = "/";textField.setText("");
			}
		});
		btnDivisión.setBackground(Color.GRAY);
		btnDivisión.setBounds(260, 139, 43, 23);
		frame.getContentPane().add(btnDivisión);
		
		JButton btnIgual = new JButton("=");
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				segundonumero= Float.parseFloat(textField.getText());
				switch(operador) {
				case "+": textField.setText(Float.toString(primernumero+  segundonumero));
				break;
				case "-": textField.setText(Float.toString(primernumero-  segundonumero));
				break;
				case "*": textField.setText(Float.toString(primernumero*  segundonumero));
				break;
				case "/": textField.setText(Float.toString(primernumero/  segundonumero));
				break;
				
				
			}
			}});
		btnIgual.setBackground(Color.GRAY);
		btnIgual.setBounds(207, 130, 43, 66);
		frame.getContentPane().add(btnIgual);
	}
}
