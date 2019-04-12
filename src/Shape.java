import java.awt.Color;
import java.awt.Point;

/**
 * abstract class for shape that is extended to all classes directly or indirectly
 * @author Jordan Lanoue
 *
 */
public abstract class Shape extends Object implements Drawable{

	//private instance variables that are called later in super constructors
	//protected array for storing the location of all the points of the shapes
	private Color color; 
	private boolean filled; 
	protected Point[] location; 
	
	/**
	 * constructor
	 * @param color 
	 * @param filled
	 */
	public Shape(Color color, Boolean filled){
		this.color = color; 
		this.filled = filled; 
	}

	/**
	 * 
	 * @returns the color of the shape in question
	 */
	public Color getColor() {
		return color; 
	}
	
	/**
	 * 
	 * @returns a true or false statement that then is passed along to the pain 
	 * function for if the shape is going to be an outline or filled
	 */
	public boolean isFilled() {
		return filled; 
	}
	/**
	 * 
	 * @returns the points of the shape stored in the locations array
	 */
	public Point[] getLocation() {
		return location; 
	}
}