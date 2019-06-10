package listener.item;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import control.ParaUI;
import modelo.enums.Especialidad;

public class ActionItemCitaPrimaria implements ActionListener {

	private ParaUI paraUI;

	public ActionItemCitaPrimaria(ParaUI paraUI) {
		super();
		this.paraUI = paraUI;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		this.paraUI.asociarPanel("citaPrimaria");
		try {
			this.paraUI.rellenarComboBoxPaciente(this.paraUI.getCitaPrimaria().getComboBoxID(),
					this.paraUI.getCitaPrimaria().getComboBoxNombre());
			this.paraUI.rellenarEspecialidadMedico(this.paraUI.getCitaPrimaria().getComboNombreMedico(),
					Especialidad.Cabecera);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
