package listener.item;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import control.ParaUI;

public class ActionItemConsultaPaciente implements ActionListener {

	private ParaUI paraUI;

	public ActionItemConsultaPaciente(ParaUI paraUI) {
		super();
		this.paraUI = paraUI;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.paraUI.asociarPanel("consultaPaciente");
		this.paraUI.rellenarComboBoxPaciente(this.paraUI.getConsultaPaciente().getComboBoxID(),
				this.paraUI.getConsultaPaciente().getComboBoxNombre());
	}

}
