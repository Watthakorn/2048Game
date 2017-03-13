package game_2048;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.print.attribute.standard.Destination;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;

public class FirstPage {

	static JFrame frmGame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstPage window = new FirstPage();
					window.frmGame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FirstPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frmGame.
	 */
	private void initialize() {
		frmGame = new JFrame();
		frmGame.setBounds(500, 100, 466, 489);
		frmGame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGame.getContentPane().setLayout(null);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBackground(Color.GRAY);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Credit nw = new Credit();
				nw.start();
				frmGame.setVisible(false);
			}
		});
		
		JLabel lblGame = new JLabel("");
		lblGame.setIcon(new ImageIcon(this.getClass().getResource("/2048gametran3.gif")));
		lblGame.setBounds(81, 44, 300, 150);
		frmGame.getContentPane().add(lblGame);
		btnNewButton_1.setIcon(new ImageIcon(this.getClass().getResource("/creditbutton4.jpg")));
		btnNewButton_1.setBounds(150, 300, 150, 75);
		frmGame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBackground(Color.GRAY);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SelectMode nw = new SelectMode();
				nw.open();
				frmGame.setVisible(false);
//				btnNewButton.setEnabled(false);
			}
		});
		btnNewButton.setIcon(new ImageIcon(this.getClass().getResource("/playbutton9.jpg")));
		btnNewButton.setBounds(150, 225, 150, 75);
		frmGame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmGame.dispose();
			}
		});
		btnNewButton_2.setIcon(new ImageIcon(this.getClass().getResource("/Exitbutton3.jpg")));
		btnNewButton_2.setBounds(150, 375, 150, 75);
		frmGame.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setForeground(Color.GREEN);
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setIcon(new ImageIcon(this.getClass().getResource("/MainMenu5.jpg")));
		lblNewLabel.setBounds(0, 0, 450, 450);
		frmGame.getContentPane().add(lblNewLabel);
	}
}
