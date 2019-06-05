package listener.combobox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import control.ParaUI;
import modelo.Paciente;

public class CitaOperacionID implements ActionListener {

	private ParaUI paraUI;

	public CitaOperacionID(ParaUI paraUI) {
		super();
		this.paraUI = paraUI;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String id = "";
		if (this.paraUI.getCitaOperacion().getComboID().getSelectedItem() != null) {
			id = this.paraUI.getCitaOperacion().getComboID().getSelectedItem().toString();
			if (id != null) {
				Paciente paciente = this.paraUI.getControl().getPaciente(id);
				this.paraUI.getCitaOperacion().getComboPaciente().setSelectedItem(paciente.getFullName());
			}
		}
	}

}
