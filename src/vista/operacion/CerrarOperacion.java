package vista.operacion;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.DefaultTableModel;

import modelo.Intervencion;
import modelo.Paciente;

import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.SwingConstants;

public class CerrarOperacion extends JPanel {
	private JTable tableCloseHistorial;
	private JTextField txtAplicar;
	private String columnaCloseInt[] = { "Paciente	", "operacion", "cirujano", "resultado" };
	private String datosCloseInt[][];
	JScrollPane scrollCerrar = new JScrollPane();

	public CerrarOperacion(Color colorFondo, int letraPequena, int letraGrande, String tipoLetra) {
		
		JPanel panelTitulo = new JPanel();
		JPanel panelDownInfo = new JPanel();
		JPanel panelAplicar = new JPanel();
		panelDownInfo.add(panelAplicar);
		panelAplicar.setBackground(colorFondo);
		panelDownInfo.setBackground(colorFondo);
		panelTitulo.setBackground(colorFondo);
		setOpaque(false);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.TRAILING).addGroup(groupLayout
				.createSequentialGroup().addGap(23)
				.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(scrollCerrar, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
						.addComponent(panelDownInfo, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
								GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(panelTitulo, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE))
				.addGap(18)));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup().addGap(31)
						.addComponent(panelTitulo, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
						.addGap(18).addComponent(scrollCerrar, GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(panelDownInfo, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addGap(46)));
		panelDownInfo.setLayout(new GridLayout(1, 0, 0, 0));


		JLabel lblAplicar = new JLabel("MENSAJE");
		lblAplicar.setHorizontalAlignment(SwingConstants.RIGHT);

		txtAplicar = new JTextField();
		txtAplicar.setColumns(10);

		JButton btnAplicar = new JButton("APLICAR");
		btnAplicar.setHorizontalTextPosition(SwingConstants.RIGHT);
		GroupLayout gl_panelAplicar = new GroupLayout(panelAplicar);
		gl_panelAplicar
				.setHorizontalGroup(
						gl_panelAplicar.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING,
								gl_panelAplicar.createSequentialGroup()
										.addComponent(lblAplicar, GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(txtAplicar, GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
										.addPreferredGap(ComponentPlacement.RELATED).addComponent(btnAplicar,
												GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
										.addContainerGap()));
		gl_panelAplicar.setVerticalGroup(gl_panelAplicar.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelAplicar.createSequentialGroup()
						.addGroup(gl_panelAplicar.createParallelGroup(Alignment.LEADING).addComponent(btnAplicar)
								.addComponent(txtAplicar, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panelAplicar.createSequentialGroup().addGap(4).addComponent(lblAplicar)))
						.addContainerGap(29, Short.MAX_VALUE)));
		panelAplicar.setLayout(gl_panelAplicar);

		tableCloseHistorial = new JTable();
		scrollCerrar.setColumnHeaderView(tableCloseHistorial);
		panelTitulo.setLayout(new GridLayout(0, 1, 0, 0));

		JLabel lblTitulo = new JLabel("CIERRE OPERACION");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panelTitulo.add(lblTitulo);
		setLayout(groupLayout);		
	}

	private void rellenarCloseInt(Paciente paciente) {
		int index = 0;
		this.datosCloseInt = new String[paciente.getCitas().size()][columnaCloseInt.length];
		for (Intervencion interven : paciente.getIntervenciones()) {
			rellenarCloseIntFila(paciente.getFullName(), interven, index);
			index++;
		}
		DefaultTableModel defaultTableModelC = new DefaultTableModel(datosCloseInt, columnaCloseInt);
		tableCloseHistorial = new JTable(defaultTableModelC);
		tableCloseHistorial.setFont(new Font("Tahoma", Font.CENTER_BASELINE, 12));
		scrollCerrar.setViewportView(tableCloseHistorial);
	}

	private void rellenarCloseIntFila(String fullName, Intervencion operacion, int index) {
		this.datosCloseInt[index][0] = fullName;
		this.datosCloseInt[index][1] = operacion.getTipoIntervencion();
		this.datosCloseInt[index][2] = operacion.getFullName();
		this.datosCloseInt[index][3] = operacion.isCurado();
	}
}
