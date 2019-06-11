package listener.btn;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import control.ParaUI;

public class ActionAltaMedico implements ActionListener {
	private ParaUI paraUI;

	public ActionAltaMedico(ParaUI paraUI) {
		super();
		this.paraUI = paraUI;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			if (this.paraUI.getAltaMedico().getComboConsulta().getSelectedItem().toString()!=null) {
				String idConsulta = this.paraUI.getAltaMedico().getComboConsulta().getSelectedItem().toString();
				if (this.paraUI.getControl().getAltaMedico(this.paraUI.getAltaMedico().getFieldsMedico(),
						this.paraUI.getAltaMedico().getTipoEspecialidad(), this.paraUI.getAltaMedico().getTurno(),
						idConsulta)) {
					this.paraUI.getAltaMedico().getMensajeSistema().setText("DONE");
					this.paraUI.getAltaMedico().vaciarCampos();
				} else {
					this.paraUI.getAltaMedico().getMensajeSistema().setText("lo has petado");
				}
				this.paraUI.asociarPanel("altaMedico");			
			}
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}
}
