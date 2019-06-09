package listener.combobox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import control.ParaUI;
import modelo.Medico;

public class CitaPrimariaMedico implements ActionListener {
	private ParaUI paraUI;

	public CitaPrimariaMedico(ParaUI paraUI) {
		super();
		this.paraUI = paraUI;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (this.paraUI.getCitaPrimaria().getComboNombreMedico().getSelectedItem() != null) {
			String fullName = this.paraUI.getCitaPrimaria().getComboNombreMedico().getSelectedItem().toString();
			if (fullName != null) {
				Medico medico = this.paraUI.getControl().getFullNameMedico(fullName);
				this.paraUI.getCitaPrimaria().crearBotonera(medico.getHorario(), medico.getTurno());
				this.paraUI.actualizarPantalla();
			}
		}
	}

}
