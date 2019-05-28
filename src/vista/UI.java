package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.ArrayList;

import javax.swing.ComboBoxEditor;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelo.Medico;
import vista.medico.ConsultaMedico;
import vista.paciente.AltaPaciente;
import vista.paciente.CitaOperacion;

public class UI extends JFrame {

	private JPanel contentPane;

	private Color colorFondo = new Color(133, 200, 255);
	private int letraPequena = 20;
	private int letraGrande = 40;
	private String tipoLetra = "Monospaced";

	private AltaPaciente altaPaciente = new AltaPaciente(colorFondo, letraPequena, letraGrande, tipoLetra);
	private CitaOperacion citaOperacion = new CitaOperacion(colorFondo, letraPequena, letraGrande, tipoLetra);
	private ConsultaMedico consultaMedico = new ConsultaMedico(colorFondo, letraPequena, letraGrande, tipoLetra);

	public UI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBackground(colorFondo);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		setLocationRelativeTo(null);
//		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setResizable(false);
//		contentPane.add(this.citaOperacion, BorderLayout.CENTER);
//		contentPane.add(this.altaPaciente, BorderLayout.CENTER);
		contentPane.add(this.consultaMedico, BorderLayout.CENTER);
	}

	public AltaPaciente getAltaPaciente() {
		return altaPaciente;
	}

	public CitaOperacion getCitaOperacion() {
		return citaOperacion;
	}

}
