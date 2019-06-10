package vista.medico;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;

import modelo.Medico;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;
import javax.swing.BoxLayout;

public class ConsultaMedico extends JPanel {
	private String[] label = { "Nombre :", "Apellidos :", "Direccion :", "Telefono :" };
	private JTextField[] campos = new JTextField[this.label.length];

	private JComboBox comboBoxID;
	private JComboBox comboBoxNombre;

	private JPanel panelLabel;
	private JPanel panelCampos;

	public ConsultaMedico(Color color, int letraPequena, int letraGrande, String tipoLetra) {

		JLabel lblNewLabel = new JLabel("Consultar Medico");
		lblNewLabel.setFont(new Font("Monospaced", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);

		JPanel panel = new JPanel();
		panel.setBackground(color);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(color);
		panelCampos = new JPanel();
		panelCampos.setBackground(color);
		panelLabel = new JPanel();
		panelLabel.setBackground(color);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(50)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 779, Short.MAX_VALUE)
						.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
							.addComponent(panelLabel, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
									.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
									.addGap(18)
									.addComponent(panel, GroupLayout.PREFERRED_SIZE, 210, GroupLayout.PREFERRED_SIZE))
								.addComponent(panelCampos, GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE))))
					.addGap(100))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(20)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addGap(40)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
					.addGap(50)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(panelCampos, GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
						.addComponent(panelLabel, GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE))
					.addGap(100))
		);
		panelCampos.setLayout(new GridLayout(0, 1, 0, 80));
		panelLabel.setLayout(new GridLayout(0, 1, 0, 80));
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));

		JLabel lblNewLabel_2 = new JLabel("ID :   ");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(lblNewLabel_2);

		comboBoxID = new JComboBox();
		panel.add(comboBoxID);
		panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.X_AXIS));

		JLabel lblNewLabel_1 = new JLabel("Nombre :    ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_1.add(lblNewLabel_1);

		comboBoxNombre = new JComboBox();
		panel_1.add(comboBoxNombre);
		setLayout(groupLayout);
		creandoVista(letraPequena, tipoLetra);
		setVisible(true);

	}

	private void creandoVista(int letraPequena, String tipoLetra) {
		Color color = new Color(133, 200, 255);
		setBackground(color);
		this.campos = new JTextField[this.label.length];
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
		field.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
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

	public void mostrarDatos(Medico medico) {
		this.campos[0].setText(medico.getNombre());
		this.campos[1].setText(medico.getApellidos());
		this.campos[2].setText(medico.getDireccion());
		this.campos[3].setText(medico.getTelefono());
	}

	public void vaciarCampos() {
		for (int i = 0; i < campos.length; i++) {
			this.campos[i].setText(null);
		}
	}

	public JTextField[] getFields() {
		return campos;
	}

	public JComboBox<String> getComboNombreMedico() {
		return this.comboBoxNombre;
	}

	public JComboBox getComboBoxID() {
		return this.comboBoxID;
	}
}
