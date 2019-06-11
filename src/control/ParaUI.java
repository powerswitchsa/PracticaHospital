package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import java.util.HashMap;

import javax.swing.JComboBox;

import listener.btn.ActionAltaMedico;
import listener.btn.ActionAltaPaciente;
import listener.btn.ActionBajaPaciente;
import listener.btn.ActionCitaEspecialista;
import listener.btn.ActionCitaOperacion;
import listener.btn.ActionCitaPrimaria;
import listener.btn.ActionModificarPaciente;
import listener.combobox.CitaEspecialistaMedico;
import listener.combobox.CitaPrimariaMedico;
import listener.combobox.MostarCamposPaciente;
import listener.combobox.MostrarCamposMedico;
import listener.combobox.MostrarCitasTratamientos;
import listener.combobox.SincronizarComboBox;
import listener.item.ActionItemAltaPaciente;
import listener.item.ActionItemCitaOperacion;
import listener.item.ActionItemBajaPaciente;
import listener.item.ActionItemConsultaMedico;
import listener.item.ActionItemConsultaPaciente;
import listener.item.ActionItemModificarPaciente;
import listener.item.ActionItemVerHistorial;
import listener.item.ActionItemAltaMedico;
import listener.item.ActionItemAtenderCita;
import listener.item.ActionItemCerrarOperacion;
import listener.item.ActionItemCitaEspecialista;
import listener.item.ActionItemCitaPrimaria;
import modelo.Medico;
import modelo.Paciente;
import modelo.enums.Especialidad;
import vista.UI;

public class ParaUI extends UI {

	private Control control;

	public ParaUI() {
		super();
		this.control = new Control();
		getLabelFecha(this.control.getFecha());

		// actionlistener cambiar pestaña
		getItemAltaPaciente().addActionListener(new ActionItemAltaPaciente(this));
		getItemCitaOperacion().addActionListener(new ActionItemCitaOperacion(this));
		getItemBajaPaciente().addActionListener(new ActionItemBajaPaciente(this));
		getItemConsultaMedico().addActionListener(new ActionItemConsultaMedico(this));
		getItemAltaMedico().addActionListener(new ActionItemAltaMedico(getAltaMedico(), this));
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
		getCitaOperacion().getBtnAceptar().addActionListener(new ActionCitaOperacion(this));

		getConsultaPaciente().getComboBoxNombre()
				.addActionListener(new MostarCamposPaciente(getConsultaPaciente().getComboBoxID(),
						getConsultaPaciente().getComboBoxNombre(), control, false, getConsultaPaciente().getFields()));
		// Cita Operacion
		getCitaOperacion().getComboPaciente().addActionListener(new SincronizarComboBox(getCitaOperacion().getComboID(),
				getCitaOperacion().getComboPaciente(), control, false));
		getCitaOperacion().getComboID().addActionListener(new SincronizarComboBox(getCitaOperacion().getComboID(),
				getCitaOperacion().getComboPaciente(), control, true));
		// Baja Paciente
		getBajaPaciente().getComboBoxID().addActionListener(new SincronizarComboBox(getBajaPaciente().getComboBoxID(),
				getBajaPaciente().getComboBoxNombre(), control, true));
		getBajaPaciente().getComboBoxNombre()
				.addActionListener(new MostarCamposPaciente(getBajaPaciente().getComboBoxID(),
						getBajaPaciente().getComboBoxNombre(), control, false, getBajaPaciente().getCampos()));
		// Cita Especialista
		getCitaEspecialista().getComboBoxNombre().addActionListener(new SincronizarComboBox(
				getCitaEspecialista().getComboBoxID(), getCitaEspecialista().getComboBoxNombre(), control, false));
		getCitaEspecialista().getComboBoxID().addActionListener(new SincronizarComboBox(
				getCitaEspecialista().getComboBoxID(), getCitaEspecialista().getComboBoxNombre(), control, true));
		getCitaEspecialista().getComboNombreMedico().addActionListener(new CitaEspecialistaMedico(this));
		getCitaEspecialista().getBtnPedirCita().addActionListener(new ActionCitaEspecialista(getCitaEspecialista(), control));
		// Consulta Paciente
		getConsultaPaciente().getComboBoxNombre()
				.addActionListener(new MostarCamposPaciente(getConsultaPaciente().getComboBoxID(),
						getConsultaPaciente().getComboBoxNombre(), control, false, getConsultaPaciente().getFields()));
		getConsultaPaciente().getComboBoxID().addActionListener(new SincronizarComboBox(
				getConsultaPaciente().getComboBoxID(), getConsultaPaciente().getComboBoxNombre(), control, true));
		// Modificar Paciente
		getModificarPaciente().getComboBoxNombre()
				.addActionListener(new MostarCamposPaciente(getModificarPaciente().getComboBoxID(),
						getModificarPaciente().getComboBoxNombre(), control, false,
						getModificarPaciente().getCampos()));
		getModificarPaciente().getComboBoxID().addActionListener(new SincronizarComboBox(
				getModificarPaciente().getComboBoxID(), getModificarPaciente().getComboBoxNombre(), control, true));
		// Cita Primaria
		getCitaPrimaria().getComboBoxNombre().addActionListener(new SincronizarComboBox(
				getCitaPrimaria().getComboBoxID(), getCitaPrimaria().getComboBoxNombre(), control, false));
		getCitaPrimaria().getComboBoxID().addActionListener(new SincronizarComboBox(getCitaPrimaria().getComboBoxID(),
				getCitaPrimaria().getComboBoxNombre(), control, true));
		
		getCitaPrimaria().getBtnPedirCita()
				.addActionListener(new ActionCitaPrimaria(getCitaPrimaria(), control));

		// Consulta Medico
		getConsultaMedico().getComboBoxID()
				.addActionListener(new MostrarCamposMedico(getConsultaMedico().getComboBoxID(),
						getConsultaMedico().getComboNombreMedico(), control, true, getConsultaMedico().getFields()));
		getConsultaMedico().getComboNombreMedico()
				.addActionListener(new MostrarCamposMedico(getConsultaMedico().getComboBoxID(),
						getConsultaMedico().getComboNombreMedico(), control, false, getConsultaMedico().getFields()));
		// Cita Primaria
		getCitaPrimaria().getComboNombreMedico().addActionListener(new CitaPrimariaMedico(this));
		getCitaPrimaria().getComboBoxNombre().addActionListener(new SincronizarComboBox(
				getCitaPrimaria().getComboBoxID(), getCitaPrimaria().getComboBoxNombre(), control, false));
		// Ver Historial
		getVerHistorial().getComboBoxID()
				.addActionListener(new MostrarCitasTratamientos(getVerHistorial().getComboBoxID(),
						getVerHistorial().getComboBoxNombre(), control, true, getVerHistorial()));
		getVerHistorial().getComboBoxNombre()
				.addActionListener(new MostrarCitasTratamientos(getVerHistorial().getComboBoxID(),
						getVerHistorial().getComboBoxNombre(), control, false, getVerHistorial()));

		getBtnPasarHora().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				control.getPasarHora();
				getLabelFecha(control.getFecha());
			}
		});
	}

	public void rellenarComboBoxPaciente(JComboBox<String> id, JComboBox<String> nombre) {
		nombre.removeAllItems();
		id.removeAllItems();
		HashMap<String, Paciente> list = getControl().getMapPaciente();
		for (Paciente paciente : list.values()) {
			id.addItem(paciente.getId());
			nombre.addItem(paciente.getFullName());
		}
	}

	public void rellenarComboBoxMedico(JComboBox<String> id, JComboBox<String> nombre) {
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
			especial.addItem(medico.getFullName());
		}
	}

	public Control getControl() {
		return control;
	}

}
