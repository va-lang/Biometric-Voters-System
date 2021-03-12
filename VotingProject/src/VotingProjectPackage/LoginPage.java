package VotingProjectPackage;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import VotingProjectPackage.VotingPage;

public class LoginPage extends JFrame {
	
	
	private JPanel contentPane;
	private JPasswordField VoterID;

	/**
	 * Launch the application.
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args)  {
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage frame = new LoginPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws FileNotFoundException 
	 */
	public LoginPage() {
		
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(47, 79, 79));
		contentPane.setBorder(new LineBorder(Color.BLUE, 2));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(168, 211, 250, 40);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JTextArea TextUsername = new JTextArea();
		TextUsername.setBorder(null);
		TextUsername.setRows(1);
		TextUsername.setColumns(10);
		TextUsername.setWrapStyleWord(true);
		TextUsername.setDisabledTextColor(Color.BLACK);
		TextUsername.setLineWrap(true);
		TextUsername.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(TextUsername.getText().equals("Username")) {
					TextUsername.setText("");
				}
				else {
					TextUsername.selectAll();
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(TextUsername.getText().equals(""))
					TextUsername.setText("Username");
					
			}
		});
		TextUsername.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 13));
		TextUsername.setText("Username");
		TextUsername.setBounds(10, 11, 170, 29);
		panel.add(TextUsername);
		
		JLabel Username_icon = new JLabel("New label");
		Username_icon.setIcon(new ImageIcon(getClass().getResource("/icons/username.jpg")));
		Username_icon.setBounds(190, 3, 62, 40);
		panel.add(Username_icon);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(168, 262, 250, 40);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		VoterID = new JPasswordField();
		VoterID.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(VoterID.getText().equals("Voters ID")) {
					//VoterID.setEchoChar('â—�');
					VoterID.setText("");
				}
				else {
					VoterID.selectAll();
				}
			}
			

			@Override
			public void focusLost(FocusEvent e) {
				if(VoterID.getText().equals(""))
					VoterID.setText("Voters ID");
					VoterID.setEchoChar((char) 0);
				
			}
		}
		);
		VoterID.setEchoChar((char) 0);
		VoterID.setDisabledTextColor(Color.WHITE);
		VoterID.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 13));
		VoterID.setText("Voters ID");
		VoterID.setBounds(0, 0, 180, 40);
		panel_1.add(VoterID);
		
		JLabel password = new JLabel("");
	
		password.setIcon(new ImageIcon(getClass().getResource("/icons/password.jpg")));
		password.setBounds(197, 0, 53, 40);
		panel_1.add(password);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 128, 128));
		panel_2.setBounds(168, 313, 250, 40);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JButton LoginButton = new JButton("LOG IN");
		LoginButton.addActionListener(new ActionListener() {
			@SuppressWarnings("unlikely-arg-type")
			public void actionPerformed(ActionEvent e) {
				String[] Voter_ID = {"44554","888778","47489","4548994","4564589","998978","7744747"};
				String[] Name = {"Aaron","Kwame","jojo","Esi","Ama","George"};
				String ID = VoterID.getText();
				String Username = TextUsername.getText();
				for(int i = 0; i < Voter_ID.length; i++) {
					for(int j = 0; j < Name.length; j++) {
						if(Voter_ID[i].equals(ID) && Name[j].equals(Username)) {
							VotingPage info = null;
							try {
								info = new VotingPage();
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							info.setVisible(true);
					}
				}
				
				
			}
			
			}

			
		});
		LoginButton.setBounds(0, 0, 250, 40);
		panel_2.add(LoginButton);
		LoginButton.setForeground(new Color(47, 79, 79));
		LoginButton.setBackground(Color.WHITE);
		LoginButton.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 14));
		
		JLabel lblIcon = new JLabel("");
		lblIcon.setBounds(168, 11, 250, 150);
		contentPane.add(lblIcon);
		lblIcon.setIcon(new ImageIcon(getClass().getResource("/icons/ghana.jpg")));
		
		JLabel lblNewLabel = new JLabel("\u201CThere\u2019s no such thing as a vote that doesn\u2019t matter. It all matters.\u201D");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Yu Gothic Medium", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel.setBounds(114, 160, 381, 32);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("X");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton.setForeground(new Color(47, 79, 79));
		btnNewButton.setBounds(555, 0, 45, 23);
		contentPane.add(btnNewButton);
		setLocationRelativeTo(null);
	}
}
