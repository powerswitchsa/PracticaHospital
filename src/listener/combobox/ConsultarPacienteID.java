package listener.combobox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import control.ParaUI;

public class ConsultarPacienteID implements ActionListener {

	private ParaUI paraUI;

	public ConsultarPacienteID(ParaUI paraUI) {
		super();
		this.paraUI = paraUI;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String id = this.paraUI.getConsultaPaciente().getComboBoxID().getSelectedItem().toString();
		if (id != null)
			this.paraUI.getConsultaPaciente().mostrarDatos(this.paraUI.getControl().getPaciente(id));

	}

}
