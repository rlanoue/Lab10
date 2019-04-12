import java.awt.Color;
import java.awt.Point;

public class IsoscelesTriangle extends Triangle {

	private double UMcalc; 
	private double UMcalc2; 

	public IsoscelesTriangle(Point pointLB, int base, int height, Color color, boolean filled) {
		super(pointLB, color, filled);

		UMcalc = (double) base;
		double temp = UMcalc / 2; 
		temp = (int) Math.round(temp);
		UMcalc = temp; 

		UMcalc = (double) height;
		double temp2 = UMcalc / 2; 
		int temp3 = (int) Math.round(temp2);
		UMcalc2 = temp3; 

		location = new Point[3]; 
		location[0] = pointLB; 
		location[1] = new Point ((int) pointLB.getX() + base, (int) pointLB.getY()); 
		location[2] = new Point ((int) pointLB.getX() + temp, (int) pointLB.getY() + temp3);  

	}
}