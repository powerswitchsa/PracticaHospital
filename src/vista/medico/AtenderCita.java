package vista.medico;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.SwingConstants;
import javax.swing.LayoutStyle.ComponentPlacement;

public class AtenderCita extends JPanel {
	private JTextField txtPaciente;
	private JTextField txtHoraCita;
	private JTextField txtObservaciones;
	private JTextField txtPeriodo;
	private JTextField txtDosis;
	private JTextField txtMensaje;

	/**
	 * Create the panel.
	 */
	public AtenderCita(Color color, int letraPequena, int letraGrande, String tipoLetra) {
		setBackground(color);

		setBorder(null);

		JLabel lblMedico = new JLabel("Medico");
		lblMedico.setFont(new Font(tipoLetra, Font.BOLD, 20));
		lblMedico.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel lblPaciente = new JLabel("Paciente");
		lblPaciente.setFont(new Font(tipoLetra, Font.BOLD, 20));
		lblPaciente.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel lblHoraCita = new JLabel("Hora cita");
		lblHoraCita.setFont(new Font(tipoLetra, Font.BOLD, 20));
		lblHoraCita.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel lblTitulo = new JLabel("Atencion a cita");
		lblTitulo.setFont(new Font(tipoLetra, Font.BOLD, letraGrande));

		JComboBox comboBoxMedico = new JComboBox();

		txtPaciente = new JTextField();
		txtPaciente.setColumns(10);

		txtHoraCita = new JTextField();
		txtHoraCita.setColumns(10);

		JLabel lblObservaciones = new JLabel("Observaciones");
		lblObservaciones.setFont(new Font(tipoLetra, Font.BOLD, 20));

		txtObservaciones = new JTextField();
		txtObservaciones.setColumns(10);

		JButton btnAplicar = new JButton("Aplicar");

		txtMensaje = new JTextField();
		txtMensaje.setBorder(null);
		txtMensaje.setFont(new Font(tipoLetra, Font.BOLD, 20));
		txtMensaje.setForeground(color.RED);
		txtMensaje.setEditable(false);
		txtMensaje.setText("Mensaje del Sistema");
		txtMensaje.setOpaque(false);
		txtMensaje.setFocusable(false);
		txtMensaje.setColumns(10);

		JPanel panel = new JPanel();
		panel.setOpaque(false);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(20)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblPaciente, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblMedico, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblHoraCita, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)))
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(10)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblObservaciones)
										.addGroup(groupLayout.createSequentialGroup()
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(txtObservaciones, GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
												.addComponent(txtMensaje, GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE))
											.addPreferredGap(ComponentPlacement.RELATED)
											.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
												.addComponent(panel, GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
												.addComponent(btnAplicar, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)))))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(18)
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(txtHoraCita, Alignment.LEADING)
										.addComponent(txtPaciente, Alignment.LEADING)
										.addComponent(comboBoxMedico, Alignment.LEADING, 0, 221, Short.MAX_VALUE)))))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(67)
							.addComponent(lblTitulo, GroupLayout.PREFERRED_SIZE, 525, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblTitulo, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addGap(30)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblMedico)
						.addComponent(comboBoxMedico, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPaciente, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtPaciente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblHoraCita, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtHoraCita, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblObservaciones, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
						.addComponent(txtObservaciones, GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE))
					.addGap(13)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(txtMensaje, GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
						.addComponent(btnAplicar))
					.addContainerGap())
		);

		JLabel lblNewLabel_2 = new JLabel("Medicamento");
		lblNewLabel_2.setFont(new Font(tipoLetra, Font.BOLD, 20));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel labelDosis = new JLabel("Dosis");
		labelDosis.setFont(new Font(tipoLetra, Font.BOLD, 20));
		labelDosis.setHorizontalAlignment(SwingConstants.CENTER);

		JComboBox comboBoxMedicamento = new JComboBox();

		txtPeriodo = new JTextField();
		txtPeriodo.setColumns(10);

		JLabel lblPeriodo = new JLabel("Periodo");
		lblPeriodo.setFont(new Font(tipoLetra, Font.BOLD, 20));
		lblPeriodo.setHorizontalAlignment(SwingConstants.CENTER);

		txtDosis = new JTextField();
		txtDosis.setColumns(10);

		JLabel lblTratamiento = new JLabel("Tratamiento");
		lblTratamiento.setFont(new Font(tipoLetra, Font.BOLD, 20));
		lblTratamiento.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.LEADING).addGroup(gl_panel
				.createSequentialGroup().addGap(20)
				.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(lblTratamiento, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
								GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblNewLabel_2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE))
				.addGap(35).addComponent(comboBoxMedicamento, 0, 80, Short.MAX_VALUE).addGap(30))
				.addGroup(gl_panel.createSequentialGroup().addGap(20)
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblPeriodo, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE)
								.addComponent(labelDosis, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE))
						.addGap(35)
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(txtDosis, GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
								.addComponent(txtPeriodo, GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
						.addGap(30)));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup().addContainerGap().addComponent(lblTratamiento).addGap(22)
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup().addGap(3).addComponent(lblNewLabel_2))
								.addComponent(comboBoxMedicamento, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup().addGap(23).addComponent(labelDosis))
								.addGroup(gl_panel.createSequentialGroup().addGap(18).addComponent(txtDosis,
										GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)))
						.addGap(13)
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup().addGap(6).addComponent(lblPeriodo))
								.addComponent(txtPeriodo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))));
		panel.setLayout(gl_panel);
		setLayout(groupLayout);

	}
}
