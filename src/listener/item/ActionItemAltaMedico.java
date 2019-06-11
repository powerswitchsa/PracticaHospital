package listener.item;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JComboBox;

import control.Control;
import control.ParaUI;
import modelo.Consulta;
import modelo.enums.*;
import modelo.enums.Especialidad;
import vista.medico.AltaMedico;

public class ActionItemAltaMedico implements ActionListener {

	private AltaMedico altaMedico;
	private ParaUI paraUI;

	public ActionItemAltaMedico(AltaMedico altaMedico, ParaUI paraUI) {
		super();
		this.altaMedico = altaMedico;
		this.paraUI = paraUI;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.paraUI.asociarPanel("altaMedico");
		this.altaMedico.getComboConsulta().removeAllItems();
		this.altaMedico.getComboEspecilidad().removeAllItems();
		this.altaMedico.getComboHorario().removeAllItems();
		this.paraUI.getAltaMedico().getMensajeSistema().setText("");
		for (Especialidad especial : Especialidad.values()) {
			this.altaMedico.getComboEspecilidad().addItem(especial);
		}
		for (Turno elementos : Turno.values()) {
			this.altaMedico.getComboHorario().addItem(elementos.name());
		}
	}
}
