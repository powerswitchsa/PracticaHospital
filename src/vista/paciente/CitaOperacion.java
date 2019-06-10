package vista.paciente;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.GridLayout;
import javax.swing.border.MatteBorder;

import modelo.enums.TipoOperacion;

import java.awt.BorderLayout;
import javax.swing.JButton;

public class CitaOperacion extends JPanel {

	private String[] cadenas = { "Paciente :", " ID :", "Tipo Operacion :", "Cirujano :", "Medico Solicitante :" };
	private JPanel panelLabel;
	private JPanel panelCombo;

	private JComboBox comboPaciente = new JComboBox();
	private JComboBox comboID = new JComboBox();
	private JComboBox comboTipoOperacion = new JComboBox();
	private JComboBox comboCirujano = new JComboBox();
	private JComboBox comboBoxMedicoSolicitante = new JComboBox();
	private JLabel mensajeSistema;
	private JButton btnAceptar;

	private Color color;
	private int letraPequena;
	private int letraGrande;
	private String tipoLetra;

	public CitaOperacion(Color color, int letraPequena, int letraGrande, String tipoLetra) {
		this.color = color;
		this.letraPequena = letraPequena;
		this.letraGrande = letraGrande;
		this.tipoLetra = tipoLetra;

		setVisible(true);
		JLabel lblNewLabel = new JLabel("Cita Operacion");
		lblNewLabel.setFont(new Font(tipoLetra, Font.BOLD, letraGrande));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);

		panelLabel = new JPanel();

		panelCombo = new JPanel();

		btnAceptar = new JButton("Aceptar");

		mensajeSistema = new JLabel("Mensaje sistema");
		mensajeSistema.setForeground(Color.BLUE);
		mensajeSistema.setFont(new Font(this.tipoLetra, Font.BOLD, this.letraPequena));
		mensajeSistema.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup().addGap(30)
						.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 794, Short.MAX_VALUE).addGap(27))
				.addGroup(groupLayout.createSequentialGroup().addGap(50)
						.addComponent(panelLabel, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
						.addGap(20)
						.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(groupLayout.createSequentialGroup()
										.addComponent(mensajeSistema, GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
										.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(btnAceptar,
												GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
								.addComponent(panelCombo, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 481,
										Short.MAX_VALUE))
						.addGap(50)));
		groupLayout
				.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup().addGap(20)
								.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
								.addGap(20)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(panelLabel, GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
										.addComponent(panelCombo, GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE))
								.addGap(20)
								.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(btnAceptar, GroupLayout.PREFERRED_SIZE, 48, Short.MAX_VALUE)
										.addComponent(mensajeSistema, GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
								.addContainerGap()));
		panelCombo.setLayout(new GridLayout(1, 0, 0, 0));
		panelLabel.setLayout(new GridLayout(1, 0, 0, 0));
		setLayout(groupLayout);
		lblNewLabel.setBackground(color);
		setBackground(Color.DARK_GRAY);
		creandoVista();
	}

	private void creandoVista() {
		setBackground(this.color);
		this.panelLabel.setBackground(this.color);
		this.panelCombo.setBackground(this.color);
		this.panelCombo.setLayout(new GridLayout(0, 1, 0, 80));
		this.panelLabel.setLayout(new GridLayout(0, 1, 0, 80));
		for (int i = 0; i < this.cadenas.length; i++) {
			this.panelLabel.add(crearLabel(this.cadenas[i]));
		}
		comboPaciente.setBackground(Color.WHITE);
		comboPaciente.setFont(new Font("Tahoma", Font.PLAIN, 15));
		this.panelCombo.add(this.comboPaciente);
		comboID.setBackground(Color.WHITE);
		comboID.setFont(new Font("Tahoma", Font.PLAIN, 15));
		this.panelCombo.add(this.comboID);
		comboTipoOperacion.setBackground(Color.WHITE);
		comboTipoOperacion.setFont(new Font("Tahoma", Font.PLAIN, 15));
		this.panelCombo.add(this.comboTipoOperacion);
		comboCirujano.setBackground(Color.WHITE);
		comboCirujano.setFont(new Font("Tahoma", Font.PLAIN, 15));
		this.panelCombo.add(this.comboCirujano);
		comboBoxMedicoSolicitante.setBackground(Color.WHITE);
		comboBoxMedicoSolicitante.setFont(new Font("Tahoma", Font.PLAIN, 15));
		this.panelCombo.add(this.comboBoxMedicoSolicitante);
		revalidate();
	}

	private JLabel crearLabel(String cadena) {
		JLabel jLabel = new JLabel();
		jLabel.setText(cadena);
		jLabel.setFont(new Font(this.tipoLetra, Font.BOLD, this.letraPequena));
		jLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		return jLabel;
	}

	public JComboBox getComboPaciente() {
		return comboPaciente;
	}

	public JComboBox getComboID() {
		return comboID;
	}

	public JComboBox getComboTipoOperacion() {
		return comboTipoOperacion;
	}

	public JComboBox getComboCirujano() {
		return comboCirujano;
	}

	public JComboBox getComboMedicoSolicitante() {
		return comboBoxMedicoSolicitante;
	}

	public JLabel getMensajeSistema() {
		return mensajeSistema;
	}

	public JButton getBtnAceptar() {
		return btnAceptar;
	}

	public String getIdPaciente() {
		return this.comboID.getSelectedItem().toString();
	}

	public String getNameCirujano() {
		return this.comboCirujano.getSelectedItem().toString();
	}

	public TipoOperacion getTipoOperacion() {
		switch (this.comboTipoOperacion.getSelectedItem().toString()) {
		case "cambio de corazon":
			return TipoOperacion.extirpacion;
		case "cambio de tocha":
			return TipoOperacion.rinoplastia;
		case "fixeo de barriga":
			return TipoOperacion.hernia;
		default:
			return null;
		}
	}

	public String getNameMedico() {
		return this.comboBoxMedicoSolicitante.getSelectedItem().toString();
	}

}
