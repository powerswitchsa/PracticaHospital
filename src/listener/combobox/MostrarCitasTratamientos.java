package listener.combobox;

import java.awt.event.ActionEvent;

import javax.swing.JComboBox;

import control.Control;
import modelo.Paciente;
import vista.paciente.VerHistorial;

public class MostrarCitasTratamientos extends SincronizarComboBox {

	private VerHistorial historial;

	public MostrarCitasTratamientos(JComboBox comboID, JComboBox comboNombre, Control control, boolean sincrPorId,
			VerHistorial historial) {
		super(comboID, comboNombre, control, sincrPorId);
		this.historial = historial;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		super.actionPerformed(e);
		Paciente paciente = null;
		if (isSincrPorId()) {
			if (getComboID().getSelectedItem() != null) {
				String id = getComboID().getSelectedItem().toString();
				if (id != null) {
					paciente = getControl().getPaciente(id);
					if (paciente != null)
						this.historial.actualizarTablas(paciente);
				}
			}
		} else {
			if (getComboNombre().getSelectedItem() != null) {
				String fullName = getComboNombre().getSelectedItem().toString();
				if (fullName != null) {
					paciente = getControl().getPacienteFullNombre(fullName);
					if (paciente != null)
						this.historial.actualizarTablas(paciente);
				}
			}
		}
	}

}
