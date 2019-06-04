package listener.item;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import control.ParaUI;
import modelo.Especialidad;

public class ActionItem05 implements ActionListener {

	private ParaUI paraUI;

	public ActionItem05(ParaUI paraUI) {
		super();
		this.paraUI = paraUI;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.paraUI.asociarPanel("altaMedico");
		this.paraUI.getAltaMedico().getComboConsulta().removeAllItems();
		this.paraUI.getAltaMedico().getComboEspecilidad().removeAllItems();
		this.paraUI.getAltaMedico().getComboHorario().removeAllItems();
		ArrayList<Integer> idConsulta = paraUI.getControl().getVacanteConsulta();
		ArrayList<Boolean> horaLibre = paraUI.getControl().getHoraLibre();
		for (Integer id : idConsulta) {
			this.paraUI.getAltaMedico().getComboConsulta().addItem(id);
		}
		for (Especialidad especial : Especialidad.values()) {
			this.paraUI.getAltaMedico().getComboEspecilidad().addItem(especial);
		}
		for (Boolean hora : horaLibre) {
			this.paraUI.getAltaMedico().getComboHorario().addItem(hora);
		}
	}

}
