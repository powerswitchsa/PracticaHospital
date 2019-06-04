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
		this.paraUI.asociarPanel("modificarPaciente");
		this.paraUI.getModificarPaciente().vaciarCampos();
		this.paraUI.rellenarComboBox(this.paraUI.getModificarPaciente().getComboBoxID(),
				this.paraUI.getModificarPaciente().getComboBoxNombre());
	}
}
