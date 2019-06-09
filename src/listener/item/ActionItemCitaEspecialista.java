
package listener.item;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import control.ParaUI;
import modelo.enums.Especialidad;

public class ActionItemCitaEspecialista implements ActionListener {

	private ParaUI paraUI;

	public ActionItemCitaEspecialista(ParaUI paraUI) {
		super();
		this.paraUI = paraUI;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.paraUI.asociarPanel("citaEspecialista");
		this.paraUI.rellenarComboBoxPaciente(this.paraUI.getCitaEspecialista().getComboBoxID(),
				this.paraUI.getCitaEspecialista().getComboBoxNombre());
		if (this.paraUI.getCitaEspecialista().getComboNombreMedico() != null) {
			this.paraUI.rellenarEspecialidadMedico(this.paraUI.getCitaEspecialista().getComboNombreMedico(),
					Especialidad.Especialista);
		}
	}
}
