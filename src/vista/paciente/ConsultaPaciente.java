package vista.paciente;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.GregorianCalendar;

import javax.swing.ComboBoxEditor;
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
import modelo.Persona;

import javax.swing.JComboBox;

public class ConsultaPaciente extends JPanel {
	private String[] label = { "ID :", "Nombre :", "Apellidos :", "Direccion :", "Nacimiento :", "Telefono :" };
	private JTextField[] fields = new JTextField[this.label.length];
	private JPanel panelLabel = new JPanel();
	private JPanel panelText = new JPanel();
	private JComboBox comboBoxNombre;
	private JComboBox comboBoxID;

	public ConsultaPaciente(Color color, int letraPequena, int letraGrande, String tipoLetra) {
		setVisible(true);
		setBackground(color);

		JLabel lblNewLabel = new JLabel("Consulta Paciente");
		lblNewLabel.setFont(new Font(tipoLetra, Font.BOLD, letraGrande));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel lblMensajeDelSistema = new JLabel("Mensaje del sistema");
		lblMensajeDelSistema.setForeground(Color.RED);
		lblMensajeDelSistema.setHorizontalAlignment(SwingConstants.CENTER);
		lblMensajeDelSistema.setFont(new Font(tipoLetra, Font.BOLD, letraPequena));
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNombre.setFont(new Font(tipoLetra, Font.BOLD, letraPequena));

		comboBoxNombre = new JComboBox();

		JLabel lblId = new JLabel("ID");
		lblId.setHorizontalAlignment(SwingConstants.RIGHT);
		lblId.setFont(new Font(tipoLetra, Font.BOLD, letraPequena));

		comboBoxID = new JComboBox();

		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.TRAILING).addGroup(groupLayout
				.createSequentialGroup().addGap(23)
				.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
								.addComponent(lblNombre, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED).addComponent(comboBoxNombre,
										GroupLayout.PREFERRED_SIZE, 169, GroupLayout.PREFERRED_SIZE))
						.addComponent(panelLabel, GroupLayout.PREFERRED_SIZE, 270, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup().addGap(35)
								.addComponent(lblId, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(comboBoxID, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup().addGap(6).addComponent(panelText,
								GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)))
				.addGap(25))
				.addGroup(groupLayout.createSequentialGroup().addGap(223)
						.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE).addGap(226))
				.addGroup(groupLayout.createSequentialGroup().addGap(234)
						.addComponent(lblMensajeDelSistema, GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
						.addGap(117)));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.TRAILING).addGroup(groupLayout
				.createSequentialGroup().addGap(19)
				.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
						.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblNombre, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(comboBoxID, GroupLayout.PREFERRED_SIZE, 28,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(lblId, GroupLayout.PREFERRED_SIZE, 33,
												GroupLayout.PREFERRED_SIZE))
								.addGap(3)))
						.addComponent(comboBoxNombre, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(panelText, GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
						.addComponent(panelLabel, GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE))
				.addGap(29)
				.addComponent(lblMensajeDelSistema, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)));
		panelLabel.setBackground(Color.WHITE);
		panelText.setBackground(Color.WHITE);
		panelText.setLayout(new GridLayout(1, 0, 0, 0));
		panelLabel.setLayout(new GridLayout(1, 0, 0, 0));
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
		panelText.setLayout(new GridLayout(this.label.length, 1, 30, 35));
		panelLabel.setLayout(new GridLayout(this.label.length, 1, 10, 15));
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
		field.setFocusable(false);
		field.setFont(new Font(tipoLetra, Font.BOLD, letraPequena));
		field.setHorizontalAlignment(SwingConstants.CENTER);
		field.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		return field;
	}

	private JLabel crearLabel(String cadena, int letraPequena, String tipoLetra) {
		JLabel jLabel = new JLabel();
		jLabel.setText(cadena);
		jLabel.setFont(new Font(tipoLetra, Font.BOLD, letraPequena));
		jLabel.setHorizontalAlignment(SwingConstants.CENTER);
		return jLabel;
	}

	public JTextField[] getFields() {
		return fields;
	}

	public void mostrarDatos(Paciente paciente) {
		this.fields[0].setText((paciente.getId()));
		this.fields[1].setText(paciente.getNombre());
		this.fields[2].setText(paciente.getApellidos());
		this.fields[3].setText(paciente.getDireccion());
		this.fields[4].setText(paciente.getTelefono());
	}

	public JComboBox getComboBoxNombre() {
		return comboBoxNombre;
	}

	public JComboBox getComboBoxID() {
		return comboBoxID;
	}

	
}
