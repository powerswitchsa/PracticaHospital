package listener.combobox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import control.ParaUI;

public class BajaPacienteID implements ActionListener {

	private ParaUI paraUI;

	public BajaPacienteID(ParaUI paraUI) {
		super();
		this.paraUI = paraUI;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String id = this.paraUI.getBajaPaciente().getComboBoxID().getSelectedItem().toString();
		if (id != null)
			this.paraUI.getBajaPaciente().rellenarCampos(this.paraUI.getControl().getPaciente(id));
	};

}
