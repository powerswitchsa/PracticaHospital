package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import net.miginfocom.swing.MigLayout;
import java.awt.FlowLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.BoxLayout;

public class vistaEleccion extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vistaEleccion frame = new vistaEleccion();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	JButton btnMedico;
	JButton btnPaciente;
	ImageIcon paciente = new ImageIcon("Clients-icon.png");
	ImageIcon medico = new ImageIcon("Doctor.png");
	JLabel lblPaciente; 
	JLabel lblMedico;
	public vistaEleccion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 790, 564);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("BIENVENIDO");
		lblNewLabel.setBounds(10, 49, 759, 79);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 34));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		btnPaciente = new JButton("");
		btnMedico = new JButton("");
		btnPaciente.setBounds(191, 187, 191, 189);
		contentPane.setLayout(null);
		contentPane.add(lblNewLabel);
		contentPane.add(btnPaciente);
		
		btnMedico.setBounds(417, 187, 191, 189);
		contentPane.add(btnMedico);
		
		
		//toqueteo
		setResizable(false);
		btnMedico.setBorder(new RoundedBorder(30));
		btnPaciente.setBorder(new RoundedBorder(30));
		btnMedico.setIcon(new ImageIcon(medico.getImage().getScaledInstance(btnMedico.getWidth(), btnMedico.getHeight(), Image.SCALE_SMOOTH)));
		btnPaciente.setIcon(new ImageIcon(paciente.getImage().getScaledInstance(btnPaciente.getWidth(), btnPaciente.getHeight(), Image.SCALE_SMOOTH)));
		lblPaciente = new JLabel("PACIENTE");
		lblPaciente.setBounds(267, 162, 70, 14);
		contentPane.add(lblPaciente);
		lblMedico = new JLabel("MEDICO");
		lblMedico.setBounds(490, 162, 46, 14);
		contentPane.add(lblMedico);
		contentPane.setBackground(Color.white);
		btnPaciente.setBackground(Color.WHITE);
		btnMedico.setBackground(Color.WHITE);
		btnPaciente.setFocusPainted(false);
		btnMedico.setFocusPainted(false);
	}
	
	class RoundedBorder implements Border {

	    private int radio;

	    RoundedBorder(int radio) {
	        this.radio = radio;
	    }

	    public Insets getBorderInsets(Component c) {
	        return new Insets(this.radio+1, this.radio+1, this.radio+2, this.radio);
	    }

	    public boolean isBorderOpaque() {
	        return true;
	    }

	    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
	        g.drawRoundRect(x, y, width-1, height-1, radio, radio);
	    }
	}
}
