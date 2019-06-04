package listener.item;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import control.ParaUI;

public class ActionItemBajaPaciente implements ActionListener {

	private ParaUI paraUI;

	public ActionItemBajaPaciente(ParaUI paraUI) {
		super();
		this.paraUI = paraUI;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.paraUI.asociarPanel("bajaPaciente");
		this.paraUI.rellenarComboBoxPaciente(this.paraUI.getBajaPaciente().getComboBoxID(),
				this.paraUI.getBajaPaciente().getComboBoxNombre());
	}

}
