package listener.item;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import control.ParaUI;
import modelo.Paciente;

public class ActionItem08 implements ActionListener {

	ParaUI paraUI;

	public ActionItem08(ParaUI paraUI) {
		super();
		this.paraUI = paraUI;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		HashMap<String, Paciente> list = paraUI.getControl().getMapPaciente();
		paraUI.getModificarPaciente().getComboBoxID().removeAllItems();
		paraUI.getModificarPaciente().getComboBoxNombre().removeAllItems();
		for (Paciente paciente : list.values()) {
			paraUI.getModificarPaciente().getComboBoxID().addItem(paciente.getId());
			paraUI.getModificarPaciente().getComboBoxNombre().addItem(paciente.getNombre());
		}
		paraUI.asociarPanel("modificarPaciente");
	}

}
