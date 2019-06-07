package listener.btn;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import control.ParaUI;

public class ActionAltaMedico implements ActionListener {
	private ParaUI paraUI;

	public ActionAltaMedico(ParaUI paraUI) {
		super();
		this.paraUI = paraUI;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.paraUI.getAltaMedico().getMensajeSistema().setText("");
		if (this.paraUI.getControl().getAltaMedico(this.paraUI.getAltaMedico().getFieldsMedico(),
				this.paraUI.getAltaMedico().getTipoEspecialidad(),
				this.paraUI.getAltaMedico().getTurno())) {
			this.paraUI.getAltaMedico().getMensajeSistema().setText("DONE");
		} else {
			this.paraUI.getAltaMedico().getMensajeSistema().setText("lo has petado");
		}
	}

}
