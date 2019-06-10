package listener.item;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import control.ParaUI;

public class ActionItemVerHistorial implements ActionListener {

	private ParaUI paraUI;

	public ActionItemVerHistorial(ParaUI paraUI) {
		super();
		this.paraUI = paraUI;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.paraUI.asociarPanel("verHistorial");
		this.paraUI.rellenarComboBoxPaciente(this.paraUI.getVerHistorial().getComboBoxID(),
				this.paraUI.getVerHistorial().getComboBoxNombre());
	}

}
