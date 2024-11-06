import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {
	
	private static void updatePoints(JLabel label, Player player) {
		DecimalFormat df = new DecimalFormat(",###");		
		label.setText("Punkte:   " + df.format(player.getPoints()));
	}
	
	private static void updateButton(JButton button, String text) {
		button.setText("<html>" + text.replaceAll("\\n", "<br>") + "</html>");
	}
	
	
	//Defualt (all false)
	private static boolean state1 = false;
	private static boolean state2 = false;
	private static boolean state3 = false;
	private static boolean state4 = false;
	private static boolean state5 = false;
	private static boolean state6 = false;
	private static boolean state7 = false;
	private static boolean state8 = false;
	private static boolean state9 = false;
	
	public static void main(String[] args) {
		
		//Default (int level = 0, int points = 0)
		Player p = new Player(0, 0);
		
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(10, 10, 10, 10);
		
		DecimalFormat df = new DecimalFormat(",###");
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 650);
		frame.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridBagLayout());
		frame.getContentPane().add(panel);
		
		JLabel points = new JLabel("Punkte:   " + df.format(p.getPoints()));
		gbc.gridwidth = 2;
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.ipady = 70;
		panel.add(points, gbc);
		
		int pointsReward0 = 1;
		JButton button0 = new JButton("<html>Dimension 01\n[+1P]".replaceAll("\\n", "<br>") + "</html>");
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.ipadx = 20;
		gbc.ipady = 30;
		gbc.gridwidth = 1;
		panel.add(button0, gbc);
		
		int pointsCost1 = 100;
		int pointsReward1 = 2;
		String name1 = state1 ? "Dimension 02\n[+2P]" : "Freischalten?\n[100P]";
		JButton button1 = new JButton("<html>" + name1.replaceAll("\\n", "<br>") + "</html>");
		gbc.gridx = 1;
		gbc.gridy = 1;
		panel.add(button1, gbc);
		
		int pointsCost2 = 500;
		int pointsReward2 = 3;
		String name2 = state2 ? "Dimension 03\n[+3P]" : "Freischalten?\n[500P]";
		JButton button2 = new JButton("<html>" + name2.replaceAll("\\n", "<br>") + "</html>");
		gbc.gridx = 0;
		gbc.gridy = 2;
		panel.add(button2, gbc);
		
		int pointsCost3 = 1000;
		int pointsReward3 = 5;
		String name3 = state3 ? "Dimension 04\n[+5P]" : "Freischalten?\n[1.000P]";
		JButton button3 = new JButton("<html>" + name3.replaceAll("\\n", "<br>") + "</html>");
		gbc.gridx = 1;
		gbc.gridy = 2;
		panel.add(button3, gbc);
	
		int pointsCost4 = 5000;
		int pointsReward4 = 10;
		String name4 = state4 ? "Dimension 05\n[+10P]" : "Freischalten?\n[5.000P]";
		JButton button4 = new JButton("<html>" + name4.replaceAll("\\n", "<br>") + "</html>");
		gbc.gridx = 0;
		gbc.gridy = 3;
		panel.add(button4, gbc);
		
		int pointsCost5 = 10000;
		int pointsReward5 = 50;
		String name5 = state5 ? "Dimension 06\n[+50P]" : "Freischalten?\n[10.000P]";
		JButton button5 = new JButton("<html>" + name5.replaceAll("\\n", "<br>") + "</html>");
		gbc.gridx = 1;
		gbc.gridy = 3;
		panel.add(button5, gbc);
		
		int pointsCost6 = 50000;
		int pointsReward6 = 100;
		String name6 = state6 ? "Dimension 07\n[+100P]" : "Freischalten?\n[50.000P]";
		JButton button6 = new JButton("<html>" + name6.replaceAll("\\n", "<br>") + "</html>");
		gbc.gridx = 0;
		gbc.gridy = 4;
		panel.add(button6, gbc);
		
		int pointsCost7 = 100000;
		int pointsReward7 = 500;
		String name7 = state7 ? "Dimension 08\n[+500P]" : "Freischalten?\n[100.000P]";
		JButton button7 = new JButton("<html>" + name7.replaceAll("\\n", "<br>") + "</html>");
		gbc.gridx = 1;
		gbc.gridy = 4;
		panel.add(button7, gbc);
		
		int pointsCost8 = 500000;
		int pointsReward8 = 1000;
		String name8 = state8 ? "Dimension 09\n[+1.000P]" : "Freischalten?\n[500.000P]";
		JButton button8 = new JButton("<html>" + name8.replaceAll("\\n", "<br>") + "</html>");
		gbc.gridx = 0;
		gbc.gridy = 5;
		panel.add(button8, gbc);
		
		int pointsCost9 = 1000000;
		int pointsReward9 = 5000;
		String name9 = state9 ? "Dimension 10\n[+5.000P]" : "Freischalten?\n[1.000.000P]";
		JButton button9 = new JButton("<html>" + name9.replaceAll("\\n", "<br>") + "</html>");
		gbc.gridx = 1;
		gbc.gridy = 5;
		panel.add(button9, gbc);
		
		
		
		
		
		
		//Event Listener
		
		
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				p.setPoints(p.getPoints() + pointsReward0);
				updatePoints(points, p);
			}
		});
		
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!state1 && p.getPoints() < 5) {
					return;
				} else if(!state1) {
					p.setPoints(p.getPoints() - pointsCost1);
					updatePoints(points, p);
					updateButton(button1, "Dimension 02\n[+2P]");
					state1 = true;
					return;
				}
				
				p.setPoints(p.getPoints() + pointsReward1);
				updatePoints(points, p);
			}
		});
		
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!state2 && p.getPoints() < pointsCost2) {
					return;
				} else if(!state2) {
					p.setPoints(p.getPoints() - pointsCost2);
					updatePoints(points, p);
					updateButton(button2, "Dimension 03\n[+3P]");
					state2 = true;
					return;
				}
				
				p.setPoints(p.getPoints() + pointsReward2);
				updatePoints(points, p);
			}
		});
		
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!state3 && p.getPoints() < pointsCost3) {
					return;
				} else if(!state3) {
					p.setPoints(p.getPoints() - pointsCost3);
					updatePoints(points, p);
					updateButton(button3, "Dimension 04\n[+5P]");
					state3 = true;
					return;
				}
				
				p.setPoints(p.getPoints() + pointsReward3);
				updatePoints(points, p);
			}
		});
		
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!state4 && p.getPoints() < pointsCost4) {
					return;
				} else if(!state4) {
					p.setPoints(p.getPoints() - pointsCost4);
					updatePoints(points, p);
					updateButton(button4, "Dimension 05\n[+10P]");
					state4 = true;
					return;
				}
				
				p.setPoints(p.getPoints() + pointsReward4);
				updatePoints(points, p);
			}
		});
		
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!state5 && p.getPoints() < pointsCost5) {
					return;
				} else if(!state5) {
					p.setPoints(p.getPoints() - pointsCost5);
					updatePoints(points, p);
					updateButton(button5, "Dimension 06\n[+50P]");
					state5 = true;
					return;
				}
				
				p.setPoints(p.getPoints() + pointsReward5);
				updatePoints(points, p);
			}
		});
		
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!state6 && p.getPoints() < pointsCost6) {
					return;
				} else if(!state6) {
					p.setPoints(p.getPoints() - pointsCost6);
					updatePoints(points, p);
					updateButton(button6, "Dimension 07\n[+100P]");
					state6 = true;
					return;
				}
				
				p.setPoints(p.getPoints() + pointsReward6);
				updatePoints(points, p);
			}
		});
		
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!state7 && p.getPoints() < pointsCost7) {
					return;
				} else if(!state7) {
					p.setPoints(p.getPoints() - pointsCost7);
					updateButton(button7, "Dimension 08\n[+500P]");
					updatePoints(points, p);
					state7 = true;
					return;
				}
				
				p.setPoints(p.getPoints() + pointsReward7);
				updatePoints(points, p);
			}
		});
		
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!state8 && p.getPoints() < pointsCost8) {
					return;
				} else if(!state8) {
					p.setPoints(p.getPoints() - pointsCost8);
					updatePoints(points, p);
					updateButton(button8, "Dimension 09\n[+1.000P]");
					state8 = true;
					return;
				}
				
				p.setPoints(p.getPoints() + pointsReward8);
				updatePoints(points, p);
			}
		});
		
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!state9 && p.getPoints() < pointsCost9) {
					return;
				} else if(!state9) {
					p.setPoints(p.getPoints() - pointsCost9);
					updatePoints(points, p);
					updateButton(button9, "Dimension 10\n[+5.000P]");
					state9 = true;
					return;
				}
				
				p.setPoints(p.getPoints() + pointsReward9);
				updatePoints(points, p);
			}
		});
		
		frame.setVisible(true);
		
	}
	
}
