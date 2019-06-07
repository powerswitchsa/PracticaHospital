package listener.item;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import control.ParaUI;
import modelo.enums.Especialidad;

public class ActionItemAltaMedico implements ActionListener {

	private ParaUI paraUI;

	public ActionItemAltaMedico(ParaUI paraUI) {
		super();
		this.paraUI = paraUI;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.paraUI.asociarPanel("altaMedico");
		this.paraUI.getAltaMedico().getComboConsulta().removeAllItems();
		this.paraUI.getAltaMedico().getComboEspecilidad().removeAllItems();
		this.paraUI.getAltaMedico().getComboHorario().removeAllItems();
		ArrayList<String> idConsulta = paraUI.getControl().getVacanteConsulta();
		for (String id : idConsulta) {
			this.paraUI.getAltaMedico().getComboConsulta().addItem(id);
		}
		for (Especialidad especial : Especialidad.values()) {
			this.paraUI.getAltaMedico().getComboEspecilidad().addItem(especial);
		}
		
//			this.paraUI.getAltaMedico().getComboHorario().addItem(hora);
		
	}
	

}
