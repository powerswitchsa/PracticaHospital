package listener.btn;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import control.ParaUI;

public class ActionModificarPaciente implements ActionListener {

	private ParaUI paraUI;

	public ActionModificarPaciente(ParaUI paraUI) {
		super();
		this.paraUI = paraUI;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String id = this.paraUI.getModificarPaciente().getComboBoxID().getSelectedItem().toString();
//		String nombre = getModificarPaciente().getComboBoxNombre().getSelectedItem().toString();
		String nuevaDireccion = this.paraUI.getModificarPaciente().getDireccion();
		String nuevaTelefono = this.paraUI.getModificarPaciente().getTelefono();
		if (id != null)
			this.paraUI.getControl().getModificarPaciente(id, "", nuevaDireccion, nuevaTelefono);
		this.paraUI.rellenarComboBoxPaciente(this.paraUI.getModificarPaciente().getComboBoxID(),
				this.paraUI.getModificarPaciente().getComboBoxNombre());
	}

}
