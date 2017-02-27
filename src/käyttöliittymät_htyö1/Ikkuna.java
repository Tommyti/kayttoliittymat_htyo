package käyttöliittymät_htyö1;

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
/**
 * Tehty WindowBuilderilla.
 * @author Tommi
 *
 */
public class Ikkuna {

	private JFrame frame;
	private JTextField txtTunnus;
	private JPasswordField pwdSalasana;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ikkuna window = new Ikkuna();
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
	public Ikkuna() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 635, 515);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		
		JPanel panel_2 = new JPanel();
		
		JPanel panel_1 = new JPanel();
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 599, Short.MAX_VALUE)
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, 599, Short.MAX_VALUE)
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 599, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		JTextPane txtpnOhjeitatietojaYms = new JTextPane();
		txtpnOhjeitatietojaYms.setEditable(false);
		txtpnOhjeitatietojaYms.setText("Ohjeita/tietoja yms.");
		panel_2.add(txtpnOhjeitatietojaYms);
		
		txtTunnus = new JTextField();
		txtTunnus.setText("Tunnus");
		txtTunnus.setColumns(10);
		
		pwdSalasana = new JPasswordField();
		pwdSalasana.setText("Salasana");
		
		JButton btnNewButton = new JButton("Kirjaudu");
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
					.addGap(57)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnNewButton, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE)
						.addComponent(pwdSalasana, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE)
						.addComponent(txtTunnus, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE))
					.addGap(57))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(45)
					.addComponent(txtTunnus, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(28)
					.addComponent(pwdSalasana, GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_1.setLayout(gl_panel_1);
		
		JTextPane txtpnElokuvalippujenVarausjrjestelm = new JTextPane();
		txtpnElokuvalippujenVarausjrjestelm.setEditable(false);
		txtpnElokuvalippujenVarausjrjestelm.setText("Elokuvalippujen varausj\u00E4rjestelm\u00E4");
		panel.add(txtpnElokuvalippujenVarausjrjestelm);
		frame.getContentPane().setLayout(groupLayout);
	}
}
