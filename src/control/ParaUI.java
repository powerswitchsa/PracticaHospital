package control;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import modelo.Especialidad;
import vista.VentanaUI;

public class ParaUI extends VentanaUI {

	private Control control;

	public ParaUI() {
		super();
		this.control = new Control();
		listener();
	}

	private void listener() {

		getAltaMedico().getBtnAceptar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});

		getAltaMedico().getBtnAceptar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});

		// Para actualizar jcombo
		getItem1().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				asociarPanel("altaPaciente");
				getAltaPaciente().getMensajeSistema().setText("caca");
			}
		});

		getItem2().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				asociarPanel("citaOperacion");
			}
		});

		getItem3().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				asociarPanel("bajaPaciente");
			}
		});

		getItem4().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				asociarPanel("altaMedico");
			}
		});

		getItem5().addActionListener(new ActionListener() {
			@SuppressWarnings("unchecked")
			public void actionPerformed(ActionEvent e) {
				asociarPanel("consultaMedico");
				getAltaMedico().getComboConsulta().removeAllItems();
				getAltaMedico().getComboEspecilidad().removeAllItems();
				ArrayList<Integer>idConsulta = control.getVacanteConsulta();
				for (Integer id : idConsulta) {
					getAltaMedico().getComboConsulta().addItem(id);
				}
				for (Especialidad especial : Especialidad.values()) {
					getAltaMedico().getComboEspecilidad().addItem(especial);
			}
				//				hacer horario
			}
		});
		
		getItem6().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				asociarPanel("verHistorial");
			}
		});
		getItem7().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				asociarPanel("cerrarOperacion");
			}
		});
	}
}
