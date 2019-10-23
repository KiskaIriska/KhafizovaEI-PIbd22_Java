import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class AttackAircraftPanel {

	private JFrame frame;
	private AttackAircrafts aircraft;
	private JPanel Panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AttackAircraftPanel window = new AttackAircraftPanel();
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
	public AttackAircraftPanel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
 
		frame = new JFrame();
		frame.setBounds(100, 100, 700, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Random rnd = new Random();
		
		JButton btnNewButton = new JButton("\u0421\u043E\u0437\u0434\u0430\u0442\u044C ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aircraft = new AttackAircrafts(rnd.nextInt(100) + 300, rnd.nextInt(1000) + 2000, Color.GRAY, Color.DARK_GRAY, true, true, true);
				aircraft.SetPosition(rnd.nextInt(100) + 300, rnd.nextInt(100) + 100, 550, 500);
				Panel = new Panel(aircraft);
				Panel.setBorder(new BevelBorder(BevelBorder.LOWERED, 
						null, null, null, null));
				Panel.setBounds(30, 10, 630, 370);
				frame.getContentPane().add(Panel);
				Panel.repaint();
			}
		});
		btnNewButton.setBounds(122, 414, 89, 23); 
		frame.getContentPane().add(btnNewButton);

		JButton btnNewButton_2 = new JButton("<<");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aircraft.MoveTransport(Direction.Left);
				Panel.repaint();
			}
		});
		btnNewButton_2.setBounds(269, 414, 57, 23);
		frame.getContentPane().add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton(">>");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aircraft.MoveTransport(Direction.Right);
				Panel.repaint();
			}
		});
		btnNewButton_3.setBounds(435, 414, 57, 23);
		frame.getContentPane().add(btnNewButton_3);

		JButton btnNewButton_4 = new JButton("v");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				aircraft.MoveTransport(Direction.Down);
				Panel.repaint();
			}
		});
		btnNewButton_4.setBounds(336, 427, 89, 23);
		frame.getContentPane().add(btnNewButton_4);

		JButton btnNewButton_1 = new JButton("^");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aircraft.MoveTransport(Direction.Up);
				Panel.repaint();
			}
		});
		btnNewButton_1.setBounds(336, 402, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
	}
}
