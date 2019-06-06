package vista;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JComboBox;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import javax.swing.JScrollPane;

public class VistaPrueba extends JPanel {
	private JTextField textFieldNombre;
	private JTextField textFieldApellidos;
	private JTextField textFieldDireccion;
	private JTextField textFieldNacimiento;
	private JTextField textFieldTelefono;

	public VistaPrueba() {
		setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 1, 749);
		add(panel_1);
		panel_1.setLayout(null);

		JLabel lblNewLabel = new JLabel("Paciente");
		lblNewLabel.setFont(new Font("Consolas", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		lblNewLabel.setBounds(11, 11, 884, 92);
		add(lblNewLabel);

		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel.setBounds(11, 114, 416, 46);
		add(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));

		JLabel lblNewLabel_1 = new JLabel("Nombre :  ");
		lblNewLabel_1.setFont(new Font("Consolas", Font.PLAIN, 20));
		panel.add(lblNewLabel_1);

		JComboBox comboBox = new JComboBox();
		panel.add(comboBox);

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_2.setBounds(437, 114, 156, 46);
		add(panel_2);
		panel_2.setLayout(new BoxLayout(panel_2, BoxLayout.X_AXIS));

		JLabel lblId = new JLabel("ID :  ");
		lblId.setFont(new Font("Consolas", Font.PLAIN, 20));
		panel_2.add(lblId);

		JComboBox comboBox_1 = new JComboBox();
		panel_2.add(comboBox_1);

		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_3.setBounds(10, 186, 583, 46);
		add(panel_3);
		panel_3.setLayout(new GridLayout(1, 0, 20, 0));

		JButton btnNewButton = new JButton("Nuevo Paciente");
		btnNewButton.setFont(new Font("Consolas", Font.BOLD, 15));
		panel_3.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Baja Paciente");
		btnNewButton_1.setFont(new Font("Consolas", Font.BOLD, 15));
		panel_3.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("Modificar Paciente");
		btnNewButton_2.setFont(new Font("Consolas", Font.BOLD, 15));
		panel_3.add(btnNewButton_2);

		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_4.setBounds(10, 258, 283, 480);
		add(panel_4);
		panel_4.setLayout(new GridLayout(0, 1, 0, 20));

		JLabel lblNewLabel_2 = new JLabel("Datos Paciente");
		lblNewLabel_2.setFont(new Font("Consolas", Font.BOLD, 20));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Nombre");
		lblNewLabel_3.setFont(new Font("Consolas", Font.PLAIN, 15));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(lblNewLabel_3);

		textFieldNombre = new JTextField();
		textFieldNombre.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(textFieldNombre);
		textFieldNombre.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("Apellidos");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(lblNewLabel_4);

		textFieldApellidos = new JTextField();
		textFieldApellidos.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(textFieldApellidos);
		textFieldApellidos.setColumns(10);

		JLabel lblNewLabel_5 = new JLabel("Direccion");
		lblNewLabel_5.setFont(new Font("Consolas", Font.PLAIN, 15));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(lblNewLabel_5);

		textFieldDireccion = new JTextField();
		textFieldDireccion.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(textFieldDireccion);
		textFieldDireccion.setColumns(10);

		JLabel lblFechaNacimiento = new JLabel("Fecha Nacimiento");
		lblFechaNacimiento.setFont(new Font("Consolas", Font.PLAIN, 15));
		lblFechaNacimiento.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(lblFechaNacimiento);

		textFieldNacimiento = new JTextField();
		textFieldNacimiento.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldNacimiento.setColumns(10);
		panel_4.add(textFieldNacimiento);

		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setFont(new Font("Consolas", Font.PLAIN, 15));
		lblTelefono.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(lblTelefono);

		textFieldTelefono = new JTextField();
		textFieldTelefono.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldTelefono.setColumns(10);
		panel_4.add(textFieldTelefono);
		
		JLabel lblCitasoperaciones = new JLabel("Citas/Operaciones");
		lblCitasoperaciones.setFont(new Font("Consolas", Font.PLAIN, 20));
		lblCitasoperaciones.setBounds(326, 258, 267, 24);
		add(lblCitasoperaciones);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(326, 293, 569, 183);
		add(scrollPane);
		
		JLabel lblTratamientos = new JLabel("Tratamientos");
		lblTratamientos.setFont(new Font("Consolas", Font.PLAIN, 20));
		lblTratamientos.setBounds(326, 509, 267, 24);
		add(lblTratamientos);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(326, 544, 569, 194);
		add(scrollPane_1);
		setVisible(true);
	}
}
