import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JPanel;

public class Panel extends JPanel {
	
	public Panel(AttackAircrafts array) {
		
	}
	public Panel(AircraftsGuns array) {
		
	}
	

	final static Random random = new Random();
	int number = 4 + (int) (Math.random() * 3);

	public void paint(Graphics g) {
		super.paint(g);
		AttackAircrafts.DrawAttackAircraft(g);
	}

}
