package listener.combobox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import control.ParaUI;
import modelo.Paciente;

public class ConsultaPacienteNombre implements ActionListener {

	private ParaUI paraUI;

	public ConsultaPacienteNombre(ParaUI paraUI) {
		super();
		this.paraUI = paraUI;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String fullNombre = "";
		if (this.paraUI.getConsultaPaciente().getComboBoxNombre().getSelectedItem() != null) {
			fullNombre = this.paraUI.getConsultaPaciente().getComboBoxNombre().getSelectedItem().toString();
			if (fullNombre != null) {
				Paciente paciente = this.paraUI.getControl().getPacienteFullNombre(fullNombre);
				this.paraUI.getConsultaPaciente().mostrarDatos(paciente);
			}
		}
	}

}
