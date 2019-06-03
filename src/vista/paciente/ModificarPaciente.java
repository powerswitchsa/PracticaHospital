package vista.paciente;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.MatteBorder;

import modelo.Paciente;

import java.awt.GridLayout;
import javax.swing.JButton;

public class ModificarPaciente extends JPanel {

	private Color colorFondo;
	private int letraPequena;
	private int letraGrande;
	private String tipoLetra;

	private String[] vectorLabel = { "Nombre : ", "Apellidos : ", "Direccion : ", "Nacimiento : ", "Telefono : " };
	private JTextField nombre;
	private JTextField apellidos;
	private JTextField direccion;
	private JTextField nacimiento;
	private JTextField telefono;

	private JPanel panelInfo;
	private JPanel panelLabel;
	private JComboBox comboBoxNombre;
	private JComboBox comboBoxID;
	private JButton btnModificar;

	public ModificarPaciente(Color colorFondo, int letraPequena, int letraGrande, String tipoLetra) {
		this.colorFondo = colorFondo;
		this.letraPequena = letraPequena;
		this.letraGrande = letraGrande;
		this.tipoLetra = tipoLetra;
		setBackground(colorFondo);
		JLabel lblNewLabel = new JLabel("Modificar Paciente");
		lblNewLabel.setFont(new Font(tipoLetra, Font.BOLD, letraGrande));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);

		panelLabel = new JPanel();

		panelInfo = new JPanel();

		JPanel panelcombo = new JPanel();

		btnModificar = new JButton("Modificar");
		btnModificar.setFont(new Font(tipoLetra, Font.BOLD, letraPequena));

		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.TRAILING).addGroup(groupLayout
				.createSequentialGroup()
				.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup().addContainerGap().addComponent(btnModificar,
								GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE))
						.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup().addGap(30)
								.addComponent(panelLabel, GroupLayout.PREFERRED_SIZE, 186, GroupLayout.PREFERRED_SIZE)
								.addGap(18)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 740,
												Short.MAX_VALUE)
										.addComponent(panelcombo, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 740,
												Short.MAX_VALUE)
										.addComponent(panelInfo, GroupLayout.DEFAULT_SIZE, 740, Short.MAX_VALUE))))
				.addGap(30)));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup().addGap(20)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panelcombo, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE).addGap(27)
						.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(panelInfo, GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
								.addComponent(panelLabel, GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE))
						.addGap(10)
						.addComponent(btnModificar, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
						.addContainerGap()));

		JLabel lblNewLabel_1 = new JLabel("Nombre : ");
		lblNewLabel_1.setFont(new Font(tipoLetra, Font.BOLD, 16));

		JLabel lblId = new JLabel("ID : ");
		lblId.setFont(new Font(tipoLetra, Font.BOLD, 16));

		comboBoxNombre = new JComboBox();
		comboBoxNombre.setFont(new Font(tipoLetra, Font.BOLD, 16));

		comboBoxID = new JComboBox();
		comboBoxID.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GroupLayout gl_panelcombo = new GroupLayout(panelcombo);
		gl_panelcombo.setHorizontalGroup(gl_panelcombo.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelcombo.createSequentialGroup().addGap(9)
						.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
						.addGap(10).addComponent(comboBoxNombre, 0, 383, Short.MAX_VALUE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(lblId, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(comboBoxID, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)));
		gl_panelcombo.setVerticalGroup(gl_panelcombo.createParallelGroup(Alignment.LEADING).addGroup(gl_panelcombo
				.createSequentialGroup()
				.addGroup(gl_panelcombo.createParallelGroup(Alignment.LEADING).addGroup(gl_panelcombo
						.createSequentialGroup().addGap(9)
						.addGroup(gl_panelcombo.createParallelGroup(Alignment.LEADING)
								.addComponent(comboBoxID, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBoxNombre, GroupLayout.PREFERRED_SIZE, 26,
										GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panelcombo.createSequentialGroup().addContainerGap().addComponent(lblId)))
				.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		panelcombo.setLayout(gl_panelcombo);
		setLayout(groupLayout);
		setVisible(true);
		panelcombo.setBackground(colorFondo);
		this.panelInfo.setBackground(colorFondo);
		panelInfo.setLayout(new GridLayout(0, 1, 0, 60));
		this.panelLabel.setBackground(colorFondo);
		panelLabel.setLayout(new GridLayout(0, 1, 0, 60));

		for (int i = 0; i < vectorLabel.length; i++) {
			this.panelLabel.add(crearLabel(vectorLabel[i]));
		}

		nombre = crearJText(false);
		apellidos = crearJText(false);
		direccion = crearJText(true);
		nacimiento = crearJText(false);
		telefono = crearJText(true);
		this.panelInfo.add(this.nombre);
		this.panelInfo.add(this.apellidos);
		this.panelInfo.add(this.direccion);
		this.panelInfo.add(this.nacimiento);
		this.panelInfo.add(this.telefono);
	}

	public void rellenarCampos(Paciente paciente) {
		this.nombre.setText(paciente.getNombre());
		this.apellidos.setText(paciente.getApellidos());
		this.direccion.setText(paciente.getDireccion());
		this.nacimiento.setText(paciente.getNacimiento());
		this.telefono.setText(paciente.getTelefono());
	}

	public void vaciarCampos() {
		this.nombre.setText(null);
		this.apellidos.setText(null);
		this.direccion.setText(null);
		this.nacimiento.setText(null);
		this.telefono.setText(null);
	}

	private JTextField crearJText(boolean editable) {
		JTextField field = new JTextField();
		field.setEditable(editable);
		field.setFont(new Font(tipoLetra, Font.BOLD, letraPequena));
		field.setHorizontalAlignment(SwingConstants.CENTER);
		field.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		return field;
	}

	private JLabel crearLabel(String cadena) {
		JLabel jLabel = new JLabel();
		jLabel.setText(cadena);
		jLabel.setFont(new Font(tipoLetra, Font.BOLD, letraPequena));
		jLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		return jLabel;
	}

	public JButton getBtnModificar() {
		return btnModificar;
	}

	public JComboBox getComboBoxNombre() {
		return comboBoxNombre;
	}

	public JComboBox getComboBoxID() {
		return comboBoxID;
	}

	public String getDireccion() {
		return this.direccion.getText();
	}

	public String getTelefono() {
		return this.telefono.getText();
	}

}
