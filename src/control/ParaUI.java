package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.UI;

public class ParaUI extends UI {

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

	}

}
