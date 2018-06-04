import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Searcher extends JFrame {

	private JPanel contentPane;
	private JTextField Name;
	private JPanel panel;
	private JTextField SUrnametxt;
	private JLabel lblNombre;
	private JLabel lblSurname;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Searcher frame = new Searcher();
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
	public Searcher() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JButton btnSearch = new JButton("Search");
		contentPane.add(btnSearch, BorderLayout.SOUTH);
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		lblNombre = new JLabel("Name");
		panel.add(lblNombre);
		
		Name = new JTextField();
		panel.add(Name);
		Name.setColumns(10);
		
		lblSurname = new JLabel("Surname");
		panel.add(lblSurname);
		
		SUrnametxt = new JTextField();
		panel.add(SUrnametxt);
		SUrnametxt.setColumns(10);
		
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) { 
				
				
			Perfil p = new Perfil("Send","Nudes","Now");
			p.setVisible(true);
			Name.getText();
			
			}
		});
	}

}
