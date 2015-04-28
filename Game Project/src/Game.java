import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;


public class Game extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Game frame = new Game();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	
//GAME CODE

//Initial Grid Placement
int x=4;
int y=4;
	public Game() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel console = new JLabel("");
		console.setBounds(10, 11, 414, 71);
		contentPane.add(console);
		
		
		
		JButton north = new JButton("North");
		north.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				y = y-1;
				
			}
		});
		north.setBounds(166, 158, 89, 23);
		contentPane.add(north);
		
		JButton south = new JButton("South");
		south.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		south.setBounds(166, 192, 89, 23);
		contentPane.add(south);
		
		JButton east = new JButton("East");
		east.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		east.setBounds(265, 178, 89, 23);
		contentPane.add(east);
		
		JButton west = new JButton("West");
		west.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		west.setBounds(67, 178, 89, 23);
		contentPane.add(west);
		
		JButton btnAttack = new JButton("Attack");
		btnAttack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAttack.setBounds(335, 228, 89, 23);
		contentPane.add(btnAttack);
		
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		textField.setBounds(67, 93, 287, 39);
		contentPane.add(textField);
		textField.setColumns(10);
	}
	
}
