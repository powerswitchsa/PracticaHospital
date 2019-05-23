package vista.paciente;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.GridLayout;

import javax.swing.border.MatteBorder;

public class AltaPaciente extends JPanel {

	private String[] label = { "ID :", "Nombre :", "Apellidos :", "Direccion :", "Nacimiento :", "Telefono :" };
	private JTextField[] fields = new JTextField[this.label.length];
	private JPanel panelLabel = new JPanel();
	private JPanel panelText = new JPanel();
	private int letraPequena = 25;

	public AltaPaciente() {
		setVisible(true);
		setBackground(Color.WHITE);

		JLabel lblNewLabel = new JLabel("Alta Paciente");
		lblNewLabel.setFont(new Font("Monospaced", Font.BOLD, 40));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel lblMensajeDelSistema = new JLabel("Mensaje del sistema");
		lblMensajeDelSistema.setForeground(Color.RED);
		lblMensajeDelSistema.setHorizontalAlignment(SwingConstants.CENTER);
		lblMensajeDelSistema.setFont(new Font("Monospaced", Font.BOLD, letraPequena));

		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.setFont(new Font("Monospaced", Font.BOLD, letraPequena));

		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup().addGap(20)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 958, Short.MAX_VALUE).addGap(20))
				.addGroup(groupLayout.createSequentialGroup().addGap(100).addGroup(groupLayout
						.createParallelGroup(Alignment.LEADING)
						.addComponent(lblMensajeDelSistema, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 798,
								Short.MAX_VALUE)
						.addGroup(groupLayout.createSequentialGroup()
								.addComponent(panelLabel, GroupLayout.PREFERRED_SIZE, 231, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 164,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(panelText, GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE))))
						.addGap(100)));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup().addGap(20)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
						.addGap(30)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(panelLabel, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
								.addComponent(panelText, GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE))
						.addGap(18).addComponent(btnNewButton).addGap(25)
						.addComponent(lblMensajeDelSistema, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addGap(43)));
		panelLabel.setBackground(Color.WHITE);
		panelText.setBackground(Color.WHITE);
		panelText.setLayout(new GridLayout(1, 0, 0, 0));
		panelLabel.setLayout(new GridLayout(1, 0, 0, 0));
		setLayout(groupLayout);
		creandoVista();
		setVisible(true);
	}

	private void creandoVista() {
		Color color = new Color(133, 200, 255);
		this.panelLabel.setBackground(color);
		this.panelText.setBackground(color);
		setBackground(color);
		this.fields = new JTextField[this.label.length];
		panelText.setLayout(new GridLayout(this.label.length, 1, 30, 50));
		panelLabel.setLayout(new GridLayout(this.label.length, 1, 10, 50));
		for (int i = 0; i < fields.length; i++) {
			this.fields[i] = crearJText();
			this.panelLabel.add(crearLabel(this.label[i]));
			this.panelText.add(this.fields[i]);
		}
		revalidate();
	}

	private JTextField crearJText() {
		JTextField field = new JTextField();
		field.setText("");
		field.setFont(new Font("Monospaced", Font.BOLD, letraPequena));
		field.setHorizontalAlignment(SwingConstants.CENTER);
		field.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		return field;
	}

	private JLabel crearLabel(String cadena) {
		JLabel jLabel = new JLabel();
		jLabel.setText(cadena);
		jLabel.setFont(new Font("Monospaced", Font.BOLD, letraPequena));
		jLabel.setHorizontalAlignment(SwingConstants.CENTER);
		return jLabel;
	}
}
