package listener.item;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import control.ParaUI;

public class ActionItemAltaPaciente implements ActionListener {

	private ParaUI paraUI;

	public ActionItemAltaPaciente(ParaUI paraUI) {
		super();
		this.paraUI = paraUI;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.paraUI.asociarPanel("altaPaciente");
		this.paraUI.getAltaPaciente().vaciarCampos();
		this.paraUI.getAltaPaciente().getMensajeSistema().setText(null);
	}

}
