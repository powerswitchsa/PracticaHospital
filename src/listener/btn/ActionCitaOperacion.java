package listener.btn;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import control.ParaUI;
import modelo.enums.TipoOperacion;

public class ActionCitaOperacion implements ActionListener {

	private ParaUI paraUI;

	public ActionCitaOperacion(ParaUI paraUI) {
		super();
		this.paraUI = paraUI;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			String idPaciente = this.paraUI.getCitaOperacion().getIdPaciente();
			String nombreCirujano = this.paraUI.getCitaOperacion().getNameCirujano();
			String nombreMedico = this.paraUI.getCitaOperacion().getNameMedico();
			TipoOperacion tipoOperacion = this.paraUI.getCitaOperacion().getTipoOperacion();
			if (idPaciente != null && nombreCirujano != null && tipoOperacion != null && nombreCirujano != null) {
				if (this.paraUI.getControl().getCitaOperacion(nombreCirujano, nombreMedico, idPaciente,
						tipoOperacion)) {
					this.paraUI.getCitaOperacion().getMensajeSistema().setText("Intervencion solicitada");
				} else {
					this.paraUI.getCitaOperacion().getMensajeSistema()
							.setText("No se ha podido solicitar la intervencion");
				}
			}
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}

}
