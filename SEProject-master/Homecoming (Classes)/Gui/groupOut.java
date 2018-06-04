import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class groupOut extends JFrame {

	private JPanel contentPane;
	private JTextField txtMembers;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					groupOut frame = new groupOut();
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
	public groupOut() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton sendRequestButton = new JButton("Send request");
		sendRequestButton.setBounds(12, 215, 408, 25);
		contentPane.add(sendRequestButton);
		
		txtMembers = new JTextField();
		txtMembers.setEditable(false);
		txtMembers.setHorizontalAlignment(SwingConstants.CENTER);
		txtMembers.setText("Members");
		txtMembers.setBounds(12, 13, 200, 22);
		contentPane.add(txtMembers);
		txtMembers.setColumns(10);
		
		JList list = new JList();
		list.setBorder(new LineBorder(new Color(0, 0, 0)));
		list.setBounds(12, 32, 200, 170);
		contentPane.add(list);
		
		JLabel lblHour = new JLabel("Hour");
		lblHour.setHorizontalAlignment(SwingConstants.CENTER);
		lblHour.setBounds(291, 16, 56, 16);
		contentPane.add(lblHour);
		
		JLabel lblOrigin = new JLabel("Origin");
		lblOrigin.setHorizontalAlignment(SwingConstants.CENTER);
		lblOrigin.setBounds(291, 83, 56, 16);
		contentPane.add(lblOrigin);
		
		JLabel lblDestination = new JLabel("Destination");
		lblDestination.setHorizontalAlignment(SwingConstants.CENTER);
		lblDestination.setBounds(283, 146, 77, 16);
		contentPane.add(lblDestination);
	}
}
