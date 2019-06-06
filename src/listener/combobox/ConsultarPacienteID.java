package listener.combobox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import control.ParaUI;
import modelo.Paciente;

public class ConsultarPacienteID implements ActionListener {

	private ParaUI paraUI;

	public ConsultarPacienteID(ParaUI paraUI) {
		super();
		this.paraUI = paraUI;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String id = "";
		if (this.paraUI.getConsultaPaciente().getComboBoxID().getSelectedItem() != null) {
			id = this.paraUI.getConsultaPaciente().getComboBoxID().getSelectedItem().toString();
			if (id != null) {
				Paciente paciente = this.paraUI.getControl().getPaciente(id);
				this.paraUI.getConsultaPaciente().mostrarDatos(paciente);
				this.paraUI.getConsultaPaciente().getComboBoxNombre().setSelectedItem(paciente.getFullName());
			}
		}
	}

}
