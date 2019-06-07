package listener.combobox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import control.ParaUI;
import modelo.Medico;

public class ConsultaMedicoNombre implements ActionListener {
	private ParaUI paraUI;
	
	public ConsultaMedicoNombre(ParaUI paraUI) {
		super();
		this.paraUI = paraUI;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		String nombre = "";
		if (this.paraUI.getConsultaMedico().getComboNombreMedico().getSelectedItem()!=null) {
			nombre = this.paraUI.getConsultaMedico().getComboNombreMedico().getSelectedItem().toString();
			if (nombre!=null) {
				Medico medico = this.paraUI.getControl().getFullNameMedico(nombre);
				this.paraUI.getConsultaMedico().mostrarDatos(medico);
				this.paraUI.getConsultaMedico().getComboBoxID().setSelectedItem(medico.getId());
			}
			
		}
	}

}
