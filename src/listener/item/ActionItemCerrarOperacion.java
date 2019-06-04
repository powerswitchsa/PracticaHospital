package listener.item;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import control.ParaUI;

public class ActionItemCerrarOperacion implements ActionListener {

	private ParaUI paraUI;

	public ActionItemCerrarOperacion(ParaUI paraUI) {
		super();
		this.paraUI = paraUI;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.paraUI.asociarPanel("cerrarOperacion");
	}

}
