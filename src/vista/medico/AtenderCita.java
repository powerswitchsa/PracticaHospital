package vista.medico;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.SwingConstants;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.MatteBorder;
import javax.swing.JTextArea;
import javax.swing.BoxLayout;

public class AtenderCita extends JPanel {

	private JTextArea textArea;
	private JComboBox comboBoxMedico;
	private JTextField textNombrePaciente;
	private JComboBox comboBoxMedicamento;
	private JTextField textFieldDosis;
	private JTextField textFieldPeriodo;
	private JButton btnAtender;

	public AtenderCita(Color color, int letraPequena, int letraGrande, String tipoLetra) {
		setBackground(color);
		setBorder(null);
		JLabel lblNewLabel = new JLabel("Atender Cita");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Monospaced", Font.BOLD, 30));

		JPanel panel = new JPanel();
		panel.setBackground(color);

		btnAtender = new JButton("Atender");

		JLabel lblNewLabel_1 = new JLabel("Observaciones");
		lblNewLabel_1.setFont(new Font("Monospaced", Font.PLAIN, 20));

		textArea = new JTextArea();
		textArea.setLineWrap(true);
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 20));
		textArea.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.TRAILING).addGroup(groupLayout
				.createSequentialGroup()
				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup().addGap(60)
								.addComponent(panel, GroupLayout.PREFERRED_SIZE, 398, GroupLayout.PREFERRED_SIZE)
								.addGap(30)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
												.addPreferredGap(ComponentPlacement.RELATED, 232, Short.MAX_VALUE)
												.addComponent(btnAtender, GroupLayout.PREFERRED_SIZE, 100,
														GroupLayout.PREFERRED_SIZE))
										.addGroup(Alignment.TRAILING,
												groupLayout.createParallelGroup(Alignment.LEADING)
														.addComponent(lblNewLabel_1).addComponent(textArea,
																GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE))))
						.addGroup(groupLayout.createSequentialGroup().addGap(20).addComponent(lblNewLabel,
								GroupLayout.DEFAULT_SIZE, 892, Short.MAX_VALUE)))
				.addGap(30)));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup().addGap(20)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
						.addGap(39).addComponent(lblNewLabel_1).addGap(20)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(panel, GroupLayout.DEFAULT_SIZE, 524, Short.MAX_VALUE)
								.addComponent(textArea, GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE))
						.addGap(20)
						.addComponent(btnAtender, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addContainerGap()));

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(color);
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(color);
		JLabel lblNewLabel_4 = new JLabel("Tratamiento");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 20));

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(color);
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(color);
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(color);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup().addGap(20)
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING, gl_panel
								.createSequentialGroup().addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
										.addComponent(
												panel_4, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 356,
												Short.MAX_VALUE)
										.addGroup(gl_panel.createSequentialGroup()
												.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
														.addComponent(panel_3, Alignment.LEADING,
																GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
														.addComponent(panel_1, Alignment.LEADING,
																GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
														.addComponent(panel_2, Alignment.LEADING,
																GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
														.addComponent(lblNewLabel_4, Alignment.LEADING,
																GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE))))
								.addGap(20)).addGroup(
										gl_panel.createSequentialGroup().addComponent(panel_5, GroupLayout.DEFAULT_SIZE,
												GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addGap(20)))));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup().addGap(20)
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE).addGap(30)
						.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE).addGap(50)
						.addComponent(lblNewLabel_4).addGap(30)
						.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE).addGap(40)
						.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE).addGap(40)
						.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(123, Short.MAX_VALUE)));
		panel_5.setLayout(new BoxLayout(panel_5, BoxLayout.X_AXIS));

		JLabel lblPeriodo = new JLabel("Periodo :   ");
		lblPeriodo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_5.add(lblPeriodo);

		textFieldPeriodo = new JTextField();
		textFieldPeriodo.setColumns(10);
		panel_5.add(textFieldPeriodo);
		panel_4.setLayout(new BoxLayout(panel_4, BoxLayout.X_AXIS));

		JLabel lblDosis = new JLabel("Dosis :      ");
		lblDosis.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_4.add(lblDosis);

		textFieldDosis = new JTextField();
		textFieldDosis.setColumns(10);
		panel_4.add(textFieldDosis);
		panel_3.setLayout(new BoxLayout(panel_3, BoxLayout.X_AXIS));

		JLabel lblNewLabel_5 = new JLabel("Medicina : ");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_3.add(lblNewLabel_5);

		comboBoxMedicamento = new JComboBox();
		panel_3.add(comboBoxMedicamento);
		panel_2.setLayout(new BoxLayout(panel_2, BoxLayout.X_AXIS));

		JLabel lblNewLabel_3 = new JLabel("Paciente : ");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_2.add(lblNewLabel_3);

		textNombrePaciente = new JTextField();
		textNombrePaciente.setFocusable(false);
		panel_2.add(textNombrePaciente);
		textNombrePaciente.setColumns(10);
		panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.X_AXIS));

		JLabel lblNewLabel_2 = new JLabel("Medico :   ");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_1.add(lblNewLabel_2);

		comboBoxMedico = new JComboBox();
		panel_1.add(comboBoxMedico);
		panel.setLayout(gl_panel);
		setLayout(groupLayout);

	}

	public JTextArea getTextArea() {
		return textArea;
	}

	public JComboBox getComboBoxMedico() {
		return comboBoxMedico;
	}

	public JTextField getTextNombrePaciente() {
		return textNombrePaciente;
	}

	public JComboBox getComboBoxMedicamento() {
		return comboBoxMedicamento;
	}

	public JTextField getTextFieldDosis() {
		return textFieldDosis;
	}

	public JTextField getTextFieldPeriodo() {
		return textFieldPeriodo;
	}

	public JButton getBtnAtender() {
		return btnAtender;
	}

}
