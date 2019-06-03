package listener.combobox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import control.ParaUI;

public class ModificarPacienteID implements ActionListener {

	private ParaUI paraUI;

	public ModificarPacienteID(ParaUI paraUI) {
		super();
		this.paraUI = paraUI;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (this.paraUI.getModificarPaciente().getComboBoxID().getSelectedItem().toString() != null) {
			String id = this.paraUI.getModificarPaciente().getComboBoxID().getSelectedItem().toString();
			this.paraUI.getModificarPaciente().rellenarCampos(this.paraUI.getControl().getPaciente(id));
		}
	}

}
