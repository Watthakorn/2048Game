package game_2048;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class ScoreBoardClassic {

	private JFrame frame;
	JLabel name1 = new JLabel("New label");
	JLabel name2 = new JLabel("New label");
	JLabel name3 = new JLabel("New label");
	JLabel name4 = new JLabel("New label");
	JLabel name5 = new JLabel("New label");
	JLabel label_5 = new JLabel("BG label");
	private final JLabel score2 = new JLabel("Score 1");
	private final JLabel score1 = new JLabel("Score 1");
	private final JLabel score3 = new JLabel("Score 1");
	private final JLabel score4 = new JLabel("Score 1");
	private final JLabel score5 = new JLabel("Score 1");
	ArrayList<String> nameA = new ArrayList<String>();
	ArrayList<Integer> scoA = new ArrayList<Integer>();
	private final JLabel lblModeClassic = new JLabel("Mode: Classic");
	
	
	
	/**
	 * Launch the application.
	 */
	public void Score() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScoreBoardClassic window = new ScoreBoardClassic();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws IOException 
	 */
	public ScoreBoardClassic() throws IOException {
		getScore();
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	
	public void getScore() throws IOException{
		File fscore = new File("classic.txt");
		FileReader fReader = new FileReader(fscore);
		BufferedReader bufReader = new BufferedReader(fReader);
		
		String line;
		while((line=bufReader.readLine())!=null){
			String[] kkk = new String[2];
			kkk = line.split(" ");
			nameA.add(kkk[0]);
			nameA.add((kkk[1]));
			scoA.add(Integer.parseInt(kkk[1]));
		}
		//scoA.sort(null);
		Collections.sort(scoA);
		Collections.reverse(scoA);
		ArrayList<String> tae = new ArrayList<String>();
		
		for (int i = 0; i<5; i++){
			tae.add(nameA.get(nameA.indexOf(""+scoA.get(i))-1));
		}
		
		name1.setText(tae.get(0));
		name2.setText(tae.get(1));
		name3.setText(tae.get(2));
		name4.setText(tae.get(3));
		name5.setText(tae.get(4));
		score1.setForeground(Color.MAGENTA);
		score1.setFont(new Font("Eras Light ITC", Font.BOLD | Font.ITALIC, 40));
		score1.setHorizontalAlignment(SwingConstants.RIGHT);
		score1.setText(""+scoA.get(0)+" ");
		score2.setForeground(Color.MAGENTA);
		score2.setHorizontalAlignment(SwingConstants.RIGHT);
		score2.setFont(new Font("Eras Light ITC", Font.BOLD | Font.ITALIC, 40));
		score2.setText(""+scoA.get(1)+" ");
		score3.setForeground(Color.MAGENTA);
		score3.setHorizontalAlignment(SwingConstants.RIGHT);
		score3.setFont(new Font("Eras Light ITC", Font.BOLD | Font.ITALIC, 40));
		score3.setText(""+scoA.get(2)+" ");
		score4.setForeground(Color.MAGENTA);
		score4.setHorizontalAlignment(SwingConstants.RIGHT);
		score4.setFont(new Font("Eras Light ITC", Font.BOLD | Font.ITALIC, 40));
		score4.setText(""+scoA.get(3)+" ");
		score5.setForeground(Color.MAGENTA);
		score5.setHorizontalAlignment(SwingConstants.RIGHT);
		score5.setFont(new Font("Eras Light ITC", Font.BOLD | Font.ITALIC, 40));
		score5.setText(""+scoA.get(4)+" ");
		
		
	}
	
	
	
	
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.getContentPane().setLayout(null);
		
		name1.setHorizontalAlignment(SwingConstants.LEFT);
		name1.setFont(new Font("Adobe Garamond Pro", Font.ITALIC, 40));
		name1.setForeground(new Color(255, 0, 0));
		name1.setBounds(145, 115, 322, 60);
		frame.getContentPane().add(name1);
		
		name2.setHorizontalAlignment(SwingConstants.LEFT);
		name2.setFont(new Font("Adobe Garamond Pro", Font.ITALIC, 40));
		name2.setForeground(new Color(255, 0, 0));
		name2.setBounds(145, 199, 322, 60);
		frame.getContentPane().add(name2);
		
		name3.setHorizontalAlignment(SwingConstants.LEFT);
		name3.setFont(new Font("Adobe Garamond Pro", Font.ITALIC, 40));
		name3.setForeground(new Color(255, 0, 0));
		name3.setBounds(145, 276, 322, 60);
		frame.getContentPane().add(name3);
		
		name4.setHorizontalAlignment(SwingConstants.LEFT);
		name4.setFont(new Font("Adobe Garamond Pro", Font.ITALIC, 40));
		name4.setForeground(new Color(255, 0, 0));
		name4.setBounds(145, 347, 322, 60);
		frame.getContentPane().add(name4);
		
		name5.setHorizontalAlignment(SwingConstants.LEFT);
		name5.setFont(new Font("Adobe Garamond Pro", Font.ITALIC, 40));
		name5.setForeground(new Color(255, 0, 0));
		name5.setBounds(145, 433, 322, 60);
		frame.getContentPane().add(name5);
		// score
		score2.setBounds(412, 196, 230, 66);
		
		frame.getContentPane().add(score2);
		score1.setBounds(412, 112, 230, 66);
		
		frame.getContentPane().add(score1);
		score3.setBounds(412, 273, 230, 66);
		
		frame.getContentPane().add(score3);
		score4.setBounds(412, 344, 230, 66);
		
		frame.getContentPane().add(score4);
		score5.setBounds(412, 418, 230, 66);
		
		frame.getContentPane().add(score5);
		
		JButton btnBack = new JButton("back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FirstPage.frmGame.setVisible(true);
				SelectMode.frmSelectPage.setVisible(true);
				frame.dispose();
			}
		});
		btnBack.setBounds(10, 499, 89, 23);
		frame.getContentPane().add(btnBack);
		lblModeClassic.setForeground(Color.YELLOW);
		lblModeClassic.setBounds(623, 77, 105, 38);
		
		frame.getContentPane().add(lblModeClassic);
		
		label_5.setFont(new Font("Adobe Garamond Pro", Font.ITALIC, 40));
		
		label_5.setBounds(0, 0, 738, 533);
		frame.getContentPane().add(label_5);
		label_5.setIcon(new ImageIcon(this.getClass().getResource("/HS1.png")));
		
		frame.setBounds(100, 100, 754, 572);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
