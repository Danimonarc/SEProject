package Gui;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Perfil extends JFrame {

	private JPanel contentPane;
	private JTextField NombreText;
	private JTextField DateOfBirthtxt;
	private JTextField textValoration;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Perfil(String name, String DateOfBirth, String average) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JPanel Personal = new JPanel();
		GridBagConstraints gbc_Personal = new GridBagConstraints();
		gbc_Personal.insets = new Insets(0, 0, 5, 0);
		gbc_Personal.fill = GridBagConstraints.BOTH;
		gbc_Personal.gridx = 0;
		gbc_Personal.gridy = 0;
		contentPane.add(Personal, gbc_Personal);
		GridBagLayout gbl_Personal = new GridBagLayout();
		gbl_Personal.columnWidths = new int[]{0, 0, 0, 0};
		gbl_Personal.rowHeights = new int[]{0, 0, 0};
		gbl_Personal.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_Personal.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		Personal.setLayout(gbl_Personal);
		
		JLabel lblName = new JLabel("Name:");
		GridBagConstraints gbc_lblName = new GridBagConstraints();
		gbc_lblName.insets = new Insets(0, 0, 5, 5);
		gbc_lblName.anchor = GridBagConstraints.EAST;
		gbc_lblName.gridx = 1;
		gbc_lblName.gridy = 0;
		Personal.add(lblName, gbc_lblName);
		
		NombreText = new JTextField();
		NombreText.setText(name);
		NombreText.setEditable(false);
		GridBagConstraints gbc_NombreText = new GridBagConstraints();
		gbc_NombreText.insets = new Insets(0, 0, 5, 0);
		gbc_NombreText.fill = GridBagConstraints.HORIZONTAL;
		gbc_NombreText.gridx = 2;
		gbc_NombreText.gridy = 0;
		Personal.add(NombreText, gbc_NombreText);
		NombreText.setColumns(10);
		
		JLabel lblDateOfBirth = new JLabel("Date of birth");
		GridBagConstraints gbc_lblDateOfBirth = new GridBagConstraints();
		gbc_lblDateOfBirth.anchor = GridBagConstraints.EAST;
		gbc_lblDateOfBirth.insets = new Insets(0, 0, 0, 5);
		gbc_lblDateOfBirth.gridx = 1;
		gbc_lblDateOfBirth.gridy = 1;
		Personal.add(lblDateOfBirth, gbc_lblDateOfBirth);
		
		DateOfBirthtxt = new JTextField();
		DateOfBirthtxt.setText(DateOfBirth);
		DateOfBirthtxt.setEditable(false);
		GridBagConstraints gbc_DateOfBirthtxt = new GridBagConstraints();
		gbc_DateOfBirthtxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_DateOfBirthtxt.gridx = 2;
		gbc_DateOfBirthtxt.gridy = 1;
		Personal.add(DateOfBirthtxt, gbc_DateOfBirthtxt);
		DateOfBirthtxt.setColumns(10);
		
		JPanel AppIfo = new JPanel();
		GridBagConstraints gbc_AppIfo = new GridBagConstraints();
		gbc_AppIfo.insets = new Insets(0, 0, 5, 0);
		gbc_AppIfo.fill = GridBagConstraints.BOTH;
		gbc_AppIfo.gridx = 0;
		gbc_AppIfo.gridy = 1;
		contentPane.add(AppIfo, gbc_AppIfo);
		GridBagLayout gbl_AppIfo = new GridBagLayout();
		gbl_AppIfo.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_AppIfo.rowHeights = new int[]{0, 0};
		gbl_AppIfo.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_AppIfo.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		AppIfo.setLayout(gbl_AppIfo);
		
		JLabel lblValoration = new JLabel("Valoration");
		GridBagConstraints gbc_lblValoration = new GridBagConstraints();
		gbc_lblValoration.insets = new Insets(0, 0, 0, 5);
		gbc_lblValoration.anchor = GridBagConstraints.EAST;
		gbc_lblValoration.gridx = 2;
		gbc_lblValoration.gridy = 0;
		AppIfo.add(lblValoration, gbc_lblValoration);
		
		textValoration = new JTextField();
		textValoration.setText(average);
		textValoration.setEditable(false);
		GridBagConstraints gbc_textValoration = new GridBagConstraints();
		gbc_textValoration.fill = GridBagConstraints.HORIZONTAL;
		gbc_textValoration.gridx = 3;
		gbc_textValoration.gridy = 0;
		AppIfo.add(textValoration, gbc_textValoration);
		textValoration.setColumns(10);
		
		JPanel BottonsPanel = new JPanel();
		GridBagConstraints gbc_BottonsPanel = new GridBagConstraints();
		gbc_BottonsPanel.fill = GridBagConstraints.BOTH;
		gbc_BottonsPanel.gridx = 0;
		gbc_BottonsPanel.gridy = 2;
		contentPane.add(BottonsPanel, gbc_BottonsPanel);
		GridBagLayout gbl_BottonsPanel = new GridBagLayout();
		gbl_BottonsPanel.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_BottonsPanel.rowHeights = new int[]{0, 0};
		gbl_BottonsPanel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_BottonsPanel.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		BottonsPanel.setLayout(gbl_BottonsPanel);
		
		JButton btnReportProfile = new JButton("Report Profile");
		GridBagConstraints gbc_btnReportProfile = new GridBagConstraints();
		gbc_btnReportProfile.insets = new Insets(0, 0, 0, 5);
		gbc_btnReportProfile.gridx = 3;
		gbc_btnReportProfile.gridy = 0;
		BottonsPanel.add(btnReportProfile, gbc_btnReportProfile);
		
		JButton btnOpinions = new JButton("Opinions");
		GridBagConstraints gbc_btnOpinions = new GridBagConstraints();
		gbc_btnOpinions.gridx = 5;
		gbc_btnOpinions.gridy = 0;
		BottonsPanel.add(btnOpinions, gbc_btnOpinions);
	}

}
