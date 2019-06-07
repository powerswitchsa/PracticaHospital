package listener.combobox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import control.ParaUI;
import modelo.Paciente;

public class CitaPrimariaID implements ActionListener {

	private ParaUI paraUI;

	public CitaPrimariaID(ParaUI paraUI) {
		super();
		this.paraUI = paraUI;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String id = "";
		if (this.paraUI.getCitaPrimaria().getComboBoxID().getSelectedItem() != null) {
			id = this.paraUI.getCitaPrimaria().getComboBoxID().getSelectedItem().toString();
			if (id != null) {
				Paciente paciente = this.paraUI.getControl().getPaciente(id);
				this.paraUI.getCitaPrimaria().getComboBoxNombre().setSelectedItem(paciente.getFullName());
			}
		}
	}

}
