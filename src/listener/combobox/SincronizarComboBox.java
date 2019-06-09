package listener.combobox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;

import control.Control;
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
		Persona persona = null;
		String cadena = "";
		if (this.comboNombre != null && this.comboID != null) {
			if (sincrPorId) {
				if (this.comboID.getSelectedItem() != null) {
					cadena = this.comboID.getSelectedItem().toString();
					if (cadena != null) {
						persona = this.control.getPaciente(cadena);
						if (persona != null)
							this.comboNombre.setSelectedItem(persona.getFullName());
					}
				}
			} else {
				cadena = "";
				if (this.comboNombre.getSelectedItem() != null) {
					cadena = this.comboNombre.getSelectedItem().toString();
					if (cadena != null) {
						persona = this.control.getPacienteFullNombre(cadena);
						if (persona != null)
							this.comboID.setSelectedItem(persona.getId());
					}
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
