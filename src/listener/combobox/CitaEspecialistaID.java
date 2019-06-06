package listener.combobox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import control.ParaUI;
import modelo.Paciente;

public class CitaEspecialistaID implements ActionListener {

	private ParaUI paraUI;

	public CitaEspecialistaID(ParaUI paraUI) {
		super();
		this.paraUI = paraUI;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String id = "";
		if (this.paraUI.getCitaEspecialista().getComboBoxID().getSelectedItem() != null) {
			id = this.paraUI.getCitaEspecialista().getComboBoxID().getSelectedItem().toString();
			if (id != null) {
				Paciente paciente = this.paraUI.getControl().getPaciente(id);
				this.paraUI.getCitaEspecialista().getComboBoxNombre().setSelectedItem(paciente.getFullName());
			}
		}
	}

}
