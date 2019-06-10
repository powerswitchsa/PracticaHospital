package listener.btn;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import control.Control;
import vista.paciente.CitaEspecialista;

public class ActionCitaEspecialista implements ActionListener {
	private CitaEspecialista citaEspecialista;
	private Control control;

	public ActionCitaEspecialista(CitaEspecialista citaEspecialista, Control control) {
		super();
		this.citaEspecialista = citaEspecialista;
		this.control = control;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		try {
			if (this.citaEspecialista.getComboNombreMedico().getSelectedItem() != null
					&& this.citaEspecialista.getComboBoxID() != null) {
				String nombreMedico = this.citaEspecialista.getComboNombreMedico().getSelectedItem().toString();
				String idPaciente = this.citaEspecialista.getComboBoxID().getSelectedItem().toString();
				String coordenada = this.citaEspecialista.getCoordenada();
				if (nombreMedico != null && idPaciente != null) {
					this.control.getCita(idPaciente, nombreMedico, coordenada, this.citaEspecialista.getHora());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
