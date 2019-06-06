package vista.paciente;

import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;

import modelo.Especialidad;
import modelo.Turno;

import javax.swing.JComboBox;
import javax.swing.SwingConstants;

import java.awt.Color;
import java.awt.ComponentOrientation;
import javax.swing.border.MatteBorder;

public class CitaPrimaria extends JPanel {

	private JComboBox comboPaciente;
	private JComboBox comboID;
	private JComboBox comboMedico;

	public String getCoordenadas() {
		return coordenadas;
	}

	private JButton[][] botonera = new JButton[8][5];
	private boolean[][] horario;

	private String coordenadas = "10 10";
	private JPanel panelBotonera;

	public CitaPrimaria(Color colorFondo, int letraPequena, int letraGrande, String tipoLetra) {
		setBackground(colorFondo);
		JLabel lblTitulo = new JLabel("CITA PRIMARIA");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 30));

		JPanel panelComboPaciente = new JPanel();
		JPanel panelComboMedico = new JPanel();
		JPanel panelComboId = new JPanel();
		JPanel panelDias = new JPanel();
		panelBotonera = new JPanel();

		panelBotonera.setBackground(colorFondo);
		panelComboId.setBackground(colorFondo);
		panelComboMedico.setBackground(colorFondo);
		panelComboPaciente.setBackground(colorFondo);
		panelDias.setBackground(colorFondo);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup().addGap(43)
						.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(groupLayout.createSequentialGroup()
										.addComponent(lblTitulo, GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
										.addContainerGap())
								.addGroup(
										groupLayout.createSequentialGroup()
												.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
														.addComponent(panelComboMedico, Alignment.LEADING,
																GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
														.addComponent(panelComboPaciente, GroupLayout.DEFAULT_SIZE, 506,
																Short.MAX_VALUE))
												.addPreferredGap(ComponentPlacement.UNRELATED)
												.addComponent(panelComboId, GroupLayout.PREFERRED_SIZE, 153,
														GroupLayout.PREFERRED_SIZE)
												.addGap(61))))
				.addGroup(groupLayout.createSequentialGroup().addContainerGap()
						.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(panelDias, GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
								.addComponent(panelBotonera, GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE))
						.addGap(25)));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
				.createSequentialGroup().addGap(26)
				.addComponent(lblTitulo, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE).addGap(26)
				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(panelComboPaciente, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
						.addComponent(panelComboId, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(panelComboMedico, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE).addGap(54)
				.addComponent(panelDias, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(panelBotonera, GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE).addGap(36)));
		panelBotonera.setLayout(new GridLayout(8, 5, 5, 10));

		JLabel lblID = new JLabel("ID");
		lblID.setHorizontalAlignment(SwingConstants.LEFT);

		comboID = new JComboBox();
		comboID.setBackground(Color.WHITE);
		comboID.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		GroupLayout gl_panelComboId = new GroupLayout(panelComboId);
		gl_panelComboId
				.setHorizontalGroup(
						gl_panelComboId.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panelComboId.createSequentialGroup()
										.addComponent(lblID, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED).addComponent(comboID,
												GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
										.addContainerGap(30, Short.MAX_VALUE)));
		gl_panelComboId.setVerticalGroup(gl_panelComboId.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelComboId.createSequentialGroup()
						.addGroup(gl_panelComboId.createParallelGroup(Alignment.LEADING)
								.addComponent(lblID, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboID, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		panelComboId.setLayout(gl_panelComboId);

		JLabel lblPaciente = new JLabel("PACIENTE");

		comboPaciente = new JComboBox();
		comboPaciente.setBackground(Color.WHITE);
		GroupLayout gl_panelComboPaciente = new GroupLayout(panelComboPaciente);
		gl_panelComboPaciente.setHorizontalGroup(gl_panelComboPaciente.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelComboPaciente.createSequentialGroup()
						.addComponent(lblPaciente, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
						.addGap(43).addComponent(comboPaciente, 0, 382, Short.MAX_VALUE).addContainerGap()));
		gl_panelComboPaciente
				.setVerticalGroup(gl_panelComboPaciente.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelComboPaciente.createSequentialGroup()
								.addGroup(gl_panelComboPaciente.createParallelGroup(Alignment.LEADING)
										.addComponent(lblPaciente, GroupLayout.PREFERRED_SIZE, 38,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(comboPaciente, GroupLayout.PREFERRED_SIZE, 38,
												GroupLayout.PREFERRED_SIZE))
								.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		panelComboPaciente.setLayout(gl_panelComboPaciente);

		JLabel lblMedico = new JLabel("MEDICO");

		comboMedico = new JComboBox();
		comboMedico.setBackground(Color.WHITE);
		GroupLayout gl_panelComboMedico = new GroupLayout(panelComboMedico);
		gl_panelComboMedico.setHorizontalGroup(gl_panelComboMedico.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelComboMedico.createSequentialGroup()
						.addComponent(lblMedico, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE).addGap(44)
						.addComponent(comboMedico, 0, 381, Short.MAX_VALUE).addContainerGap()));
		gl_panelComboMedico.setVerticalGroup(gl_panelComboMedico.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelComboMedico.createSequentialGroup()
						.addGroup(gl_panelComboMedico.createParallelGroup(Alignment.LEADING)
								.addComponent(lblMedico, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboMedico, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		panelComboMedico.setLayout(gl_panelComboMedico);
		panelDias.setLayout(new GridLayout(1, 0, 10, 10));

		JLabel lblLunes = new JLabel("LUNES");
		lblLunes.setHorizontalAlignment(SwingConstants.CENTER);
		panelDias.add(lblLunes);
		lblLunes.setBackground(Color.WHITE);
		lblLunes.setOpaque(true);
		lblLunes.setBorder(new MatteBorder(2, 2, 2, 2, Color.BLACK));

		JLabel lblMartes = new JLabel("MARTES");
		lblMartes.setHorizontalAlignment(SwingConstants.CENTER);
		panelDias.add(lblMartes);
		lblMartes.setBackground(Color.WHITE);
		lblMartes.setOpaque(true);
		lblMartes.setBorder(new MatteBorder(2, 2, 2, 2, Color.BLACK));

		JLabel lblMiercoles = new JLabel("MIERCOLES");
		lblMiercoles.setHorizontalAlignment(SwingConstants.CENTER);
		panelDias.add(lblMiercoles);
		lblMiercoles.setBackground(Color.WHITE);
		lblMiercoles.setOpaque(true);
		lblMiercoles.setBorder(new MatteBorder(2, 2, 2, 2, Color.BLACK));

		JLabel lblJueves = new JLabel("JUEVES");
		lblJueves.setHorizontalAlignment(SwingConstants.CENTER);
		panelDias.add(lblJueves);
		lblJueves.setBackground(Color.WHITE);
		lblJueves.setOpaque(true);
		lblJueves.setBorder(new MatteBorder(2, 2, 2, 2, Color.BLACK));

		JLabel lblViernes = new JLabel("VIERNES");
		lblViernes.setHorizontalAlignment(SwingConstants.CENTER);
		panelDias.add(lblViernes);
		setLayout(groupLayout);
		lblViernes.setBackground(Color.WHITE);
		lblViernes.setOpaque(true);
		lblViernes.setBorder(new MatteBorder(2, 2, 2, 2, Color.BLACK));

		coordenadas = "10 10";
		for (int i = 0; i < botonera.length; i++) {
			for (int j = 0; j < botonera[i].length; j++) {
				this.botonera[i][j] = new JButton();
				this.botonera[i][j].setName(i + " " + j);
				this.botonera[i][j].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						JButton boton = (JButton) e.getSource();

//						String[] anterior = coordenadas.split(" ");
//						int anteriorX = Integer.valueOf(anterior[0]);
//						int anteriorY = Integer.valueOf(anterior[1]);
//
//						String[] actual = boton.getName().split(" ");
//						int actualX = Integer.valueOf(actual[0]);
//						int actualY = Integer.valueOf(actual[1]);
//
//						if (anteriorX != 10 && anteriorY != 10) {
//							botonera[anteriorX][anteriorY].setBackground(Color.LIGHT_GRAY);
//						}
//						coordenadas = boton.getName();
//						botonera[actualX][actualY].setBackground(Color.GREEN);
					}
				});
				this.panelBotonera.add(this.botonera[i][j]);
			}
		}

		boolean[][] asd = new boolean[8][5];
		asd[0][0] = true;
		asd[1][3] = true;
		asd[3][4] = true;
		asd[7][0] = true;
		asd[2][0] = true;
		crearBotonera(asd, Turno.mañana);

	}

	public void crearBotonera(boolean[][] horario, Turno turno) {
		this.coordenadas = "";
		this.horario = horario;
		for (int i = 0; i < horario.length; i++) {
			for (int j = 0; j < horario[i].length; j++) {
				if (i > 3 && Turno.mañana == turno || i < 4 && Turno.tarde == turno) {
					this.botonera[i][j].setEnabled(false);
					this.botonera[i][j].setBorder(new MatteBorder(5, 5, 5, 5, Color.ORANGE));
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
		String dia="";
		switch (i) {
		case 0:
			dia = "lunes";

		case 1:
			dia = "martes";
			break;
		case 2:
			dia = "miercoles";
		case 3:
			dia = "jueves";
		case 4:
			dia = "viernes";
		case 5:
			dia = "sabado";
		case 6:
			dia = "domingo";
		default:
			break;
		}
		return dia;

	}

	public JComboBox getComboPaciente() {
		return comboPaciente;
	}

	public JComboBox getComboID() {
		return comboID;
	}

	public JComboBox getComboMedico() {
		return comboMedico;
	}

}
