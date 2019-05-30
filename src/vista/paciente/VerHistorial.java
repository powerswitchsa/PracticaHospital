package vista.paciente;

import javax.swing.JPanel;
import java.awt.GridLayout;
import java.util.Iterator;

import javax.swing.JScrollPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.DefaultTableModel;

import modelo.Especialidad;
import modelo.Medicamento;
import modelo.Medico;
import modelo.Paciente;
import modelo.historial.Cita;
import modelo.historial.Tratamiento;

import javax.swing.JTable;

public class VerHistorial extends JPanel {
	private Paciente pac = new Paciente(1, "98321321", "bartolo", "asdads", "calle pedrin", "21/5/1996");
	private JTable tableCitas;
	private JTable tableTratamiento;
	private JScrollPane scrollTratamiento = new JScrollPane();
	private JScrollPane scrollCitas = new JScrollPane();
	private String columnaCita[] = { "Paciente	", "Tipo", "Fecha", "Medico" };
	private String datosCita[][];
	private String columnaTratamiento[] = { "Paciente", "Medicamento", "Posologia", "Fecha inicio", "Fecha Fin" };
	private String datosTratamiento[][];

	/**
	 * Create the panel.
	 */
	public VerHistorial() {
		JPanel panelTitulo = new JPanel();
		JPanel panelTituloTratamiento = new JPanel();
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.TRAILING).addGroup(Alignment.LEADING,
				groupLayout.createSequentialGroup().addGap(39).addGroup(groupLayout
						.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
								.addComponent(panelTituloTratamiento, GroupLayout.PREFERRED_SIZE, 103,
										GroupLayout.PREFERRED_SIZE)
								.addContainerGap(454, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(scrollCitas, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 629,
												Short.MAX_VALUE)
										.addComponent(scrollTratamiento, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE,
												629, Short.MAX_VALUE)
										.addComponent(panelTitulo, GroupLayout.DEFAULT_SIZE, 629, Short.MAX_VALUE))
								.addGap(31)))));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup().addGap(88)
						.addComponent(panelTitulo, GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(scrollCitas, GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panelTituloTratamiento, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addGap(12).addComponent(scrollTratamiento, GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
						.addGap(25)));
		panelTituloTratamiento.setLayout(new GridLayout(0, 1, 0, 0));

		JLabel lblTratamientos = new JLabel("Tratamientos");
		lblTratamientos.setHorizontalAlignment(SwingConstants.LEFT);
		lblTratamientos.setHorizontalTextPosition(SwingConstants.CENTER);
		panelTituloTratamiento.add(lblTratamientos);
		scrollTratamiento.setColumnHeaderView(tableTratamiento);

		scrollCitas.setColumnHeaderView(tableCitas);
		panelTitulo.setLayout(new GridLayout(0, 1, 0, 0));

		JLabel lblHistorialPaciente = new JLabel("HISTORIAL PACIENTE");
		panelTitulo.add(lblHistorialPaciente);
		lblHistorialPaciente.setFont(new Font("Tahoma", Font.PLAIN, 34));

		JLabel label = new JLabel("Citas/Operaciones");
		label.setVerticalAlignment(SwingConstants.BOTTOM);
		panelTitulo.add(label);
		setLayout(groupLayout);
		rellenarCitas(pac);

	}

	public void rellenarCitas(Paciente paciente) {
		this.pac.asignarCita(
				new Cita(new Medico(1, "12321", "bartolo", "adsa", "asdsada", "Asda", Especialidad.Cabecera),
						"21-6-1996", true, "Adsa"));
		this.pac.asignarCita(
				new Cita(new Medico(1, "12321", "bartolo", "adsa", "asdsada", "Asda", Especialidad.Cabecera),
						"21-6-1996", true, "Adsa"));
		this.pac.asignarCita(
				new Cita(new Medico(1, "12321", "bartolo", "adsa", "asdsada", "Asda", Especialidad.Cabecera),
						"21-6-1996", true, "Adsa"));
		this.pac.asignarCita(
				new Cita(new Medico(1, "12321", "bartolo", "adsa", "asdsada", "Asda", Especialidad.Cabecera),
						"21-6-1996", true, "Adsa"));
		int index = 0;
		this.datosCita = new String[paciente.getCitas().size()][columnaCita.length];
		for (Cita cita : paciente.getCitas()) {
			rellenarCitaFila(paciente.getFullName(), cita, index);
			index++;
		}
		DefaultTableModel defaultTableModelC = new DefaultTableModel(datosCita, columnaCita);
		tableCitas = new JTable(defaultTableModelC);
		tableCitas.setFont(new Font("Tahoma", Font.CENTER_BASELINE, 12));
		scrollCitas.setViewportView(tableCitas);
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

	public void rellenarTratamiento(Paciente paciente) {
		this.pac.asigarTratamiento(new Tratamiento(new Medicamento(), "2", "21/1/1", "123"));
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
}
