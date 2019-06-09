package listener.combobox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import control.ParaUI;
import modelo.Medico;
import modelo.enums.Turno;

public class CitaEspecialistaMedico implements ActionListener {
	private ParaUI paraUI;

	public CitaEspecialistaMedico(ParaUI paraUI) {
		super();
		this.paraUI = paraUI;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
//		String fullNombre = "";
//		if (this.paraUI.getCitaEspecialista().getComboNombreMedico().getSelectedItem().toString()!=null) {
//			fullNombre = this.paraUI.getCitaEspecialista().getComboNombreMedico().getSelectedItem().toString();
//			if (fullNombre!=null) {
//				Medico medico = this.paraUI.getControl().getFullNameMedico(fullNombre);
//				System.out.println(medico==null);
//				this.paraUI.getCitaEspecialista().crearBotonera(medico.getHorario(), Turno.mañana);
//			}
//		}
//	}
}
}