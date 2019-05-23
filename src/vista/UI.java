package vista;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import vista.paciente.AltaPaciente;

public class UI extends JFrame {

	private JPanel contentPane;

	private Color colorFondo = new Color(133, 200, 255);
	private int letraPequena = 30;
	private int letraGrande = 40;
	private String tipoLetra = "Monospaced";

	private AltaPaciente altaPaciente = new AltaPaciente(colorFondo, letraPequena, letraGrande, tipoLetra);

	public UI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 900);
		contentPane = new JPanel();
		contentPane.setBackground(colorFondo);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.add(this.altaPaciente, BorderLayout.CENTER);
		setLocationRelativeTo(null);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
	}

}
