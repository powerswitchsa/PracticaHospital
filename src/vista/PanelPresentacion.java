package vista;

import javax.swing.JPanel;

import java.awt.Image;
import java.awt.Panel;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class PanelPresentacion extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelPresentacion() {
	
		
		JButton btnNewButton = new JButton("Entrar");
//		ImageIcon imagen= new ImageIcon(getClass().getResource("/imgVista/pepeMedico.jpg"));
//		ImageIcon icono= new ImageIcon(imagen.getImage().getScaledInstance(PanelPresentacion.WIDTH,PanelPresentacion.HEIGHT, Image.SCALE_DEFAULT));
		
		JLabel lblNewLabel = new JLabel("HOSPITAL");
		lblNewLabel.setFont(new Font("MV Boli", Font.BOLD, 27));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblPowerswitcj = new JLabel("POWERSWITCH");
		lblPowerswitcj.setForeground(new Color(165, 42, 42));
		lblPowerswitcj.setFont(new Font("MV Boli", Font.BOLD, 37));
		lblPowerswitcj.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblAhoraConTests = new JLabel("Ahora con tests!");
		lblAhoraConTests.setFont(new Font("DialogInput", Font.PLAIN, 12));
		lblAhoraConTests.setHorizontalTextPosition(SwingConstants.CENTER);
		lblAhoraConTests.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addGap(190)
					.addComponent(lblAhoraConTests, GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
					.addGap(20))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addGap(66)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblPowerswitcj, GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
							.addGap(133)))
					.addGap(37))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(293, Short.MAX_VALUE)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 189, GroupLayout.PREFERRED_SIZE)
					.addGap(167))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addGap(35)
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
					.addGap(17)
					.addComponent(lblPowerswitcj, GroupLayout.PREFERRED_SIZE, 60, Short.MAX_VALUE)
					.addGap(30)
					.addComponent(lblAhoraConTests, GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnNewButton)
					.addGap(39))
		);
		setLayout(groupLayout);
	}
}
