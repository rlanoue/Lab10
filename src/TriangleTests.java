import java.awt.Color;
import java.awt.Point;

import org.junit.Assert;
import org.junit.Test;

public class TriangleTests {

	private static int base = 3;
	private static int height = 4;
	
	private static RightTriangle rDrawn = new RightTriangle(new Point(20, 20), 3, 4, Color.YELLOW, false);

	private static int base2 = 3;
	private static int height2 = 8; 
	private static Point pointRA2 = new Point(75, 50); 
	private static RightTriangle rFilled = new RightTriangle(new Point(20, 20), 6, 8, Color.ORANGE, true);
	
	private static int base3 = 3;
	private static int height3 = 7;
	private static Point pointLB1 = new Point(15, 5); 
	private static IsoscelesTriangle iDrawn = new IsoscelesTriangle(new Point(20, 20), 5, 7, Color.MAGENTA, false);

	private static int base4 = 3;
	private static int height4 = 2;
	private static Point pointLB2 = new Point(5, 15); 
	private static IsoscelesTriangle iFilled = new IsoscelesTriangle(new Point(20, 20), 1, 2, Color.PINK, true);
	
	@Test
	public void triangleTests()
	{
		Point[] tPoint1 = rDrawn.getLocation(); 
		Assert.assertEquals(3, tPoint1.length);
		Assert.assertEquals(tPoint1[0], rDrawn.getLocation()[0]);
		Assert.assertEquals(tPoint1[1], rDrawn.getLocation()[1]);	
		Assert.assertEquals(tPoint1[2], rDrawn.getLocation()[2]);	
		Assert.assertEquals(Color.YELLOW, rDrawn.getColor());
		Assert.assertEquals(false, rDrawn.isFilled());
		//Assert.assertEquals(4, rDrawn.get)
		
		Point[] tPoint2 = rFilled.getLocation();  
		Assert.assertEquals(3, tPoint2.length);
		Assert.assertEquals(tPoint2[0], rFilled.getLocation()[0]);
		Assert.assertEquals(tPoint2[1], rFilled.getLocation()[1]);	
		Assert.assertEquals(tPoint2[2], rFilled.getLocation()[2]);
		Assert.assertEquals(Color.ORANGE, rFilled.getColor());
		Assert.assertEquals(true, rFilled.isFilled());
		
		Point[] tPoint3 = iDrawn.getLocation(); 
		Assert.assertEquals(3, tPoint3.length);
		Assert.assertEquals(new Point(15, 5), pointLB1);
		Assert.assertEquals(Color.MAGENTA, iDrawn.getColor());
		Assert.assertEquals(false, iDrawn.isFilled());
		Assert.assertEquals(tPoint3[0], iDrawn.getLocation()[0]);
		Assert.assertEquals(tPoint3[1], iDrawn.getLocation()[1]);	
		Assert.assertEquals(tPoint3[2], iDrawn.getLocation()[2]);
		 
		Point[] tPoint4 = iFilled.getLocation(); 
		Assert.assertEquals(3, tPoint4.length);
		Assert.assertEquals(tPoint4[0], iFilled.getLocation()[0]);
		Assert.assertEquals(tPoint4[1], iFilled.getLocation()[1]);	
		Assert.assertEquals(tPoint4[2], iFilled.getLocation()[2]);
		Assert.assertEquals(Color.PINK, iFilled.getColor());
		Assert.assertEquals(true, iFilled.isFilled());
		
	}
}