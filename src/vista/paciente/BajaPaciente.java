package vista.paciente;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.MatteBorder;

import modelo.Medico;
import modelo.Paciente;

import javax.swing.JComboBox;

public class BajaPaciente extends JPanel {
	private String[] label = { "Nombre :", "Apellidos :", "Direccion :", "Nacimiento :", "Telefono :" };
	private JTextField[] fields = new JTextField[this.label.length];
	private JPanel panelLabel = new JPanel();
	private JPanel panelText = new JPanel();
	private JLabel mensajeSistema;
	private final JLabel lblNombre = new JLabel("Nombre");
	private JComboBox comboBox = new JComboBox();
	private final JLabel lblId = new JLabel("ID");
	private JComboBox comboBox_1 = new JComboBox();

	public BajaPaciente(Color color, int letraPequena, int letraGrande, String tipoLetra) {

		JLabel lblConsultaMedico = new JLabel("BAJA PACIENTE");
		lblConsultaMedico.setHorizontalAlignment(SwingConstants.CENTER);
		lblConsultaMedico.setFont(new Font(tipoLetra, Font.BOLD, letraGrande));

		JLabel lblNombre = new JLabel("Nombre : ");
		lblNombre.setFont(new Font(tipoLetra, Font.BOLD, letraPequena));

		comboBox = new JComboBox();
		comboBox.setFont(new Font(tipoLetra, Font.BOLD, letraPequena));

		JLabel lblId = new JLabel("ID : ");
		lblId.setFont(new Font(tipoLetra, Font.BOLD, letraPequena));

		comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font(tipoLetra, Font.BOLD, letraPequena));

		panelLabel = new JPanel();

		panelText = new JPanel();

		mensajeSistema = new JLabel("Mensaje del Sistema");
		mensajeSistema.setForeground(Color.RED);
		mensajeSistema.setHorizontalAlignment(SwingConstants.CENTER);
		mensajeSistema.setFont(new Font(tipoLetra, Font.BOLD, letraPequena));

		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
				.createSequentialGroup().addGap(30)
				.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup().addComponent(lblNombre)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 195, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(lblId).addGap(18)
								.addComponent(
										comboBox_1, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
								.addGap(40))
						.addGroup(groupLayout.createSequentialGroup()
								.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblConsultaMedico, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
												410, Short.MAX_VALUE)
										.addGroup(groupLayout.createSequentialGroup()
												.addComponent(panelLabel, GroupLayout.PREFERRED_SIZE, 163,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(panelText,
														GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
								.addContainerGap())))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup().addContainerGap(308, Short.MAX_VALUE)
						.addComponent(mensajeSistema).addGap(96)));
		groupLayout
				.setVerticalGroup(
						groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup().addContainerGap()
										.addComponent(lblConsultaMedico).addGap(38)
										.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
												.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblId)
												.addComponent(comboBox, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblNombre, GroupLayout.PREFERRED_SIZE, 17,
														GroupLayout.PREFERRED_SIZE))
										.addGap(26)
										.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(panelLabel, GroupLayout.DEFAULT_SIZE, 178,
														Short.MAX_VALUE)
												.addComponent(panelText, GroupLayout.DEFAULT_SIZE, 178,
														Short.MAX_VALUE))
										.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(mensajeSistema)
										.addGap(5)));
		setLayout(groupLayout);

		creandoVista(letraPequena, tipoLetra);
		setVisible(true);
	}

	private void creandoVista(int letraPequena, String tipoLetra) {
		Color color = new Color(133, 200, 255);
		this.panelLabel.setBackground(color);
		this.panelText.setBackground(color);
		setBackground(color);
		this.fields = new JTextField[this.label.length];
		panelText.setLayout(new GridLayout(this.label.length, 1, 30, 40));
		panelLabel.setLayout(new GridLayout(this.label.length, 1, 10, 40));
		for (int i = 0; i < fields.length; i++) {
			this.fields[i] = crearJText(letraPequena, tipoLetra);
			this.panelLabel.add(crearLabel(this.label[i], letraPequena, tipoLetra));
			this.panelText.add(this.fields[i]);
		}
		revalidate();
	}

	private JTextField crearJText(int letraPequena, String tipoLetra) {
		JTextField field = new JTextField();
		field.setText("");
		field.setFont(new Font(tipoLetra, Font.BOLD, letraPequena));
		field.setHorizontalAlignment(SwingConstants.CENTER);
		field.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		field.setEnabled(false);
		return field;
	}

	private JLabel crearLabel(String cadena, int letraPequena, String tipoLetra) {
		JLabel jLabel = new JLabel();
		jLabel.setText(cadena);
		jLabel.setFont(new Font(tipoLetra, Font.BOLD, letraPequena));
		jLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		return jLabel;
	}

	public JTextField[] getFields() {
		return fields;
	}

	public JLabel getMensajeSistema() {
		return mensajeSistema;
	}

	public void rellenarComboBox(ArrayList<Paciente> paciente) {
		for (Paciente pacienteDos : paciente) {
			comboBox.addItem(pacienteDos.getNombre());
			comboBox_1.addItem(pacienteDos.getId());
		}
	}

	public void mostrarDatos(Paciente paciente) {
		this.fields[0].setText(paciente.getNombre());
		this.fields[1].setText(paciente.getApellidos());
		this.fields[2].setText(paciente.getDireccion());
		this.fields[3].setText(paciente.getNacimiento());
		this.fields[4].setText(String.valueOf(paciente.getTelefono()));
	}

	public int getID() {
		int id = Integer.parseInt((String) comboBox_1.getSelectedItem());
		return id;
	}

	public String getNombre() {
		String nombre = comboBox.getName();
		return nombre;
	}

}
