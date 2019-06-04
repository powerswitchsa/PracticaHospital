package vista.paciente;

import javax.swing.JPanel;
import java.awt.GridLayout;
import java.util.Iterator;

import javax.swing.JScrollPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.DefaultTableModel;

import modelo.Cita;
import modelo.Especialidad;
import modelo.Medicamento;
import modelo.Medico;
import modelo.Paciente;
import modelo.Tratamiento;

import javax.swing.JTable;
import javax.swing.JComboBox;

public class VerHistorial extends JPanel {

	private JTable tableCitas;
	private JTable tableTratamiento;

	private JScrollPane scrollTratamiento = new JScrollPane();
	private JScrollPane scrollCitas = new JScrollPane();

	private String columnaCita[] = { "Paciente	", "Tipo", "Fecha", "Medico" };
	private String columnaTratamiento[] = { "Paciente", "Medicamento", "Posologia", "Fecha inicio", "Fecha Fin" };
	private String datosCita[][];
	private String datosTratamiento[][];

	public VerHistorial(Color colorFondo, int letraPequena, int letraGrande, String tipoLetra) {
		JPanel panelTitulo = new JPanel();
		panelTitulo.setBackground(colorFondo);
		setBackground(colorFondo);
		JPanel panelTituloTratamiento = new JPanel();
		panelTituloTratamiento.setBackground(colorFondo);

		JLabel lblHistorialPaciente = new JLabel("HISTORIAL PACIENTE");
		lblHistorialPaciente.setFont(new Font("Tahoma", Font.PLAIN, 34));
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
				.createSequentialGroup().addGap(39).addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(
								groupLayout.createSequentialGroup()
										.addComponent(lblHistorialPaciente, GroupLayout.DEFAULT_SIZE, 359,
												Short.MAX_VALUE)
										.addGap(31))
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
										.addComponent(panelTituloTratamiento, GroupLayout.PREFERRED_SIZE, 103,
												GroupLayout.PREFERRED_SIZE)
										.addContainerGap(308, Short.MAX_VALUE))
								.addGroup(groupLayout.createSequentialGroup()
										.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(scrollCitas, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE,
														380, Short.MAX_VALUE)
												.addComponent(scrollTratamiento, Alignment.TRAILING,
														GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
												.addComponent(panelTitulo, GroupLayout.PREFERRED_SIZE, 192,
														GroupLayout.PREFERRED_SIZE))
										.addGap(31))))));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup().addGap(36).addComponent(lblHistorialPaciente)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(panelTitulo, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(scrollCitas, GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panelTituloTratamiento, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addGap(12).addComponent(scrollTratamiento, GroupLayout.PREFERRED_SIZE, 22, Short.MAX_VALUE)
						.addGap(25)));
		panelTituloTratamiento.setLayout(new GridLayout(0, 1, 0, 0));

		JLabel lblTratamientos = new JLabel("Tratamientos");
		lblTratamientos.setBackground(colorFondo);
		lblTratamientos.setHorizontalAlignment(SwingConstants.LEFT);
		lblTratamientos.setHorizontalTextPosition(SwingConstants.CENTER);
		panelTituloTratamiento.add(lblTratamientos);
		scrollTratamiento.setColumnHeaderView(tableTratamiento);

		scrollCitas.setColumnHeaderView(tableCitas);
		panelTitulo.setLayout(new GridLayout(0, 1, 0, 0));

		JComboBox comboBox = new JComboBox();
		panelTitulo.add(comboBox);

		JLabel label = new JLabel("Citas/Operaciones");
		label.setVerticalAlignment(SwingConstants.BOTTOM);
		panelTitulo.add(label);
		setLayout(groupLayout);
	}

	public void actualizarTablas(Paciente paciente) {
		rellenarCitas(paciente);
		rellenarTratamiento(paciente);
	}

	private void rellenarCitas(Paciente paciente) {
		int index = 0;
//		this.datosCita = new String[paciente.getCitas().size()][columnaCita.length];
//		for (Cita cita : paciente.getCitas()) {
//			rellenarCitaFila(paciente.getFullName(), cita, index);
//			index++;
//		}
		DefaultTableModel defaultTableModelC = new DefaultTableModel(datosCita, columnaCita);
		tableCitas = new JTable(defaultTableModelC);
		tableCitas.setFont(new Font("Tahoma", Font.CENTER_BASELINE, 12));
		scrollCitas.setViewportView(tableCitas);
	}

	private void rellenarTratamiento(Paciente paciente) {
		int index = 0;
		for (Tratamiento tratamiento : paciente.getTratamientos()) {
			this.datosTratamiento = new String[paciente.getTratamientos().size()][columnaTratamiento.length];
			rellenarTratamientoFila(paciente.getFullName(), tratamiento, index);
			index++;
		}
		DefaultTableModel defaultTableModelT = new DefaultTableModel(datosTratamiento, columnaTratamiento);
		tableTratamiento = new JTable(defaultTableModelT);
		tableTratamiento.setFont(new Font("Tahoma", Font.CENTER_BASELINE, 12));
		scrollTratamiento.setViewportView(tableTratamiento);
	}

	private void rellenarCitaFila(String fullName, Cita cita, int index) {
		this.datosCita[index][0] = fullName;
		this.datosCita[index][1] = cita.getMedico().getEspecialidad().toString();
		this.datosCita[index][2] = cita.getFecha();
		this.datosCita[index][3] = cita.getNombreMedico();
	}

	private void rellenarTratamientoFila(String fullName, Tratamiento tratamiento, int index) {
		this.datosTratamiento[index][0] = fullName;
		this.datosTratamiento[index][1] = tratamiento.getMedicamento().toString();
		this.datosTratamiento[index][2] = tratamiento.getDosis();
		this.datosTratamiento[index][3] = tratamiento.getInicio();
		this.datosTratamiento[index][4] = tratamiento.getFin();
	}
}
