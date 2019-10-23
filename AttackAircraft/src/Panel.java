import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JPanel;

public class Panel extends JPanel {
	//private static AttackAircrafts aircraft;
	
	public Panel(AttackAircrafts array) {
		
	}
	public Panel(AircraftsGuns array) {
		
	}
	

	

	public void paint(Graphics g) {
		super.paint(g);
		AttackAircrafts.DrawAttackAircraft(g);
	}

}
