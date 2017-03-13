package game_2048;

import gameFunction.Table4x4;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Label;

import javax.swing.JFrame;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Font;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Window.Type;

public class Versus{
	private Table4x4 table1 = new Table4x4();
	private Table4x4 table2 = new Table4x4();
	

	private JFrame frmVersusMode;
	private final JLabel label = new JLabel("");
	private final JLabel label_1 = new JLabel("");
	private final JLabel label_2 = new JLabel("");
	private final JLabel label_3 = new JLabel("");
	private final JLabel label_4 = new JLabel("Press");
	private final JLabel label_5 = new JLabel("Space");
	private final JLabel label_6 = new JLabel("to");
	private final JLabel label_7 = new JLabel("Start");
	private final JLabel label_9 = new JLabel("");
	private final JLabel label_8 = new JLabel("");
	private final JLabel label_10 = new JLabel("");
	private final JLabel label_11 = new JLabel("");
	private final JLabel label_12 = new JLabel("");
	private final JLabel label_13 = new JLabel("");
	private final JLabel label_14 = new JLabel("");
	private final JLabel label_15 = new JLabel("");
	private final JLabel label_17 = new JLabel("");
	private final JLabel label_18 = new JLabel("");
	private final JLabel label_19 = new JLabel("");
	private final JLabel label_20 = new JLabel("");
	private final JLabel label_21 = new JLabel("Press");
	private final JLabel label_22 = new JLabel("Space");
	private final JLabel label_23 = new JLabel("to");
	private final JLabel label_24 = new JLabel("Start");
	private final JLabel label_25 = new JLabel("");
	private final JLabel label_26 = new JLabel("");
	private final JLabel label_27 = new JLabel("");
	private final JLabel label_28 = new JLabel("");
	private final JLabel label_29 = new JLabel("");
	private final JLabel label_30 = new JLabel("");
	private final JLabel label_31 = new JLabel("");
	private final JLabel label_32 = new JLabel("");

	private final Label label_16 = new Label("Wait");
	private final Label label_33 = new Label("Wait");
	
	private final JLabel lblNewLabel = new JLabel("GAME OVER !");
	private final JButton btnMainMenu = new JButton("");
	private final JLabel lblGameOver = new JLabel("GAME OVER !");
	private final JLabel lblWin = new JLabel("WIN!");
	private final JLabel lblWin_2 = new JLabel("WIN!");
	private final JLabel lblLose = new JLabel("LOSE!");
	private final JLabel lblLose_2 = new JLabel("LOSE!");
	private final JLabel lblDraw = new JLabel("Draw!");
	static int check = 0;
	private final JLabel lblNewLabel_1 = new JLabel("New label");
	

	/**
	 * Launch the application.
	 */
	public void GameStart() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Versus window = new Versus();
					window.frmVersusMode.setVisible(true);
					check = 0;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	private void setItem(){
		label.setIcon(new ImageIcon(table1.getItem1()));
		label_1.setIcon(new ImageIcon(table1.getItem2()));
		label_2.setIcon(new ImageIcon(table1.getItem3()));
		label_3.setIcon(new ImageIcon(table1.getItem4()));
		
		label_4.setIcon(new ImageIcon(table1.getItem5()));
		label_5.setIcon(new ImageIcon(table1.getItem6()));
		label_6.setIcon(new ImageIcon(table1.getItem7()));
		label_7.setIcon(new ImageIcon(table1.getItem8()));
		
		label_8.setIcon(new ImageIcon(table1.getItem9()));
		label_9.setIcon(new ImageIcon(table1.getItem10()));
		label_10.setIcon(new ImageIcon(table1.getItem11()));
		label_11.setIcon(new ImageIcon(table1.getItem12()));
		
		label_12.setIcon(new ImageIcon(table1.getItem13()));
		label_13.setIcon(new ImageIcon(table1.getItem14()));
		label_14.setIcon(new ImageIcon(table1.getItem15()));
		label_15.setIcon(new ImageIcon(table1.getItem16()));
		
		label_17.setIcon(new ImageIcon(table2.getItem1()));
		label_18.setIcon(new ImageIcon(table2.getItem2()));
		label_19.setIcon(new ImageIcon(table2.getItem3()));
		label_20.setIcon(new ImageIcon(table2.getItem4()));
		
		label_21.setIcon(new ImageIcon(table2.getItem5()));
		label_22.setIcon(new ImageIcon(table2.getItem6()));
		label_23.setIcon(new ImageIcon(table2.getItem7()));
		label_24.setIcon(new ImageIcon(table2.getItem8()));
		
		label_25.setIcon(new ImageIcon(table2.getItem9()));
		label_26.setIcon(new ImageIcon(table2.getItem10()));
		label_27.setIcon(new ImageIcon(table2.getItem11()));
		label_28.setIcon(new ImageIcon(table2.getItem12()));
		
		label_29.setIcon(new ImageIcon(table2.getItem13()));
		label_30.setIcon(new ImageIcon(table2.getItem14()));
		label_31.setIcon(new ImageIcon(table2.getItem15()));
		label_32.setIcon(new ImageIcon(table2.getItem16()));
		
		label_16.setText(table1.getScore());
		label_33.setText(table2.getScore());

	}
	/**
	 * Create the application.
	 */
	public Versus() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmVersusMode = new JFrame();
		frmVersusMode.setAlwaysOnTop(true);
		frmVersusMode.setType(Type.UTILITY);
		frmVersusMode.setTitle("Versus Mode");
		frmVersusMode.getContentPane().setBackground(new Color(255, 153, 102));

		
		
		frmVersusMode.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if (check==1){
									
					if (e.getKeyCode() == KeyEvent.VK_D) {
						table1.right();
		        	}
					if (e.getKeyCode() == KeyEvent.VK_A) {
		        		table1.left();
		        	}
		        	if (e.getKeyCode() == KeyEvent.VK_W) {
		        		table1.up();
		        	}
		        	if (e.getKeyCode() == KeyEvent.VK_S) {
		        		table1.down();
		        	}
		        	if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
						table2.right();
		        	}
		        	if (e.getKeyCode() == KeyEvent.VK_LEFT) {
		        		table2.left();
		        }
		        	if (e.getKeyCode() == KeyEvent.VK_UP) {
		        		table2.up();
		        	}
		        	if (e.getKeyCode() == KeyEvent.VK_DOWN) {
		        		table2.down();
		        	}
				}
				
		        if (e.getKeyCode() == KeyEvent.VK_SPACE){
		        	lblNewLabel.setVisible(false);
		        	lblGameOver.setVisible(false);
					lblWin.setVisible(false);
					lblWin_2.setVisible(false);
					lblLose.setVisible(false);
					lblLose_2.setVisible(false);
					lblDraw.setVisible(false);
		        	table1.start();
		        	table2.start();
		        	check = 1;
		        }
				setItem();
				
//		        table1.printTable();
				
		        if(!(table1.gameOver())&&check == 1)
		        	lblNewLabel.setVisible(true);
		        
		        if(!(table2.gameOver())&&check == 1)
		        	lblGameOver.setVisible(true);
		    
		        
				if(((!table1.gameOver()&&!table2.gameOver())&&check == 1)||table1.gameOver(true)||table2.gameOver(true)){
					check=0;
					if(table1.gameOver(true)){
						lblWin.setVisible(true);
						lblLose_2.setVisible(true);
					}
					if(table2.gameOver(true)){
						lblWin_2.setVisible(true);
						lblLose.setVisible(true);
					}
					
						
					if(table1.getScore(0)>table2.getScore(0)){
						lblWin.setVisible(true);
						lblLose_2.setVisible(true);
					}
					else if (table1.getScore(0)<table2.getScore(0)){
						lblWin_2.setVisible(true);
						lblLose.setVisible(true);
						
					}
					else{
						lblDraw.setVisible(true);
						
					}
				}
//				System.out.println();
					
			}
		});
		
		frmVersusMode.setFocusable(true);
		frmVersusMode.setBounds(350, 100, 928, 448);
		frmVersusMode.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmVersusMode.getContentPane().setLayout(null);
		lblNewLabel.setForeground(Color.RED);
		
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 43));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setVisible(false);
		lblGameOver.setForeground(Color.RED);
		lblGameOver.setHorizontalAlignment(SwingConstants.CENTER);
		lblGameOver.setFont(new Font("Dialog", Font.BOLD, 43));
		lblGameOver.setVisible(false);
		
		JButton btnHelp = new JButton("");
		btnHelp.setBackground(Color.WHITE);
		btnHelp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(frmVersusMode, "Click Start game or press space bar to Start\n"
						+ "Player 1: W A S D \n"
						+ "Player 2: UP LEFT DOWN RIGHT \n",
						"How to play",
						JOptionPane.INFORMATION_MESSAGE
						);
			}
		});
		btnHelp.setFocusable(false);
		btnHelp.setIcon(new ImageIcon(this.getClass().getResource("/HelpN.jpg")));
		btnHelp.setBounds(852, 350, 51, 51);
		frmVersusMode.getContentPane().add(btnHelp);
		lblGameOver.setBounds(584, 137, 318, 75);
		
		frmVersusMode.getContentPane().add(lblGameOver);
		lblNewLabel.setBounds(10, 125, 318, 99);		
		frmVersusMode.getContentPane().add(lblNewLabel);
		
		label.setIcon(new ImageIcon(this.getClass().getResource("/blank.png")));
		label.setFont(new Font("Algerian", Font.BOLD, 15));		
		label.setBackground(Color.WHITE);
		label.setBounds(10, 10, 75, 75);
		frmVersusMode.getContentPane().add(label);
		
		label_1.setIcon(new ImageIcon(this.getClass().getResource("/blank.png")));
		label_1.setFont(new Font("Algerian", Font.BOLD, 15));		
		
		label_1.setBackground(Color.WHITE);
		label_1.setBounds(91, 10, 75, 75);
		frmVersusMode.getContentPane().add(label_1);
		
		label_2.setIcon(new ImageIcon(this.getClass().getResource("/blank.png")));
		label_2.setFont(new Font("Algerian", Font.BOLD, 15));		
		label_2.setBackground(Color.WHITE);
		label_2.setBounds(172, 10, 75, 75);
		frmVersusMode.getContentPane().add(label_2);
		
		label_3.setIcon(new ImageIcon(this.getClass().getResource("/blank.png")));
		label_3.setFont(new Font("Algerian", Font.BOLD, 15));		
		label_3.setBackground(Color.WHITE);
		label_3.setBounds(253, 10, 75, 75);
		frmVersusMode.getContentPane().add(label_3);
		
		label_4.setIcon(new ImageIcon(this.getClass().getResource("/blank.png")));
		label_4.setFont(new Font("Algerian", Font.BOLD, 15));		
		label_4.setBackground(Color.WHITE);
		label_4.setBounds(10, 91, 75, 75);
		frmVersusMode.getContentPane().add(label_4);
		
		label_5.setIcon(new ImageIcon(this.getClass().getResource("/blank.png")));
		label_5.setFont(new Font("Algerian", Font.BOLD, 15));		
		label_5.setBackground(Color.WHITE);
		label_5.setBounds(91, 91, 75, 75);
		frmVersusMode.getContentPane().add(label_5);
		
		label_6.setIcon(new ImageIcon(this.getClass().getResource("/blank.png")));
		label_6.setFont(new Font("Algerian", Font.BOLD, 15));		
		label_6.setBackground(Color.WHITE);
		label_6.setBounds(172, 91, 75, 75);
		frmVersusMode.getContentPane().add(label_6);
		
		label_7.setIcon(new ImageIcon(this.getClass().getResource("/blank.png")));
		label_7.setFont(new Font("Algerian", Font.BOLD, 15));		
		label_7.setBackground(Color.WHITE);
		label_7.setBounds(253, 91, 75, 75);
		frmVersusMode.getContentPane().add(label_7);
		
		label_8.setIcon(new ImageIcon(this.getClass().getResource("/blank.png")));
		label_8.setFont(new Font("Algerian", Font.BOLD, 15));		
		label_8.setBackground(Color.WHITE);
		label_8.setBounds(10, 172, 75, 75);
		frmVersusMode.getContentPane().add(label_8);
		
		label_9.setIcon(new ImageIcon(this.getClass().getResource("/blank.png")));
		label_9.setFont(new Font("Algerian", Font.BOLD, 15));
				label_9.setBackground(Color.WHITE);
		label_9.setBounds(91, 172, 75, 75);
		frmVersusMode.getContentPane().add(label_9);
		
		label_10.setIcon(new ImageIcon(this.getClass().getResource("/blank.png")));
		label_10.setFont(new Font("Algerian", Font.BOLD, 15));		
		label_10.setBackground(Color.WHITE);
		label_10.setBounds(172, 172, 75, 75);
		frmVersusMode.getContentPane().add(label_10);
		
		label_11.setIcon(new ImageIcon(this.getClass().getResource("/blank.png")));
		label_11.setFont(new Font("Algerian", Font.BOLD, 15));		
		label_11.setBackground(Color.WHITE);
		label_11.setBounds(253, 172, 75, 75);
		frmVersusMode.getContentPane().add(label_11);
		
		label_12.setIcon(new ImageIcon(this.getClass().getResource("/blank.png")));
		label_12.setFont(new Font("Algerian", Font.BOLD, 15));
		label_12.setBackground(Color.WHITE);
		label_12.setBounds(10, 252, 75, 75);
		frmVersusMode.getContentPane().add(label_12);
		
		label_13.setIcon(new ImageIcon(this.getClass().getResource("/blank.png")));
		label_13.setFont(new Font("Algerian", Font.BOLD, 15));
		label_13.setBackground(Color.WHITE);
		label_13.setBounds(91, 252, 75, 75);
		frmVersusMode.getContentPane().add(label_13);
		
		label_14.setIcon(new ImageIcon(this.getClass().getResource("/blank.png")));
		label_14.setFont(new Font("Algerian", Font.BOLD, 15));
		label_14.setBackground(Color.WHITE);
		label_14.setBounds(172, 252, 75, 75);
		frmVersusMode.getContentPane().add(label_14);
		
		label_15.setIcon(new ImageIcon(this.getClass().getResource("/blank.png")));
		label_15.setFont(new Font("Algerian", Font.BOLD, 15));
		label_15.setBackground(Color.WHITE);
		label_15.setBounds(253, 252, 75, 75);
		frmVersusMode.getContentPane().add(label_15);
		
		label_16.setForeground(new Color(0, 0, 0));
		label_16.setBackground(new Color(255, 255, 255));
		label_16.setBounds(334, 10, 111, 22);
		frmVersusMode.getContentPane().add(label_16);
		
//		JButton btnHello = new JButton("Hello");
//		btnHello.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent arg0) {
//				table1.winCheat();
//				setItem();
//			}
//		});
//		btnHello.setBounds(10, 364, 75, 22);
//		btnHello.setFocusable(false);
//		frmVersusMode.getContentPane().add(btnHello);
		
		btnMainMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FirstPage.frmGame.setVisible(true);
				frmVersusMode.dispose();
			}
		});
		btnMainMenu.setBounds(403, 350, 111, 37);
		btnMainMenu.setIcon(new ImageIcon(this.getClass().getResource("/MainMenu.png")));
		
		frmVersusMode.getContentPane().add(btnMainMenu);
		
		label_17.setIcon(new ImageIcon(this.getClass().getResource("/blank.png")));
		label_17.setBackground(Color.WHITE);
		label_17.setBounds(584, 10, 75, 75);
		frmVersusMode.getContentPane().add(label_17);
		
		label_18.setIcon(new ImageIcon(this.getClass().getResource("/blank.png")));
		label_18.setBackground(Color.WHITE);
		label_18.setBounds(665, 10, 75, 75);
		frmVersusMode.getContentPane().add(label_18);
		
		label_19.setIcon(new ImageIcon(this.getClass().getResource("/blank.png")));
		label_19.setBackground(Color.WHITE);
		label_19.setBounds(746, 10, 75, 75);
		frmVersusMode.getContentPane().add(label_19);
		
		label_20.setIcon(new ImageIcon(this.getClass().getResource("/blank.png")));
		label_20.setBackground(Color.WHITE);
		label_20.setBounds(827, 10, 75, 75);
		frmVersusMode.getContentPane().add(label_20);
		
		label_21.setIcon(new ImageIcon(this.getClass().getResource("/blank.png")));
		label_21.setBackground(Color.WHITE);
		label_21.setBounds(584, 91, 75, 75);
		frmVersusMode.getContentPane().add(label_21);
		
		label_22.setIcon(new ImageIcon(this.getClass().getResource("/blank.png")));
		label_22.setBackground(Color.WHITE);
		label_22.setBounds(665, 91, 75, 75);
		frmVersusMode.getContentPane().add(label_22);
		
		label_23.setIcon(new ImageIcon(this.getClass().getResource("/blank.png")));
		label_23.setBackground(Color.WHITE);
		label_23.setBounds(746, 91, 75, 75);
		frmVersusMode.getContentPane().add(label_23);
		
		label_24.setIcon(new ImageIcon(this.getClass().getResource("/blank.png")));
		label_24.setBackground(Color.WHITE);
		label_24.setBounds(827, 91, 75, 75);
		frmVersusMode.getContentPane().add(label_24);
		
		label_25.setIcon(new ImageIcon(this.getClass().getResource("/blank.png")));
		label_25.setBackground(Color.WHITE);
		label_25.setBounds(584, 172, 75, 75);
		frmVersusMode.getContentPane().add(label_25);
		
		label_26.setIcon(new ImageIcon(this.getClass().getResource("/blank.png")));
		label_26.setBackground(Color.WHITE);
		label_26.setBounds(665, 172, 75, 75);
		frmVersusMode.getContentPane().add(label_26);
		
		label_27.setIcon(new ImageIcon(this.getClass().getResource("/blank.png")));
		label_27.setBackground(Color.WHITE);
		label_27.setBounds(746, 172, 75, 75);
		frmVersusMode.getContentPane().add(label_27);
		
		label_28.setIcon(new ImageIcon(this.getClass().getResource("/blank.png")));
		label_28.setBackground(Color.WHITE);
		label_28.setBounds(827, 172, 75, 75);
		frmVersusMode.getContentPane().add(label_28);
		
		label_29.setIcon(new ImageIcon(this.getClass().getResource("/blank.png")));
		label_29.setBackground(Color.WHITE);
		label_29.setBounds(584, 252, 75, 75);
		frmVersusMode.getContentPane().add(label_29);
		
		label_30.setIcon(new ImageIcon(this.getClass().getResource("/blank.png")));
		label_30.setBackground(Color.WHITE);
		label_30.setBounds(665, 252, 75, 75);
		frmVersusMode.getContentPane().add(label_30);
		
		label_31.setIcon(new ImageIcon(this.getClass().getResource("/blank.png")));
		label_31.setBackground(Color.WHITE);
		label_31.setBounds(746, 252, 75, 75);
		frmVersusMode.getContentPane().add(label_31);
		
		label_32.setIcon(new ImageIcon(this.getClass().getResource("/blank.png")));
		label_32.setBackground(Color.WHITE);
		label_32.setBounds(827, 252, 75, 75);
		frmVersusMode.getContentPane().add(label_32);
		
		label_33.setAlignment(Label.RIGHT);
		label_33.setForeground(Color.WHITE);
		label_33.setBackground(Color.BLACK);
		label_33.setBounds(467, 10, 111, 22);
		frmVersusMode.getContentPane().add(label_33);
		
		lblWin.setForeground(Color.YELLOW);
		lblWin.setFont(new Font("Tempus Sans ITC", Font.BOLD, 31));
		lblWin.setHorizontalAlignment(SwingConstants.CENTER);
		lblWin.setBounds(338, 38, 107, 60);
		lblWin.setVisible(false);
		frmVersusMode.getContentPane().add(lblWin);
		
		lblWin_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblWin_2.setForeground(Color.YELLOW);
		lblWin_2.setFont(new Font("Tempus Sans ITC", Font.BOLD, 31));
		lblWin_2.setBounds(455, 38, 107, 60);
		lblWin_2.setVisible(false);
		frmVersusMode.getContentPane().add(lblWin_2);
		
		lblLose.setHorizontalAlignment(SwingConstants.CENTER);
		lblLose.setForeground(Color.RED);
		lblLose.setFont(new Font("Tempus Sans ITC", Font.BOLD, 31));
		lblLose.setBounds(338, 211, 107, 60);
		lblLose.setVisible(false);
		frmVersusMode.getContentPane().add(lblLose);
		
		lblLose_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblLose_2.setForeground(Color.RED);
		lblLose_2.setFont(new Font("Tempus Sans ITC", Font.BOLD, 31));
		lblLose_2.setBounds(467, 211, 107, 60);
		lblLose_2.setVisible(false);
		frmVersusMode.getContentPane().add(lblLose_2);
		
		lblDraw.setForeground(Color.CYAN);
		lblDraw.setFont(new Font("Segoe Print", Font.BOLD, 33));
		lblDraw.setHorizontalAlignment(SwingConstants.CENTER);
		lblDraw.setBounds(403, 45, 107, 53);
		lblDraw.setVisible(false);
		frmVersusMode.getContentPane().add(lblDraw);
		
		JButton btnStartButton = new JButton("");
		btnStartButton.setIcon(new ImageIcon(this.getClass().getResource("/startbutton.jpg")));
		btnStartButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
	        	lblNewLabel.setVisible(false);
	        	lblGameOver.setVisible(false);
				lblWin.setVisible(false);
				lblWin_2.setVisible(false);
				lblLose.setVisible(false);
				lblLose_2.setVisible(false);
				lblDraw.setVisible(false);
	        	table1.start();
	        	table2.start();
				setItem();
	        	check = 1;
			}
		});
		btnStartButton.setFocusable(false);
		btnStartButton.setBounds(403, 290, 111, 37);
		frmVersusMode.getContentPane().add(btnStartButton);
		lblNewLabel_1.setIcon(new ImageIcon(this.getClass().getResource("/VersusBg.jpg")));
		lblNewLabel_1.setBounds(0, 0, 912, 409);
		
		frmVersusMode.getContentPane().add(lblNewLabel_1);
	}
}
