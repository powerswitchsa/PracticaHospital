package listener.btn;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JPanel;

import control.Control;
import control.ParaUI;
import listener.combobox.SincronizarComboBox;
import vista.paciente.CitaPrimaria;

public class ActionCitaPrimaria implements ActionListener {
	private JComboBox nombreMedico;
	private CitaPrimaria panel;
	private JComboBox idPaciente;
	private Control control;
	private String dia;
	private String hora;

	public ActionCitaPrimaria(JComboBox comboMedico,CitaPrimaria citaPrimaria, JComboBox idPaciente, Control control,
			String dia, String hora) {
		super();
		this.nombreMedico = comboMedico;
		this.panel = citaPrimaria;
		this.idPaciente = idPaciente;
		this.control = control;
		this.dia = dia;
		this.hora = hora;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		String cadena = this.dia + ";" + this.hora;
		try {
			if (this.nombreMedico.getSelectedItem() != null && this.idPaciente.getSelectedItem() != null) {
				String nombreMedico = this.nombreMedico.getSelectedItem().toString();
				String idPaciente = this.idPaciente.getSelectedItem().toString();
				String coordenada = this.panel.getCoordenada();
				if (nombreMedico != null && idPaciente != null) {
					this.control.getCitaPrimaria(idPaciente, nombreMedico, coordenada, cadena);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
