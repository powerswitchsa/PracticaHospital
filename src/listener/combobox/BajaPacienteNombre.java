package listener.combobox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import control.ParaUI;
import modelo.Paciente;

public class BajaPacienteNombre implements ActionListener {

	private ParaUI paraUI;

	public BajaPacienteNombre(ParaUI paraUI) {
		super();
		this.paraUI = paraUI;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String fullNombre = "";
		if (this.paraUI.getBajaPaciente().getComboBoxNombre().getSelectedItem() != null) {
			fullNombre = this.paraUI.getBajaPaciente().getComboBoxNombre().getSelectedItem().toString();
			if (fullNombre != null) {
				Paciente paciente = this.paraUI.getControl().getPacienteFullNombre(fullNombre);
				this.paraUI.getBajaPaciente().rellenarCampos(paciente);
				this.paraUI.getBajaPaciente().getComboBoxID().setSelectedItem(paciente.getId());
			}
		}
	}

}
