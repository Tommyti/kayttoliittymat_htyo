package kayttoliittymat_htyo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.JTextPane;
import net.miginfocom.swing.MigLayout;
import java.awt.FlowLayout;
import javax.swing.JPasswordField;
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
import javax.swing.JTabbedPane;
import java.awt.Dimension;

/**
 * Tehty WindowBuilderilla.
 * @author Tommi
 *
 */
public class UI {

	private JFrame frame;
	private JTextField txtTunnus;
	private JPasswordField pwdSalasana;
	private JButton btnKirj;
	protected CardLayout CL;
	protected CardLayout kayttajaCL;
	protected CardLayout hallintaCL;
	BufferedImage thehobbit;
	JLabel hobbitkuva;
    private ActionListener AL = new ActionListener() {
        public void actionPerformed(ActionEvent AE) {
          System.out.println("Nappia painettu");
        }
      };
    private JPanel panelOhjelmisto;
    private final Action kirjaudu = new SwingAction();
    private final Action luotili = new SwingAction_1();
    private final Action ohjelmisto = new SwingAction_2();
    private final Action varaukset = new SwingAction_3();
    private final Action h_elokuvat = new SwingAction_4();
    private final Action h_naytokset = new SwingAction_5();
    private final Action h_kayttajat = new SwingAction_6();
    private final Action sali1 = new SwingAction_7();
    private final Action sali2 = new SwingAction_8();
    private final Action teatteri1 = new SwingAction_9();
    private final Action teatteri2 = new SwingAction_10();
    private JPanel panelUser_ala;
    private JPanel panelAdmin_ala;

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
		
		JButton btnLuoTili = new JButton("Luo Tili");
		btnLuoTili.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLuoTili.setAction(luotili);
		
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
		
		panelUser_ala = new JPanel();
		
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
		panelO.setLayout(kayttajaCL = new CardLayout(0, 0));
		
		JPanel pOhjelmisto = new JPanel();
		panelO.add(pOhjelmisto, "name_12842638568807");
		
		JPanel panel = new JPanel();
		
		//JLabel lblTheHobbit = new JLabel("The Hobbit");
		//lblTheHobbit.setAlignmentX(Component.CENTER_ALIGNMENT);
		//panel.add(lblTheHobbit);
		//panel.add(hobbitkuva);
		
		JPanel panel_1 = new JPanel();
		
		JTextPane txtpnTietoaLeffasta = new JTextPane();
		txtpnTietoaLeffasta.setText("Tietoa leffasta");
		panel_1.add(txtpnTietoaLeffasta);
		GroupLayout gl_pOhjelmisto = new GroupLayout(pOhjelmisto);
		gl_pOhjelmisto.setHorizontalGroup(
			gl_pOhjelmisto.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pOhjelmisto.createSequentialGroup()
					.addGroup(gl_pOhjelmisto.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pOhjelmisto.createSequentialGroup()
							.addGap(10)
							.addComponent(panel, GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE))
						.addGroup(gl_pOhjelmisto.createSequentialGroup()
							.addContainerGap()
							.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)))
					.addContainerGap())
		);
		gl_pOhjelmisto.setVerticalGroup(
			gl_pOhjelmisto.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pOhjelmisto.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 298, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		JLabel lblnappejaLeffoistaJoissa = new JLabel("Lista nappeja leffoista");
		panel.add(lblnappejaLeffoistaJoissa);
		pOhjelmisto.setLayout(gl_pOhjelmisto);
		
		JPanel pTeatteri = new JPanel();
		panelO.add(pTeatteri, "name_12992666872268");
		pTeatteri.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_3 = new JPanel();
		pTeatteri.add(panel_3);
		
		JButton btnTeatteri = new JButton("Teatteri #1");
		btnTeatteri.setAction(teatteri1);
		panel_3.add(btnTeatteri);
		
		JButton btnTeatteri_1 = new JButton("Teatteri #2");
		btnTeatteri_1.setAction(teatteri2);
		panel_3.add(btnTeatteri_1);
		
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
		btnSali.setAction(sali1);
		panel_7.add(btnSali);
		
		JButton btnSali_1 = new JButton("Sali #2");
		btnSali_1.setAction(sali2);
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
		panelV.setLayout(new MigLayout("", "[90px:90.00:90px,center]", "[23px][23px][23px][23px][23px][23px][23px][23px][23px][23px][23px]"));
		
		JButton btnOhjelmisto = new JButton("Ohjelmisto");
		btnOhjelmisto.setToolTipText("Elokuvat teatterissa");
		btnOhjelmisto.setAction(ohjelmisto);
		btnOhjelmisto.setSize(new Dimension(83, 23));
		btnOhjelmisto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		panelV.add(btnOhjelmisto, "cell 0 0,alignx center,aligny center");
		
		JButton btnVaraukset = new JButton("Varaukset");
		btnVaraukset.setAction(varaukset);
		btnVaraukset.setSize(new Dimension(83, 23));
		btnVaraukset.setPreferredSize(new Dimension(83, 23));
		btnVaraukset.setActionCommand("Varaukset");
		btnVaraukset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panelV.add(btnVaraukset, "cell 0 1,alignx center,aligny center");
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
		
		panelAdmin_ala = new JPanel();
		panelAdmin.setLayout(hallintaCL = new CardLayout(0, 0));
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
		panel_V.setLayout(new MigLayout("", "[90px:90.00px:90px,center][]", "[23px][23px][23px][]"));
		
		JButton btnNytkset = new JButton("N\u00E4yt\u00F6kset");
		btnNytkset.setAction(h_naytokset);
		btnNytkset.setSize(new Dimension(83, 23));
		btnNytkset.setPreferredSize(new Dimension(83, 23));
		btnNytkset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnElokuvat = new JButton("Elokuvat");
		btnElokuvat.setAction(h_elokuvat);
		btnElokuvat.setSize(new Dimension(83, 23));
		btnElokuvat.setPreferredSize(new Dimension(83, 23));
		panel_V.add(btnElokuvat, "cell 0 0,alignx left,aligny top");
		panel_V.add(btnNytkset, "cell 0 1,alignx left,aligny top");
		
		JButton btnKyttjt = new JButton("K\u00E4ytt\u00E4j\u00E4t");
		btnKyttjt.setAction(h_kayttajat);
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
		hobbitkuva = new JLabel(new ImageIcon(thehobbit));
		hobbitkuva.setSize(new Dimension(60, 80));
		hobbitkuva.setMaximumSize(new Dimension(60, 80));
		hobbitkuva.setAlignmentX(Component.CENTER_ALIGNMENT);
		hobbitkuva.setSize(40, 60);

	}
	protected JPanel getPanelOhjelmisto() {
		return panelOhjelmisto;
	}
	private void lataaKuvat() { //antaa virheitä välillä
		try {
			thehobbit = ImageIO.read(new File("thehobbit.jpg"));
		}
		catch (IOException x) {
			System.out.println(x);
		}
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(ACTION_COMMAND_KEY, "kirjautuminen");
			putValue(NAME, "Kirjaudu");
			putValue(SHORT_DESCRIPTION, "Kirjautuu ohjelmaan");
			
		}
		public void actionPerformed(ActionEvent e) {

			if(e.getActionCommand()=="kirjautuminen") {
				//tarkista tunnus ja salasana ja vaihda paneelia
				CL.show(frame.getContentPane(), "tabbedP");
				//aseta hallinta piilotetuksi jos ei ylläpitäjä
			}
		}
	}
	private class SwingAction_1 extends AbstractAction {
		public SwingAction_1() {
			putValue(ACTION_COMMAND_KEY, "luotili");
			putValue(NAME, "Luo Tili");
			putValue(SHORT_DESCRIPTION, "Luo uuden tilin");
		}
		public void actionPerformed(ActionEvent e) {
			if(e.getActionCommand()=="luotili") {
				//luo tili metodi
				//txtTunnus ja pwdSalasana
			}
		}
	}
	private class SwingAction_2 extends AbstractAction {
		//TODO korjaa wrong parent virhe
		public SwingAction_2() {
			putValue(NAME, "Ohjelmisto");
			putValue(SHORT_DESCRIPTION, "Elokuvat");
		}
		public void actionPerformed(ActionEvent e) {
			kayttajaCL.show(getPanelUser_ala(), "pOhjelmisto");
		}
	}
	private class SwingAction_3 extends AbstractAction {
		public SwingAction_3() {
			putValue(NAME, "Varaukset");
			putValue(SHORT_DESCRIPTION, "Omat varaukset");
		}
		public void actionPerformed(ActionEvent e) {
			kayttajaCL.show(getPanelUser_ala(), "pVaraukset");
		}
	}
	private class SwingAction_4 extends AbstractAction {
		public SwingAction_4() {
			putValue(NAME, "Elokuvat");
			putValue(SHORT_DESCRIPTION, "Elokuvien hallinta paneeli");
		}
		public void actionPerformed(ActionEvent e) {
			hallintaCL.show(getPanelAdmin_ala(), "pElokuvat");
		}
	}
	private class SwingAction_5 extends AbstractAction {
		public SwingAction_5() {
			putValue(NAME, "Näytökset");
			putValue(SHORT_DESCRIPTION, "Näytöksien hallinta paneeli");
		}
		public void actionPerformed(ActionEvent e) {
			hallintaCL.show(getPanelAdmin_ala(), "pNaytokset");
		}
	}
	private class SwingAction_6 extends AbstractAction {
		public SwingAction_6() {
			putValue(NAME, "Käyttäjät");
			putValue(SHORT_DESCRIPTION, "Käyttäjien hallinta paneeli");
		}
		public void actionPerformed(ActionEvent e) {
			hallintaCL.show(getPanelAdmin_ala(), "pKayttajat");
		}
	}
	private class SwingAction_7 extends AbstractAction {
		public SwingAction_7() {
			putValue(NAME, "Sali #1");
			putValue(SHORT_DESCRIPTION, "Valitsee salin 1");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	private class SwingAction_8 extends AbstractAction {
		public SwingAction_8() {
			putValue(NAME, "Sali #2");
			putValue(SHORT_DESCRIPTION, "Valitsee salin 2");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	private class SwingAction_9 extends AbstractAction {
		public SwingAction_9() {
			putValue(NAME, "Teatteri #1");
			putValue(SHORT_DESCRIPTION, "Valitsee teatterin 1");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	private class SwingAction_10 extends AbstractAction {
		public SwingAction_10() {
			putValue(NAME, "Teatteri #2");
			putValue(SHORT_DESCRIPTION, "Valitsee teatterin 2");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	protected JPanel getPanelUser_ala() {
		return panelUser_ala;
	}
	public JPanel getPanelAdmin_ala() {
		return panelAdmin_ala;
	}
}
