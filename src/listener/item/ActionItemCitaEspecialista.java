
package listener.item;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import control.ParaUI;
<<<<<<< HEAD
import modelo.Especialidad;
import modelo.TipoOperacion;
import modelo.Turno;
=======
import modelo.enums.Especialidad;
>>>>>>> branch 'master' of https://github.com/powerswitchsa/PracticaHospital.git

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
		this.paraUI.rellenarEspecialidadMedico(this.paraUI.getCitaEspecialista().getComboNombreMedico(),
				Especialidad.Especialista);
	}
}
