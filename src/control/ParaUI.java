package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.VentanaUI;

public class ParaUI extends VentanaUI {

	private Control control;

	public ParaUI() {
		super();
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
			public void actionPerformed(ActionEvent e) {
				asociarPanel("consultaMedico");
			}
		});

		getItem6().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				asociarPanel("verHistorial");
			}
		});

	}

}
