package vista;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import vista.medico.AltaMedico;
import vista.medico.ConsultaMedico;
import vista.operacion.CerrarOperacion;
import vista.paciente.AltaPaciente;
import vista.paciente.BajaPaciente;
import vista.paciente.CitaEspecialista;
import vista.paciente.CitaOperacion;
import vista.paciente.ConsultaPaciente;
import vista.paciente.ModificarPaciente;
import vista.paciente.VerHistorial;

import java.awt.CardLayout;
import javax.swing.JMenu;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class UI extends JFrame {

	private JPanel contentPane;

	private Color colorFondo = new Color(133, 200, 255);
	private String tipoLetra = "Monospaced";
	private int letraPequena = 20;
	private int letraGrande = 35;

	private AltaPaciente altaPaciente = new AltaPaciente(colorFondo, letraPequena, letraGrande, tipoLetra);
	private CitaOperacion citaOperacion = new CitaOperacion(colorFondo, letraPequena, letraGrande, tipoLetra);
	private BajaPaciente bajaPaciente = new BajaPaciente(colorFondo, letraPequena, letraGrande, tipoLetra);
	private ConsultaMedico consultaMedico = new ConsultaMedico(colorFondo, letraPequena, letraGrande, tipoLetra);
	private ConsultaPaciente consultaPaciente = new ConsultaPaciente(colorFondo, letraPequena, letraGrande, tipoLetra);
	private AltaMedico altaMedico = new AltaMedico(colorFondo, letraPequena, letraGrande, tipoLetra);
	private VerHistorial verHistorial = new VerHistorial(colorFondo, letraPequena, letraGrande, tipoLetra);
	private CerrarOperacion cerrarOperacion = new CerrarOperacion(colorFondo, letraPequena, letraGrande, tipoLetra);
	private ModificarPaciente modificarPaciente = new ModificarPaciente(colorFondo, letraPequena, letraGrande,
			tipoLetra);
	private CitaEspecialista citaEspecialista = new CitaEspecialista(colorFondo, letraPequena, letraGrande, tipoLetra);

	private JMenu jmenuPaciente;
	private JMenu jmenuMedico;
	private JMenu jmenuOperacion;

	private JMenuItem item1 = new JMenuItem("Alta Paciente");
	private JMenuItem item2 = new JMenuItem("Cita Operacion");
	private JMenuItem item3 = new JMenuItem("Baja Paciente");
	private JMenuItem item4 = new JMenuItem("Consulta Medico");
	private JMenuItem item5 = new JMenuItem("Alta Medico");
	private JMenuItem item6 = new JMenuItem("Ver Historial");
	private JMenuItem item7 = new JMenuItem("Cerrar Operacion");
	private JMenuItem item8 = new JMenuItem("Modificar Paciente");
	private JMenuItem item9 = new JMenuItem("Consulta Paciente");
	private JMenuItem item10 = new JMenuItem("Cita Especialista");

	public UI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 800);
		setLocationRelativeTo(null);
		setResizable(true);
		contentPane = new JPanel();
		contentPane.setBackground(colorFondo);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new CardLayout(0, 0));
//		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setResizable(true);
		setContentPane(contentPane);
		setBackground(colorFondo);
		setVisible(true);
		// ----------------------------------------------
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		// ----------------------------------------------
		jmenuPaciente = new JMenu("Paciente");
		jmenuPaciente.setForeground(Color.BLACK);
		jmenuPaciente.setFont(new Font(this.tipoLetra, Font.PLAIN, 20));
		menuBar.add(jmenuPaciente);
		jmenuMedico = new JMenu("Medico");
		jmenuMedico.setForeground(Color.BLACK);
		jmenuMedico.setFont(new Font(this.tipoLetra, Font.PLAIN, 20));
		menuBar.add(jmenuMedico);
		jmenuOperacion = new JMenu("Operacion");
		jmenuOperacion.setForeground(Color.BLACK);
		jmenuOperacion.setFont(new Font(this.tipoLetra, Font.PLAIN, 20));
		menuBar.add(jmenuOperacion);
		// ----------------------------------------------

		this.contentPane.add(this.altaPaciente, "altaPaciente");
		this.contentPane.add(this.citaOperacion, "citaOperacion");
		this.contentPane.add(this.bajaPaciente, "bajaPaciente");
		this.contentPane.add(this.consultaMedico, "altaMedico");
		this.contentPane.add(this.altaMedico, "consultaMedico");
		this.contentPane.add(this.verHistorial, "verHistorial");
		this.contentPane.add(this.cerrarOperacion, "cerrarOperacion");
		this.contentPane.add(this.modificarPaciente, "modificarPaciente");
		this.contentPane.add(this.consultaPaciente, "consultaPaciente");
		this.contentPane.add(this.citaEspecialista, "citaEspecialista");

		incluirItem(jmenuPaciente, item1);
		incluirItem(jmenuPaciente, item2);
		incluirItem(jmenuPaciente, item3);
		incluirItem(jmenuMedico, item4);
		incluirItem(jmenuMedico, item5);
		incluirItem(jmenuPaciente, item6);
		incluirItem(jmenuOperacion, item7);
		incluirItem(jmenuPaciente, item8);
		incluirItem(jmenuPaciente, item9);
		incluirItem(jmenuPaciente, item10);

	}

	private void incluirItem(JMenu menu, JMenuItem item) {
		item.setFont(new Font(this.tipoLetra, Font.BOLD, 20));
		item.setForeground(new Color(22, 85, 148));
		item.setBackground(Color.WHITE);
		menu.add(item);
	}
	
	

	public CitaEspecialista getCitaEspecialista() {
		return citaEspecialista;
	}

	public JMenuItem getItem10() {
		return item10;
	}

	public JMenu getJmenuPaciente() {
		return jmenuPaciente;
	}

	public JMenu getJmenuMedico() {
		return jmenuMedico;
	}

	public JMenuItem getItem9() {
		return item9;
	}

	public JMenu getJmenuOperacion() {
		return jmenuOperacion;
	}

	public void asociarPanel(String string) {
		((CardLayout) contentPane.getLayout()).show(contentPane, string);
	}

	public AltaPaciente getAltaPaciente() {
		return altaPaciente;
	}

	public CitaOperacion getCitaOperacion() {
		return citaOperacion;
	}

	public ConsultaPaciente getConsultaPaciente() {
		return consultaPaciente;
	}

	public BajaPaciente getBajaPaciente() {
		return bajaPaciente;
	}

	public ConsultaMedico getConsultaMedico() {
		return consultaMedico;
	}

	public ModificarPaciente getModificarPaciente() {
		return modificarPaciente;
	}

	public AltaMedico getAltaMedico() {
		return altaMedico;
	}

	public VerHistorial getVerHistorial() {
		return verHistorial;
	}

	public JMenuItem getItem1() {
		return item1;
	}

	public JMenuItem getItem2() {
		return item2;
	}

	public JMenuItem getItem3() {
		return item3;
	}

	public JMenuItem getItem4() {
		return item4;
	}

	public JMenuItem getItem5() {
		return item5;
	}

	public JMenuItem getItem6() {
		return item6;
	}

	public JMenuItem getItem7() {
		return item7;
	}

	public JMenuItem getItem8() {
		return item8;
	}

}
