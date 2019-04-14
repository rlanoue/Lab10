import java.awt.Color;
import java.awt.Point;

public class IsoscelesTriangle extends Triangle {

	private double UMcalc; 
	private double UMcalc2; 

	public IsoscelesTriangle(Point pointLB, int base, int height, Color color, boolean filled) {
		super(pointLB, color, filled);

		//Do not use an odd number for base 
		UMcalc = (double) base;
		double temp = UMcalc / 2; 
		temp = (int) Math.round(temp);
		UMcalc = temp; 

		location = new Point[3]; 
		location[0] = pointLB; 
		location[1] = new Point ((int) pointLB.getX() + base, (int) pointLB.getY()); 
		location[2] = new Point ((int) (pointLB.getX() + temp), (int) pointLB.getY() + height);  

	}
}