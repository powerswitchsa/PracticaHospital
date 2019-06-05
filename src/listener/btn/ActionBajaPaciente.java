package listener.btn;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import control.ParaUI;

public class ActionBajaPaciente implements ActionListener {

	private ParaUI paraUI;

	public ActionBajaPaciente(ParaUI paraUI) {
		super();
		this.paraUI = paraUI;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String id = this.paraUI.getBajaPaciente().getComboBoxID().getSelectedItem().toString();
		if (id != null) {
			this.paraUI.getBajaPaciente().getMensajeSistema()
					.setText(this.paraUI.getControl().getBajaPaciente(id) ? "Se ha dado de baja con exito"
							: "No se ha podido dar de baja");
		}
		this.paraUI.getBajaPaciente().vaciarCampos();
		this.paraUI.rellenarComboBoxPaciente(this.paraUI.getBajaPaciente().getComboBoxID(),
				this.paraUI.getBajaPaciente().getComboBoxNombre());
	}

}
