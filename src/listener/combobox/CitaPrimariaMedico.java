package listener.combobox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import control.ParaUI;
import modelo.Medico;
import modelo.Paciente;
import modelo.enums.Especialidad;
import modelo.enums.Turno;

public class CitaPrimariaMedico implements ActionListener {
	private ParaUI paraUI;

	public CitaPrimariaMedico(ParaUI paraUI) {
		super();
		this.paraUI = paraUI;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String fullNombre;
		if (this.paraUI.getCitaPrimaria().getComboNombreMedico().getSelectedItem().toString()!=null) {
			fullNombre = this.paraUI.getCitaPrimaria().getComboNombreMedico().getSelectedItem().toString();
			if (fullNombre!=null) {
				Medico medico = this.paraUI.getControl().getFullNameMedico(fullNombre);
				System.out.println(medico==null);
				this.paraUI.getCitaPrimaria().crearBotonera(medico.getHorario(), medico.getTurno());
			}
		}
	}
}