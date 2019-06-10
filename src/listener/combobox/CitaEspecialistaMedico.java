package listener.combobox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import control.ParaUI;
import modelo.Medico;

public class CitaEspecialistaMedico implements ActionListener {

	private ParaUI paraUI;

	public CitaEspecialistaMedico(ParaUI paraUI) {
		super();
		this.paraUI = paraUI;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			if (this.paraUI.getCitaEspecialista().getComboNombreMedico() != null) {
				String fullName = this.paraUI.getCitaEspecialista().getComboNombreMedico().getSelectedItem().toString();
				if (fullName != null) {
					Medico medico = this.paraUI.getControl().getFullNameMedico(fullName);
					this.paraUI.getCitaEspecialista().crearBotonera(medico.getHorario(), medico.getTurno());
					this.paraUI.actualizarPantalla();
				}
			}
		} catch (Exception e2) {
		}
	}
}
