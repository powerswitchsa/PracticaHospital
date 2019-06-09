package listener.combobox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;

import control.Control;
import modelo.Paciente;
import modelo.Persona;

public class SincronizarComboBox implements ActionListener {

	private JComboBox comboID;
	private JComboBox comboNombre;
	private Control control;

	private boolean sincrPorId;

	public SincronizarComboBox(JComboBox comboID, JComboBox comboNombre, Control control, boolean sincrPorId) {
		super();
		this.comboID = comboID;
		this.comboNombre = comboNombre;
		this.control = control;
		this.sincrPorId = sincrPorId;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (sincrPorId) {
			String id = "";
			if (this.comboID.getSelectedItem() != null) {
				id = this.comboID.getSelectedItem().toString();
				if (id != null) {
					Persona persona = this.control.getPaciente(id);
					this.comboNombre.setSelectedItem(persona.getFullName());
				}
			}
		} else {
			String fullName = "";
			if (this.comboNombre.getSelectedItem() != null) {
				fullName = this.comboNombre.getSelectedItem().toString();
				if (fullName != null) {
					Persona persona = this.control.getPacienteFullNombre(fullName);
					this.comboID.setSelectedItem(persona.getId());
				}
			}
		}
	}

	public JComboBox getComboID() {
		return comboID;
	}

	public JComboBox getComboNombre() {
		return comboNombre;
	}

	public Control getControl() {
		return control;
	}

	public boolean isSincrPorId() {
		return sincrPorId;
	}

}
