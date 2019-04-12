import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Oval extends Shape{

	//Private instance variables for diameters
	private int diameter1;
	private int diameter2; 
	
	/**
	 * 
	 * @param pointUL location where the oval/circle begins
	 * @param diameter first diameter for an oval - only for a circle
	 * @param diameter2 second diameter used only for ovals
	 * @param color relys the color of the oval or circle
	 * @param filled reports a true/false boolean if the oval/circle is filled or just the outline of the shape
	 */
	public Oval(Point pointUL, int diameter, int diameter2, Color color, boolean filled) {
		super(color, filled); 
		this.diameter1 = diameter; 
		this.diameter2 = diameter2;   

		location = new Point[1];
		location[0] = pointUL; 
	}
	 
	/**
	 * 
	 * @returns the first diameter of the oval
	 */
	public int getDiameter1() {
		return diameter1;
	}
	
	/**
	 * 
	 * @returns the second diameter of the oval
	 */
	public int getDiameter2() {
		return diameter2;
	}

	
	@Override
	/**
	 * draws the shape with the designated color
	 */
	public void draw(Graphics graphics) {
		graphics.setColor(getColor());
	}
}