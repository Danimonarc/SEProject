import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class InicioUser extends JFrame {

	private JPanel contentPane;
	private JTextField Nametxt;
	private JTextField Surnametxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InicioUser frame = new InicioUser();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public InicioUser() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		Nametxt = new JTextField();
		Nametxt.setText("");
		GridBagConstraints gbc_Nametxt = new GridBagConstraints();
		gbc_Nametxt.insets = new Insets(0, 0, 5, 5);
		gbc_Nametxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_Nametxt.gridx = 0;
		gbc_Nametxt.gridy = 0;
		contentPane.add(Nametxt, gbc_Nametxt);
		Nametxt.setColumns(10);
		
		Surnametxt = new JTextField();
		GridBagConstraints gbc_Surnametxt = new GridBagConstraints();
		gbc_Surnametxt.insets = new Insets(0, 0, 5, 0);
		gbc_Surnametxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_Surnametxt.gridx = 2;
		gbc_Surnametxt.gridy = 0;
		contentPane.add(Surnametxt, gbc_Surnametxt);
		Surnametxt.setColumns(10);
	}

}
