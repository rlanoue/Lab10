import java.awt.Color;
import java.awt.Graphics;

public abstract class Polygon extends Shape{

	public Polygon(Color color, boolean filled)
	{
		super(color, filled); 
	}

	public void draw(Graphics g) {
		int[] xPoints = new int[location.length];
		int[] yPoints = new int[location.length]; 
		int nPoints = location.length;
		for(int i = 0; i < location.length; i++) 
		{
			xPoints[i] = (int) location[i].getX(); 
			yPoints[i] = (int) location[i].getY(); 
		}
		
		g.setColor(getColor());
		
		if (isFilled())
		{
			g.fillPolygon(xPoints, yPoints, nPoints);
		}
		else
		{
			g.drawPolygon(xPoints, yPoints, nPoints);
		}
	}
}
