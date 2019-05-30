package vista;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import vista.medico.AltaMedico;
import vista.medico.ConsultaMedico;
import vista.paciente.AltaPaciente;
import vista.paciente.BajaPaciente;
import vista.paciente.CitaOperacion;
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
	private int letraPequena = 20;
	private int letraGrande = 35;
	private String tipoLetra = "Monospaced";

	private AltaPaciente altaPaciente = new AltaPaciente(colorFondo, letraPequena, letraGrande, tipoLetra);
	private CitaOperacion citaOperacion = new CitaOperacion(colorFondo, letraPequena, letraGrande, tipoLetra);
	private BajaPaciente bajaPaciente = new BajaPaciente(colorFondo, letraPequena, letraGrande, tipoLetra);
	private ConsultaMedico consultaMedico = new ConsultaMedico(colorFondo, letraPequena, letraGrande, tipoLetra);
	private AltaMedico altaMedico = new AltaMedico(colorFondo, letraPequena, letraGrande, tipoLetra);
	private VerHistorial verHistorial = new VerHistorial(colorFondo, letraPequena , letraGrande , tipoLetra);

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
		// ----------------------------------------------
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		// ----------------------------------------------
		JMenu jmenuPaciente = new JMenu("Paciente");
		jmenuPaciente.setForeground(Color.BLACK);
		jmenuPaciente.setFont(new Font(this.tipoLetra, Font.PLAIN, 20));
		menuBar.add(jmenuPaciente);
		JMenu jmenuMedico = new JMenu("Medico");
		jmenuMedico.setForeground(Color.BLACK);
		jmenuMedico.setFont(new Font(this.tipoLetra, Font.PLAIN, 20));
		menuBar.add(jmenuMedico);
		JMenu jmenuOperacion = new JMenu("Operacion");
		jmenuOperacion.setForeground(Color.BLACK);
		jmenuOperacion.setFont(new Font(this.tipoLetra, Font.PLAIN, 20));
		menuBar.add(jmenuOperacion);
		// ----------------------------------------------
		meterPanel(this.altaPaciente, jmenuPaciente, "altaPaciente", "Alta Paciente");
		meterPanel(this.citaOperacion, jmenuPaciente, "citaOperacion", "Cita Operacion");
		meterPanel(this.bajaPaciente, jmenuPaciente, "bajaPaciente", "Baja Paciente");
		meterPanel(this.altaMedico, jmenuMedico, "altaMedico", "Alta Medico");
		meterPanel(this.consultaMedico, jmenuMedico, "consultaMedico", "Consulta Medico");
		meterPanel(this.verHistorial, jmenuPaciente, "verHistorial", "Historial Paciente");
	}

	private void meterPanel(JPanel jPanel, JMenu menu, String nombre, String nombreVisible) {
		this.contentPane.add(jPanel, nombre);
		JMenuItem jmenuitem = new JMenuItem(nombreVisible);
		jmenuitem.setFont(new Font(this.tipoLetra, Font.BOLD, 20));
		jmenuitem.setForeground(new Color(22, 85, 148));
		jmenuitem.setBackground(Color.WHITE);
		jmenuitem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				asociarPanel(nombre);
			}
		});
		menu.add(jmenuitem);
	}

	private void asociarPanel(String string) {
		((CardLayout) contentPane.getLayout()).show(contentPane, string);
	}

}
