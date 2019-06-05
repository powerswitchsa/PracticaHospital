package listener.combobox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import control.ParaUI;
import modelo.Paciente;

public class ModificarPacienteNombre implements ActionListener {

	private ParaUI paraUI;

	public ModificarPacienteNombre(ParaUI paraUI) {
		super();
		this.paraUI = paraUI;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String fullNombre = "";
		if (this.paraUI.getModificarPaciente().getComboBoxNombre().getSelectedItem() != null) {
			fullNombre = this.paraUI.getModificarPaciente().getComboBoxNombre().getSelectedItem().toString();
			if (fullNombre != null) {
				Paciente paciente = this.paraUI.getControl().getPacienteFullNombre(fullNombre);
				this.paraUI.getModificarPaciente().rellenarCampos(paciente);
				this.paraUI.getModificarPaciente().getComboBoxID().setSelectedItem(paciente.getId());
			}
		}
	}

}
