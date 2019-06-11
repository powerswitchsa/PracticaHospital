package listener.combobox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import control.ParaUI;
import vista.medico.AltaMedico;

public class AltaMedicoComboEspecialidad implements ActionListener {
	private ParaUI paraUI;

	public AltaMedicoComboEspecialidad(ParaUI paraUI) {
		super();
		this.paraUI = paraUI;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			if (this.paraUI.getAltaMedico().getComboEspecilidad() != null) {
				String tipo = this.paraUI.getAltaMedico().getComboEspecilidad().toString();
				if (tipo != null) {
					AltaMedico altamedico = this.paraUI.getAltaMedico();
					ArrayList<String> idConsulta = paraUI.getControl().getVacanteConsulta(altamedico);
					for (String id : idConsulta) {
						this.paraUI.getAltaMedico().getComboConsulta().addItem(id);
					}
				}
			}
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}
}
