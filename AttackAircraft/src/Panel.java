import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JPanel;

public class Panel extends JPanel {	
	ITransport transport;
	
	
	public Panel(ITransport transport ) {
		this.transport = transport;
		
	}
	
	//public Panel(AircraftsGuns array) {}

	public void paint(Graphics g) {
		super.paint(g);
		transport.DrawAircraft(g);
		
	
	
	}

}
