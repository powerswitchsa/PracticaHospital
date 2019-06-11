package listener.item;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JComboBox;

import control.ParaUI;
import modelo.Consulta;
import modelo.enums.*;
import modelo.enums.Especialidad;
import vista.medico.AltaMedico;

public class ActionItemAltaMedico implements ActionListener {

	private ParaUI paraUI;
	private AltaMedico altaMedico;

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
		altaMedico = this.paraUI.getAltaMedico();
		ArrayList<String> idConsulta = paraUI.getControl().getVacanteConsulta(this.altaMedico);
		for (String id : idConsulta) {
			this.paraUI.getAltaMedico().getComboConsulta().addItem(id);
		}
		for (Especialidad especial : Especialidad.values()) {
			this.paraUI.getAltaMedico().getComboEspecilidad().addItem(especial);
		}
		for (Turno elementos : Turno.values()) {
			this.paraUI.getAltaMedico().getComboHorario().addItem(elementos.name());
		}
		
	}
	

}
