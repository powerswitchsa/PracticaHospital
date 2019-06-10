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
	private CitaPrimaria citaPrimaria;
	private Control control;

	public ActionCitaPrimaria(CitaPrimaria citaPrimaria, Control control) {
		super();
		this.citaPrimaria = citaPrimaria;
		this.control = control;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		try {
			if (this.citaPrimaria.getComboNombreMedico().getSelectedItem() != null
					&& this.citaPrimaria.getComboBoxID().getSelectedItem() != null) {
				String nombreMedico = this.citaPrimaria.getComboNombreMedico().getSelectedItem().toString();
				String idPaciente = this.citaPrimaria.getComboBoxID().getSelectedItem().toString();
				String coordenada = this.citaPrimaria.getCoordenada();
				if (nombreMedico != null && idPaciente != null) {
					this.control.getCita(idPaciente, nombreMedico, coordenada, this.citaPrimaria.getHora());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
