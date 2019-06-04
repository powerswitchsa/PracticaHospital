package listener.item;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import control.ParaUI;

public class ActionItem02 implements ActionListener {

	private ParaUI paraUI;

	public ActionItem02(ParaUI paraUI) {
		super();
		this.paraUI = paraUI;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.paraUI.asociarPanel("citaOperacion");

		this.paraUI.rellenarComboBoxPaciente(this.paraUI.getCitaOperacion().getComboID(),
				this.paraUI.getCitaOperacion().getComboPaciente());

	}

}
