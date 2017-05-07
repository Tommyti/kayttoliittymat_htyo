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
import javax.swing.border.EtchedBorder;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.CardLayout;
import javax.swing.JButton;
import java.awt.Dimension;

public class HallintaIkkuna {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HallintaIkkuna window = new HallintaIkkuna();
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
	public HallintaIkkuna() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 760, 620);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		
		JPanel panel_v = new JPanel();
		panel_v.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_v.setLayout(new MigLayout("", "[80.00,fill]", "[][][]"));
		
		JPanel panel_o = new JPanel();
		panel_o.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_o.setLayout(new CardLayout(0, 0));
		
		JPanel pElokuvat = new JPanel();
		panel_o.add(pElokuvat, "name_8798620138455");
		
		JPanel pNaytokset = new JPanel();
		panel_o.add(pNaytokset, "name_8798626984432");
		
		JPanel pKayttajat = new JPanel();
		panel_o.add(pKayttajat, "name_8798634130680");
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_v, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_o, GroupLayout.DEFAULT_SIZE, 629, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_o, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE)
						.addComponent(panel_v, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE))
					.addContainerGap())
		);
		
		JButton button = new JButton("Elokuvat");
		button.setSize(new Dimension(83, 23));
		button.setPreferredSize(new Dimension(83, 23));
		panel_v.add(button, "cell 0 0");
		
		JButton button_1 = new JButton("N\u00E4yt\u00F6kset");
		button_1.setSize(new Dimension(83, 23));
		button_1.setPreferredSize(new Dimension(83, 23));
		panel_v.add(button_1, "cell 0 1");
		
		JButton button_2 = new JButton("K\u00E4ytt\u00E4j\u00E4t");
		button_2.setSize(new Dimension(83, 23));
		button_2.setPreferredSize(new Dimension(83, 23));
		panel_v.add(button_2, "cell 0 2");
		panel.setLayout(gl_panel);
	}

}
