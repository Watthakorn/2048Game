package game_2048;
import java.awt.Color;
import java.awt.Font;
import java.awt.Label;
import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import gameFunction.Table4x4;

public class TimerMode {
private static Table4x4 table = new Table4x4();
static Label lblTime = new Label("");
int interval;


static JFrame frmTimer;
static JLabel label = new JLabel("");
static JLabel label_1 = new JLabel("");
static JLabel label_2 = new JLabel("");
static JLabel label_3 = new JLabel("");
static JLabel label_4 = new JLabel("Press");
static JLabel label_5 = new JLabel("Space");
static JLabel label_6 = new JLabel("to");
static JLabel label_7 = new JLabel("Start");
static JLabel label_9 = new JLabel("");
static JLabel label_8 = new JLabel("");
static JLabel label_10 = new JLabel("");
static JLabel label_11 = new JLabel("");
static JLabel label_12 = new JLabel("");
static JLabel label_13 = new JLabel("");
static JLabel label_14 = new JLabel("");
static JLabel label_15 = new JLabel("");
static Label label_16 = new Label("Wait");
static JLabel lblGameOver = new JLabel("GAME OVER!");
private final JButton btnHome = new JButton("");
private static JTextField textField;
static JLabel lblName = new JLabel("Name");
static JButton btnPutScore = new JButton("Submit");
static boolean check = false;
private final JLabel lblBg = new JLabel("");



/**
 * Launch the application.
 */
public void GameStart() {
	try {
		TimerMode window = new TimerMode();
		window.frmTimer.setVisible(true);
		table.start();
		setItem();
	} catch (Exception e) {
		e.printStackTrace();
	}
	int delay = 1000;
    int period = 1000;
    Timer timer = new Timer();
    check = false;
    interval = 30;
	lblTime.setText(""+interval);
    timer.scheduleAtFixedRate(new TimerTask() {

        public void run() {
        	lblTime.setText(""+--interval);
            if(check){
            	timer.cancel();
				timer.purge();
            }
            if(interval==0||!table.gameOver()){
				timer.cancel();
	        	textField.setVisible(true);
	        	textField.requestFocus();
	        	lblName.setVisible(true);
	        	lblGameOver.setVisible(true);
	        	btnPutScore.setVisible(true);
	        	btnPutScore.addActionListener(new ActionListener() {
	        		public void actionPerformed(ActionEvent arg0) {
	        			File file = new File("time2.txt");
	        			File file1 = new File("time.txt");
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
	        				
	        				file = new File("time.txt");
	        				file1 = new File("time2.txt");
	        				
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
	        				
	        				
	        				ScoreBoardTime nw = new ScoreBoardTime();
	        				nw.Score();
	        				timer.purge();
	        				btnPutScore.removeActionListener(this);
	        				frmTimer.dispose();
	        				} catch (IOException e) {
		        				frmTimer.dispose();
	        				}
	        		}
	        	});
            }
        }
    }, delay, period);
}
private static void setItem(){
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
public TimerMode() {
	initialize();
}

/**
 * Initialize the contents of the frame.
 */
private void initialize() {
	frmTimer = new JFrame();
	frmTimer.setAlwaysOnTop(true);
	frmTimer.setType(Type.UTILITY);
	frmTimer.setTitle("Stopwatch Mode");
	frmTimer.getContentPane().setBackground(new Color(255, 102, 0));

	
	
	frmTimer.addKeyListener(new KeyAdapter() {
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
			setItem();
			
		}
	});
	frmTimer.setFocusable(true);
	frmTimer.setBounds(500, 100, 524, 433);
	frmTimer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frmTimer.getContentPane().setLayout(null);
	lblGameOver.setForeground(Color.RED);
	
	lblGameOver.setFont(new Font("Dialog", Font.BOLD, 37));
	lblGameOver.setHorizontalAlignment(SwingConstants.CENTER);
	lblGameOver.setVisible(false);
	lblTime.setFont(new Font("Billo Dream", Font.BOLD, 20));
	lblTime.setAlignment(Label.CENTER);
	lblTime.setForeground(Color.YELLOW);
	lblTime.setBackground(Color.DARK_GRAY);
	
	lblTime.setBounds(388, 10, 65, 47);
	frmTimer.getContentPane().add(lblTime);
	lblGameOver.setBounds(10, 115, 316, 111);
	
	frmTimer.getContentPane().add(lblGameOver);
	label.setIcon(new ImageIcon(this.getClass().getResource("/blank.png")));
	label.setFont(new Font("Algerian", Font.BOLD, 15));		
	label.setBackground(Color.WHITE);
	label.setBounds(10, 10, 75, 75);
	frmTimer.getContentPane().add(label);
	
	label_1.setIcon(new ImageIcon(this.getClass().getResource("/blank.png")));
	label_1.setFont(new Font("Algerian", Font.BOLD, 15));		
	
	label_1.setBackground(Color.WHITE);
	label_1.setBounds(91, 10, 75, 75);
	frmTimer.getContentPane().add(label_1);
	
	label_2.setIcon(new ImageIcon(this.getClass().getResource("/blank.png")));
	label_2.setFont(new Font("Algerian", Font.BOLD, 15));		
	label_2.setBackground(Color.WHITE);
	label_2.setBounds(172, 10, 75, 75);
	frmTimer.getContentPane().add(label_2);
	
	label_3.setIcon(new ImageIcon(this.getClass().getResource("/blank.png")));
	label_3.setFont(new Font("Algerian", Font.BOLD, 15));		
	label_3.setBackground(Color.WHITE);
	label_3.setBounds(253, 10, 75, 75);
	frmTimer.getContentPane().add(label_3);
	
	label_4.setIcon(new ImageIcon(this.getClass().getResource("/blank.png")));
	label_4.setFont(new Font("Algerian", Font.BOLD, 15));		
	label_4.setBackground(Color.WHITE);
	label_4.setBounds(10, 91, 75, 75);
	frmTimer.getContentPane().add(label_4);
	
	label_5.setIcon(new ImageIcon(this.getClass().getResource("/blank.png")));
	label_5.setFont(new Font("Algerian", Font.BOLD, 15));		
	label_5.setBackground(Color.WHITE);
	label_5.setBounds(91, 91, 75, 75);
	frmTimer.getContentPane().add(label_5);
	
	label_6.setIcon(new ImageIcon(this.getClass().getResource("/blank.png")));
	label_6.setFont(new Font("Algerian", Font.BOLD, 15));		
	label_6.setBackground(Color.WHITE);
	label_6.setBounds(172, 91, 75, 75);
	frmTimer.getContentPane().add(label_6);
	
	label_7.setIcon(new ImageIcon(this.getClass().getResource("/blank.png")));
	label_7.setFont(new Font("Algerian", Font.BOLD, 15));		
	label_7.setBackground(Color.WHITE);
	label_7.setBounds(253, 91, 75, 75);
	frmTimer.getContentPane().add(label_7);
	
	label_8.setIcon(new ImageIcon(this.getClass().getResource("/blank.png")));
	label_8.setFont(new Font("Algerian", Font.BOLD, 15));		
	label_8.setBackground(Color.WHITE);
	label_8.setBounds(10, 172, 75, 75);
	frmTimer.getContentPane().add(label_8);
	
	label_9.setIcon(new ImageIcon(this.getClass().getResource("/blank.png")));
	label_9.setFont(new Font("Algerian", Font.BOLD, 15));
			label_9.setBackground(Color.WHITE);
	label_9.setBounds(91, 172, 75, 75);
	frmTimer.getContentPane().add(label_9);
	
	label_10.setIcon(new ImageIcon(this.getClass().getResource("/blank.png")));
	label_10.setFont(new Font("Algerian", Font.BOLD, 15));		
	label_10.setBackground(Color.WHITE);
	label_10.setBounds(172, 172, 75, 75);
	frmTimer.getContentPane().add(label_10);
	
	label_11.setIcon(new ImageIcon(this.getClass().getResource("/blank.png")));
	label_11.setFont(new Font("Algerian", Font.BOLD, 15));		
	label_11.setBackground(Color.WHITE);
	label_11.setBounds(253, 172, 75, 75);
	frmTimer.getContentPane().add(label_11);
	
	label_12.setIcon(new ImageIcon(this.getClass().getResource("/blank.png")));
	label_12.setFont(new Font("Algerian", Font.BOLD, 15));
	label_12.setBackground(Color.WHITE);
	label_12.setBounds(10, 252, 75, 75);
	frmTimer.getContentPane().add(label_12);
	
	label_13.setIcon(new ImageIcon(this.getClass().getResource("/blank.png")));
	label_13.setFont(new Font("Algerian", Font.BOLD, 15));
	label_13.setBackground(Color.WHITE);
	label_13.setBounds(91, 252, 75, 75);
	frmTimer.getContentPane().add(label_13);
	
	label_14.setIcon(new ImageIcon(this.getClass().getResource("/blank.png")));
	label_14.setFont(new Font("Algerian", Font.BOLD, 15));
	label_14.setBackground(Color.WHITE);
	label_14.setBounds(172, 252, 75, 75);
	frmTimer.getContentPane().add(label_14);
	
	label_15.setIcon(new ImageIcon(this.getClass().getResource("/blank.png")));
	label_15.setFont(new Font("Algerian", Font.BOLD, 15));
	label_15.setBackground(Color.WHITE);
	label_15.setBounds(253, 252, 75, 75);
	frmTimer.getContentPane().add(label_15);
	
	label_16.setForeground(Color.WHITE);
	label_16.setBackground(Color.BLACK);
	label_16.setBounds(338, 63, 164, 22);
	frmTimer.getContentPane().add(label_16);
	
	btnHome.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			FirstPage.frmGame.setVisible(true);
			check = true;
			frmTimer.dispose();
		}
	});
	btnHome.setBounds(112, 338, 111, 37);
	btnHome.setIcon(new ImageIcon(this.getClass().getResource("/MainMenu.png")));
	frmTimer.getContentPane().add(btnHome);

//	btnStartButton.setBounds(360, 153, 126, 23);
//	btnStartButton.addActionListener(new ActionListener() {
//		public void actionPerformed(ActionEvent arg0) {
//        	lblGameOver.setVisible(false);
//        	table.start();
//			setItem();
//		}
//	});
//	btnStartButton.setFocusable(false);
//	frmTimer.getContentPane().add(btnStartButton);
	

	//Put score field
	textField = new JTextField();
	textField.setVisible(false);
	textField.setBounds(304, 350, 86, 20);
	frmTimer.getContentPane().add(textField);
	textField.setColumns(10);
	
	//label name of put score
	lblName.setBounds(260, 353, 46, 14);
	lblName.setVisible(false);
	frmTimer.getContentPane().add(lblName);
	
	
	//Put score button
	
	btnPutScore.setVisible(false);
	btnPutScore.setFocusable(false);
	btnPutScore.setBounds(400, 349, 98, 23);
	frmTimer.getContentPane().add(btnPutScore);
	
	JButton btnHelp = new JButton("");
	btnHelp.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			JOptionPane.showMessageDialog(frmTimer, "Click Start game or press space bar to Start\n"
					+ "Use arrow keys to control board \n"
					+ "You have only 30 seconds per game and It isn't stop until you lose\n"
					+ "To save your score enter you name to name field and Click Put Score Button\n"
					+ "get 2048 to win the game",
					"How to play",
					JOptionPane.INFORMATION_MESSAGE
					);
		}
	});
	btnHelp.setFocusable(false);
	btnHelp.setIcon(new ImageIcon(this.getClass().getResource("/HelpN.jpg")));
	btnHelp.setBounds(402, 163, 51, 51);
	frmTimer.getContentPane().add(btnHelp);
	lblBg.setIcon(new ImageIcon(this.getClass().getResource("/TimeBg4.jpg")));
	lblBg.setBounds(0, 0, 508, 394);
	
	frmTimer.getContentPane().add(lblBg);
}
}