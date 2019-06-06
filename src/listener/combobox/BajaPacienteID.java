package listener.combobox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import control.ParaUI;
import modelo.Paciente;

public class BajaPacienteID implements ActionListener {

	private ParaUI paraUI;

	public BajaPacienteID(ParaUI paraUI) {
		super();
		this.paraUI = paraUI;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String id = "";
		if (this.paraUI.getBajaPaciente().getComboBoxID().getSelectedItem() != null) {
			id = this.paraUI.getBajaPaciente().getComboBoxID().getSelectedItem().toString();
			if (id != null) {
				Paciente paciente = this.paraUI.getControl().getPaciente(id);
				this.paraUI.getBajaPaciente().rellenarCampos(paciente);
				this.paraUI.getBajaPaciente().getComboBoxNombre().setSelectedItem(paciente.getFullName());
			}
		}
	}

}
