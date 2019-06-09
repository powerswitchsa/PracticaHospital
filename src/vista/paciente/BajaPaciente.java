package vista.paciente;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.MatteBorder;

import modelo.Paciente;

import javax.swing.JComboBox;

public class BajaPaciente extends JPanel {

	private String[] label = { "Nombre :", "Apellidos :", "Direccion :", "Nacimiento :", "Telefono :" };
	private JTextField[] campos = new JTextField[this.label.length];
	private JComboBox comboBoxNombre;
	private JComboBox comboBoxID;
	private JPanel panelLabel;
	private JPanel panelCampos;
	private JButton btnDarBaja;
	private JLabel mensajeSistema;

	public BajaPaciente(Color color, int letraPequena, int letraGrande, String tipoLetra) {
		creandoVista(letraPequena, tipoLetra, letraGrande);
		setVisible(true);
	}

	private void creandoVista(int letraPequena, String tipoLetra, int letraGrande) {
		Color color = new Color(133, 200, 255);
		setBackground(color);
		this.campos = new JTextField[this.label.length];

		JLabel lblNewLabel = new JLabel("Baja Paciente");
		lblNewLabel.setFont(new Font("Monospaced", Font.BOLD, letraGrande));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);

		JPanel panel = new JPanel();
		panel.setBackground((Color) null);

		JLabel label_1 = new JLabel("Nombre : ");
		label_1.setFont(new Font(tipoLetra, Font.BOLD, letraPequena));

		comboBoxNombre = new JComboBox();
		comboBoxNombre.setBackground(Color.WHITE);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup().addContainerGap()
						.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE).addGap(5)
						.addComponent(comboBoxNombre, 0, 274, Short.MAX_VALUE).addGap(1)));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup().addGap(20)
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(label_1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 30,
										Short.MAX_VALUE)
								.addComponent(comboBoxNombre, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 30,
										Short.MAX_VALUE))
						.addGap(20)));
		panel.setLayout(gl_panel);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground((Color) null);

		JLabel lblId = new JLabel("ID :");
		lblId.setFont(new Font(tipoLetra, Font.BOLD, letraPequena));

		comboBoxID = new JComboBox();
		comboBoxID.setBackground(Color.WHITE);
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup().addContainerGap()
						.addComponent(lblId, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(comboBoxID, 0, 155, Short.MAX_VALUE)
						.addContainerGap()));
		gl_panel_1.setVerticalGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING).addGroup(gl_panel_1
				.createSequentialGroup().addGap(20)
				.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
						.addComponent(comboBoxID, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
						.addComponent(lblId, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
				.addGap(20)));
		panel_1.setLayout(gl_panel_1);

		panelCampos = new JPanel();

		panelLabel = new JPanel();

		btnDarBaja = new JButton("Dar de baja");

		mensajeSistema = new JLabel("");
		mensajeSistema.setFont(new Font("Consolas", Font.PLAIN, 15));
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup().addGap(10)
						.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 922, Short.MAX_VALUE).addGap(10))
				.addGroup(groupLayout.createSequentialGroup().addGroup(groupLayout
						.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup().addGap(213)
								.addComponent(panel, GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE).addGap(10)
								.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup().addGap(25)
								.addComponent(panelLabel, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
												.addComponent(mensajeSistema, GroupLayout.DEFAULT_SIZE, 548,
														Short.MAX_VALUE)
												.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(btnDarBaja,
														GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE))
										.addComponent(panelCampos, GroupLayout.DEFAULT_SIZE, 697, Short.MAX_VALUE))))
						.addGap(30)));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup().addGap(10)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addGap(26)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
						.addGap(10)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(panelLabel, GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
								.addComponent(panelCampos, GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE))
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(btnDarBaja, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(mensajeSistema, GroupLayout.PREFERRED_SIZE, 33,
										GroupLayout.PREFERRED_SIZE))
						.addGap(19)));
		panelCampos.setLayout(new GridLayout(0, 1, 0, 50));
		panelLabel.setLayout(new GridLayout(0, 1, 0, 50));
		setLayout(groupLayout);
		this.panelCampos.setBackground(color);
		this.panelLabel.setBackground(color);
		for (int i = 0; i < campos.length; i++) {
			this.campos[i] = crearJText(letraPequena, tipoLetra);
			this.panelLabel.add(crearLabel(this.label[i], letraPequena, tipoLetra));
			this.panelCampos.add(this.campos[i]);
		}
		revalidate();
	}

	private JTextField crearJText(int letraPequena, String tipoLetra) {
		JTextField field = new JTextField();
		field.setFont(new Font(tipoLetra, Font.BOLD, letraPequena));
		field.setHorizontalAlignment(SwingConstants.CENTER);
		field.setBorder(new MatteBorder(2, 2, 1, 1, Color.BLACK));
		field.setFocusable(false);
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
		for (int i = 0; i < campos.length; i++) {
			this.campos[i].setText(null);
		}
	}

	public void rellenarCampos(Paciente paciente) {
		this.campos[0].setText(paciente.getNombre());
		this.campos[1].setText(paciente.getApellidos());
		this.campos[2].setText(paciente.getDireccion());
		this.campos[3].setText(paciente.getNacimiento());
		this.campos[4].setText(paciente.getTelefono());
	}

	public JComboBox getComboBoxNombre() {
		return comboBoxNombre;
	}

	public JComboBox getComboBoxID() {
		return comboBoxID;
	}

	public JButton getBtnDarBaja() {
		return btnDarBaja;
	}

	public JLabel getMensajeSistema() {
		return mensajeSistema;
	}

	public JTextField[] getCampos() {
		return campos;
	}

}
