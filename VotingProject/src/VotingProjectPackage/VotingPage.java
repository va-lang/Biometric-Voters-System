package VotingProjectPackage;



import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;
import VotingProjectPackage.Voter;

public class VotingPage extends JFrame {

	private JPanel candidateFrame;

	/**
	 * Launch the application.
	 * @throws IOException 
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VotingPage frame = new VotingPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws IOException 
	 */
	public VotingPage() throws IOException   {

		File Nana = new File("VoteCountNana.txt");
		
		FileWriter nanaw = new FileWriter(Nana);
		
		PrintWriter pwNana = new PrintWriter(nanaw);
		
		File JM = new File("VoteCountMahama.txt");
		
		FileWriter JMw = new FileWriter(JM);
		
		PrintWriter JMpw = new PrintWriter(JMw);
		
		File Andrew = new File("Andrew.txt");
		
		FileWriter Andreww = new FileWriter(Andrew);
		
		PrintWriter Andrewpw = new PrintWriter(Andreww);
		
		File Kobina = new File("Kobina.txt");
		
		FileWriter Kobinaw = new FileWriter(Kobina);
		
		
		PrintWriter Kobinapw = new PrintWriter(Kobinaw);
		
		setBackground(Color.WHITE);
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		candidateFrame = new JPanel();
		candidateFrame.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 14));
		candidateFrame.setForeground(Color.WHITE);
		candidateFrame.setBackground(new Color(47, 79, 79));
		candidateFrame.setBorder(new LineBorder(Color.BLUE, 2));
		setContentPane(candidateFrame);
		candidateFrame.setLayout(null);
		
		JPanel Candidate1 = new JPanel();
		Candidate1.setBounds(36, 70, 144, 112);
		candidateFrame.add(Candidate1);
		Candidate1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(getClass().getResource("/icons/nana.addo.jpg")));
		lblNewLabel.setBounds(0, 0, 144, 112);
		Candidate1.add(lblNewLabel);
		
		JPanel Candidate2 = new JPanel();
		Candidate2.setBounds(36, 290, 144, 112);
		candidateFrame.add(Candidate2);
		Candidate2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(getClass().getResource("/icons/jM.jpg")));
		lblNewLabel_1.setBounds(0, 0, 144, 112);
		Candidate2.add(lblNewLabel_1);
		
		JPanel Candidate3 = new JPanel();
		Candidate3.setBounds(451, 290, 144, 112);
		candidateFrame.add(Candidate3);
		Candidate3.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(getClass().getResource("/icons/CPP.jpg")));
		lblNewLabel_3.setBounds(0, 0, 144, 112);
		Candidate3.add(lblNewLabel_3);
		
		JPanel Candidate4 = new JPanel();
		Candidate4.setBounds(451, 70, 144, 112);
		candidateFrame.add(Candidate4);
		Candidate4.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(getClass().getResource("/icons/GUM.jpg")));
		lblNewLabel_2.setBounds(0, 0, 144, 112);
		Candidate4.add(lblNewLabel_2);
		
		JButton vote1 = new JButton("VOTE ");
		vote1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pwNana.println("Nana");
				pwNana.close();
				System.exit(0);
				
				
			}
		});
		vote1.setBackground(new Color(135, 206, 235));
		vote1.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 9));
		vote1.setForeground(new Color(47, 79, 79));
		vote1.setBounds(60, 256, 104, 23);
		candidateFrame.add(vote1);
		
		JButton vote2 = new JButton("VOTE ");
		vote2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JMpw.println("Mahama");
				JMpw.close();
				
				System.exit(0);
			}
		});
		vote2.setForeground(new Color(47, 79, 79));
		vote2.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 9));
		vote2.setBackground(new Color(135, 206, 235));
		vote2.setBounds(60, 466, 104, 23);
		candidateFrame.add(vote2);
		
		JButton vote3 = new JButton("VOTE ");
		vote3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Kobinapw.println("Kobina");
				
				Kobinapw.close();
				System.exit(0);
				
				System.out.println(Voter.votes);
			}
		});
		vote3.setForeground(new Color(47, 79, 79));
		vote3.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 9));
		vote3.setBackground(new Color(135, 206, 235));
		vote3.setBounds(470, 466, 104, 23);
		candidateFrame.add(vote3);
		
		JButton vote4 = new JButton("VOTE ");
		vote4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Andrewpw.println("Andrews");
				
				Andrewpw.close();
				System.exit(0);
				
				System.out.println(Voter.votes);
			}
		});
		vote4.setForeground(new Color(47, 79, 79));
		vote4.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 9));
		vote4.setBackground(new Color(135, 206, 235));
		vote4.setBounds(470, 256, 104, 23);
		candidateFrame.add(vote4);
		
		JLabel candidatelabel1 = new JLabel("Nana Akuffo-Addo");
		candidatelabel1.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
		candidatelabel1.setForeground(Color.WHITE);
		candidatelabel1.setBounds(46, 193, 134, 23);
		candidateFrame.add(candidatelabel1);
		
		JLabel party1 = new JLabel("       NPP");
		party1.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 14));
		party1.setForeground(Color.WHITE);
		party1.setBounds(60, 227, 104, 14);
		candidateFrame.add(party1);
		
		JLabel candidatelabel2 = new JLabel("John Dramani Mahama");
		candidatelabel2.setForeground(Color.WHITE);
		candidatelabel2.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
		candidatelabel2.setBounds(23, 413, 157, 23);
		candidateFrame.add(candidatelabel2);
		
		JLabel party2 = new JLabel("       NDC");
		party2.setForeground(Color.WHITE);
		party2.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 14));
		party2.setBounds(60, 441, 104, 14);
		candidateFrame.add(party2);
		
		JLabel candidatelabel3 = new JLabel("Christian Kwabena Andrews");
		candidatelabel3.setForeground(Color.WHITE);
		candidatelabel3.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 11));
		candidatelabel3.setBounds(433, 193, 197, 23);
		candidateFrame.add(candidatelabel3);
		
		JLabel party3 = new JLabel("       CUM");
		party3.setForeground(Color.WHITE);
		party3.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 14));
		party3.setBounds(471, 229, 104, 14);
		candidateFrame.add(party3);
		
		JLabel candidatelabel4 = new JLabel("Ivor Kobina Greenstreet");
		candidatelabel4.setForeground(Color.WHITE);
		candidatelabel4.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 11));
		candidatelabel4.setBounds(461, 413, 178, 23);
		candidateFrame.add(candidatelabel4);
		
		JLabel party4 = new JLabel("       CPP");
		party4.setForeground(Color.WHITE);
		party4.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 14));
		party4.setBounds(470, 441, 104, 14);
		candidateFrame.add(party4);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(getClass().getResource("/icons/hands vote.jpg")));
		lblNewLabel_4.setBounds(211, 193, 200, 165);
		candidateFrame.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("VOTE FOR YOUR CANDIDATE");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_5.setBounds(192, 11, 288, 23);
		candidateFrame.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("\"We have the power to make a difference. But we need to VOTE.\" ");
		lblNewLabel_6.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setBounds(112, 39, 520, 33);
		candidateFrame.add(lblNewLabel_6);
		
		JButton closeBtn = new JButton("X");
		closeBtn.setBorder(null);
		closeBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		closeBtn.setBounds(644, 0, 56, 23);
		candidateFrame.add(closeBtn);
		
		
		
	}
}
