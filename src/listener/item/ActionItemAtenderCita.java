package listener.item;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;

import control.ParaUI;
import modelo.Medico;
import modelo.enums.Medicamento;

public class ActionItemAtenderCita implements ActionListener {

	private ParaUI paraUI;

	public ActionItemAtenderCita(ParaUI paraUI) {
		super();
		this.paraUI = paraUI;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.paraUI.asociarPanel("atenderCita");
		this.paraUI.getAtenderCita().getComboBoxMedicamento().removeAllItems();
		this.paraUI.getAtenderCita().getComboBoxMedico().removeAllItems();
		this.paraUI.getAtenderCita().getTextNombrePaciente().setText(null);
		for (Medicamento medicamento : Medicamento.values()) {
			this.paraUI.getAtenderCita().getComboBoxMedicamento().addItem(medicamento);
		}
		ArrayList<Medico> medicos = this.paraUI.getControl().getMedicosAtenderCita();
		for (Medico medico : medicos) {
			this.paraUI.getAtenderCita().getComboBoxMedico().addItem(medico.getFullName());
		}
	}

}