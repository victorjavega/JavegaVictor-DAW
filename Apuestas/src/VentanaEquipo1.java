import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class VentanaEquipo1 extends JFrame {
	
	private Equipo equip;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	/**
	 * Create the frame.
	 */
	
	
	public VentanaEquipo1(Equipo e) {
		equip=e;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JLabel lblEquipo = new JLabel("Equipo");
		lblEquipo.setBounds(49, 25, 46, 14);
		contentPane.add(lblEquipo);
		
		
		JLabel lblGolesAFavor = new JLabel("Goles a Favor");
		lblGolesAFavor.setBounds(29, 81, 77, 14);
		contentPane.add(lblGolesAFavor);
		
		JLabel lblGolesEnContra = new JLabel("Goles en Contra");
		lblGolesEnContra.setBounds(29, 106, 77, 14);
		contentPane.add(lblGolesEnContra);
		
		textField = new JTextField();
		textField.setBounds(127, 78, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(127, 103, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(127, 150, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Partidos Ganados");
		lblNewLabel.setBounds(29, 153, 88, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Partidos Perdidos");
		lblNewLabel_1.setBounds(29, 178, 88, 14);
		contentPane.add(lblNewLabel_1);
		
		textField_3 = new JTextField();
		textField_3.setBounds(127, 175, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(127, 22, 86, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JButton Guardar = new JButton("guardar");
		Guardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String equipo="";
				int a=0;
				int b=0;
				int c=0;
				int e=0;
			}
		});
		Guardar.setBounds(307, 174, 89, 23);
		contentPane.add(Guardar);
		
		
	} 
	}
}
