package game_2048;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class SelectMode {

	static JFrame frmSelectPage;

	/**
	 * Launch the application.
	 */
	public void open() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SelectMode window = new SelectMode();
					window.frmSelectPage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SelectMode() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSelectPage = new JFrame();
		frmSelectPage.setTitle("Select Page");
		frmSelectPage.setAlwaysOnTop(true);
		frmSelectPage.setBounds(500, 100, 465, 488);
		frmSelectPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSelectPage.getContentPane().setLayout(null);
		
		JButton btnClassic = new JButton("");
		btnClassic.setIcon(new ImageIcon(this.getClass().getResource("/Classic.jpg")));
		btnClassic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				FirstPage.btnNewButton.setEnabled(true);
				Classic nw = new Classic();
				nw.GameStart();
				FirstPage.frmGame.setVisible(false);
				frmSelectPage.setVisible(false);
			}
		});
		btnClassic.setBounds(0, 0, 132, 187);
		frmSelectPage.getContentPane().add(btnClassic);
		
		JButton btnVersus = new JButton("");
		btnVersus.setIcon(new ImageIcon(this.getClass().getResource("/vs2.jpg")));
		btnVersus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				FirstPage.btnNewButton.setEnabled(true);
				Versus nw = new Versus();
				nw.GameStart();
				FirstPage.frmGame.setVisible(false);
				frmSelectPage.dispose();
			}
		});
		btnVersus.setBounds(132, 227, 132, 225);
		frmSelectPage.getContentPane().add(btnVersus);
		
		JButton btnOnlyMinute = new JButton("");
		btnOnlyMinute.setIcon(new ImageIcon(this.getClass().getResource("/30.jpg")));
		btnOnlyMinute.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				FirstPage.btnNewButton.setEnabled(true);
				TimerMode nw = new TimerMode();
				nw.GameStart();
				FirstPage.frmGame.setVisible(false);
				frmSelectPage.setVisible(false);
			}
		});
		
		JButton btnBomb = new JButton("");
		btnBomb.setIcon(new ImageIcon(this.getClass().getResource("/hi-sco-1.jpg")));
		btnBomb.setBounds(132, 186, 132, 40);
		frmSelectPage.getContentPane().add(btnBomb);
		btnBomb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				FirstPage.frmGame.setVisible(false);
				try {
					ScoreBoardBomb nw = new ScoreBoardBomb();
					nw.Score();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				frmSelectPage.setVisible(false);
			}
		});
		
		JButton btnSecs = new JButton("");
		btnSecs.setIcon(new ImageIcon(this.getClass().getResource("/hi-sco-1.jpg")));
		btnSecs.setBounds(0, 410, 132, 40);
		frmSelectPage.getContentPane().add(btnSecs);
		btnSecs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				FirstPage.frmGame.setVisible(false);
				try {
					ScoreBoardTime nw = new ScoreBoardTime();
					nw.Score();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				frmSelectPage.setVisible(false);
			}
		});
		btnOnlyMinute.setBounds(0, 227, 132, 186);
		frmSelectPage.getContentPane().add(btnOnlyMinute);
		
		JButton btnHelper = new JButton("");
		btnHelper.setIcon(new ImageIcon(this.getClass().getResource("/bomb2.jpg")));
		btnHelper.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				FirstPage.btnNewButton.setEnabled(true);
				Bomb nw = new Bomb();
				nw.GameStart();
				FirstPage.frmGame.setVisible(false);
				frmSelectPage.setVisible(false);
			}
		});
		btnHelper.setBounds(132, 0, 132, 187);
		frmSelectPage.getContentPane().add(btnHelper);
		
		JButton btnMainMenu = new JButton("");
		btnMainMenu.setIcon(new ImageIcon(this.getClass().getResource("/main-bg.jpg")));
		btnMainMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				FirstPage.frmGame.setVisible(true);
				frmSelectPage.dispose();
			}
		});
		btnMainMenu.setBounds(264, 410, 188, 40);
		frmSelectPage.getContentPane().add(btnMainMenu);
		
		JButton btnClsscore = new JButton("Clr_Score");
		btnClsscore.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				File file = new File("classic.txt");
				File file2 = new File("bomb.txt");
				File file3 = new File("time.txt");
				File fileR = new File("default.txt");
				FileWriter fWriter,fw2,fw3;
				try {
					FileReader fReader = new FileReader(fileR);
					BufferedReader bufReader = new BufferedReader(fReader);

					fWriter = new FileWriter(file);
					BufferedWriter bufWriter = new BufferedWriter(fWriter);
					fw2 = new FileWriter(file2);
					BufferedWriter bufWriter2 = new BufferedWriter(fw2);
					fw3 = new FileWriter(file3);
					BufferedWriter bufWriter3 = new BufferedWriter(fw3);
					
					String line;
					while((line=bufReader.readLine())!=null){
						bufWriter.write(line);
						bufWriter2.write(line);
						bufWriter3.write(line);
						bufWriter.newLine();
						bufWriter2.newLine();
						bufWriter3.newLine();
					}
					
					bufReader.close();
					bufWriter.close();
					bufWriter2.close();
					bufWriter3.close();
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnClsscore.setBounds(292, 368, 127, 23);
		frmSelectPage.getContentPane().add(btnClsscore);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(this.getClass().getResource("/hi-sco-2.jpg")));
		btnNewButton.setBounds(0, 186, 132, 40);
		frmSelectPage.getContentPane().add(btnNewButton);
		
		JLabel lblBg = new JLabel("BG");
		lblBg.setIcon(new ImageIcon(this.getClass().getResource("/bg-mode2.jpg")));
		lblBg.setBounds(262, 0, 185, 410);
		frmSelectPage.getContentPane().add(lblBg);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				FirstPage.frmGame.setVisible(false);
				try {
					ScoreBoardClassic nw = new ScoreBoardClassic();
					nw.Score();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				frmSelectPage.setVisible(false);
			}
		});
	}
}
