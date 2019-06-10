package listener.btn;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JComboBox;

import control.Control;
import control.ParaUI;
import listener.combobox.SincronizarComboBox;

public class ActionCitaPrimaria implements ActionListener {
	private String nombreMedico;
	private String coordenada;
	private String idPaciente;
	private Control control;
	private String dia;
	private String hora;

	public ActionCitaPrimaria(String nombreMedico, String coordenada, String idPaciente,Control control,String dia,String hora) {
		super();
		this.nombreMedico = nombreMedico;
		this.coordenada = coordenada;
		this.idPaciente = idPaciente;
		this.control = control;
		this.dia = dia;
		this.hora = hora;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		String cadena = this.dia+";"+this.hora;
		this.control.getCitaPrimaria(this.idPaciente, this.nombreMedico, this.coordenada,cadena);
	}
}
