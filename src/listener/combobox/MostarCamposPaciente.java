package listener.combobox;

import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JTextField;

import control.Control;
import modelo.Paciente;

public class MostarCamposPaciente extends SincronizarComboBox {

	private JTextField[] list;

	public MostarCamposPaciente(JComboBox comboID, JComboBox comboNombre, Control control, boolean sincrPorId,
			JTextField[] list) {
		super(comboID, comboNombre, control, sincrPorId);
		this.list = list;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Paciente paciente = null;
		String cadena = "";
		if (isSincrPorId()) {
			if (this.getComboID().getSelectedItem() != null) {
				cadena = this.getComboID().getSelectedItem().toString();
				if (cadena != null) {
					paciente = this.getControl().getPaciente(cadena);
				}
			}
		} else {
			if (this.getComboNombre().getSelectedItem() != null) {
				cadena = this.getComboNombre().getSelectedItem().toString();
				if (cadena != null) {
					paciente = this.getControl().getPacienteFullNombre(cadena);
				}
			}
		}
		rellenarCampos(paciente);
		super.actionPerformed(e);
	}

	private void rellenarCampos(Paciente paciente) {
		if (paciente != null) {
			this.list[0].setText(paciente.getNombre());
			this.list[1].setText(paciente.getApellidos());
			this.list[2].setText(paciente.getDireccion());
			this.list[3].setText(paciente.getNacimiento());
			this.list[4].setText(paciente.getTelefono());
		}
	}

}
