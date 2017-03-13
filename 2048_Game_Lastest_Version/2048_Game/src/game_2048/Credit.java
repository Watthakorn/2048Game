package game_2048;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Credit {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public void start() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Credit window = new Credit();
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
	public Credit() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(500, 100, 763, 604);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				FirstPage.frmGame.setVisible(true);
				frame.dispose();
			}
		});
		btnBack.setBounds(10, 531, 89, 23);
		frame.getContentPane().add(btnBack);
		
		JLabel lblCreditEiei = new JLabel("credit eiei");
		lblCreditEiei.setIcon(new ImageIcon(this.getClass().getResource("/Credit2.jpg")));
		lblCreditEiei.setBounds(0, 0, 754, 573);
		frame.getContentPane().add(lblCreditEiei);
	}
}
