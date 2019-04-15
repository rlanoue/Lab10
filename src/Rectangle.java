import java.awt.Color;
import java.awt.Point;

public class Rectangle extends Polygon{
	

	/**
	 * 
	 * @param pointUL is the starting point for the rectangle being drawn 
	 * @param width is how long the shape is 
	 * @param height is how many pixels tall the shape is
	 * @param color is the color the shape is returned
	 * @param filled boolean for whether or not its filled or just outlined
	 */
	public Rectangle(Point pointUL, int width, int height, Color color, boolean filled) {
		super(color, filled);
		// TODO Auto-generated constructor stub
		location = new Point[4];
		location[0] = pointUL;
		location[1] = new Point((int) location[0].getX() + width, (int) location[0].getY()); //UR 
		location[2] = new Point((int) location[0].getX() + width, (int) location[0].getY() + height); //DR
		location[3] = new Point((int) location[0].getX(), (int) location[0].getY() + height); //DL
		
	}

}