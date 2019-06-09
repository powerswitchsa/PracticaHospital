package control;

import java.util.ArrayList;

import java.util.HashMap;

import javax.swing.JComboBox;

import listener.btn.ActionAltaMedico;
import listener.btn.ActionAltaPaciente;
import listener.btn.ActionBajaPaciente;
import listener.btn.ActionCitaPrimaria;
import listener.btn.ActionModificarPaciente;
import listener.combobox.CitaEspecialistaMedico;
import listener.combobox.CitaPrimariaMedico;
import listener.combobox.MostarCamposPaciente;
import listener.combobox.SincronizarComboBox;
import listener.item.ActionItemAltaPaciente;
import listener.item.ActionItemCitaOperacion;
import listener.item.ActionItemBajaPaciente;
import listener.item.ActionItemConsultaMedico;
import listener.item.ActionItemConsultaPaciente;
import listener.item.ActionItemModificarPaciente;
import listener.item.ActionItemVerHistorial;
import listener.item.ActionItemAltaMedico;
import listener.item.ActionItemAltaPaciente;
import listener.item.ActionItemAtenderCita;
import listener.item.ActionItemBajaPaciente;
import listener.item.ActionItemCerrarOperacion;
import listener.item.ActionItemCitaEspecialista;
import listener.item.ActionItemCitaOperacion;
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
		getCitaPrimaria().getBtnPedirCita()
				.addActionListener(new ActionCitaPrimaria(getCitaPrimaria().getNombreMedico(),
						getCitaPrimaria().getCoordenada(), getCitaPrimaria().getIDPaciente(), control,
						getCitaPrimaria().getDia(), getCitaPrimaria().getHora()));
		// actionlistener combobox
		getConsultaPaciente().getComboBoxNombre()
				.addActionListener(new MostarCamposPaciente(getConsultaPaciente().getComboBoxID(),
						getConsultaPaciente().getComboBoxNombre(), control, false, getConsultaPaciente().getFields()));
		getBajaPaciente().getComboBoxNombre()
				.addActionListener(new MostarCamposPaciente(getBajaPaciente().getComboBoxID(),
						getBajaPaciente().getComboBoxNombre(), control, false, getBajaPaciente().getCampos()));
		getModificarPaciente().getComboBoxNombre()
				.addActionListener(new MostarCamposPaciente(getModificarPaciente().getComboBoxID(),
						getModificarPaciente().getComboBoxNombre(), control, false,
						getModificarPaciente().getCampos()));
		getCitaOperacion().getComboPaciente().addActionListener(new SincronizarComboBox(getCitaOperacion().getComboID(),
				getCitaOperacion().getComboPaciente(), control, false));
		getCitaEspecialista().getComboBoxNombre().addActionListener(new SincronizarComboBox(
				getCitaEspecialista().getComboBoxID(), getCitaEspecialista().getComboBoxNombre(), control, false));
		getCitaPrimaria().getComboBoxNombre().addActionListener(new SincronizarComboBox(
				getCitaPrimaria().getComboBoxID(), getCitaPrimaria().getComboBoxNombre(), control, false));
		getConsultaMedico().getComboNombreMedico().addActionListener(new SincronizarComboBox(
				getConsultaMedico().getComboBoxID(), getConsultaMedico().getComboNombreMedico(), control, false));
		getCitaPrimaria().getComboBoxNombre().addActionListener(new SincronizarComboBox(
				getCitaPrimaria().getComboBoxID(), getCitaPrimaria().getComboBoxNombre(), control, false));

		getBajaPaciente().getComboBoxID().addActionListener(new SincronizarComboBox(getBajaPaciente().getComboBoxID(),
				getBajaPaciente().getComboBoxNombre(), control, true));
		getCitaOperacion().getComboID().addActionListener(new SincronizarComboBox(getCitaOperacion().getComboID(),
				getCitaOperacion().getComboPaciente(), control, true));
		getCitaEspecialista().getComboBoxID().addActionListener(new SincronizarComboBox(
				getCitaEspecialista().getComboBoxID(), getCitaEspecialista().getComboBoxNombre(), control, true));
		getConsultaPaciente().getComboBoxID().addActionListener(new SincronizarComboBox(
				getConsultaPaciente().getComboBoxID(), getConsultaPaciente().getComboBoxNombre(), control, true));
		getModificarPaciente().getComboBoxID().addActionListener(new SincronizarComboBox(
				getModificarPaciente().getComboBoxID(), getModificarPaciente().getComboBoxNombre(), control, true));
		getConsultaMedico().getComboBoxID().addActionListener(new SincronizarComboBox(
				getConsultaMedico().getComboBoxID(), getConsultaMedico().getComboNombreMedico(), control, true));
		getCitaPrimaria().getComboBoxID().addActionListener(new SincronizarComboBox(getCitaPrimaria().getComboBoxID(),
				getCitaPrimaria().getComboBoxNombre(), control, true));
		getCitaPrimaria().getComboBoxID().addActionListener(new SincronizarComboBox(getCitaPrimaria().getComboBoxID(),
				getCitaPrimaria().getComboBoxNombre(), control, true));

		getCitaPrimaria().getComboNombreMedico().addActionListener(new CitaPrimariaMedico(this));
		getCitaEspecialista().getComboNombreMedico().addActionListener(new CitaEspecialistaMedico(this));
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
