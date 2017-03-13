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
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Window.Type;
import javax.swing.UIManager;

public class Classic{
	private Table4x4 table = new Table4x4();
	

	private JFrame frmClassicMode;
	JLabel label = new JLabel("");
	JLabel label_1 = new JLabel("");
	JLabel label_2 = new JLabel("");
	JLabel label_3 = new JLabel("");
	JLabel label_4 = new JLabel("Press");
	JLabel label_5 = new JLabel("Space");
	JLabel label_6 = new JLabel("to");
	JLabel label_7 = new JLabel("Start");
	JLabel label_9 = new JLabel("");
	JLabel label_8 = new JLabel("");
	JLabel label_10 = new JLabel("");
	JLabel label_11 = new JLabel("");
	JLabel label_12 = new JLabel("");
	JLabel label_13 = new JLabel("");
	JLabel label_14 = new JLabel("");
	JLabel label_15 = new JLabel("");
	Label label_16 = new Label("Wait");
	JLabel lblYouWin = new JLabel("You Win!");
	JLabel lblYouLose = new JLabel("GAME OVER!");
	private final JButton btnNewButton = new JButton("");
	private final JButton btnStartButton = new JButton("");
	private JTextField textField;
	JLabel lblName = new JLabel("Name");
	JButton btnPutScore = new JButton("Submit");
	static int check = 0;
	
	

	/**
	 * Launch the application.
	 */
	public void GameStart() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Classic window = new Classic();
					window.frmClassicMode.setVisible(true);
					check = 0;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	private void setItem(){
		label.setIcon(new ImageIcon(table.getItem1()));
		label_1.setIcon(new ImageIcon(table.getItem2()));
		label_2.setIcon(new ImageIcon(table.getItem3()));
		label_3.setIcon(new ImageIcon(table.getItem4()));
		
		label_4.setIcon(new ImageIcon(table.getItem5()));
		label_5.setIcon(new ImageIcon(table.getItem6()));
		label_6.setIcon(new ImageIcon(table.getItem7()));
		label_7.setIcon(new ImageIcon(table.getItem8()));
		
		label_8.setIcon(new ImageIcon(table.getItem9()));
		label_9.setIcon(new ImageIcon(table.getItem10()));
		label_10.setIcon(new ImageIcon(table.getItem11()));
		label_11.setIcon(new ImageIcon(table.getItem12()));
		
		label_12.setIcon(new ImageIcon(table.getItem13()));
		label_13.setIcon(new ImageIcon(table.getItem14()));
		label_14.setIcon(new ImageIcon(table.getItem15()));
		label_15.setIcon(new ImageIcon(table.getItem16()));
		
		label_16.setText(table.getScore());

	}
	/**
	 * Create the application.
	 */
	public Classic() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmClassicMode = new JFrame();
		frmClassicMode.setAlwaysOnTop(true);
		frmClassicMode.setType(Type.UTILITY);
		frmClassicMode.setTitle("Classic Mode");
		frmClassicMode.getContentPane().setBackground(Color.LIGHT_GRAY);

		
		
		frmClassicMode.addKeyListener(new KeyAdapter() {
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
		        	textField.setVisible(false);
		        	lblName.setVisible(false);
		        	btnPutScore.setVisible(false);
		        	table.start();
		        	check = 1;
		        }
				setItem();
				
//		        table.printTable();
		        if(!(table.gameOver())&&check==1){
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
		frmClassicMode.setFocusable(true);
		frmClassicMode.setBounds(500, 100, 525, 433);
		frmClassicMode.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmClassicMode.getContentPane().setLayout(null);
		
		
		lblYouWin.setForeground(Color.YELLOW);
		lblYouWin.setFont(new Font("Tekton Pro Ext", Font.BOLD, 33));
		lblYouWin.setHorizontalAlignment(SwingConstants.CENTER);
		lblYouWin.setBounds(338, 56, 172, 75);
		lblYouWin.setVisible(false);
		lblYouLose.setForeground(Color.RED);
		
		lblYouLose.setFont(new Font("Dialog", Font.BOLD, 26));
		lblYouLose.setHorizontalAlignment(SwingConstants.CENTER);
		lblYouLose.setVisible(false);
		lblYouLose.setBounds(328, 59, 182, 64);
		
		frmClassicMode.getContentPane().add(lblYouLose);
		frmClassicMode.getContentPane().add(lblYouWin);
		label.setIcon(new ImageIcon(this.getClass().getResource("/blank.png")));
		label.setFont(new Font("Algerian", Font.BOLD, 15));		
		label.setBackground(Color.WHITE);
		label.setBounds(10, 10, 75, 75);
		frmClassicMode.getContentPane().add(label);
		
		label_1.setIcon(new ImageIcon(this.getClass().getResource("/blank.png")));
		label_1.setFont(new Font("Algerian", Font.BOLD, 15));		
		
		label_1.setBackground(Color.WHITE);
		label_1.setBounds(91, 10, 75, 75);
		frmClassicMode.getContentPane().add(label_1);
		
		label_2.setIcon(new ImageIcon(this.getClass().getResource("/blank.png")));
		label_2.setFont(new Font("Algerian", Font.BOLD, 15));		
		label_2.setBackground(Color.WHITE);
		label_2.setBounds(172, 10, 75, 75);
		frmClassicMode.getContentPane().add(label_2);
		
		label_3.setIcon(new ImageIcon(this.getClass().getResource("/blank.png")));
		label_3.setFont(new Font("Algerian", Font.BOLD, 15));		
		label_3.setBackground(Color.WHITE);
		label_3.setBounds(253, 10, 75, 75);
		frmClassicMode.getContentPane().add(label_3);
		
		label_4.setIcon(new ImageIcon(this.getClass().getResource("/blank.png")));
		label_4.setFont(new Font("Algerian", Font.BOLD, 15));		
		label_4.setBackground(Color.WHITE);
		label_4.setBounds(10, 91, 75, 75);
		frmClassicMode.getContentPane().add(label_4);
		
		label_5.setIcon(new ImageIcon(this.getClass().getResource("/blank.png")));
		label_5.setFont(new Font("Algerian", Font.BOLD, 15));		
		label_5.setBackground(Color.WHITE);
		label_5.setBounds(91, 91, 75, 75);
		frmClassicMode.getContentPane().add(label_5);
		
		label_6.setIcon(new ImageIcon(this.getClass().getResource("/blank.png")));
		label_6.setFont(new Font("Algerian", Font.BOLD, 15));		
		label_6.setBackground(Color.WHITE);
		label_6.setBounds(172, 91, 75, 75);
		frmClassicMode.getContentPane().add(label_6);
		
		label_7.setIcon(new ImageIcon(this.getClass().getResource("/blank.png")));
		label_7.setFont(new Font("Algerian", Font.BOLD, 15));		
		label_7.setBackground(Color.WHITE);
		label_7.setBounds(253, 91, 75, 75);
		frmClassicMode.getContentPane().add(label_7);
		
		label_8.setIcon(new ImageIcon(this.getClass().getResource("/blank.png")));
		label_8.setFont(new Font("Algerian", Font.BOLD, 15));		
		label_8.setBackground(Color.WHITE);
		label_8.setBounds(10, 172, 75, 75);
		frmClassicMode.getContentPane().add(label_8);
		
		label_9.setIcon(new ImageIcon(this.getClass().getResource("/blank.png")));
		label_9.setFont(new Font("Algerian", Font.BOLD, 15));
				label_9.setBackground(Color.WHITE);
		label_9.setBounds(91, 172, 75, 75);
		frmClassicMode.getContentPane().add(label_9);
		
		label_10.setIcon(new ImageIcon(this.getClass().getResource("/blank.png")));
		label_10.setFont(new Font("Algerian", Font.BOLD, 15));		
		label_10.setBackground(Color.WHITE);
		label_10.setBounds(172, 172, 75, 75);
		frmClassicMode.getContentPane().add(label_10);
		
		label_11.setIcon(new ImageIcon(this.getClass().getResource("/blank.png")));
		label_11.setFont(new Font("Algerian", Font.BOLD, 15));		
		label_11.setBackground(Color.WHITE);
		label_11.setBounds(253, 172, 75, 75);
		frmClassicMode.getContentPane().add(label_11);
		
		label_12.setIcon(new ImageIcon(this.getClass().getResource("/blank.png")));
		label_12.setFont(new Font("Algerian", Font.BOLD, 15));
		label_12.setBackground(Color.WHITE);
		label_12.setBounds(10, 252, 75, 75);
		frmClassicMode.getContentPane().add(label_12);
		
		label_13.setIcon(new ImageIcon(this.getClass().getResource("/blank.png")));
		label_13.setFont(new Font("Algerian", Font.BOLD, 15));
		label_13.setBackground(Color.WHITE);
		label_13.setBounds(91, 252, 75, 75);
		frmClassicMode.getContentPane().add(label_13);
		
		label_14.setIcon(new ImageIcon(this.getClass().getResource("/blank.png")));
		label_14.setFont(new Font("Algerian", Font.BOLD, 15));
		label_14.setBackground(Color.WHITE);
		label_14.setBounds(172, 252, 75, 75);
		frmClassicMode.getContentPane().add(label_14);
		
		label_15.setIcon(new ImageIcon(this.getClass().getResource("/blank.png")));
		label_15.setFont(new Font("Algerian", Font.BOLD, 15));
		label_15.setBackground(Color.WHITE);
		label_15.setBounds(253, 252, 75, 75);
		frmClassicMode.getContentPane().add(label_15);
		
		label_16.setForeground(new Color(255, 255, 0));
		label_16.setBackground(new Color(128, 128, 128));
		label_16.setBounds(334, 10, 164, 22);
		frmClassicMode.getContentPane().add(label_16);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FirstPage.frmGame.setVisible(true);
				frmClassicMode.dispose();
			}
		});
		btnNewButton.setBounds(114, 338, 111, 37);
		btnNewButton.setIcon(new ImageIcon(this.getClass().getResource("/MainMenu.png")));
		frmClassicMode.getContentPane().add(btnNewButton);
		btnStartButton.setIcon(new ImageIcon(this.getClass().getResource("/startbutton.jpg")));

		btnStartButton.setBounds(366, 129, 111, 37);
		btnStartButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblYouWin.setVisible(false);
	        	lblYouLose.setVisible(false);
	        	table.start();
				setItem();
				check=1;
			}
		});
		btnStartButton.setFocusable(false);
		frmClassicMode.getContentPane().add(btnStartButton);
		

		//Put score field
		textField = new JTextField();
		textField.setVisible(false);
		textField.setBounds(304, 350, 86, 20);
		frmClassicMode.getContentPane().add(textField);
		textField.setColumns(10);
		
		//label name of put score
		lblName.setBounds(260, 353, 46, 14);
		lblName.setVisible(false);
		frmClassicMode.getContentPane().add(lblName);
		
		
		//Put score button
		btnPutScore.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				File file = new File("classic2.txt");
				File file1 = new File("classic.txt");
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
					
					file = new File("classic.txt");
					file1 = new File("classic2.txt");
					
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
					
					
					ScoreBoardClassic nw = new ScoreBoardClassic();
					nw.Score();
					frmClassicMode.dispose();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}


			}
		});
		btnPutScore.setVisible(false);
		btnPutScore.setFocusable(false);
		btnPutScore.setBounds(400, 349, 98, 23);
		frmClassicMode.getContentPane().add(btnPutScore);
		
		JButton btnHelp = new JButton("");
		btnHelp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(frmClassicMode, "Click Start game or press space bar to Start\n"
						+ "Use arrow keys to control board \n"
						+ "To save your score enter you name to name field and Click Put Score Button\n"
						+ "get 2048 to win the game",
						"How to play",
						JOptionPane.INFORMATION_MESSAGE
						);
			}
		});
		btnHelp.setFocusable(false);
		btnHelp.setIcon(new ImageIcon(Classic.class.getResource("/HelpN.jpg")));
		btnHelp.setBounds(400, 176, 52, 52);
		frmClassicMode.getContentPane().add(btnHelp);
		
		JLabel lblBg = new JLabel("");
		lblBg.setIcon(new ImageIcon(Classic.class.getResource("/BG2048Classic.jpg")));
		lblBg.setBounds(0, 0, 510, 394);
		frmClassicMode.getContentPane().add(lblBg);
	}
}
