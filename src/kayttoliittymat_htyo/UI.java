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
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JProgressBar;
import javax.swing.JList;
import javax.swing.JScrollBar;
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
	private final Action kirjaudu = new SwingAction();
	private JButton btnKirj;
	protected CardLayout CL;
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
		
		JPanel pTeatteri = new JPanel();
		panelO.add(pTeatteri, "name_12992666872268");
		
		JPanel pSali = new JPanel();
		panelO.add(pSali, "name_13008255349157");
		
		JPanel pPaikat = new JPanel();
		panelO.add(pPaikat, "name_12958178230757");
		
		JPanel pVaraukset = new JPanel();
		panelO.add(pVaraukset, "name_12916663132887");
		
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
}
