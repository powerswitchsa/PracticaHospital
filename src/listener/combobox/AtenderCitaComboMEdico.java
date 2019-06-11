package listener.combobox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import control.Control;
import modelo.Cita;
import vista.medico.AtenderCita;

public class AtenderCitaComboMEdico implements ActionListener {

	private Control control;
	private AtenderCita atenderCita;

	public AtenderCitaComboMEdico(Control control, AtenderCita atenderCita) {
		super();
		this.control = control;
		this.atenderCita = atenderCita;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			if (this.atenderCita.getComboBoxMedico().getSelectedItem() != null) {
				String nombreMedico = this.atenderCita.getComboBoxMedico().getSelectedItem().toString();
				if (nombreMedico != null) {
					Cita cita = this.control.getCitaPorMedico(nombreMedico);
					if (cita != null) {

						this.atenderCita.getTextNombrePaciente().setText(cita.getNombrePaciente());
					}
				}
			}
		} catch (Exception e2) {
			e2.printStackTrace();
		}

	}

}
