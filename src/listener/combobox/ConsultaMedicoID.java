package listener.combobox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import control.ParaUI;

public class ConsultaMedicoID implements ActionListener {
	private ParaUI paraUI;

	public ConsultaMedicoID(ParaUI paraUI) {
		super();
		this.paraUI = paraUI;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String id = this.paraUI.getConsultaMedico().getComboBoxID().getSelectedItem().toString();
		this.paraUI.getConsultaMedico().mostrarDatos(this.paraUI.getControl().getMedico(id));
	}

}
