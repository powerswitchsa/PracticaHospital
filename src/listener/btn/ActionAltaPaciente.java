package listener.btn;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import control.ParaUI;

public class ActionAltaPaciente implements ActionListener {

	private ParaUI paraUI;

	public ActionAltaPaciente(ParaUI paraUI) {
		super();
		this.paraUI = paraUI;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.paraUI.getControl().getAltaPaciente(this.paraUI.getAltaPaciente().getInfoPaciente());
	}

}
