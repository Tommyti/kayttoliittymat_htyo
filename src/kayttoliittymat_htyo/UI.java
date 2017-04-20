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
		panelUser.setLayout(new CardLayout(0, 0));
		
		JPanel panelOhjelmisto_2 = new JPanel();
		panelUser.add(panelOhjelmisto_2, "name_19250298438323");
		
		JPanel panelV = new JPanel();
		panelV.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		JPanel panelO = new JPanel();
		panelO.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		JPanel panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		GroupLayout gl_panelOhjelmisto_2 = new GroupLayout(panelOhjelmisto_2);
		gl_panelOhjelmisto_2.setHorizontalGroup(
			gl_panelOhjelmisto_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelOhjelmisto_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(panelV, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelOhjelmisto_2.createParallelGroup(Alignment.LEADING)
						.addComponent(panelO, GroupLayout.DEFAULT_SIZE, 585, Short.MAX_VALUE)
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, 585, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panelOhjelmisto_2.setVerticalGroup(
			gl_panelOhjelmisto_2.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panelOhjelmisto_2.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelOhjelmisto_2.createParallelGroup(Alignment.TRAILING)
						.addComponent(panelV, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE)
						.addGroup(Alignment.LEADING, gl_panelOhjelmisto_2.createSequentialGroup()
							.addComponent(panelO, GroupLayout.PREFERRED_SIZE, 541, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
					.addContainerGap())
		);
		
		JLabel label = new JLabel("minimaalista kuvausta toiminnasta");
		panel.add(label);
		
		JProgressBar progressBar = new JProgressBar();
		panel.add(progressBar);
		
		JLabel label_1 = new JLabel("Elokuvan valinta");
		panelO.add(label_1);
		panelV.setLayout(new MigLayout("", "[83px]", "[23px][23px][23px][23px][23px][23px][23px][23px][23px][23px][23px]"));
		
		JButton btnOhjelmisto = new JButton("Ohjelmisto");
		panelV.add(btnOhjelmisto, "cell 0 0,alignx left,aligny top");
		
		JButton button = new JButton("Ohjelmisto");
		panelV.add(button, "cell 0 1,alignx center,aligny center");
		
		JButton button_1 = new JButton("Ohjelmisto");
		panelV.add(button_1, "cell 0 2,alignx center,aligny center");
		
		JButton button_2 = new JButton("Ohjelmisto");
		panelV.add(button_2, "cell 0 3,alignx center,aligny center");
		
		JButton button_3 = new JButton("Ohjelmisto");
		panelV.add(button_3, "cell 0 4,alignx center,aligny center");
		
		JButton button_4 = new JButton("Ohjelmisto");
		panelV.add(button_4, "cell 0 5,alignx center,aligny center");
		
		JButton button_5 = new JButton("Ohjelmisto");
		panelV.add(button_5, "cell 0 6,alignx center,aligny center");
		
		JButton button_6 = new JButton("Ohjelmisto");
		panelV.add(button_6, "cell 0 7,alignx center,aligny center");
		
		JButton button_7 = new JButton("Ohjelmisto");
		panelV.add(button_7, "cell 0 8,alignx center,aligny center");
		
		JButton button_8 = new JButton("Ohjelmisto");
		panelV.add(button_8, "cell 0 9,alignx center,aligny center");
		
		JButton button_9 = new JButton("Ohjelmisto");
		panelV.add(button_9, "cell 0 10,alignx center,aligny center");
		panelOhjelmisto_2.setLayout(gl_panelOhjelmisto_2);
		
		JPanel panelAdmin = new JPanel();
		tabbedPane.addTab("Hallinta", null, panelAdmin, "Sis\u00E4lt\u00E4\u00E4 kaiken hallintaan liittyv\u00E4n");
		
		JPanel panelOhjelmistoAdmin = new JPanel();
		panelAdmin.setLayout(new CardLayout(0, 0));
		panelAdmin.add(panelOhjelmistoAdmin, "name_19274229816455");
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setLayout(new MigLayout("", "[]", "[]"));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		JLabel lblElokuvanHallinta = new JLabel("Elokuvan hallinta");
		panel_2.add(lblElokuvanHallinta);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		
		JLabel label_3 = new JLabel("minimaalista kuvausta toiminnasta");
		panel_3.add(label_3);
		
		JProgressBar progressBar_1 = new JProgressBar();
		panel_3.add(progressBar_1);
		GroupLayout gl_panelOhjelmistoAdmin = new GroupLayout(panelOhjelmistoAdmin);
		gl_panelOhjelmistoAdmin.setHorizontalGroup(
			gl_panelOhjelmistoAdmin.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelOhjelmistoAdmin.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addGroup(gl_panelOhjelmistoAdmin.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 624, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 624, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_panelOhjelmistoAdmin.setVerticalGroup(
			gl_panelOhjelmistoAdmin.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelOhjelmistoAdmin.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelOhjelmistoAdmin.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 575, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panelOhjelmistoAdmin.createSequentialGroup()
							.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 541, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panelOhjelmistoAdmin.setLayout(gl_panelOhjelmistoAdmin);

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
