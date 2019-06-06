package listener.combobox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import control.ParaUI;
import modelo.Medico;

public class ConsultaMedicoID implements ActionListener {
	private ParaUI paraUI;

	public ConsultaMedicoID(ParaUI paraUI) {
		super();
		this.paraUI = paraUI;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String id = "";
		if (this.paraUI.getConsultaMedico().getComboBoxID().getSelectedItem() != null) {
			id = this.paraUI.getConsultaMedico().getComboBoxID().getSelectedItem().toString();
			if (id != null) {
				Medico medico = this.paraUI.getControl().getMedico(id);
				this.paraUI.getConsultaMedico().mostrarDatos(medico);
				this.paraUI.getConsultaMedico().getComboNombreMedico().setSelectedItem(medico.getFullName());
			}
		}
	}
}
