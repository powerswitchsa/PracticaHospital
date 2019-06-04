package control;

import java.util.HashMap;

import javax.swing.JComboBox;
import javax.swing.plaf.ComboBoxUI;

import listener.btn.ActionAltaPaciente;

import listener.btn.ActionModificarPaciente;
import listener.combobox.ConsultaMedicoID;
import listener.combobox.ModificarPacientesID;
import listener.item.ActionItem01;
import listener.item.ActionItem02;
import listener.item.ActionItem03;
import listener.item.ActionItem04;
import listener.item.ActionItem05;
import listener.item.ActionItem06;
import listener.item.ActionItem07;
import listener.item.ActionItem08;
import listener.item.ActionItem09;
import listener.item.ActionItem10;
import listener.item.ActionItem11;
import listener.item.ActionItem12;
import modelo.Medico;
import modelo.Paciente;

import vista.UI;

public class ParaUI extends UI {

	private Control control;

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
	private ActionModificarPaciente actionModificarPaciente = new ActionModificarPaciente(this);
	// actionlistener combobox
	private ModificarPacientesID cbidModificarPaciente = new ModificarPacientesID(this);
	private ConsultaMedicoID consultaMedicoID = new ConsultaMedicoID(this);
	private ModificarPacientesID boxModifcarPacienteID = new ModificarPacientesID(this);

	public ParaUI() {
		super();
		this.control = new Control();

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
		getConsultaMedico().getComboId().addActionListener(this.consultaMedicoID);
		getModificarPaciente().getComboBoxID().addActionListener(this.boxModifcarPacienteID);
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
