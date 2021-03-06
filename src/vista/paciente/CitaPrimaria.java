package vista.paciente;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.MatteBorder;

import modelo.enums.Turno;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CitaPrimaria extends JPanel {

	private int letraPequena;
	private int letraGrande;
	private Color colorFondo;
	private String tipoLetra;

	private JPanel panelBotonera;
	private JPanel panelLabel;

	private String[] textHoras = { "08:00", "09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00" };
	private String[] label = { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes" };
	private int horas = 8;
	private int dias = 5;
	private JButton[][] botonera;
	private String coordenadas = "10;10";
	private boolean[][] horario;

	private JComboBox comboBoxNombre;
	private JComboBox comboBoxID;
	private JComboBox comboNombreMedico;
	private JButton btnPedirCita;
	private JLabel lblMensaje;

	public CitaPrimaria(Color colorFondo, int letraPequena, int letraGrande, String tipoLetra) {
		this.botonera = new JButton[horas][dias];
		this.horario = new boolean[horas][dias];
		setVisible(true);
		setBackground(colorFondo);
		this.colorFondo = colorFondo;
		this.letraPequena = letraPequena;
		this.letraGrande = letraGrande;
		this.tipoLetra = tipoLetra;

		JLabel lblNewLabel = new JLabel("Cita Primaria");
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
		gl_panel_2.setVerticalGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup().addGap(20)
						.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
								.addComponent(lblMedico, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 30,
										Short.MAX_VALUE)
								.addComponent(comboNombreMedico, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 30,
										Short.MAX_VALUE))
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

		JPanel panelPecirCita = new JPanel();
		panelPecirCita.setBackground(colorFondo);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING,
				groupLayout.createSequentialGroup().addGap(30)
						.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(panelPecirCita, GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
								.addComponent(panelBotonera, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
								.addComponent(panelLabel, GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
								.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
								.addGroup(groupLayout.createSequentialGroup()
										.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
												.addComponent(panel_2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 375,
														Short.MAX_VALUE)
												.addComponent(panel, GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE))
										.addGap(6)
										.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)))
						.addGap(30)));
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
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(panelPecirCita, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
						.addGap(12)));

		lblMensaje = new JLabel("");
		lblMensaje.setHorizontalAlignment(SwingConstants.CENTER);

		btnPedirCita = new JButton("Pedir Cita");
		GroupLayout gl_panelPecirCita = new GroupLayout(panelPecirCita);
		gl_panelPecirCita.setHorizontalGroup(gl_panelPecirCita.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelPecirCita.createSequentialGroup()
						.addComponent(lblMensaje, GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
						.addComponent(btnPedirCita, GroupLayout.PREFERRED_SIZE, 245, GroupLayout.PREFERRED_SIZE)));
		gl_panelPecirCita.setVerticalGroup(gl_panelPecirCita.createParallelGroup(Alignment.LEADING)
				.addComponent(lblMensaje, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
				.addComponent(btnPedirCita, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE));
		panelPecirCita.setLayout(gl_panelPecirCita);
		panelBotonera.setLayout(new GridLayout(horas, dias, 10, 10));
		panelLabel.setLayout(new GridLayout(1, 0, 10, 10));
		setLayout(groupLayout);
		panelLabel.setBackground(colorFondo);
		this.panelBotonera.setBackground(colorFondo);
		for (int i = 0; i < label.length; i++) {
			this.panelLabel.add(crearLabel(label[i]));
		}
		int indice = 0;
		for (int i = 0; i < botonera.length; i++) {

			for (int j = 0; j < botonera[i].length; j++) {
				this.botonera[i][j] = new JButton();
				this.botonera[i][j].setBackground(Color.WHITE);
				this.botonera[i][j].setName(i + ";" + j);
				this.botonera[i][j].setText(this.textHoras[indice]);
				this.botonera[i][j].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						JButton boton = (JButton) e.getSource();
						String[] anterior = coordenadas.split(";");
						int anteriorX = Integer.valueOf(anterior[0]);
						int anteriorY = Integer.valueOf(anterior[1]);

						String[] actual = boton.getName().split(";");
						int actualX = Integer.valueOf(actual[0]);
						int actualY = Integer.valueOf(actual[1]);

						if (anteriorX != 10 && anteriorY != 10) {
							botonera[anteriorX][anteriorY].setBackground(Color.WHITE);
						}
						botonera[actualX][actualY].setBackground(Color.GREEN);
						setCoordenadas(boton.getName());
//						coordenadas = boton.getName();
					}
				});
				this.panelBotonera.add(this.botonera[i][j]);
			}
			indice++;
		}
	}

	public void crearBotonera(boolean[][] horario, Turno turno) {
		this.horario = horario;
		for (int i = 0; i < horario.length; i++) {
			for (int j = 0; j < horario[i].length; j++) {
				this.botonera[i][j].setEnabled(true);
				this.botonera[i][j].setBackground(Color.WHITE);
				if (i != turno.getFilaUno() && i != turno.getFilaDos()) {
					this.botonera[i][j].setEnabled(false);
					this.botonera[i][j].setBorder(new MatteBorder(5, 5, 5, 5, Color.RED));
				} else {
					this.botonera[i][j]
							.setBorder(new MatteBorder(5, 5, 5, 5, this.horario[i][j] ? Color.RED : Color.BLUE));
					if (this.horario[i][j])
						this.botonera[i][j].setEnabled(false);
				}
			}
		}
		revalidate();
	}

	public String getHora() {
		String[] cadena = this.coordenadas.split(";");
		int i = Integer.valueOf(cadena[0]);
		int j = Integer.valueOf(cadena[1]);
		if (i != 10 && j != 10) {
			return this.botonera[i][j].getText();
		} else {
			return "00:00";
		}
	}

	private JLabel crearLabel(String cadena) {
		JLabel jLabel = new JLabel();
		jLabel.setOpaque(true);
		jLabel.setBackground(Color.WHITE);
		jLabel.setText(cadena);
		jLabel.setFont(new Font(tipoLetra, Font.BOLD, letraPequena));
		jLabel.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel.setBorder(new MatteBorder(1, 1, 1, 1, Color.BLACK));
		return jLabel;
	}

	public String getIDPaciente() {
		if (this.comboBoxID.getSelectedItem() != null) {
			String id = this.comboBoxID.getSelectedItem().toString();
			if (id != null)
				return id;
		}
		return "";
	}

	public String getNombreMedico() {
		if (this.getComboNombreMedico().getSelectedItem() != null) {
			String nombreMedico = this.getComboNombreMedico().getSelectedItem().toString();
			if (nombreMedico != null) {
				System.out.println(nombreMedico);
				return nombreMedico;
			}
		}
		return "";
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
		return this.coordenadas;
	}

	public JButton getBtnPedirCita() {
		return btnPedirCita;
	}

	public JLabel getLblMensaje() {
		return lblMensaje;
	}

	public void setCoordenadas(String coordenadas) {
		this.coordenadas = coordenadas;
	}
}
