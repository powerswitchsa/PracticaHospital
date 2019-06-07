package control;

import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JComboBox;

import listener.btn.ActionAltaMedico;
import listener.btn.ActionAltaPaciente;
import listener.btn.ActionBajaPaciente;
import listener.btn.ActionModificarPaciente;
import listener.combobox.BajaPacienteID;
import listener.combobox.BajaPacienteNombre;
import listener.combobox.CitaEspecialistaID;
import listener.combobox.CitaEspecialistaMedico;
import listener.combobox.CitaEspecialistaNombre;
import listener.combobox.CitaOperacionID;
import listener.combobox.CitaOperacionNombre;
import listener.combobox.CitaPrimariaID;
import listener.combobox.CitaPrimariaNombre;
import listener.combobox.ConsultaMedicoID;
import listener.combobox.ConsultaMedicoNombre;
import listener.combobox.ConsultaPacienteNombre;
import listener.combobox.ConsultarPacienteID;
import listener.combobox.ModificarPacienteID;
import listener.combobox.ModificarPacienteNombre;
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
import modelo.Cita;
import modelo.Medico;
import modelo.Paciente;
import modelo.enums.Especialidad;
import modelo.enums.TipoOperacion;
import vista.UI;

public class ParaUI extends UI {

	private Control control;

	public ParaUI() {
		super();
		this.control = new Control();
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
		getBajaPaciente().getBtnDarBaja().addActionListener(new ActionBajaPaciente(this));
		// actionlistener combobox
		getModificarPaciente().getComboBoxID().addActionListener(new ModificarPacienteID(this));
		getConsultaMedico().getComboBoxID().addActionListener(new ConsultaMedicoID(this));
		getBajaPaciente().getComboBoxID().addActionListener(new BajaPacienteID(this));
		getConsultaPaciente().getComboBoxID().addActionListener(new ConsultarPacienteID(this));
		getConsultaPaciente().getComboBoxNombre().addActionListener(new ConsultaPacienteNombre(this));
		getBajaPaciente().getComboBoxNombre().addActionListener(new BajaPacienteNombre(this));
		getModificarPaciente().getComboBoxNombre().addActionListener(new ModificarPacienteNombre(this));
		getCitaOperacion().getComboID().addActionListener(new CitaOperacionID(this));
		getCitaOperacion().getComboPaciente().addActionListener(new CitaOperacionNombre(this));
		getCitaEspecialista().getComboBoxID().addActionListener(new CitaEspecialistaID(this));
		getCitaEspecialista().getComboBoxNombre().addActionListener(new CitaEspecialistaNombre(this));
		getCitaEspecialista().getComboBoxNombre().addActionListener(new CitaEspecialistaMedico(this));
		getConsultaMedico().getComboBoxID().addActionListener(new ConsultaMedicoID(this));
		getConsultaMedico().getComboNombreMedico().addActionListener(new ConsultaMedicoNombre(this));
		getCitaPrimaria().getComboBoxID().addActionListener(new CitaPrimariaID(this));
		getCitaPrimaria().getComboBoxNombre().addActionListener(new CitaPrimariaNombre(this));
		getConsultaMedico().getComboNombreMedico().addActionListener(new ConsultaMedicoNombre(this));
		getCitaPrimaria().getComboBoxID().addActionListener(new CitaPrimariaID(this));

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
			nombre.addItem(medico.getFullName());
		}
	}

	public void rellenarEspecialidadMedico(JComboBox especial, Especialidad especialidad) {
		especial.removeAllItems();
		ArrayList<Medico> medicos = this.getControl().getEspecialidadMedico(especialidad);
		for (Medico medico : medicos) {
			especial.addItem(medico);
		}
	}

	public Control getControl() {
		return control;
	}
}
