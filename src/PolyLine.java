import java.awt.Color;
import java.awt.Point;
/**
 * 
 * @author Jordan Lanoue
 *
 */
public class PolyLine extends Polygon {
/**
 * 
 * @param pointUL starting point of the polygon shape
 * @param pointUR the next point of the polygon
 * @param thickness how long the shape is
 * @param color - what color the polygon will ne 
 * @param filled - determines if its filled or outlined 
 */
	public PolyLine(Point pointUL, Point pointUR, int thickness, Color color, boolean filled){
		super(color, filled); 	
		location = new Point[4]; 
		location[0] = pointUL;
		location[1] = pointUR; 
		location[2] = new Point((int) location[0].getX(), (int) (location[0].getY() + thickness)); 
		location[3] = new Point((int) location[1].getX(), (int) (location[1].getY() + thickness)); 
	} 
}