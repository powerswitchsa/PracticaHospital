package vista;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import vista.medico.AltaMedico;
import vista.medico.AtenderCita;
import vista.medico.ConsultaMedico;
import vista.operacion.CerrarOperacion;
import vista.paciente.AltaPaciente;
import vista.paciente.BajaPaciente;
import vista.paciente.CitaEspecialista;
import vista.paciente.CitaOperacion;
import vista.paciente.CitaPrimaria;
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
import javax.swing.BoxLayout;
import javax.swing.JSpinner;

public class UI extends JFrame {

	private JPanel contentPane;

	private Color colorFondo = new Color(133, 200, 255);
	private String tipoLetra = "Monospaced";
	private int letraPequena = 20;
	private int letraGrande = 35;

	private PanelPresentacion panelPresentacion = new PanelPresentacion();

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
	private AtenderCita atenderCita = new AtenderCita(colorFondo, letraPequena, letraGrande, tipoLetra);
	private CitaPrimaria citaPrimaria = new CitaPrimaria(colorFondo, letraPequena, letraGrande, tipoLetra);

	private JMenu jmenuPaciente;
	private JMenu jmenuMedico;
	private JMenu jmenuOperacion;

	private JMenuItem itemAltaPaciente = new JMenuItem("Alta Paciente");
	private JMenuItem itemCitaOperacion = new JMenuItem("Cita Operacion");
	private JMenuItem itemBajaPaciente = new JMenuItem("Baja Paciente");
	private JMenuItem itemAltaMedico = new JMenuItem("Alta Medico");
	private JMenuItem itemConsultaMedico = new JMenuItem("Consulta Medico");
	private JMenuItem itemVerHistorial = new JMenuItem("Ver Historial");
	private JMenuItem itemCerrarOperacion = new JMenuItem("Cerrar Operacion");
	private JMenuItem itemModificarPaciente = new JMenuItem("Modificar Paciente");
	private JMenuItem itemConsultaPaciente = new JMenuItem("Consulta Paciente");
	private JMenuItem itemCitaEspecialista = new JMenuItem("Cita Especialista");
	private JMenuItem itemAtenderCita = new JMenuItem("Atender Cita");
	private JMenuItem itemCitaPrimaria = new JMenuItem("Cita Primaria");

	private final JPanel panel = new JPanel();
	private final JSpinner spinner = new JSpinner();

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
		this.contentPane.add(this.panelPresentacion, "panelPresentacion");

		// ----------------------------------------------

		this.contentPane.add(this.altaPaciente, "altaPaciente");
		this.contentPane.add(this.citaOperacion, "citaOperacion");
		this.contentPane.add(this.bajaPaciente, "bajaPaciente");
		this.contentPane.add(this.consultaMedico, "consultaMedico");
		this.contentPane.add(this.altaMedico, "altaMedico");
		this.contentPane.add(this.verHistorial, "verHistorial");
		this.contentPane.add(this.cerrarOperacion, "cerrarOperacion");
		this.contentPane.add(this.modificarPaciente, "modificarPaciente");
		this.contentPane.add(this.consultaPaciente, "consultaPaciente");
		this.contentPane.add(this.citaEspecialista, "citaEspecialista");
		this.contentPane.add(this.atenderCita, "atenderCita");
		this.contentPane.add(this.citaPrimaria, "citaPrimaria");

		incluirItem(jmenuPaciente, itemAltaPaciente);
		incluirItem(jmenuPaciente, itemBajaPaciente);
		incluirItem(jmenuPaciente, itemModificarPaciente);
		incluirItem(jmenuPaciente, itemConsultaPaciente);
		incluirItem(jmenuPaciente, itemCitaOperacion);
		incluirItem(jmenuPaciente, itemCitaPrimaria);
		incluirItem(jmenuPaciente, itemCitaEspecialista);
		incluirItem(jmenuPaciente, itemVerHistorial);

		incluirItem(jmenuMedico, itemAltaMedico);
		incluirItem(jmenuMedico, itemConsultaMedico);
		incluirItem(jmenuMedico, itemAtenderCita);

		incluirItem(jmenuOperacion, itemCerrarOperacion);

		menuBar.add(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));

		panel.add(spinner);

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

	public AtenderCita getAtenderCita() {
		return atenderCita;
	}

	public JMenu getJmenuPaciente() {
		return jmenuPaciente;
	}

	public JMenu getJmenuMedico() {
		return jmenuMedico;
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

	public JPanel getContentPane() {
		return contentPane;
	}

	public CerrarOperacion getCerrarOperacion() {
		return cerrarOperacion;
	}

	public CitaPrimaria getCitaPrimaria() {
		return citaPrimaria;
	}

	public JMenuItem getItemAltaPaciente() {
		return itemAltaPaciente;
	}

	public JMenuItem getItemCitaOperacion() {
		return itemCitaOperacion;
	}

	public JMenuItem getItemBajaPaciente() {
		return itemBajaPaciente;
	}

	public JMenuItem getItemAltaMedico() {
		return itemAltaMedico;
	}

	public JMenuItem getItemConsultaMedico() {
		return itemConsultaMedico;
	}

	public JMenuItem getItemVerHistorial() {
		return itemVerHistorial;
	}

	public JMenuItem getItemCerrarOperacion() {
		return itemCerrarOperacion;
	}

	public JMenuItem getItemModificarPaciente() {
		return itemModificarPaciente;
	}

	public JMenuItem getItemConsultaPaciente() {
		return itemConsultaPaciente;
	}

	public JMenuItem getItemCitaEspecialista() {
		return itemCitaEspecialista;
	}

	public JMenuItem getItemAtenderCita() {
		return itemAtenderCita;
	}

	public JMenuItem getItemCitaPrimaria() {
		return itemCitaPrimaria;
	}

}
