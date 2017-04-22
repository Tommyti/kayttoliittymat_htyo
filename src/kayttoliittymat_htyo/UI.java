package kayttoliittymat_htyo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.JToolBar;
import javax.swing.JTextField;
import javax.swing.DropMode;
import java.awt.Component;
import com.jgoodies.forms.layout.*;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.JTextPane;
import net.miginfocom.swing.MigLayout;
import javax.swing.JFormattedTextField;
import java.awt.FlowLayout;
import javax.swing.JPasswordField;
import javax.swing.SpringLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import javax.imageio.ImageIO;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import javax.swing.Action;
import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JProgressBar;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JTabbedPane;
import java.awt.Dimension;
import javax.swing.BoxLayout;
/**
 * Tehty WindowBuilderilla.
 * @author Tommi
 *
 */
public class UI {

	private JFrame frame;
	private JTextField txtTunnus;
	private JPasswordField pwdSalasana;
	private final Action kirjaudu = new SwingAction();
	private JButton btnKirj;
	protected CardLayout CL;
	BufferedImage thehobbit;
	JLabel hobbitkuva;
    private ActionListener AL = new ActionListener() {
        public void actionPerformed(ActionEvent AE) {
          System.out.println("Nappia painettu");
        }
      };
    private JPanel panelOhjelmisto;
    private JPanel panelOhjelmisto_1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UI window = new UI();
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
	public UI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	protected void initialize() {
		frame = new JFrame();
		frame.setName("MainFrame");
		frame.setBounds(100, 100, 770, 660);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(CL = new CardLayout(0, 0));
		lataaKuvat();
		
		JPanel panelAloitus = new JPanel();
		frame.getContentPane().add(panelAloitus, "aloitusP");
		
		txtTunnus = new JTextField();
		txtTunnus.setText("Tunnus");
		txtTunnus.setColumns(10);
		
		pwdSalasana = new JPasswordField();
		pwdSalasana.setText("Salasana");
		
		btnKirj = new JButton();
		btnKirj.addActionListener(AL);
		btnKirj.setAction(kirjaudu);
		btnKirj.setText("Kirjaudu");
		
		JButton btnLuoTili = new JButton("Luo Tili");
		GroupLayout gl_panelAloitus = new GroupLayout(panelAloitus);
		gl_panelAloitus.setHorizontalGroup(
			gl_panelAloitus.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panelAloitus.createSequentialGroup()
					.addGap(57)
					.addGroup(gl_panelAloitus.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnLuoTili, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
						.addComponent(btnKirj, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
						.addComponent(pwdSalasana, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
						.addComponent(txtTunnus, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE))
					.addGap(42))
		);
		gl_panelAloitus.setVerticalGroup(
			gl_panelAloitus.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelAloitus.createSequentialGroup()
					.addGap(190)
					.addComponent(txtTunnus, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(pwdSalasana, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnKirj, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnLuoTili, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(215, Short.MAX_VALUE))
		);
		panelAloitus.setLayout(gl_panelAloitus);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frame.getContentPane().add(tabbedPane, "tabbedP");
		
		JPanel panelUser = new JPanel();
		tabbedPane.addTab("K\u00E4ytt\u00E4j\u00E4", null, panelUser, "Sis\u00E4lt\u00E4\u00E4 kaikki k\u00E4ytt\u00E4j\u00E4lle tarkoitetut toiminnot");
		
		JPanel panelUser_ala = new JPanel();
		
		JPanel panelV = new JPanel();
		panelV.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		JPanel panelO = new JPanel();
		panelO.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		JPanel panelA = new JPanel();
		panelA.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		GroupLayout gl_panelUser_ala = new GroupLayout(panelUser_ala);
		gl_panelUser_ala.setHorizontalGroup(
			gl_panelUser_ala.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelUser_ala.createSequentialGroup()
					.addContainerGap()
					.addComponent(panelV, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelUser_ala.createParallelGroup(Alignment.LEADING)
						.addComponent(panelO, GroupLayout.DEFAULT_SIZE, 585, Short.MAX_VALUE)
						.addComponent(panelA, GroupLayout.DEFAULT_SIZE, 585, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panelUser_ala.setVerticalGroup(
			gl_panelUser_ala.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panelUser_ala.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelUser_ala.createParallelGroup(Alignment.TRAILING)
						.addComponent(panelV, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE)
						.addGroup(Alignment.LEADING, gl_panelUser_ala.createSequentialGroup()
							.addComponent(panelO, GroupLayout.PREFERRED_SIZE, 541, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panelA, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
					.addContainerGap())
		);
		panelO.setLayout(new CardLayout(0, 0));
		
		JPanel pOhjelmisto = new JPanel();
		panelO.add(pOhjelmisto, "name_12842638568807");
		pOhjelmisto.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		pOhjelmisto.add(panel, BorderLayout.NORTH);
		
		JLabel lblTheHobbit = new JLabel("The Hobbit");
		lblTheHobbit.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel.add(lblTheHobbit);
		panel.add(hobbitkuva);
		
		JPanel panel_1 = new JPanel();
		pOhjelmisto.add(panel_1, BorderLayout.CENTER);
		
		JTextPane txtpnTietoaLeffasta = new JTextPane();
		txtpnTietoaLeffasta.setText("Tietoa leffasta");
		panel_1.add(txtpnTietoaLeffasta);
		
		JPanel pTeatteri = new JPanel();
		panelO.add(pTeatteri, "name_12992666872268");
		pTeatteri.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_3 = new JPanel();
		pTeatteri.add(panel_3);
		
		JButton btnTeatteri = new JButton("Teatteri #1");
		panel_3.add(btnTeatteri);
		
		JButton btnTeatteri_1 = new JButton("Teatteri #2");
		panel_3.add(btnTeatteri_1);
		
		JButton btnTeatteri_2 = new JButton("Teatteri #3");
		panel_3.add(btnTeatteri_2);
		
		JButton btnTeatteri_3 = new JButton("Teatteri #4");
		panel_3.add(btnTeatteri_3);
		
		JPanel panel_4 = new JPanel();
		pTeatteri.add(panel_4, BorderLayout.NORTH);
		
		JLabel lblTeatterinValinta = new JLabel("Teatterin valinta");
		panel_4.add(lblTeatterinValinta);
		
		JPanel pSali = new JPanel();
		panelO.add(pSali, "name_12958178230757");
		pSali.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_6 = new JPanel();
		pSali.add(panel_6, BorderLayout.NORTH);
		
		JLabel lblSalinValinta = new JLabel("Salin valinta");
		panel_6.add(lblSalinValinta);
		
		JPanel panel_7 = new JPanel();
		pSali.add(panel_7, BorderLayout.CENTER);
		panel_7.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnSali = new JButton("Sali #1");
		panel_7.add(btnSali);
		
		JButton btnSali_1 = new JButton("Sali #2");
		panel_7.add(btnSali_1);
		
		JPanel pPaikat = new JPanel();
		panelO.add(pPaikat, "name_13008255349157");
		pPaikat.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_2 = new JPanel();
		pPaikat.add(panel_2, BorderLayout.NORTH);
		
		JLabel lblPaikanValinta = new JLabel("Paikan valinta");
		panel_2.add(lblPaikanValinta);
		
		JPanel panel_5 = new JPanel();
		pPaikat.add(panel_5, BorderLayout.CENTER);
		
		JButton button_1 = new JButton("1");
		
		JButton button_2 = new JButton("2");
		button_2.setActionCommand("2");
		
		JButton button_3 = new JButton("3");
		
		JButton button_4 = new JButton("4");
		
		JButton button_5 = new JButton("5");
		
		JButton button_6 = new JButton("6");
		
		JButton button_7 = new JButton("7");
		
		JButton button_8 = new JButton("8");
		
		JButton button_9 = new JButton("9");
		
		JButton button_10 = new JButton("10");
		
		JButton button_11 = new JButton("12");
		
		JButton button_12 = new JButton("13");
		
		JButton button_13 = new JButton("14");
		GroupLayout gl_panel_5 = new GroupLayout(panel_5);
		gl_panel_5.setHorizontalGroup(
			gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_5.createSequentialGroup()
					.addContainerGap()
					.addComponent(button_1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(button_3)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(button_4)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(button_5)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(button_6)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(button_7)
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
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_panel_5.setVerticalGroup(
			gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_5.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_5.createParallelGroup(Alignment.BASELINE)
						.addComponent(button_1)
						.addComponent(button_2)
						.addComponent(button_3)
						.addComponent(button_4)
						.addComponent(button_5)
						.addComponent(button_6)
						.addComponent(button_7)
						.addComponent(button_8)
						.addComponent(button_9)
						.addComponent(button_10)
						.addComponent(button_11)
						.addComponent(button_12)
						.addComponent(button_13))
					.addContainerGap(481, Short.MAX_VALUE))
		);
		panel_5.setLayout(gl_panel_5);
		
		JPanel pVaraukset = new JPanel();
		panelO.add(pVaraukset, "name_12916663132887");
		pVaraukset.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_8 = new JPanel();
		pVaraukset.add(panel_8, BorderLayout.NORTH);
		
		JLabel lblOmatVaraukset = new JLabel("Omat varaukset");
		panel_8.add(lblOmatVaraukset);
		
		JPanel panel_9 = new JPanel();
		pVaraukset.add(panel_9, BorderLayout.CENTER);
		panel_9.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel pVarmennus = new JPanel();
		panelO.add(pVarmennus, "name_13057546524508");
		
		JLabel label = new JLabel("minimaalista kuvausta toiminnasta");
		panelA.add(label);
		
		JProgressBar progressBar = new JProgressBar();
		panelA.add(progressBar);
		panelV.setLayout(new MigLayout("", "[83px]", "[23px][23px][23px][23px][23px][23px][23px][23px][23px][23px][23px]"));
		
		JButton btnOhjelmisto = new JButton("Ohjelmisto");
		btnOhjelmisto.setSize(new Dimension(83, 23));
		btnOhjelmisto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		panelV.add(btnOhjelmisto, "cell 0 0,alignx center,aligny center");
		
		JButton button = new JButton("Varaukset");
		button.setSize(new Dimension(83, 23));
		button.setPreferredSize(new Dimension(83, 23));
		button.setActionCommand("Varaukset");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panelV.add(button, "cell 0 1,alignx center,aligny center");
		panelUser_ala.setLayout(gl_panelUser_ala);
		GroupLayout gl_panelUser = new GroupLayout(panelUser);
		gl_panelUser.setHorizontalGroup(
			gl_panelUser.createParallelGroup(Alignment.LEADING)
				.addComponent(panelUser_ala, GroupLayout.PREFERRED_SIZE, 749, GroupLayout.PREFERRED_SIZE)
		);
		gl_panelUser.setVerticalGroup(
			gl_panelUser.createParallelGroup(Alignment.LEADING)
				.addComponent(panelUser_ala, GroupLayout.PREFERRED_SIZE, 593, GroupLayout.PREFERRED_SIZE)
		);
		panelUser.setLayout(gl_panelUser);
		
		JPanel panelAdmin = new JPanel();
		tabbedPane.addTab("Hallinta", null, panelAdmin, "Sis\u00E4lt\u00E4\u00E4 kaiken hallintaan liittyv\u00E4n");
		
		JPanel panelAdmin_ala = new JPanel();
		panelAdmin.setLayout(new CardLayout(0, 0));
		panelAdmin.add(panelAdmin_ala, "name_19274229816455");
		
		JPanel panel_V = new JPanel();
		panel_V.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		JPanel panel_A = new JPanel();
		panel_A.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		
		JLabel label_3 = new JLabel("minimaalista kuvausta toiminnasta");
		panel_A.add(label_3);
		
		JProgressBar progressBar_1 = new JProgressBar();
		panel_A.add(progressBar_1);
		
		JPanel panel_O = new JPanel();
		panel_O.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_O.setLayout(new CardLayout(0, 0));
		GroupLayout gl_panelAdmin_ala = new GroupLayout(panelAdmin_ala);
		gl_panelAdmin_ala.setHorizontalGroup(
			gl_panelAdmin_ala.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelAdmin_ala.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_V, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelAdmin_ala.createParallelGroup(Alignment.TRAILING)
						.addComponent(panel_O, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 624, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_A, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 636, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_panelAdmin_ala.setVerticalGroup(
			gl_panelAdmin_ala.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelAdmin_ala.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelAdmin_ala.createParallelGroup(Alignment.LEADING, false)
						.addComponent(panel_V, GroupLayout.PREFERRED_SIZE, 575, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panelAdmin_ala.createSequentialGroup()
							.addComponent(panel_O, GroupLayout.PREFERRED_SIZE, 541, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel_A, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel_V.setLayout(new MigLayout("", "[83px][]", "[23px][23px][23px][]"));
		
		JButton btnNytkset = new JButton("N\u00E4yt\u00F6kset");
		btnNytkset.setSize(new Dimension(83, 23));
		btnNytkset.setPreferredSize(new Dimension(83, 23));
		btnNytkset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnElokuvat = new JButton("Elokuvat");
		btnElokuvat.setSize(new Dimension(83, 23));
		btnElokuvat.setPreferredSize(new Dimension(83, 23));
		panel_V.add(btnElokuvat, "cell 0 0,alignx left,aligny top");
		panel_V.add(btnNytkset, "cell 0 1,alignx left,aligny top");
		
		JButton btnKyttjt = new JButton("K\u00E4ytt\u00E4j\u00E4t");
		btnKyttjt.setSize(new Dimension(83, 23));
		btnKyttjt.setPreferredSize(new Dimension(83, 23));
		btnKyttjt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_V.add(btnKyttjt, "cell 0 2,alignx left,aligny top");
		
		JPanel pElokuvat = new JPanel();
		panel_O.add(pElokuvat, "name_13190117925414");
		
		JPanel pNaytokset = new JPanel();
		panel_O.add(pNaytokset, "name_13214758647317");
		
		JPanel pKayttajat = new JPanel();
		panel_O.add(pKayttajat, "name_13233569861002");
		panelAdmin_ala.setLayout(gl_panelAdmin_ala);

	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(ACTION_COMMAND_KEY, "kirjautuminen");
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			CL.show(frame.getContentPane(), "tabbedP");
		}
	}
	
	protected JPanel getPanelOhjelmisto() {
		return panelOhjelmisto;
	}
	private void lataaKuvat() {
		try {
			thehobbit = ImageIO.read(new File("thehobbit.jpg"));
			hobbitkuva = new JLabel(new ImageIcon(thehobbit));
			hobbitkuva.setSize(new Dimension(60, 80));
			hobbitkuva.setMaximumSize(new Dimension(60, 80));
			hobbitkuva.setAlignmentX(Component.CENTER_ALIGNMENT);
			hobbitkuva.setSize(40, 60);
		}
		catch (IOException x) {
			System.out.println(x);
		}
	}
}
