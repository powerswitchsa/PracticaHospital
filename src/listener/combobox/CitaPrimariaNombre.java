package listener.combobox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import control.ParaUI;
import modelo.Paciente;

public class CitaPrimariaNombre implements ActionListener {

	private ParaUI paraUI;

	public CitaPrimariaNombre(ParaUI paraUI) {
		super();
		this.paraUI = paraUI;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String fullNombre = "";
		if (this.paraUI.getCitaPrimaria().getComboPaciente().getSelectedItem() != null) {
			fullNombre = this.paraUI.getCitaPrimaria().getComboPaciente().getSelectedItem().toString();
			if (fullNombre != null) {
				Paciente paciente = this.paraUI.getControl().getPacienteFullNombre(fullNombre);
				this.paraUI.getCitaPrimaria().getComboID().setSelectedItem(paciente.getId());
				
			}
		}
	}

}
