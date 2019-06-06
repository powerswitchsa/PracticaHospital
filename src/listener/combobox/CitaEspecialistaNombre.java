package listener.combobox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import control.ParaUI;
import modelo.Paciente;

public class CitaEspecialistaNombre implements ActionListener {

	private ParaUI paraUI;

	public CitaEspecialistaNombre(ParaUI paraUI) {
		super();
		this.paraUI = paraUI;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String fullNombre = "";
		if (this.paraUI.getCitaEspecialista().getComboBoxNombre().getSelectedItem() != null) {
			fullNombre = this.paraUI.getCitaEspecialista().getComboBoxNombre().getSelectedItem().toString();
			if (fullNombre != null) {
				Paciente paciente = this.paraUI.getControl().getPacienteFullNombre(fullNombre);
				this.paraUI.getCitaEspecialista().getComboBoxID().setSelectedItem(paciente.getId());
			}
		}
	}

}
