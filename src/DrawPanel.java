import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class DrawPanel {

	
	@Override
	protected void paintComponent(Graphics g)
	{
		super.paintComponent((java.awt.Graphics) g);
		Graphics2D g2d = (Graphics2D) g; 
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.drawString("Moo", x, y);//(x, y, 30, 30);
	}
}
