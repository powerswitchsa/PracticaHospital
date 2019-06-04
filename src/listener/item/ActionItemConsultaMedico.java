package listener.item;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import control.ParaUI;

public class ActionItemConsultaMedico implements ActionListener {

	private ParaUI paraUI;

	public ActionItemConsultaMedico(ParaUI paraUI) {
		super();
		this.paraUI = paraUI;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.paraUI.asociarPanel("consultaMedico");
		this.paraUI.rellenarComboBoxMedico(this.paraUI.getConsultaMedico().getComboId(),
				this.paraUI.getConsultaMedico().getComboNombreMedico());
	}

}
