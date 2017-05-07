package varausjarjestelma;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.LineBorder;
import java.awt.Color;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EtchedBorder;
import javax.swing.JProgressBar;
import java.awt.CardLayout;
import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.FlowLayout;

public class KayttajaIkkuna {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KayttajaIkkuna window = new KayttajaIkkuna();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public KayttajaIkkuna() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 760, 620);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		
		JPanel panel_o = new JPanel();
		panel_o.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_o.setLayout(new CardLayout(0, 0));
		
		JPanel pOhjelmisto = new JPanel();
		panel_o.add(pOhjelmisto, "name_14289592473550");
		
		JPanel panel_12 = new JPanel();
		
		JLabel lbllistaLeffoista = new JLabel("*Lista leffoista*");
		panel_12.add(lbllistaLeffoista);
		
		JPanel panel_13 = new JPanel();
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setText("Tietoa leffasta");
		panel_13.add(textPane_1);
		GroupLayout gl_pOhjelmisto = new GroupLayout(pOhjelmisto);
		gl_pOhjelmisto.setHorizontalGroup(
			gl_pOhjelmisto.createParallelGroup(Alignment.LEADING)
				.addGap(0, 623, Short.MAX_VALUE)
				.addGroup(gl_pOhjelmisto.createSequentialGroup()
					.addGroup(gl_pOhjelmisto.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pOhjelmisto.createSequentialGroup()
							.addGap(10)
							.addComponent(panel_12, GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE))
						.addGroup(gl_pOhjelmisto.createSequentialGroup()
							.addContainerGap()
							.addComponent(panel_13, GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)))
					.addContainerGap())
		);
		gl_pOhjelmisto.setVerticalGroup(
			gl_pOhjelmisto.createParallelGroup(Alignment.LEADING)
				.addGap(0, 539, Short.MAX_VALUE)
				.addGroup(gl_pOhjelmisto.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_12, GroupLayout.PREFERRED_SIZE, 298, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_13, GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
					.addContainerGap())
		);
		pOhjelmisto.setLayout(gl_pOhjelmisto);
		
		JPanel pTeatteri = new JPanel();
		panel_o.add(pTeatteri, "name_14289609666648");
		pTeatteri.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_2 = new JPanel();
		pTeatteri.add(panel_2, BorderLayout.NORTH);
		
		JLabel label_1 = new JLabel("Teatterin valinta");
		panel_2.add(label_1);
		
		JPanel panel_1 = new JPanel();
		pTeatteri.add(panel_1, BorderLayout.CENTER);
		
		JButton button_2 = new JButton("Teatteri #1");
		panel_1.add(button_2);
		
		JButton button_3 = new JButton("Teatteri #2");
		panel_1.add(button_3);
		
		JPanel pSali = new JPanel();
		panel_o.add(pSali, "name_14289617826345");
		pSali.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_3 = new JPanel();
		pSali.add(panel_3, BorderLayout.NORTH);
		
		JLabel label = new JLabel("Salin valinta");
		panel_3.add(label);
		
		JPanel panel_4 = new JPanel();
		pSali.add(panel_4, BorderLayout.CENTER);
		panel_4.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton button_4 = new JButton("Sali #1");
		panel_4.add(button_4);
		
		JButton button_5 = new JButton("Sali #2");
		panel_4.add(button_5);
		
		JPanel pPaikat = new JPanel();
		panel_o.add(pPaikat, "name_14289626280289");
		pPaikat.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_5 = new JPanel();
		pPaikat.add(panel_5, BorderLayout.CENTER);
		
		JButton button_6 = new JButton("1");
		
		JButton button_7 = new JButton("2");
		button_7.setActionCommand("2");
		
		JButton button_8 = new JButton("3");
		
		JButton button_9 = new JButton("4");
		
		JButton button_10 = new JButton("5");
		
		JButton button_11 = new JButton("6");
		
		JButton button_12 = new JButton("7");
		
		JButton button_13 = new JButton("8");
		
		JButton button_14 = new JButton("9");
		
		JButton button_15 = new JButton("10");
		
		JButton button_16 = new JButton("12");
		
		JButton button_17 = new JButton("13");
		
		JButton button_18 = new JButton("14");
		GroupLayout gl_panel_5 = new GroupLayout(panel_5);
		gl_panel_5.setHorizontalGroup(
			gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addGap(0, 623, Short.MAX_VALUE)
				.addGroup(gl_panel_5.createSequentialGroup()
					.addContainerGap()
					.addComponent(button_6)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(button_7, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(button_8)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(button_9)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(button_10)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(button_11)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(button_12)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(button_13)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(button_14)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(button_15)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(button_16)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(button_17)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(button_18)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_panel_5.setVerticalGroup(
			gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addGap(0, 515, Short.MAX_VALUE)
				.addGroup(gl_panel_5.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_5.createParallelGroup(Alignment.BASELINE)
						.addComponent(button_6)
						.addComponent(button_7)
						.addComponent(button_8)
						.addComponent(button_9)
						.addComponent(button_10)
						.addComponent(button_11)
						.addComponent(button_12)
						.addComponent(button_13)
						.addComponent(button_14)
						.addComponent(button_15)
						.addComponent(button_16)
						.addComponent(button_17)
						.addComponent(button_18))
					.addContainerGap(481, Short.MAX_VALUE))
		);
		panel_5.setLayout(gl_panel_5);
		
		JPanel panel_6 = new JPanel();
		pPaikat.add(panel_6, BorderLayout.NORTH);
		
		JLabel label_2 = new JLabel("Paikan valinta");
		panel_6.add(label_2);
		
		JPanel pVaraukset = new JPanel();
		panel_o.add(pVaraukset, "name_14289634823379");
		pVaraukset.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_7 = new JPanel();
		pVaraukset.add(panel_7, BorderLayout.NORTH);
		
		JLabel label_3 = new JLabel("Omat varaukset");
		panel_7.add(label_3);
		
		JPanel panel_8 = new JPanel();
		pVaraukset.add(panel_8, BorderLayout.CENTER);
		panel_8.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel pVarmennus = new JPanel();
		panel_o.add(pVarmennus, "name_14289643858889");
		
		JPanel panel_v = new JPanel();
		panel_v.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_v.setLayout(new MigLayout("", "[fill]", "[][]"));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_v, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_o, GroupLayout.PREFERRED_SIZE, 619, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_o, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 559, Short.MAX_VALUE)
						.addComponent(panel_v, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 559, Short.MAX_VALUE))
					.addContainerGap())
		);
		
		JButton button = new JButton("Ohjelmisto");
		button.setToolTipText("Elokuvat teatterissa");
		button.setSize(new Dimension(83, 23));
		panel_v.add(button, "cell 0 0");
		
		JButton button_1 = new JButton("Varaukset");
		button_1.setSize(new Dimension(83, 23));
		button_1.setPreferredSize(new Dimension(83, 23));
		button_1.setActionCommand("Varaukset");
		panel_v.add(button_1, "cell 0 1");
		panel.setLayout(gl_panel);
	}
}
