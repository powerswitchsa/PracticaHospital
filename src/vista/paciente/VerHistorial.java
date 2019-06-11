package vista.paciente;

import javax.swing.JPanel;
import java.awt.GridLayout;

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
import modelo.Paciente;
import modelo.Tratamiento;

import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.BoxLayout;

public class VerHistorial extends JPanel {

	private JTable tableCitas;
	private JTable tableTratamiento;

	private JScrollPane scrollTratamiento = new JScrollPane();
	private JScrollPane scrollCitas = new JScrollPane();

	private String columnaCita[] = { "Paciente	", "Tipo", "Fecha", "Medico" };
	private String columnaTratamiento[] = { "Paciente", "Medicamento", "Posologia", "Periodo" };
	private String datosCita[][];
	private String datosTratamiento[][];
	private JComboBox comboBoxNombre;
	private JComboBox comboBoxID;

	public VerHistorial(Color colorFondo, int letraPequena, int letraGrande, String tipoLetra) {
		setBackground(colorFondo);
		JPanel panelTituloTratamiento = new JPanel();
		panelTituloTratamiento.setBackground(colorFondo);

		JLabel lblHistorialPaciente = new JLabel("HISTORIAL PACIENTE");
		lblHistorialPaciente.setFont(new Font("Tahoma", Font.PLAIN, 34));

		JLabel label = new JLabel("Citas/Operaciones");
		label.setVerticalAlignment(SwingConstants.BOTTOM);

		JPanel panel = new JPanel();
		panel.setBackground(colorFondo);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(colorFondo);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
				.createSequentialGroup().addGap(39)
				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
								.addComponent(panel, GroupLayout.PREFERRED_SIZE, 444, GroupLayout.PREFERRED_SIZE)
								.addGap(35)
								.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE)
								.addContainerGap())
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
										.addComponent(label, GroupLayout.PREFERRED_SIZE, 100,
												GroupLayout.PREFERRED_SIZE)
										.addContainerGap())
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
												.addComponent(lblHistorialPaciente, GroupLayout.DEFAULT_SIZE, 942,
														Short.MAX_VALUE)
												.addGap(31))
										.addGroup(groupLayout.createSequentialGroup()
												.addComponent(panelTituloTratamiento, GroupLayout.PREFERRED_SIZE, 103,
														GroupLayout.PREFERRED_SIZE)
												.addContainerGap(870, Short.MAX_VALUE))
										.addGroup(groupLayout.createSequentialGroup()
												.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
														.addComponent(scrollCitas, Alignment.TRAILING,
																GroupLayout.DEFAULT_SIZE, 942, Short.MAX_VALUE)
														.addComponent(scrollTratamiento, Alignment.TRAILING,
																GroupLayout.DEFAULT_SIZE, 942, Short.MAX_VALUE))
												.addGap(31)))))));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
				.createSequentialGroup().addGap(10).addComponent(lblHistorialPaciente).addGap(54)
				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
				.addGap(20).addComponent(label, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(scrollCitas, GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(panelTituloTratamiento, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
						GroupLayout.PREFERRED_SIZE)
				.addGap(12).addComponent(scrollTratamiento, GroupLayout.PREFERRED_SIZE, 245, Short.MAX_VALUE)
				.addGap(25)));
		panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.X_AXIS));

		JLabel lblNewLabel_1 = new JLabel("ID : ");
		lblNewLabel_1.setFont(new Font("Monospaced", Font.BOLD, 18));
		panel_1.add(lblNewLabel_1);

		comboBoxID = new JComboBox();
		panel_1.add(comboBoxID);
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));

		JLabel lblNewLabel = new JLabel("Paciente : ");
		lblNewLabel.setFont(new Font("Monospaced", Font.BOLD, 18));
		panel.add(lblNewLabel);

		comboBoxNombre = new JComboBox();
		panel.add(comboBoxNombre);
		panelTituloTratamiento.setLayout(new GridLayout(0, 1, 0, 0));

		JLabel lblTratamientos = new JLabel("Tratamientos");
		lblTratamientos.setBackground(colorFondo);
		lblTratamientos.setHorizontalAlignment(SwingConstants.LEFT);
		lblTratamientos.setHorizontalTextPosition(SwingConstants.CENTER);
		panelTituloTratamiento.add(lblTratamientos);
		scrollTratamiento.setColumnHeaderView(tableTratamiento);

		scrollCitas.setColumnHeaderView(tableCitas);
		setLayout(groupLayout);
	}

	public void actualizarTablas(Paciente paciente) {
		rellenarCitas(paciente);
		rellenarTratamiento(paciente);
	}

	private void rellenarCitas(Paciente paciente) {
		int index = 0;
		this.datosCita = new String[paciente.getCitas().size()][columnaCita.length];
		for (Cita cita : paciente.getCitas()) {
			rellenarCitaFila(paciente.getFullName(), cita, index);
			index++;
		}
		DefaultTableModel defaultTableModelC = new DefaultTableModel(datosCita, columnaCita);
		tableCitas = new JTable(defaultTableModelC);
		tableCitas.setFont(new Font("Tahoma", Font.CENTER_BASELINE, 15));
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
		tableTratamiento.setFont(new Font("Tahoma", Font.CENTER_BASELINE, 15));
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
		this.datosTratamiento[index][3] = tratamiento.getPeriodo();
	}

	public JComboBox getComboBoxID() {
		return comboBoxID;
	}

	public JComboBox getComboBoxNombre() {
		return comboBoxNombre;
	}

}
