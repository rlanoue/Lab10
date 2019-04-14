import java.awt.Color;
import java.awt.Point;

/**
 * 
 * @author Jordan Lanoue
 *
 */
public class Square extends Rectangle {

	/**
	 * 
	 * @param pointUL
	 * @param width used twice because its a square (rather than height)
	 * @param color
	 * @param filled
	 */
	public Square(Point pointUL, int width, Color color, boolean filled) {
		super(pointUL, width, width, color, filled);
		
	}
}