package listener.combobox;

import java.awt.event.ActionEvent;

import javax.swing.JComboBox;
import javax.swing.JTextField;

import control.Control;
import modelo.Medico;

public class MostrarCamposMedico extends SincronizarComboBox {

	private JTextField[] vector;

	public MostrarCamposMedico(JComboBox comboID, JComboBox comboNombre, Control control, boolean sincrPorId,
			JTextField[] vector) {
		super(comboID, comboNombre, control, sincrPorId);
		this.vector = vector;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		super.actionPerformed(e);
		Medico medico = null;
		String cadena = "";
		if (isSincrPorId()) {
			if (this.getComboID().getSelectedItem() != null) {
				cadena = this.getComboID().getSelectedItem().toString();
				if (cadena != null)
					medico = this.getControl().getMedico(cadena);
			}
		} else {
			if (this.getComboNombre().getSelectedItem() != null) {
				cadena = this.getComboNombre().getSelectedItem().toString();
				if (cadena != null)
					medico = this.getControl().getFullNameMedico(cadena);
			}
		}
		if (medico != null)
			rellenarCampos(medico);
	}

	private void rellenarCampos(Medico medico) {
		this.vector[0].setText(medico.getNombre());
		this.vector[1].setText(medico.getApellidos());
		this.vector[2].setText(medico.getDireccion());
		this.vector[3].setText(medico.getTelefono());
	}

}
