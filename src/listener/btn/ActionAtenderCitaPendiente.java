package listener.btn;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import control.Control;
import control.ParaUI;
import modelo.enums.Medicamento;
import vista.medico.AtenderCita;

public class ActionAtenderCitaPendiente implements ActionListener {

	private Control control;
	private AtenderCita atenderCita;

	public ActionAtenderCitaPendiente(Control control, AtenderCita atenderCita) {
		super();
		this.control = control;
		this.atenderCita = atenderCita;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		try {
			String nombrePaciente = this.atenderCita.getTextNombrePaciente().getText();
			String dosis = this.atenderCita.getTextFieldDosis().getText();
			String periodo = this.atenderCita.getTextFieldPeriodo().getText();
			Medicamento medicamento = (Medicamento) this.atenderCita.getComboBoxMedicamento().getSelectedItem();
			if (this.atenderCita.getComboBoxMedico() != null) {
				if (nombrePaciente != null && dosis != null && periodo != null && medicamento != null) {
					this.control.getAddTratamiento(nombrePaciente, dosis, periodo, medicamento);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
