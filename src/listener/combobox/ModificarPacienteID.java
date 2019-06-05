package listener.combobox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import control.ParaUI;
import modelo.Paciente;

public class ModificarPacienteID implements ActionListener {

	private ParaUI paraUI;

	public ModificarPacienteID(ParaUI paraUI) {
		super();
		this.paraUI = paraUI;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String id = "";
		if (this.paraUI.getModificarPaciente().getComboBoxID().getSelectedItem() != null) {
			id = this.paraUI.getModificarPaciente().getComboBoxID().getSelectedItem().toString();
			if (id != null) {
				Paciente paciente = this.paraUI.getControl().getPaciente(id);
				this.paraUI.getModificarPaciente().rellenarCampos(paciente);
				this.paraUI.getModificarPaciente().getComboBoxNombre().setSelectedItem(paciente.getFullName());
			}
		}
	}

}
