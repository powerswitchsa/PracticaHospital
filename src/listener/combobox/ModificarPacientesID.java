package listener.combobox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import control.ParaUI;

public class ModificarPacientesID implements ActionListener {

	private ParaUI paraUI;

	public ModificarPacientesID(ParaUI paraUI) {
		super();
		this.paraUI = paraUI;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String id = this.paraUI.getModificarPaciente().getComboBoxID().getSelectedItem().toString();
		if (id != null)
			this.paraUI.getModificarPaciente().rellenarCampos(this.paraUI.getControl().getPaciente(id));
	}

}
