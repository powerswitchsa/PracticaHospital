package vista.medico;

import java.awt.Color;

import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.MatteBorder;

import modelo.enums.Especialidad;
import modelo.enums.Turno;

import javax.swing.LayoutStyle.ComponentPlacement;

public class AltaMedico extends JPanel {

	private String[] label = { "Nombre :", "Apellidos :", "Direccion :", "Telefono :", "Especialidad :", "Consulta :",
			"Turno :" };

	private JTextField[] fields = new JTextField[this.label.length];
	private JComboBox<Especialidad> comboEspecilidad;
	private JComboBox comboConsulta;
	private JComboBox comboHorario;
	private JPanel panelLabel = new JPanel();
	private JPanel panelText = new JPanel();
	private JButton btnAceptar;
	private JLabel mensajeSistema;

	public AltaMedico(Color color, int letraPequena, int letraGrande, String tipoLetra) {
		setVisible(true);
		setBackground(color);
		this.comboEspecilidad = new JComboBox<Especialidad>();
		this.comboConsulta = new JComboBox();
		this.comboHorario = new JComboBox<Turno>();

		JLabel lblNewLabel = new JLabel("Alta Medico");
		lblNewLabel.setFont(new Font(tipoLetra, Font.BOLD, letraGrande));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);

		mensajeSistema = new JLabel("");
		mensajeSistema.setForeground(Color.RED);
		mensajeSistema.setHorizontalAlignment(SwingConstants.CENTER);
		mensajeSistema.setFont(new Font(tipoLetra, Font.BOLD, letraPequena));

		btnAceptar = new JButton("Aceptar");
		btnAceptar.setFont(new Font(tipoLetra, Font.BOLD, letraPequena));
		panelLabel.setBackground(Color.WHITE);
		panelText.setBackground(Color.WHITE);
		panelText.setLayout(new GridLayout(1, 0, 0, 0));
		panelLabel.setLayout(new GridLayout(1, 0, 0, 0));
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
				.createSequentialGroup()
				.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup().addGap(286).addComponent(lblNewLabel,
								GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup().addGap(30)
								.addComponent(panelLabel, GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE)
								.addGap(18).addComponent(panelText, GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup().addContainerGap(349, Short.MAX_VALUE)
								.addComponent(mensajeSistema, GroupLayout.PREFERRED_SIZE, 321,
										GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(btnAceptar, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE)))
				.addGap(30)));
		groupLayout
				.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup().addGap(20)
								.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
								.addGap(30)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(panelText, GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
										.addComponent(panelLabel, GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE))
								.addGap(10)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
										.addComponent(mensajeSistema, GroupLayout.DEFAULT_SIZE,
												GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(btnAceptar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE))
								.addGap(108)));
		setLayout(groupLayout);
		creandoVista(color, letraPequena, tipoLetra);
		setVisible(true);

		for (Especialidad esp : Especialidad.values()) {
			this.comboEspecilidad.addItem(esp);
		}
	}

	private void creandoVista(Color color, int letraPequena, String tipoLetra) {
		this.panelLabel.setBackground(color);
		this.panelText.setBackground(color);
		setBackground(color);
		this.fields = new JTextField[this.label.length];
		panelText.setLayout(new GridLayout(this.label.length, 1, 0, 40));
		panelLabel.setLayout(new GridLayout(this.label.length, 1, 0, 40));
		for (int i = 0; i < fields.length; i++) {
			if (i == 4) {
				this.panelText.add(this.comboEspecilidad);
			} else if (i == 5) {
				this.panelText.add(this.comboConsulta);
			} else if (i == 6) {
				this.panelText.add(comboHorario);
			} else {
				this.fields[i] = crearJText(letraPequena, tipoLetra);
				this.panelText.add(this.fields[i]);
			}
			this.panelLabel.add(crearLabel(this.label[i], letraPequena, tipoLetra));
		}
		revalidate();
	}

	private JTextField crearJText(int letraPequena, String tipoLetra) {
		JTextField field = new JTextField();
		field.setFont(new Font(tipoLetra, Font.BOLD, letraPequena));
		field.setHorizontalAlignment(SwingConstants.LEFT);
		field.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		return field;
	}

	private JLabel crearLabel(String cadena, int letraPequena, String tipoLetra) {
		JLabel jLabel = new JLabel();
		jLabel.setText(cadena);
		jLabel.setFont(new Font(tipoLetra, Font.BOLD, letraPequena));
		jLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		return jLabel;
	}

	public void vaciarCampos() {
		for (int i = 0; i < fields.length; i++) {
			if (i < 4) {
				this.fields[i].setText("");
			}
		}
	}

	public ArrayList<String> getFieldsMedico() {
		ArrayList<String> campos = new ArrayList<String>();
		for (int i = 0; i < 4; i++) {
			campos.add(i, this.fields[i].getText().toString());
		}
		return campos;
	}

	public JTextField[] getFields() {
		return fields;
	}

	public JButton getBtnAceptar() {
		return btnAceptar;
	}

	public JLabel getMensajeSistema() {
		return mensajeSistema;
	}

	public JComboBox<Especialidad> getComboEspecilidad() {
		return comboEspecilidad;
	}

	public JComboBox getComboConsulta() {
		return comboConsulta;
	}

	public JComboBox getComboHorario() {
		return comboHorario;
	}

	public Especialidad getTipoEspecialidad() {
		if (getComboEspecilidad().getSelectedItem() != null) {
			switch (getComboEspecilidad().getSelectedItem().toString()) {
			case "Especialista":
				return Especialidad.Especialista;
			case "Cabecera":
				return Especialidad.Cabecera;
			case "Cirujano":
				return Especialidad.Cirujano;
			default:
				return null;
			}
		} else {
			return null;
		}
	}

	public Turno getTurno() {
		switch (getComboHorario().getSelectedItem().toString()) {
		case "mañana":
			return Turno.mañana;
		case "tarde":
			return Turno.tarde;
		case "mediaMañana":
			return Turno.mediaMañana;
		case "medioDia":
			return Turno.medioDia;
		default:
			return null;
		}
	}

	public void setFields(JTextField[] fields) {
		this.fields = fields;
	}

}
