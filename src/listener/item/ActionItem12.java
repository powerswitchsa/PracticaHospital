package listener.item;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import control.ParaUI;

public class ActionItem12 implements ActionListener {
	
	private ParaUI paraUI;

	public ActionItem12(ParaUI paraUI) {
		super();
		this.paraUI = paraUI;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		this.paraUI.asociarPanel("citaPrimaria");

	}

}
