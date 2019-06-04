package listener.item;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import control.ParaUI;

public class ActionItemAtenderCita implements ActionListener {

	private ParaUI paraUI;

	public ActionItemAtenderCita(ParaUI paraUI) {
		super();
		this.paraUI = paraUI;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.paraUI.asociarPanel("atenderCita");
	}

}
