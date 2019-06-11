package listener.combobox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import control.Control;
import control.ParaUI;
import modelo.enums.Especialidad;
import vista.medico.AltaMedico;

public class AltaMedicoComboEspecialidad implements ActionListener {
	private ParaUI paraUI;
	private AltaMedico altaMedico;

	public AltaMedicoComboEspecialidad(ParaUI paraUI, AltaMedico altaMedico) {
		super();
		this.paraUI = paraUI;
		this.altaMedico = altaMedico;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			if (this.altaMedico.getComboEspecilidad() != null) {
				Especialidad tipo = this.altaMedico.getTipoEspecialidad();
				if (tipo != null) {
					ArrayList<String> idConsulta = this.paraUI.getControl().getVacanteConsulta(tipo);
					for (String id : idConsulta) {
//						this.altaMedico.getComboConsulta().addItem(id);
					}
				}
			}
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}
}
