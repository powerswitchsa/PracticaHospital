package control;

import java.util.HashMap;

import javax.swing.JComboBox;
import javax.swing.plaf.ComboBoxUI;

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

	// actionlistener cambiar pestaña
	private ActionItemAltaPaciente actionItemAltaPaciente = new ActionItemAltaPaciente(this);
	private ActionItemCitaOperacion actionItemCitaOperacion = new ActionItemCitaOperacion(this);
	private ActionItemBajaPaciente actionItemBajaPaciente = new ActionItemBajaPaciente(this);
	private ActionItemConsultaMedico actionItemConsultaMedico = new ActionItemConsultaMedico(this);
	private ActionItemAltaMedico actionItemAltaMedico = new ActionItemAltaMedico(this);
	private ActionItemVerHistorial actionItemVerHistorial = new ActionItemVerHistorial(this);
	private ActionItemCerrarOperacion actionItemCerrarOperacion = new ActionItemCerrarOperacion(this);
	private ActionItemModificarPaciente actionItemModificarPaciente = new ActionItemModificarPaciente(this);
	private ActionItemConsultaPaciente actionItemConsultaPaciente = new ActionItemConsultaPaciente(this);
	private ActionItemCitaEspecialista actionItemCitaEspecialista = new ActionItemCitaEspecialista(this);
	private ActionItemAtenderCita actionItemAtenderCita = new ActionItemAtenderCita(this);
	private ActionItemCitaPrimaria actionItemCitaPrimaria = new ActionItemCitaPrimaria(this);
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

		getItemAltaPaciente().addActionListener(this.actionItemAltaPaciente);
		getItemCitaOperacion().addActionListener(this.actionItemCitaOperacion);
		getItemBajaPaciente().addActionListener(this.actionItemBajaPaciente);
		getItemConsultaMedico().addActionListener(this.actionItemConsultaMedico);
		getItemAltaMedico().addActionListener(this.actionItemAltaMedico);
		getItemVerHistorial().addActionListener(this.actionItemVerHistorial);
		getItemCerrarOperacion().addActionListener(this.actionItemCerrarOperacion);
		getItemModificarPaciente().addActionListener(this.actionItemModificarPaciente);
		getItemConsultaPaciente().addActionListener(this.actionItemConsultaPaciente);
		getItemCitaEspecialista().addActionListener(this.actionItemCitaEspecialista);
		getItemAtenderCita().addActionListener(this.actionItemAtenderCita);
		getItemCitaPrimaria().addActionListener(this.actionItemCitaPrimaria);

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
