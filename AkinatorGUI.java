package repaso;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class AkinatorGUI {
	private boolean decision;
	private JFrame frame;
	private Image cloud;
	/**
	 * Launch the application.
	 */
	private Image image ;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AkinatorGUI window = new AkinatorGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the application.
	 */
	public AkinatorGUI() {
		initialize();
		this.cloud = new ImageIcon("cloud.jpg").getImage();
	}
	/**
	 * Initialize the contents of the frame.
	 */
//	public void paint(Graphics g){
//		super.paint(g);
//		g.drawImage(cloud, 534, 174, null);
//	}
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1065, 615);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton No = new JButton("No");
		No.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				decision = false;
			}
		});
		No.setBounds(644, 413, 89, 23);
		frame.getContentPane().add(No);
		
		JButton Si = new JButton("Si");
		Si.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				decision = true;
			}
		});
		Si.setBounds(541, 413, 89, 23);
		frame.getContentPane().add(Si);
	}
}
