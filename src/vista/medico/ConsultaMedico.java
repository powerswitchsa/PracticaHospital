package vista.medico;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;

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

public class ConsultaMedico extends JPanel {
	private String[] label = { "ID :", "Nombre :", "Apellidos :", "Direccion :", "Nacimiento :", "Telefono :" };
	private JTextField[] fields = new JTextField[this.label.length];
	private JPanel panelLabel = new JPanel();
	private JPanel panelText = new JPanel();
	private JComboBox comboBox;
	private JComboBox comboBox_1;

	public ConsultaMedico(Color color, int letraPequena, int letraGrande, String tipoLetra) {
		
		JLabel lblConsultaMedico = new JLabel("CONSULTA MEDICO");
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
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(30)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblNombre)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 195, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblId)
							.addGap(18)
							.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
							.addGap(40))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblConsultaMedico, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(panelLabel, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(panelText, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
							.addContainerGap())))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblConsultaMedico)
					.addGap(38)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblId)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNombre, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
					.addGap(26)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(panelLabel, GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
						.addComponent(panelText, GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE))
					.addGap(30))
		);
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
		jLabel.setHorizontalAlignment(SwingConstants.CENTER);
		return jLabel;
	}

	public JTextField[] getFields() {
		return fields;
	}
	
	public void mostrarDatos(Medico medico) {
		this.fields[0].setText(String.valueOf(medico.getId()));
		this.fields[1].setText(medico.getNombre());
		this.fields[2].setText(medico.getApellidos());
		this.fields[3].setText(medico.getDireccion());
		this.fields[4].setText(medico.getEspecialidad().name());
		this.fields[5].setText(medico.getTelefono());
//		this.fields[6].setText();
	}
	
	public void rellenarComboBox(ArrayList <Medico> medico) {
		for (Medico medicoDos : medico) {
			comboBox.addItem(medicoDos.getNombre());
			comboBox_1.addItem(medicoDos.getId());
		}
	}
}

