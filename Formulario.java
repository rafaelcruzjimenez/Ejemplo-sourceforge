import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.border.LineBorder;

public class Ejemplo {

	private JFrame frmMiPrimerProyecto;
	private JTextField textFiel;
	private JTextField textField_2;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejemplo window = new Ejemplo();
					window.frmMiPrimerProyecto.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ejemplo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMiPrimerProyecto = new JFrame();
		frmMiPrimerProyecto.getContentPane().setBackground(Color.LIGHT_GRAY);
		frmMiPrimerProyecto.setBackground(Color.BLACK);
		frmMiPrimerProyecto.getContentPane().setForeground(Color.WHITE);
		frmMiPrimerProyecto.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(Color.WHITE);
		panel.setBorder(new LineBorder(Color.BLACK));
		panel.setBackground(Color.CYAN);
		panel.setBounds(59, 30, 301, 180);
		frmMiPrimerProyecto.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Codigo Departamento");
		lblNewLabel_1.setBounds(10, 28, 113, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Nombre Departamento");
		lblNewLabel.setBounds(10, 82, 113, 14);
		panel.add(lblNewLabel);
		
		textFiel = new JTextField();
		textFiel.setBounds(169, 79, 86, 20);
		panel.add(textFiel);
		textFiel.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Extension Departamento");
		lblNewLabel_2.setBounds(10, 133, 128, 14);
		panel.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(169, 130, 86, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(169, 22, 86, 20);
		panel.add(passwordField);
		
		JButton btnNewButton = new JButton("Inserte Datos");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Bienvenido usuario");
				System.out.println(" SE HA PULSADO EL BOTÓN INSERTAR ");
			}
		});
		btnNewButton.setBounds(47, 227, 111, 23);
		frmMiPrimerProyecto.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Salir");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1.setBounds(286, 227, 89, 23);
		frmMiPrimerProyecto.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_3 = new JLabel("FORMULARIO");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(163, 11, 111, 14);
		frmMiPrimerProyecto.getContentPane().add(lblNewLabel_3);
		frmMiPrimerProyecto.setTitle("Mi Primer Proyecto");
		frmMiPrimerProyecto.setBounds(100, 100, 450, 300);
		frmMiPrimerProyecto.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
