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

import modelo.enums.Turno;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CitaEspecialista extends JPanel {

	private int letraPequena;
	private int letraGrande;
	private Color colorFondo;
	private String tipoLetra;

	private JPanel panelBotonera;
	private JPanel panelLabel;

	private String[] textHoras = { "8:00-9:00", "9:00-10:00", "10:00-11:00", "11:00-12:00", "12:00-13:00",
			"13:00-14:00", "14:00-15:00", "15:00-16:00" };
	private String[] label = { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes" };
	private int horas = 8;
	private int dias = 5;
	private JButton[][] botonera;
	private String coordenadas;
	private boolean[][] horario;

	private JComboBox comboBoxNombre;
	private JComboBox comboBoxID;
	private JComboBox comboNombreMedico;

	public CitaEspecialista(Color colorFondo, int letraPequena, int letraGrande, String tipoLetra) {
		this.botonera = new JButton[horas][dias];
		this.horario = new boolean[horas][dias];
		this.coordenadas = "10;10";
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
		
		JPanel panelPedirCita = new JPanel();
		
		panelPedirCita.setBackground(colorFondo);
		
		JLabel lblMenasaje = new JLabel("");
		lblMenasaje.setHorizontalAlignment(SwingConstants.CENTER);
		
		JButton btnPedirCita = new JButton("Pedir Cita");
		GroupLayout gl_panelPedirCita = new GroupLayout(panelPedirCita);
		gl_panelPedirCita.setHorizontalGroup(
			gl_panelPedirCita.createParallelGroup(Alignment.LEADING)
				.addGap(0, 490, Short.MAX_VALUE)
				.addGroup(gl_panelPedirCita.createSequentialGroup()
					.addComponent(lblMenasaje, GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
					.addComponent(btnPedirCita, GroupLayout.PREFERRED_SIZE, 245, GroupLayout.PREFERRED_SIZE))
		);
		gl_panelPedirCita.setVerticalGroup(
			gl_panelPedirCita.createParallelGroup(Alignment.LEADING)
				.addGap(0, 27, Short.MAX_VALUE)
				.addComponent(lblMenasaje, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
				.addComponent(btnPedirCita, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
		);
		panelPedirCita.setLayout(gl_panelPedirCita);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addGap(30)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(panelPedirCita, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
						.addComponent(panelBotonera, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
						.addComponent(panelLabel, GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
						.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(panel_2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
								.addComponent(panel, GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE))
							.addGap(6)
							.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)))
					.addGap(30))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(30)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(10)
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(panelLabel, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
					.addGap(5)
					.addComponent(panelBotonera, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panelPedirCita, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addGap(17))
		);
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
						coordenadas = boton.getName();
					}
				});
				this.panelBotonera.add(this.botonera[i][j]);
			}
			indice++;
		}

//		boolean[][] a = new boolean[horas][dias];
//		a[0][0] = true;
//		a[3][3] = true;
//		a[2][4] = true;
//		a[1][1] = true;
//		crearBotonera(a, Turno.mañana);
	}

	public void crearBotonera(boolean[][] horario, Turno turno) {
		this.horario = horario;
		for (int i = 0; i < horario.length; i++) {
			for (int j = 0; j < horario[i].length; j++) {
				this.botonera[i][j].setEnabled(true);
				this.botonera[i][j].setBackground(Color.WHITE);
				if (i > 3 && Turno.mañana == turno || i < 4 && Turno.tarde == turno) {
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
		return this.botonera[i][j].getText();
	}

	public String getDia() {
		String[] cadena = this.coordenadas.split(";");
		int i = Integer.valueOf(cadena[1]);
		switch (i) {
		case 0:
			return "lunes";
		case 1:
			return "martes";
		case 2:
			return "miercoles";
		case 3:
			return "jueves";
		case 4:
			return "viernes";
		default:
			return "";
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
		return coordenadas;
	}

	public void setCoordenadas(String coordenadas) {
		this.coordenadas = coordenadas;
	}
	

}
