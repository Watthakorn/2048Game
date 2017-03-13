package game_2048;

import gameFunction.Table4x4;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Label;

import javax.swing.JFrame;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.Font;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Window.Type;
import javax.swing.JTextField;

public class Bomb{
	private Table4x4 table = new Table4x4();
	
	//Create All label button variable ...
	private JFrame frmBomb;
	JButton btn00 = new JButton("");
	JButton btn01 = new JButton("");
	JButton btn03 = new JButton("");
	JButton btn04 = new JButton("");
	JButton btn10 = new JButton("");
	JButton btn11 = new JButton("");
	JButton btn12 = new JButton("");
	JButton btn13 = new JButton("");
	JButton btn21 = new JButton("");
	JButton btn20 = new JButton("");
	JButton btn22 = new JButton("");
	JButton btn23 = new JButton("");
	JButton btn30 = new JButton("");
	JButton btn31 = new JButton("");
	JButton btn32 = new JButton("");
	JButton btn33 = new JButton("");
	Label lblScore = new Label("Wait");
	JLabel lblYouWin = new JLabel("You Win!");
	JLabel lblYouLose = new JLabel("You Lose!");
	JLabel lblX = new JLabel("x3");
	JLabel lblX_1 = new JLabel("x3");
	JLabel lblX_2 = new JLabel("x3");
	private final JButton btnMainMenu = new JButton("");
	private final JButton btnStartButton = new JButton("");
	private final JLabel lblBomb = new JLabel("");
	int bomb,rbomb,cbomb;
	private JButton btnRow_2;
	private JTextField textField;
	JLabel lblName = new JLabel("Name");
	JButton btnPutScore = new JButton("Submit");
	static int check = 0;
	private final JLabel lblBg = new JLabel("");
	/**
	 * @wbp.nonvisual location=727,429
	 */
	private final JButton button = new JButton("New button");
	

	/**
	 * Launch the application.
	 */
	public void GameStart() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bomb window = new Bomb();
					window.frmBomb.setVisible(true);
					check = 0;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	//Set all item to present
	private void setItem(){
		btn00.setIcon(new ImageIcon(table.getItem1()));
		btn01.setIcon(new ImageIcon(table.getItem2()));
		btn03.setIcon(new ImageIcon(table.getItem3()));
		btn04.setIcon(new ImageIcon(table.getItem4()));
		
		btn10.setIcon(new ImageIcon(table.getItem5()));
		btn11.setIcon(new ImageIcon(table.getItem6()));
		btn12.setIcon(new ImageIcon(table.getItem7()));
		btn13.setIcon(new ImageIcon(table.getItem8()));
		
		btn20.setIcon(new ImageIcon(table.getItem9()));
		btn21.setIcon(new ImageIcon(table.getItem10()));
		btn22.setIcon(new ImageIcon(table.getItem11()));
		btn23.setIcon(new ImageIcon(table.getItem12()));
		
		btn30.setIcon(new ImageIcon(table.getItem13()));
		btn31.setIcon(new ImageIcon(table.getItem14()));
		btn32.setIcon(new ImageIcon(table.getItem15()));
		btn33.setIcon(new ImageIcon(table.getItem16()));
		
		lblScore.setText(table.getScore());
		
		lblX.setText("x"+bomb);
		lblX_1.setText("x"+rbomb);
		lblX_2.setText("x"+cbomb);

	}
	/**
	 * Create the application.
	 */
	public Bomb() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBomb = new JFrame();
		frmBomb.setAlwaysOnTop(true);
		frmBomb.setType(Type.UTILITY);
		frmBomb.setTitle("Helper Mode");
		frmBomb.getContentPane().setBackground(Color.GREEN);

		
		//wait for user Press/Released arrow keys
		frmBomb.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
					table.right();
		        }
		        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
		        	table.left();
		        }
		        if (e.getKeyCode() == KeyEvent.VK_UP) {
		        	table.up();
		        }
		        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
		        	table.down();
		        }
		        if (e.getKeyCode() == KeyEvent.VK_SPACE){
		        	lblYouWin.setVisible(false);
		        	lblYouLose.setVisible(false);
		        	table.start();
					bomb = 3;
					rbomb = 3;
					cbomb = 3;
					check = 1;
		        }
				setItem();
				
//		        table.printTable();
		        if(!(table.gameOver())&&bomb==0&&rbomb==0&&cbomb==0&&check==1){
		        	if(table.gameOver(true))
		        		lblYouWin.setVisible(true);
		        	else
		        		lblYouLose.setVisible(true);
		        	textField.setVisible(true);
		        	lblName.setVisible(true);
		        	btnPutScore.setVisible(true);
		        }
//				System.out.println();
			}
		});
		//Create frame of bomb mode
		frmBomb.setFocusable(true);
		frmBomb.setBounds(500, 100, 601, 489);
		frmBomb.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBomb.getContentPane().setLayout(null);
		
		//Create label win and set to invisible
		lblYouWin.setForeground(Color.YELLOW);
		lblYouWin.setFont(new Font("Tekton Pro Ext", Font.BOLD, 33));
		lblYouWin.setHorizontalAlignment(SwingConstants.CENTER);
		lblYouWin.setBounds(404, 42, 160, 64);
		lblYouWin.setVisible(false);
		frmBomb.getContentPane().add(lblYouWin);
		
		//Create label lose and set to invisible
		lblYouLose.setForeground(Color.RED);
		lblYouLose.setFont(new Font("Dialog", Font.BOLD, 31));
		lblYouLose.setHorizontalAlignment(SwingConstants.CENTER);
		lblYouLose.setVisible(false);
		lblYouLose.setBounds(404, 38, 160, 64);
		frmBomb.getContentPane().add(lblYouLose);
		
		//Create button of table 00 to 33 and set action for bomb
		/*Start*/
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(bomb!=0&&table.getItem1(true)!=0){
					table.setItem1(0);
					bomb--;
				}
				setItem();
			}
		});	
		btn00.setBackground(Color.WHITE);
		btn00.setBounds(10, 10, 75, 75);
		btn00.setFocusable(false);
		frmBomb.getContentPane().add(btn00);
		
		
		btn01.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(bomb!=0&&table.getItem2(true)!=0){
					table.setItem2(0);
					bomb--;
				}
				setItem();
			}
		});	
		btn01.setBackground(Color.WHITE);
		btn01.setBounds(91, 10, 75, 75);
		btn01.setFocusable(false);
		frmBomb.getContentPane().add(btn01);

		btn03.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(bomb!=0&&table.getItem3(true)!=0){
					table.setItem3(0);
					bomb--;
				}
				setItem();
			}
		});	
		btn03.setBackground(Color.WHITE);
		btn03.setBounds(172, 10, 75, 75);
		btn03.setFocusable(false);
		frmBomb.getContentPane().add(btn03);
		
		btn04.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				table.setItem4(0);
				setItem();
			}
		});	
		btn04.setBackground(Color.WHITE);
		btn04.setBounds(253, 10, 75, 75);
		btn04.setFocusable(false);
		frmBomb.getContentPane().add(btn04);
		
		btn10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(bomb!=0&&table.getItem5(true)!=0){
					table.setItem5(0);
					bomb--;
				}
				setItem();
			}
		});	
		btn10.setBackground(Color.WHITE);
		btn10.setBounds(10, 91, 75, 75);
		btn10.setFocusable(false);
		frmBomb.getContentPane().add(btn10);
		
		btn11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(bomb!=0&&table.getItem6(true)!=0){
					table.setItem6(0);
					bomb--;
				}
				setItem();
			}
		});	
		btn11.setBackground(Color.WHITE);
		btn11.setBounds(91, 91, 75, 75);
		btn11.setFocusable(false);
		frmBomb.getContentPane().add(btn11);
		
		btn12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(bomb!=0&&table.getItem7(true)!=0){	
					table.setItem7(0);
					bomb--;
				}
				setItem();
			}
		});	
		btn12.setBackground(Color.WHITE);
		btn12.setBounds(172, 91, 75, 75);
		btn12.setFocusable(false);
		frmBomb.getContentPane().add(btn12);
		
		btn13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(bomb!=0&&table.getItem8(true)!=0){
					table.setItem8(0);
					bomb--;
				}
				setItem();
			}
		});	
		btn13.setBackground(Color.WHITE);
		btn13.setBounds(253, 91, 75, 75);
		btn13.setFocusable(false);
		frmBomb.getContentPane().add(btn13);
		
		btn20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(bomb!=0&&table.getItem9(true)!=0){
					table.setItem9(0);
					bomb--;
				}
				setItem();
			}
		});	
		btn20.setBackground(Color.WHITE);
		btn20.setBounds(10, 172, 75, 75);
		btn20.setFocusable(false);
		frmBomb.getContentPane().add(btn20);
		
		btn21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(bomb!=0&&table.getItem10(true)!=0){
					table.setItem10(0);
					bomb--;
				}
				setItem();
			}
		});	
		btn21.setBackground(Color.WHITE);
		btn21.setBounds(91, 172, 75, 75);
		btn21.setFocusable(false);
		frmBomb.getContentPane().add(btn21);
		
		btn22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(bomb!=0&&table.getItem11(true)!=0){
					table.setItem11(0);
					bomb--;
				}
				setItem();
			}
		});	
		btn22.setBackground(Color.WHITE);
		btn22.setBounds(172, 172, 75, 75);
		btn22.setFocusable(false);
		frmBomb.getContentPane().add(btn22);
		
		btn23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(bomb!=0&&table.getItem12(true)!=0){
					table.setItem12(0);
					bomb--;
				}
				setItem();
			}
		});	
		btn23.setBackground(Color.WHITE);
		btn23.setBounds(253, 172, 75, 75);
		btn23.setFocusable(false);
		frmBomb.getContentPane().add(btn23);
		
		btn30.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(bomb!=0&&table.getItem13(true)!=0){
					table.setItem13(0);
					bomb--;
				}
				setItem();
			}
		});	
		btn30.setBackground(Color.WHITE);
		btn30.setBounds(10, 252, 75, 75);
		btn30.setFocusable(false);
		frmBomb.getContentPane().add(btn30);
		
		btn31.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(bomb!=0&&table.getItem14(true)!=0){
					table.setItem14(0);
					bomb--;
				}
				setItem();
			}
		});	
		btn31.setBackground(Color.WHITE);
		btn31.setBounds(91, 252, 75, 75);
		btn31.setFocusable(false);
		frmBomb.getContentPane().add(btn31);
		
		btn32.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(bomb!=0&&table.getItem15(true)!=0){
					table.setItem15(0);
					bomb--;
				}
				setItem();
			}
		});	
		btn32.setBackground(Color.WHITE);
		btn32.setBounds(172, 252, 75, 75);
		btn32.setFocusable(false);
		frmBomb.getContentPane().add(btn32);
		
		btn33.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(bomb!=0&&table.getItem16(true)!=0){
					table.setItem16(0);
					bomb--;
				}
				setItem();
			}
		});	
		btn33.setBackground(Color.WHITE);
		btn33.setBounds(253, 252, 75, 75);
		btn33.setFocusable(false);
		frmBomb.getContentPane().add(btn33);
		/*End 00 - 33*/
		
		//Create label to present score
		lblScore.setForeground(Color.WHITE);
		lblScore.setBackground(Color.BLACK);
		lblScore.setBounds(402, 10, 164, 22);
		frmBomb.getContentPane().add(lblScore);
		
		//cheat button set score and table00-33 to 2048
//		JButton btnHello = new JButton("Hello");
//		btnHello.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent arg0) {
//				table.winCheat();
//				lblYouWin.setVisible(true);
//				setItem();
//			}
//		});
//		btnHello.setBounds(450, 219, 75, 22);
//		btnHello.setFocusable(false);
//		frmBomb.getContentPane().add(btnHello);
		
		//Create main menu button and set action to set First page to visible
		btnMainMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FirstPage.frmGame.setVisible(true);
				frmBomb.dispose();
			}
		});
		btnMainMenu.setBounds(217, 387, 111, 37);
		btnMainMenu.setIcon(new ImageIcon(this.getClass().getResource("/MainMenu.png")));
		frmBomb.getContentPane().add(btnMainMenu);
		btnStartButton.setIcon(new ImageIcon(this.getClass().getResource("/startbutton.jpg")));
		
		//Create start button and action to set game to start
		btnStartButton.setBounds(437, 249, 111, 37);
		btnStartButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				bomb = 3;
				rbomb = 3;
				cbomb = 3;
				check = 1;
				lblYouWin.setVisible(false);
	        	lblYouLose.setVisible(false);
	        	table.start();
				setItem();
			}
		});
		btnStartButton.setFocusable(false);
		frmBomb.getContentPane().add(btnStartButton);
		lblBomb.setIcon(new ImageIcon(Bomb.class.getResource("/bomba.gif")));
		
		//Create label Bomb
		lblBomb.setHorizontalAlignment(SwingConstants.CENTER);
		lblBomb.setBounds(474, 98, 30, 30);
		lblBomb.setFocusable(false);
		frmBomb.getContentPane().add(lblBomb);
		
		//Create label for show number of bomb left
		lblX.setBounds(523, 106, 18, 22);
		frmBomb.getContentPane().add(lblX);
		
		//Create label row bomb
		JLabel lblRbomb = new JLabel("");
		lblRbomb.setIcon(new ImageIcon(this.getClass().getResource("/rbomb.gif")));
		lblRbomb.setBounds(474, 136, 30, 30);
		frmBomb.getContentPane().add(lblRbomb);
		
		//Create label column bomb
		JLabel lblCbomb = new JLabel("");
		lblCbomb.setIcon(new ImageIcon(this.getClass().getResource("/cbomb.gif")));
		lblCbomb.setBounds(474, 172, 30, 30);
		frmBomb.getContentPane().add(lblCbomb);
		
		//Create label for show number of rBomb left
		lblX_1.setBounds(523, 139, 18, 14);
		frmBomb.getContentPane().add(lblX_1);

		//Create label for show number of cBomb left
		lblX_2.setBounds(523, 174, 18, 14);
		frmBomb.getContentPane().add(lblX_2);
		
		//Create button row1-4 for select row bomb active
		/*Start*/
		JButton btnRow_1 = new JButton("<");
		btnRow_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rbomb!=0){
					table.setItem1(0);
					table.setItem2(0);
					table.setItem3(0);
					table.setItem4(0);
					rbomb--;
				}
				setItem();
			}
		});
		btnRow_1.setFocusable(false);
		btnRow_1.setBounds(338, 38, 46, 23);
		frmBomb.getContentPane().add(btnRow_1);
		
		btnRow_2 = new JButton("<");
		btnRow_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rbomb!=0){
					table.setItem5(0);
					table.setItem6(0);
					table.setItem7(0);
					table.setItem8(0);
					rbomb--;
				}
				setItem();
			}
		});
		btnRow_2.setFocusable(false);
		btnRow_2.setBounds(338, 115, 46, 23);
		frmBomb.getContentPane().add(btnRow_2);
		
		JButton btnRow_3 = new JButton("<");
		btnRow_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rbomb!=0){
					table.setItem9(0);
					table.setItem10(0);
					table.setItem11(0);
					table.setItem12(0);
					rbomb--;
				}
				setItem();
			}
		});
		btnRow_3.setFocusable(false);
		btnRow_3.setBounds(338, 198, 46, 23);
		frmBomb.getContentPane().add(btnRow_3);
		
		JButton btnRow_4 = new JButton("<");
		btnRow_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rbomb!=0){
					table.setItem13(0);
					table.setItem14(0);
					table.setItem15(0);
					table.setItem16(0);
					rbomb--;
				}
				setItem();
			}
		});
		btnRow_4.setFocusable(false);
		btnRow_4.setBounds(338, 278, 46, 23);
		frmBomb.getContentPane().add(btnRow_4);
		/*End btn Row1-4*/
		
		//Create button for select column bomb active
		/*Start*/
		JButton btnCol_4 = new JButton("^");
		btnCol_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cbomb!=0){
					table.setItem4(0);
					table.setItem8(0);
					table.setItem12(0);
					table.setItem16(0);
					cbomb--;
				}
				setItem();
			}
		});
		btnCol_4.setFocusable(false);
		btnCol_4.setBounds(270, 349, 46, 23);
		frmBomb.getContentPane().add(btnCol_4);
		
		JButton btnCol_3 = new JButton("^");
		btnCol_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cbomb!=0){
					table.setItem3(0);
					table.setItem7(0);
					table.setItem11(0);
					table.setItem15(0);
					cbomb--;
				}
				setItem();
			}
		});
		btnCol_3.setFocusable(false);
		btnCol_3.setBounds(192, 349, 46, 23);
		frmBomb.getContentPane().add(btnCol_3);
		
		JButton btnCol_2 = new JButton("^");
		btnCol_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cbomb!=0){
					table.setItem2(0);
					table.setItem6(0);
					table.setItem10(0);
					table.setItem14(0);
					cbomb--;
				}
				setItem();
			}
		});
		btnCol_2.setFocusable(false);
		btnCol_2.setBounds(109, 349, 46, 23);
		frmBomb.getContentPane().add(btnCol_2);
		
		JButton btnCol_1 = new JButton("^");
		btnCol_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cbomb!=0){
					table.setItem1(0);
					table.setItem5(0);
					table.setItem9(0);
					table.setItem13(0);
					cbomb--;
				}
				setItem();
			}
		});
		btnCol_1.setFocusable(false);
		btnCol_1.setBounds(27, 349, 46, 23);
		frmBomb.getContentPane().add(btnCol_1);
		/*End Col1-4*/
		
		//Put score field
		textField = new JTextField();
		textField.setVisible(false);
		textField.setBounds(382, 365, 86, 20);
		frmBomb.getContentPane().add(textField);
		textField.setColumns(10);
		
		//label name of put score
		lblName.setBounds(338, 368, 46, 14);
		lblName.setVisible(false);
		frmBomb.getContentPane().add(lblName);
		
		
		//Put score button
		btnPutScore.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				File file = new File("bomb2.txt");
				File file1 = new File("bomb.txt");
				FileWriter fWriter;
				try {
					FileReader fReader = new FileReader(file1);
					BufferedReader bufReader = new BufferedReader(fReader);

					fWriter = new FileWriter(file);
					BufferedWriter bufWriter = new BufferedWriter(fWriter);
					
					String line;
					while((line=bufReader.readLine())!=null){
						bufWriter.write(line);
						bufWriter.newLine();
					}
					bufWriter.write(textField.getText()+" "+table.getScore(0));
					bufWriter.newLine();
					
					bufReader.close();
					bufWriter.close();
					
					file = new File("bomb.txt");
					file1 = new File("bomb2.txt");
					
					fReader = new FileReader(file1);
					bufReader = new BufferedReader(fReader);

					fWriter = new FileWriter(file);
					bufWriter = new BufferedWriter(fWriter);
					
					while((line=bufReader.readLine())!=null){
						bufWriter.write(line);
						bufWriter.newLine();
					}
					
					bufReader.close();
					bufWriter.close();
					
					
					ScoreBoardBomb nw = new ScoreBoardBomb();
					nw.Score();
					frmBomb.dispose();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnPutScore.setVisible(false);
		btnPutScore.setFocusable(false);
		btnPutScore.setBounds(478, 364, 98, 23);
		frmBomb.getContentPane().add(btnPutScore);
		
		JButton btnHelp = new JButton("");
		btnHelp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(frmBomb, "Click Start game or press space bar to Start\n"
						+ "Use arrow keys to control board \n"
						+ "Press number to active bomb \n"
						+"Press < button to select row of board you need to clear \n"
						+ "Press ^ button to select column of board you need to clear \n"
						+ "To save your score enter you name to name field and Click Put Score Button\n"
						+ "get 2048 to win the game",
						"How to play",
						JOptionPane.INFORMATION_MESSAGE
						);
			}
		});
		btnHelp.setFocusable(false);
		btnHelp.setIcon(new ImageIcon(this.getClass().getResource("/HelpN.jpg")));
		btnHelp.setBounds(525, 395, 51, 51);
		frmBomb.getContentPane().add(btnHelp);
		lblBg.setIcon(new ImageIcon(this.getClass().getResource("/BombBg7.jpg")));
		lblBg.setBounds(0, 0, 585, 450);
		
		frmBomb.getContentPane().add(lblBg);
	}
}
