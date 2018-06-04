package Gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Inicio extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio frame = new Inicio("ab");
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
	public String Name;
	public Inicio(String UserName) {
		Name= UserName;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{424, 0};
		gbl_contentPane.rowHeights = new int[]{23, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JButton SearchProfileButton = new JButton("Search Profile");
		SearchProfileButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) { new Searcher().setVisible(true);
			}
		});
		GridBagConstraints gbc_SearchProfileButton = new GridBagConstraints();
		gbc_SearchProfileButton.insets = new Insets(0, 0, 5, 0);
		gbc_SearchProfileButton.gridx = 0;
		gbc_SearchProfileButton.gridy = 2;
		contentPane.add(SearchProfileButton, gbc_SearchProfileButton);
		
		JButton SearchGroupButton = new JButton("Search Group");
		SearchGroupButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) { new Busqueda().setVisible(true);
			}
		});
		GridBagConstraints gbc_SearchGroupButton = new GridBagConstraints();
		gbc_SearchGroupButton.insets = new Insets(0, 0, 5, 0);
		gbc_SearchGroupButton.gridx = 0;
		gbc_SearchGroupButton.gridy = 4;
		contentPane.add(SearchGroupButton, gbc_SearchGroupButton);
		
		JButton ReportPlace = new JButton("Report Place");
		GridBagConstraints gbc_ReportPlace = new GridBagConstraints();
		gbc_ReportPlace.gridx = 0;
		gbc_ReportPlace.gridy = 6;
		contentPane.add(ReportPlace, gbc_ReportPlace);
	}

}
