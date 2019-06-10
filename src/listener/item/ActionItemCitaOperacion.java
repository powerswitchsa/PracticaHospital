package listener.item;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import control.ParaUI;
import modelo.enums.Especialidad;
import modelo.enums.TipoOperacion;

public class ActionItemCitaOperacion implements ActionListener {

	private ParaUI paraUI;

	public ActionItemCitaOperacion(ParaUI paraUI) {
		super();
		this.paraUI = paraUI;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.paraUI.asociarPanel("citaOperacion");
		this.paraUI.getCitaOperacion().getComboTipoOperacion().removeAllItems();
		this.paraUI.rellenarComboBoxPaciente(this.paraUI.getCitaOperacion().getComboID(),
				this.paraUI.getCitaOperacion().getComboPaciente());
		this.paraUI.rellenarEspecialidadMedico(this.paraUI.getCitaOperacion().getComboCirujano(),
				Especialidad.Cirujano);
		for (TipoOperacion elementos : TipoOperacion.values()) {
			this.paraUI.getCitaOperacion().getComboTipoOperacion().addItem(elementos.getOperacion());
		}
		this.paraUI.rellenarEspecialidadMedico(this.paraUI.getCitaOperacion().getComboMedicoSolicitante(),
				Especialidad.Especialista);
	}

}
