import java.awt.Color;
import java.awt.Point;

public abstract class Shape extends Object implements Drawable{

	private Color color; 
	private boolean filled; 
	protected Point[] location; 
	
	public Shape(Color color, Boolean filled)
	{
		this.color = color; 
		this.filled = filled; 
	}
	
	public Color getColor() {
		return color; 
	}
	
	public boolean isFilled() {
		return filled; 
	}
	
	public Point[] getLocation() {
		return location; 
	}
}
