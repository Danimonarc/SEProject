import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;

public class Resultados extends JFrame {

	private JPanel contentPane;
	private JTextField txtGroupDescription;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Resultados frame = new Resultados();
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
	public Resultados() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 193);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("See");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new groupOut().setVisible(true);
			}
		});
		btnNewButton.setBounds(12, 13, 69, 120);
		contentPane.add(btnNewButton);
		
		txtGroupDescription = new JTextField();
		txtGroupDescription.setHorizontalAlignment(SwingConstants.CENTER);
		txtGroupDescription.setText("Group description");
		txtGroupDescription.setBounds(93, 13, 201, 120);
		contentPane.add(txtGroupDescription);
		txtGroupDescription.setColumns(10);
		
		JLabel lblAddres = new JLabel("ADDRESS");
		lblAddres.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddres.setBounds(306, 62, 114, 30);
		contentPane.add(lblAddres);
		
		JLabel lblNewLabel = new JLabel("N\u00BA MEMBERS");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(306, 105, 116, 28);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("HOUR");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(306, 13, 114, 36);
		contentPane.add(lblNewLabel_1);
	}
}
