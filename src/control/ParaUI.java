package control;

import java.util.HashMap;

import javax.swing.JComboBox;

import listener.btn.ActionAltaMedico;
import listener.btn.ActionAltaPaciente;

import listener.btn.ActionModificarPaciente;
import listener.combobox.ConsultaMedicoID;
import listener.combobox.ModificarPacientesID;
import listener.item.ActionItemAltaPaciente;
import listener.item.ActionItemCitaOperacion;
import listener.item.ActionItemBajaPaciente;
import listener.item.ActionItemConsultaMedico;
import listener.item.ActionItemAltaMedico;
import listener.item.ActionItemVerHistorial;
import listener.item.ActionItemCerrarOperacion;
import listener.item.ActionItemModificarPaciente;
import listener.item.ActionItemConsultaPaciente;
import listener.item.ActionItemCitaEspecialista;
import listener.item.ActionItemAtenderCita;
import listener.item.ActionItemCitaPrimaria;
import modelo.Medico;
import modelo.Paciente;

import vista.UI;

public class ParaUI extends UI {

	private Control control;

<<<<<<< HEAD
	// actionlistener cambiar pestaña
	private ActionItem01 actionItem01 = new ActionItem01(this);
	private ActionItem02 actionItem02 = new ActionItem02(this);
	private ActionItem03 actionItem03 = new ActionItem03(this);
	private ActionItem04 actionItem04 = new ActionItem04(this);
	private ActionItem05 actionItem05 = new ActionItem05(this);
	private ActionItem06 actionItem06 = new ActionItem06(this);
	private ActionItem07 actionItem07 = new ActionItem07(this);
	private ActionItem08 actionItem08 = new ActionItem08(this);
	private ActionItem09 actionItem09 = new ActionItem09(this);
	private ActionItem10 actionItem10 = new ActionItem10(this);
	private ActionItem11 actionItem11 = new ActionItem11(this);
	private ActionItem12 actionItem12 = new ActionItem12(this);
	// actionlistener botones
	private ActionAltaPaciente actionAltaPaciente = new ActionAltaPaciente(this);
	private ActionAltaMedico actionAltaMedico = new ActionAltaMedico(this);
	private ActionModificarPaciente actionModificarPaciente = new ActionModificarPaciente(this);
	// actionlistener combobox
	private ModificarPacientesID cbidModificarPaciente = new ModificarPacientesID(this);
	private ConsultaMedicoID consultaMedicoID = new ConsultaMedicoID(this);
	private ModificarPacientesID boxModifcarPacienteID = new ModificarPacientesID(this);

=======
>>>>>>> branch 'master' of https://github.com/powerswitchsa/PracticaHospital.git
	public ParaUI() {
		super();
		this.control = new Control();
<<<<<<< HEAD

		getItem1().addActionListener(this.actionItem01);
		getItem2().addActionListener(this.actionItem02);
		getItem3().addActionListener(this.actionItem03);
		getItem4().addActionListener(this.actionItem04);
		getItem5().addActionListener(this.actionItem05);
		getItem6().addActionListener(this.actionItem06);
		getItem7().addActionListener(this.actionItem07);
		getItem8().addActionListener(this.actionItem08);
		getItem9().addActionListener(this.actionItem09);
		getItem10().addActionListener(this.actionItem10);
		getItem11().addActionListener(this.actionItem11);
		getItem12().addActionListener(this.actionItem12);

		getAltaPaciente().getBtnAceptar().addActionListener(this.actionAltaPaciente);
		getModificarPaciente().getBtnModificar().addActionListener(this.actionModificarPaciente);
		getModificarPaciente().getComboBoxID().addActionListener(this.cbidModificarPaciente);
		getModificarPaciente().getComboBoxID().addActionListener(this.boxModifcarPacienteID);
		getConsultaMedico().getComboId().addActionListener(this.consultaMedicoID);
		getAltaMedico().getBtnAceptar().addActionListener(this.actionAltaMedico);
=======
		// actionlistener cambiar pestaña
		getItemAltaPaciente().addActionListener(new ActionItemAltaPaciente(this));
		getItemCitaOperacion().addActionListener(new ActionItemCitaOperacion(this));
		getItemBajaPaciente().addActionListener(new ActionItemBajaPaciente(this));
		getItemConsultaMedico().addActionListener(new ActionItemConsultaMedico(this));
		getItemAltaMedico().addActionListener(new ActionItemAltaMedico(this));
		getItemVerHistorial().addActionListener(new ActionItemVerHistorial(this));
		getItemCerrarOperacion().addActionListener(new ActionItemCerrarOperacion(this));
		getItemModificarPaciente().addActionListener(new ActionItemModificarPaciente(this));
		getItemConsultaPaciente().addActionListener(new ActionItemConsultaPaciente(this));
		getItemCitaEspecialista().addActionListener(new ActionItemCitaEspecialista(this));
		getItemAtenderCita().addActionListener(new ActionItemAtenderCita(this));
		getItemCitaPrimaria().addActionListener(new ActionItemCitaPrimaria(this));
		// actionlistener botones
		getAltaPaciente().getBtnAceptar().addActionListener(new ActionAltaPaciente(this));
		getModificarPaciente().getBtnModificar().addActionListener(new ActionModificarPaciente(this));
		getAltaMedico().getBtnAceptar().addActionListener(new ActionAltaMedico(this));
		// actionlistener combobox
		getModificarPaciente().getComboBoxID().addActionListener(new ModificarPacientesID(this));
		getConsultaMedico().getComboId().addActionListener(new ConsultaMedicoID(this));
>>>>>>> branch 'master' of https://github.com/powerswitchsa/PracticaHospital.git
	}

	public void rellenarComboBoxPaciente(JComboBox id, JComboBox nombre) {
		nombre.removeAllItems();
		id.removeAllItems();
		HashMap<String, Paciente> list = getControl().getMapPaciente();
		for (Paciente paciente : list.values()) {
			id.addItem(paciente.getId());
			nombre.addItem(paciente.getFullName());
		}
	}

	public void rellenarComboBoxMedico(JComboBox id, JComboBox nombre) {
		nombre.removeAllItems();
		id.removeAllItems();
		HashMap<String, Medico> list = getControl().getMapMedico();
		for (Medico medico : list.values()) {
			id.addItem(medico.getId());
			nombre.addItem(medico.getNombre());
		}
	}

	public Control getControl() {
		return control;
	}

}
