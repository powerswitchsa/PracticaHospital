package listener.item;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import control.ParaUI;

public class ActionItem03 implements ActionListener {

	private ParaUI paraUI;

	public ActionItem03(ParaUI paraUI) {
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
