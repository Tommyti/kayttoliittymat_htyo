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
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
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
import javax.swing.Action;
import java.awt.CardLayout;
import javax.swing.JProgressBar;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.SwingConstants;
import javax.swing.Box;
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
	private JButton btnNewButton;

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
		frame.setBounds(100, 100, 640, 640);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panelPaikat = new JPanel();
		JPanel syötepaneeli = new JPanel();
		JPanel panelAloitus = new JPanel();
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		frame.getContentPane().add(panelAloitus, "name_3744901173526");
		panelAloitus.setLayout(new BorderLayout(0, 0));
		
		txtTunnus = new JTextField();
		txtTunnus.setText("Tunnus");
		txtTunnus.setColumns(10);
		
		pwdSalasana = new JPasswordField();
		pwdSalasana.setText("Salasana");
		
		btnNewButton = new JButton("Kirjaudu");
		btnNewButton.setAction(kirjaudu);
		
		JButton btnLuoTili = new JButton("Luo Tili");
		GroupLayout gl_syötepaneeli = new GroupLayout(syötepaneeli);
		gl_syötepaneeli.setHorizontalGroup(
			gl_syötepaneeli.createParallelGroup(Alignment.CENTER)
				.addGroup(gl_syötepaneeli.createSequentialGroup()
					.addGap(10)
					.addGroup(gl_syötepaneeli.createParallelGroup(Alignment.CENTER)
						.addComponent(txtTunnus, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
						.addComponent(pwdSalasana, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnLuoTili, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)))
		);
		gl_syötepaneeli.setVerticalGroup(
			gl_syötepaneeli.createParallelGroup(Alignment.CENTER)
				.addGroup(gl_syötepaneeli.createSequentialGroup()
					.addGap(11)
					.addComponent(txtTunnus, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(pwdSalasana, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(btnLuoTili, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
		);
		syötepaneeli.setLayout(gl_syötepaneeli);
		panelAloitus.add(syötepaneeli);
		
		JPanel panelOhjelmisto = new JPanel();
		frame.getContentPane().add(panelOhjelmisto, "name_569557156095");
		
		JPanel panel_2 = new JPanel();
		
		JButton button = new JButton("New button");
		
		JScrollBar scrollBar_1 = new JScrollBar();
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGap(0, 136, Short.MAX_VALUE)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addComponent(button, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollBar_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 589, Short.MAX_VALUE)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addComponent(button)
					.addGap(566))
				.addComponent(scrollBar_1, GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE)
		);
		panel_2.setLayout(gl_panel_2);
		
		JPanel panel_3 = new JPanel();
		
		JLabel label_1 = new JLabel("minimaalista kuvausta toiminnasta");
		
		JProgressBar progressBar_1 = new JProgressBar();
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 462, Short.MAX_VALUE)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addContainerGap(109, Short.MAX_VALUE)
					.addComponent(label_1)
					.addGap(35)
					.addComponent(progressBar_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGap(0, 28, Short.MAX_VALUE)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_3.createParallelGroup(Alignment.TRAILING)
						.addComponent(progressBar_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_1))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel_3.setLayout(gl_panel_3);
		
		JPanel panel_4 = new JPanel();
		
		JLabel lblElokuvat = new JLabel("Elokuvan valinta");
		panel_4.add(lblElokuvat);
		GroupLayout gl_panelOhjelmisto = new GroupLayout(panelOhjelmisto);
		gl_panelOhjelmisto.setHorizontalGroup(
			gl_panelOhjelmisto.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 624, Short.MAX_VALUE)
				.addGroup(gl_panelOhjelmisto.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelOhjelmisto.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_3, GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
						.addComponent(panel_4, GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panelOhjelmisto.setVerticalGroup(
			gl_panelOhjelmisto.createParallelGroup(Alignment.LEADING)
				.addGap(0, 601, Short.MAX_VALUE)
				.addGroup(gl_panelOhjelmisto.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelOhjelmisto.createParallelGroup(Alignment.TRAILING)
						.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(gl_panelOhjelmisto.createSequentialGroup()
							.addComponent(panel_4, GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		panelOhjelmisto.setLayout(gl_panelOhjelmisto);
		
		JPanel panelTeatteriAdmin = new JPanel();
		frame.getContentPane().add(panelTeatteriAdmin, "name_1298085162439");
		
		JPanel panel_13 = new JPanel();
		
		JButton button_4 = new JButton("New button");
		
		JScrollBar scrollBar_5 = new JScrollBar();
		GroupLayout gl_panel_13 = new GroupLayout(panel_13);
		gl_panel_13.setHorizontalGroup(
			gl_panel_13.createParallelGroup(Alignment.LEADING)
				.addGap(0, 136, Short.MAX_VALUE)
				.addGap(0, 136, Short.MAX_VALUE)
				.addGroup(gl_panel_13.createSequentialGroup()
					.addComponent(button_4, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollBar_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_panel_13.setVerticalGroup(
			gl_panel_13.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 589, Short.MAX_VALUE)
				.addGap(0, 589, Short.MAX_VALUE)
				.addGroup(gl_panel_13.createSequentialGroup()
					.addComponent(button_4)
					.addGap(566))
				.addComponent(scrollBar_5, GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE)
		);
		panel_13.setLayout(gl_panel_13);
		
		JPanel panel_14 = new JPanel();
		
		JLabel label_3 = new JLabel("minimaalista kuvausta toiminnasta");
		
		JProgressBar progressBar_5 = new JProgressBar();
		GroupLayout gl_panel_14 = new GroupLayout(panel_14);
		gl_panel_14.setHorizontalGroup(
			gl_panel_14.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 462, Short.MAX_VALUE)
				.addGap(0, 462, Short.MAX_VALUE)
				.addGroup(gl_panel_14.createSequentialGroup()
					.addContainerGap(109, Short.MAX_VALUE)
					.addComponent(label_3)
					.addGap(35)
					.addComponent(progressBar_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_panel_14.setVerticalGroup(
			gl_panel_14.createParallelGroup(Alignment.LEADING)
				.addGap(0, 28, Short.MAX_VALUE)
				.addGap(0, 28, Short.MAX_VALUE)
				.addGroup(gl_panel_14.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_14.createParallelGroup(Alignment.TRAILING)
						.addComponent(progressBar_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_3))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel_14.setLayout(gl_panel_14);
		
		JPanel panel_15 = new JPanel();
		
		JLabel lblTeatterienHallinta = new JLabel("Teatterien hallinta");
		panel_15.add(lblTeatterienHallinta);
		GroupLayout gl_panelTeatteriAdmin = new GroupLayout(panelTeatteriAdmin);
		gl_panelTeatteriAdmin.setHorizontalGroup(
			gl_panelTeatteriAdmin.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 624, Short.MAX_VALUE)
				.addGap(0, 624, Short.MAX_VALUE)
				.addGroup(gl_panelTeatteriAdmin.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_13, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelTeatteriAdmin.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_14, GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
						.addComponent(panel_15, GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panelTeatteriAdmin.setVerticalGroup(
			gl_panelTeatteriAdmin.createParallelGroup(Alignment.LEADING)
				.addGap(0, 601, Short.MAX_VALUE)
				.addGap(0, 601, Short.MAX_VALUE)
				.addGroup(gl_panelTeatteriAdmin.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelTeatteriAdmin.createParallelGroup(Alignment.TRAILING)
						.addComponent(panel_13, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(gl_panelTeatteriAdmin.createSequentialGroup()
							.addComponent(panel_15, GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel_14, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		panelTeatteriAdmin.setLayout(gl_panelTeatteriAdmin);
		
		JPanel panelTeatteri = new JPanel();
		frame.getContentPane().add(panelTeatteri, "name_676069971813");
		
		JPanel panel_5 = new JPanel();
		
		JButton button_1 = new JButton("New button");
		
		JScrollBar scrollBar_2 = new JScrollBar();
		GroupLayout gl_panel_5 = new GroupLayout(panel_5);
		gl_panel_5.setHorizontalGroup(
			gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addGap(0, 136, Short.MAX_VALUE)
				.addGroup(gl_panel_5.createSequentialGroup()
					.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollBar_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_panel_5.setVerticalGroup(
			gl_panel_5.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 589, Short.MAX_VALUE)
				.addGroup(gl_panel_5.createSequentialGroup()
					.addComponent(button_1)
					.addGap(566))
				.addComponent(scrollBar_2, GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE)
		);
		panel_5.setLayout(gl_panel_5);
		
		JPanel panel_6 = new JPanel();
		
		JLabel label_2 = new JLabel("minimaalista kuvausta toiminnasta");
		
		JProgressBar progressBar_2 = new JProgressBar();
		GroupLayout gl_panel_6 = new GroupLayout(panel_6);
		gl_panel_6.setHorizontalGroup(
			gl_panel_6.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 462, Short.MAX_VALUE)
				.addGroup(gl_panel_6.createSequentialGroup()
					.addContainerGap(109, Short.MAX_VALUE)
					.addComponent(label_2)
					.addGap(35)
					.addComponent(progressBar_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_panel_6.setVerticalGroup(
			gl_panel_6.createParallelGroup(Alignment.LEADING)
				.addGap(0, 28, Short.MAX_VALUE)
				.addGroup(gl_panel_6.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_6.createParallelGroup(Alignment.TRAILING)
						.addComponent(progressBar_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_2))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel_6.setLayout(gl_panel_6);
		
		JPanel panel_7 = new JPanel();
		
		JLabel lblTeatterinValinta = new JLabel("Teatterin valinta");
		panel_7.add(lblTeatterinValinta);
		GroupLayout gl_panelTeatteri = new GroupLayout(panelTeatteri);
		gl_panelTeatteri.setHorizontalGroup(
			gl_panelTeatteri.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 624, Short.MAX_VALUE)
				.addGroup(gl_panelTeatteri.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelTeatteri.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_6, GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
						.addComponent(panel_7, GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panelTeatteri.setVerticalGroup(
			gl_panelTeatteri.createParallelGroup(Alignment.LEADING)
				.addGap(0, 601, Short.MAX_VALUE)
				.addGroup(gl_panelTeatteri.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelTeatteri.createParallelGroup(Alignment.TRAILING)
						.addComponent(panel_5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(gl_panelTeatteri.createSequentialGroup()
							.addComponent(panel_7, GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel_6, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		panelTeatteri.setLayout(gl_panelTeatteri);
		
		JPanel panelOhjelmistoAdmin = new JPanel();
		frame.getContentPane().add(panelOhjelmistoAdmin, "name_873598997631");
		
		JPanel panel_10 = new JPanel();
		
		JButton button_3 = new JButton("New button");
		
		JScrollBar scrollBar_4 = new JScrollBar();
		GroupLayout gl_panel_10 = new GroupLayout(panel_10);
		gl_panel_10.setHorizontalGroup(
			gl_panel_10.createParallelGroup(Alignment.LEADING)
				.addGap(0, 136, Short.MAX_VALUE)
				.addGap(0, 136, Short.MAX_VALUE)
				.addGroup(gl_panel_10.createSequentialGroup()
					.addComponent(button_3, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollBar_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_panel_10.setVerticalGroup(
			gl_panel_10.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 589, Short.MAX_VALUE)
				.addGap(0, 589, Short.MAX_VALUE)
				.addGroup(gl_panel_10.createSequentialGroup()
					.addComponent(button_3)
					.addGap(566))
				.addComponent(scrollBar_4, GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE)
		);
		panel_10.setLayout(gl_panel_10);
		
		JPanel panel_11 = new JPanel();
		
		JLabel label_5 = new JLabel("minimaalista kuvausta toiminnasta");
		
		JProgressBar progressBar_4 = new JProgressBar();
		GroupLayout gl_panel_11 = new GroupLayout(panel_11);
		gl_panel_11.setHorizontalGroup(
			gl_panel_11.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 462, Short.MAX_VALUE)
				.addGap(0, 462, Short.MAX_VALUE)
				.addGroup(gl_panel_11.createSequentialGroup()
					.addContainerGap(109, Short.MAX_VALUE)
					.addComponent(label_5)
					.addGap(35)
					.addComponent(progressBar_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_panel_11.setVerticalGroup(
			gl_panel_11.createParallelGroup(Alignment.LEADING)
				.addGap(0, 28, Short.MAX_VALUE)
				.addGap(0, 28, Short.MAX_VALUE)
				.addGroup(gl_panel_11.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_11.createParallelGroup(Alignment.TRAILING)
						.addComponent(progressBar_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_5))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel_11.setLayout(gl_panel_11);
		
		JPanel panel_12 = new JPanel();
		
		JLabel lblOhjelmistoHallinta = new JLabel("Ohjelmisto hallinta");
		panel_12.add(lblOhjelmistoHallinta);
		GroupLayout gl_panelOhjelmistoAdmin = new GroupLayout(panelOhjelmistoAdmin);
		gl_panelOhjelmistoAdmin.setHorizontalGroup(
			gl_panelOhjelmistoAdmin.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 624, Short.MAX_VALUE)
				.addGap(0, 624, Short.MAX_VALUE)
				.addGroup(gl_panelOhjelmistoAdmin.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_10, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelOhjelmistoAdmin.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_11, GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
						.addComponent(panel_12, GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panelOhjelmistoAdmin.setVerticalGroup(
			gl_panelOhjelmistoAdmin.createParallelGroup(Alignment.LEADING)
				.addGap(0, 601, Short.MAX_VALUE)
				.addGap(0, 601, Short.MAX_VALUE)
				.addGroup(gl_panelOhjelmistoAdmin.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelOhjelmistoAdmin.createParallelGroup(Alignment.TRAILING)
						.addComponent(panel_10, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(gl_panelOhjelmistoAdmin.createSequentialGroup()
							.addComponent(panel_12, GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel_11, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		panelOhjelmistoAdmin.setLayout(gl_panelOhjelmistoAdmin);
		
		JPanel panelPaikatAdmin = new JPanel();
		frame.getContentPane().add(panelPaikatAdmin, "name_777481396918");
		
		JPanel panel_1 = new JPanel();
		
		JButton button_2 = new JButton("New button");
		
		JScrollBar scrollBar_3 = new JScrollBar();
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 136, Short.MAX_VALUE)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollBar_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 589, Short.MAX_VALUE)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addComponent(button_2)
					.addGap(566))
				.addComponent(scrollBar_3, GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE)
		);
		panel_1.setLayout(gl_panel_1);
		
		JPanel panel_8 = new JPanel();
		
		JLabel label_4 = new JLabel("minimaalista kuvausta toiminnasta");
		
		JProgressBar progressBar_3 = new JProgressBar();
		GroupLayout gl_panel_8 = new GroupLayout(panel_8);
		gl_panel_8.setHorizontalGroup(
			gl_panel_8.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 462, Short.MAX_VALUE)
				.addGroup(gl_panel_8.createSequentialGroup()
					.addContainerGap(109, Short.MAX_VALUE)
					.addComponent(label_4)
					.addGap(35)
					.addComponent(progressBar_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_panel_8.setVerticalGroup(
			gl_panel_8.createParallelGroup(Alignment.LEADING)
				.addGap(0, 28, Short.MAX_VALUE)
				.addGroup(gl_panel_8.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_8.createParallelGroup(Alignment.TRAILING)
						.addComponent(progressBar_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_4))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel_8.setLayout(gl_panel_8);
		
		JPanel panel_9 = new JPanel();
		
		JLabel lblVarausHallinta = new JLabel("Paikkojen hallinta");
		panel_9.add(lblVarausHallinta);
		GroupLayout gl_panelPaikatAdmin = new GroupLayout(panelPaikatAdmin);
		gl_panelPaikatAdmin.setHorizontalGroup(
			gl_panelPaikatAdmin.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 624, Short.MAX_VALUE)
				.addGroup(gl_panelPaikatAdmin.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelPaikatAdmin.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_8, GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
						.addComponent(panel_9, GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panelPaikatAdmin.setVerticalGroup(
			gl_panelPaikatAdmin.createParallelGroup(Alignment.LEADING)
				.addGap(0, 601, Short.MAX_VALUE)
				.addGroup(gl_panelPaikatAdmin.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelPaikatAdmin.createParallelGroup(Alignment.TRAILING)
						.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(gl_panelPaikatAdmin.createSequentialGroup()
							.addComponent(panel_9, GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel_8, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		panelPaikatAdmin.setLayout(gl_panelPaikatAdmin);
		frame.getContentPane().add(panelPaikat, "name_3744938342968");
		
		JPanel panel2_1 = new JPanel();
		
		JLabel label = new JLabel("minimaalista kuvausta toiminnasta");
		
		JProgressBar progressBar = new JProgressBar();
		
		JPanel panel2_2 = new JPanel();
		
		JScrollBar scrollBar = new JScrollBar();
		
		JButton btnNewButton_1 = new JButton("New button");
		
		JPanel panel2_3 = new JPanel();
		GroupLayout gl_panelPaikat = new GroupLayout(panelPaikat);
		gl_panelPaikat.setHorizontalGroup(
			gl_panelPaikat.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panelPaikat.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel2_2, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelPaikat.createParallelGroup(Alignment.LEADING)
						.addComponent(panel2_1, GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
						.addComponent(panel2_3, GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panelPaikat.setVerticalGroup(
			gl_panelPaikat.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelPaikat.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelPaikat.createParallelGroup(Alignment.LEADING)
						.addComponent(panel2_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(Alignment.TRAILING, gl_panelPaikat.createSequentialGroup()
							.addComponent(panel2_3, GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel2_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		GroupLayout gl_panel2_1 = new GroupLayout(panel2_1);
		gl_panel2_1.setHorizontalGroup(
			gl_panel2_1.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel2_1.createSequentialGroup()
					.addContainerGap(119, Short.MAX_VALUE)
					.addComponent(label)
					.addGap(35)
					.addComponent(progressBar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_panel2_1.setVerticalGroup(
			gl_panel2_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_panel2_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel2_1.createParallelGroup(Alignment.TRAILING)
						.addComponent(progressBar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel2_1.setLayout(gl_panel2_1);
		
		JLabel lblVaraus = new JLabel("Paikan varaus");
		panel2_3.add(lblVaraus);
		GroupLayout gl_panel2_2 = new GroupLayout(panel2_2);
		gl_panel2_2.setHorizontalGroup(
			gl_panel2_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel2_2.createSequentialGroup()
					.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollBar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_panel2_2.setVerticalGroup(
			gl_panel2_2.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel2_2.createSequentialGroup()
					.addComponent(btnNewButton_1)
					.addGap(566))
				.addComponent(scrollBar, GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE)
		);
		panel2_2.setLayout(gl_panel2_2);
		panelPaikat.setLayout(gl_panelPaikat);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(ACTION_COMMAND_KEY, "kirjautuminen");
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			
		}
	}
	public JButton getBtnNewButton() {
		return btnNewButton;
	}
}
