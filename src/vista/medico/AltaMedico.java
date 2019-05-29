package vista.medico;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.MatteBorder;

public class AltaMedico extends JPanel {

	/**
	 * Create the panel.
	 */
	private String[] label = { "ID :", "Nombre :", "Apellidos :", "Direccion :", "Telefono :", "Especialidad :",
			"Consulta :", "Horario :" };

	private JTextField[] fields = new JTextField[this.label.length];
	private JComboBox comboEspecilidad = crearCombo();
	private JComboBox comboConsulta = crearCombo();
	private JComboBox comboHorario = crearCombo();
	private JPanel panelLabel = new JPanel();
	private JPanel panelText = new JPanel();
	private JButton btnAceptar;
	private JLabel mensajeSistema;

	public AltaMedico(Color color, int letraPequena, int letraGrande, String tipoLetra) {
		setVisible(true);
		setBackground(color);

		JLabel lblNewLabel = new JLabel("Alta Medico");
		lblNewLabel.setFont(new Font(tipoLetra, Font.BOLD, letraGrande));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);

		mensajeSistema = new JLabel("Mensaje del sistema");
		mensajeSistema.setForeground(Color.RED);
		mensajeSistema.setHorizontalAlignment(SwingConstants.CENTER);
		mensajeSistema.setFont(new Font(tipoLetra, Font.BOLD, letraPequena));

		btnAceptar = new JButton("Aceptar");
		btnAceptar.setFont(new Font(tipoLetra, Font.BOLD, letraPequena));

		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.TRAILING).addGroup(groupLayout
				.createSequentialGroup()
				.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup().addContainerGap().addComponent(btnAceptar,
								GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup().addGap(30)
								.addComponent(panelLabel, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(mensajeSistema, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 156,
												Short.MAX_VALUE)
										.addComponent(lblNewLabel, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 156,
												Short.MAX_VALUE)
										.addComponent(panelText, GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE))))
				.addGap(100)));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup().addGap(20)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
						.addGap(30)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(panelLabel, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
								.addComponent(panelText, GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))
						.addGap(18).addComponent(btnAceptar).addGap(25)
						.addComponent(mensajeSistema, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addGap(43)));
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
		panelText.setLayout(new GridLayout(this.label.length, 1, 20, 20));
		panelLabel.setLayout(new GridLayout(this.label.length, 1, 10, 20));
//		for (int i = 0; i < fields.length; i++) {
//			int index = 0;
//			do {
//				this.fields[i] = crearJText(letraPequena, tipoLetra);
//				this.panelLabel.add(crearLabel(this.label[i], letraPequena, tipoLetra));
//				this.panelText.add(this.fields[i]);
//				i++;
//			} while (i <= 4);
//			this.dis[index] = crearCombo();
//			this.panelLabel.add(crearLabel(this.label[i], letraPequena, tipoLetra));
//			this.panelText.add(this.dis[index]);
//			index++;

//		}
		for (int i = 0; i < fields.length; i++) {
			if (i == 5) {
				this.panelText.add(this.comboEspecilidad);
			} else if (i == 6) {
				this.panelText.add(this.comboConsulta);
			} else if (i == 7) {
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
		field.setText(" ");
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

	private JComboBox crearCombo() {
		JComboBox combo = new JComboBox();
		return combo;

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

	public JComboBox getComboEspecilidad() {
		return comboEspecilidad;
	}

	public JComboBox getComboConsulta() {
		return comboConsulta;
	}
	public JComboBox getComboHorario() {
		return comboHorario;
	}

}
