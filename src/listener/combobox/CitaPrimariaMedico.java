package listener.combobox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import control.ParaUI;
import modelo.Medico;

public class CitaPrimariaMedico implements ActionListener{
	private ParaUI paraUI;

	public CitaPrimariaMedico(ParaUI paraUI) {
		super();
		this.paraUI = paraUI;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//coger el horario de la consulta en la que trabaja y meterlo, + el turno del medico;
		String id = this.paraUI.getCitaPrimaria().getComboID().getSelectedItem().toString();
		Medico medico = this.paraUI.getControl().getMedico(id);
		this.paraUI.getCitaPrimaria().crearBotonera(medico.getHorario(), medico.getTurno());
		this.paraUI.getControl().getHorario(medico);
		
	}
	
}
