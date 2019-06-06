package listener.item;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import control.ParaUI;
import modelo.Especialidad;

public class ActionItemCitaPrimaria implements ActionListener {

	private ParaUI paraUI;

	public ActionItemCitaPrimaria(ParaUI paraUI) {
		super();
		this.paraUI = paraUI;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		this.paraUI.asociarPanel("citaPrimaria");
		this.paraUI.rellenarComboBoxPaciente(this.paraUI.getCitaPrimaria().getComboID(),
				this.paraUI.getCitaPrimaria().getComboPaciente());
		this.paraUI.rellenarEspecialidadMedico(this.paraUI.getCitaPrimaria().getComboMedico(),Especialidad.Cabecera);
	}

}
