package control;

import vista.UI;

public class ParaUI extends UI {

	private Control control;

	public ParaUI() {
		super();
		this.control = new Control();
		control.getCitaOperacion(getCitaOperacion());
	}

}
