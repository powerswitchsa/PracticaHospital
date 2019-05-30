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

import modelo.Paciente;

import javax.swing.JTable;

public class VerHistorial extends JPanel {
	private JTable tableCitas;
	private JTable tableTratamiento;
	private JScrollPane scrollTratamiento = new JScrollPane();
	private JScrollPane scrollCitas = new JScrollPane();
	private String columnaName[];
	private String datosColumna[][];
	private String columnaNameT[];
	private String datosColumnaT[][];

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
		crearTables();

	}

	public void crearTables() {
		String columnaName[] = { "Paciente", "Medicamento", "Posologia", "Fecha inicio", "Fecha Fin" };
		String datosColumna[][] = {
				{ "Gonzalo Berceo, Jonathan", "Consulta primaria", "16/06/2019", "Jovellanos pursuy,Benito","12/19/24" } };
		DefaultTableModel defaultTableModelC = new DefaultTableModel(datosColumna, columnaName);
		tableCitas = new JTable(defaultTableModelC);
		tableCitas.setFont(new Font("Tahoma", Font.CENTER_BASELINE, 12));
		scrollCitas.setViewportView(tableCitas);
		String columnaNameT[] = { "Paciente	", "Tipo", "Fecha", "Medico"};
		String datosColumnaT[][] = {
				{ "Gonzalo Berceo, Jonathan", "Consulta primaria", "16/06/2019", "Jovellanos pursuy,Benito","10-0-10"} };
		DefaultTableModel defaultTableModelT = new DefaultTableModel(datosColumnaT, columnaNameT);
		tableTratamiento = new JTable(defaultTableModelT);
		tableTratamiento.setFont(new Font("Tahoma", Font.CENTER_BASELINE, 12));
		scrollTratamiento.setViewportView(tableTratamiento);
	}
	public void mostrarPaciente(Paciente paciente) {
		for (int i = 0; i < 5; i++) {
			
		}
	}

}
