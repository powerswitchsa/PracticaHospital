package vista.paciente;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.MatteBorder;
import java.awt.GridLayout;

public class CitaEspecialista extends JPanel {

	private int letraPequena;
	private int letraGrande;
	private Color colorFondo;
	private String tipoLetra;

	private JPanel panelBotonera;
	private JPanel panelLabel;

	private String[] label = { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes" };
	private JButton[][] botonera = new JButton[4][5];
	private JComboBox comboBoxNombre;
	private JComboBox comboBoxID;
	private JComboBox comboNombreMedico;
	private String coordenada;

	public CitaEspecialista(Color colorFondo, int letraPequena, int letraGrande, String tipoLetra) {
		setVisible(true);
		setBackground(colorFondo);
		this.colorFondo = colorFondo;
		this.letraPequena = letraPequena;
		this.letraGrande = letraGrande;
		this.tipoLetra = tipoLetra;

		JLabel lblNewLabel = new JLabel("Cita Especialista");
		lblNewLabel.setFont(new Font(tipoLetra, Font.BOLD, letraGrande));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);

		JPanel panel = new JPanel();
		panel.setBackground(colorFondo);
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(colorFondo);

		JLabel lblId = new JLabel("ID : ");
		lblId.setFont(new Font(tipoLetra, Font.BOLD, letraPequena));

		comboBoxID = new JComboBox();
		comboBoxID.setBackground(Color.WHITE);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(colorFondo);

		JLabel lblMedico = new JLabel("Medico : ");
		lblMedico.setFont(new Font(tipoLetra, Font.BOLD, letraPequena));

		comboNombreMedico = new JComboBox();
		comboNombreMedico.setBackground(Color.WHITE);
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup().addContainerGap()
						.addComponent(lblMedico, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE).addGap(20)
						.addComponent(comboNombreMedico, 0, 505, Short.MAX_VALUE).addContainerGap()));
		gl_panel_2.setVerticalGroup(gl_panel_2.createParallelGroup(Alignment.LEADING).addGroup(gl_panel_2
				.createSequentialGroup().addGap(20)
				.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addComponent(lblMedico, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
						.addComponent(comboNombreMedico, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
				.addGap(20)));
		panel_2.setLayout(gl_panel_2);
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup().addContainerGap()
						.addComponent(lblId, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(comboBoxID, 0, 155, Short.MAX_VALUE)
						.addContainerGap()));
		gl_panel_1.setVerticalGroup(gl_panel_1.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING,
				gl_panel_1.createSequentialGroup().addGap(21)
						.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
								.addComponent(comboBoxID, Alignment.LEADING)
								.addComponent(lblId, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
						.addGap(20)));
		panel_1.setLayout(gl_panel_1);

		JLabel lblNewLabel_1 = new JLabel("Nombre : ");
		lblNewLabel_1.setFont(new Font(tipoLetra, Font.BOLD, letraPequena));

		comboBoxNombre = new JComboBox();
		comboBoxNombre.setBackground(Color.WHITE);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup().addContainerGap()
						.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
						.addGap(20).addComponent(comboBoxNombre, 0, 505, Short.MAX_VALUE).addContainerGap()));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup().addGap(20)
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 30,
										Short.MAX_VALUE)
								.addComponent(comboBoxNombre, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 44,
										Short.MAX_VALUE))
						.addGap(20)));
		panel.setLayout(gl_panel);

		panelLabel = new JPanel();

		panelBotonera = new JPanel();
		panelBotonera.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
				.createSequentialGroup().addGap(30)
				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
								.addComponent(panelBotonera, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE).addGap(30))
						.addGroup(groupLayout.createSequentialGroup().addGroup(groupLayout
								.createParallelGroup(Alignment.TRAILING)
								.addComponent(panelLabel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 926,
										Short.MAX_VALUE)
								.addComponent(lblNewLabel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 926,
										Short.MAX_VALUE)
								.addGroup(groupLayout.createSequentialGroup()
										.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
												.addComponent(panel_2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 656,
														Short.MAX_VALUE)
												.addComponent(panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
														Short.MAX_VALUE))
										.addGap(6).addComponent(panel_1, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
								.addGap(30)))));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup().addGap(30)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addGap(10)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(panel, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
						.addGap(10)
						.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addGap(18).addComponent(panelLabel, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
						.addGap(5).addComponent(panelBotonera, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
						.addGap(50)));
		panelBotonera.setLayout(new GridLayout(1, 0, 0, 0));
		panelLabel.setLayout(new GridLayout(1, 0, 10, 10));
		setLayout(groupLayout);
		panelLabel.setBackground(colorFondo);

		for (int i = 0; i < label.length; i++) {
			this.panelLabel.add(crearLabel(label[i]));
		}
	}

	private JLabel crearLabel(String cadena) {
		JLabel jLabel = new JLabel();
		jLabel.setOpaque(true);
		jLabel.setBackground(Color.WHITE);
		jLabel.setText(cadena);
		jLabel.setFont(new Font(tipoLetra, Font.BOLD, letraPequena));
		jLabel.setHorizontalAlignment(SwingConstants.CENTER);
		return jLabel;
	}

	public JComboBox getComboBoxNombre() {
		return comboBoxNombre;
	}

	public JComboBox getComboBoxID() {
		return comboBoxID;
	}

	public JComboBox getComboNombreMedico() {
		return comboNombreMedico;
	}

	public String getCoordenada() {
		return coordenada;
	}
	

}
