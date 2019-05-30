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

		setBorder(new LineBorder(new Color(0, 0, 0)));

		JLabel lblMedico = new JLabel("Medico");
		lblMedico.setFont(new Font(tipoLetra, Font.BOLD, 15));
		lblMedico.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel lblPaciente = new JLabel("Paciente");
		lblPaciente.setFont(new Font(tipoLetra, Font.BOLD, 15));
		lblPaciente.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel lblHoraCita = new JLabel("Hora cita");
		lblHoraCita.setFont(new Font(tipoLetra, Font.BOLD, 15));
		lblHoraCita.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel lblTitulo = new JLabel("Atencion a cita");
		lblTitulo.setFont(new Font(tipoLetra, Font.BOLD, letraGrande));

		JComboBox comboBoxMedico = new JComboBox();

		txtPaciente = new JTextField();
		txtPaciente.setColumns(10);

		txtHoraCita = new JTextField();
		txtHoraCita.setColumns(10);

		JLabel lblObservaciones = new JLabel("Observaciones");
		lblObservaciones.setFont(new Font(tipoLetra, Font.BOLD, 15));

		txtObservaciones = new JTextField();
		txtObservaciones.setColumns(10);

		JButton btnAplicar = new JButton("Aplicar");

		JLabel lblMensaje = new JLabel("Mensaje");
		lblMensaje.setFont(new Font(tipoLetra, Font.BOLD, 15));

		txtMensaje = new JTextField();
		txtMensaje.setFocusable(false);
		txtMensaje.setColumns(10);

		JPanel panel = new JPanel();
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(24)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
							.addComponent(lblMedico, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblPaciente, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblHoraCita, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblObservaciones)
							.addContainerGap())
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
							.addGroup(groupLayout.createSequentialGroup()
								.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
									.addComponent(lblTitulo, GroupLayout.PREFERRED_SIZE, 522, GroupLayout.PREFERRED_SIZE)
									.addGroup(groupLayout.createSequentialGroup()
										.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
											.addGroup(groupLayout.createSequentialGroup()
												.addComponent(lblMensaje, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.UNRELATED)
												.addComponent(txtMensaje, GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
												.addGap(109)
												.addComponent(btnAplicar, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE))
											.addGroup(groupLayout.createSequentialGroup()
												.addComponent(txtObservaciones, GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(panel, GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)))
										.addGap(30)))
								.addGap(5))
							.addGroup(groupLayout.createSequentialGroup()
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
									.addComponent(txtPaciente, GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(comboBoxMedico, Alignment.LEADING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(txtHoraCita, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)))
								.addContainerGap(192, Short.MAX_VALUE)))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(22)
							.addComponent(lblTitulo, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
							.addGap(128))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(60)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblMedico, GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
								.addComponent(comboBoxMedico, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblPaciente, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtPaciente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtHoraCita, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblHoraCita, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblObservaciones, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtObservaciones, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE))
					.addGap(35)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnAplicar)
						.addComponent(txtMensaje, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblMensaje))
					.addGap(43))
		);

		JLabel lblNewLabel_2 = new JLabel("Medicamento");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel label = new JLabel("Dosis");
		label.setHorizontalAlignment(SwingConstants.CENTER);

		JComboBox comboBoxMedicamento = new JComboBox();

		txtPeriodo = new JTextField();
		txtPeriodo.setColumns(10);

		JLabel lblPeriodo = new JLabel("Periodo");
		lblPeriodo.setHorizontalAlignment(SwingConstants.CENTER);

		txtDosis = new JTextField();
		txtDosis.setColumns(10);

		JLabel lblTratamiento = new JLabel("Tratamiento");
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
								.addComponent(label, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE))
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
								.addGroup(gl_panel.createSequentialGroup().addGap(23).addComponent(label))
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
