//import java.awt.Color;
//import java.awt.Point;
//
//import org.junit.Assert;
//import org.junit.Test;
//
//public class CircleOvalTests {
//
//
//	private static int diameter1 = 4; 
//	private static Point CP1 = new Point(50, 75); 
//	private static Circle cDrawn = new Circle(new Point(20, 20), diameter1, Color.YELLOW, false);
//
//	private static int diameter2 = 14; 
//	private static Point CP2 = new Point(75, 50); 
//	private static Circle cFilled = new Circle(new Point(21, 21), diameter2, Color.ORANGE, true);
//
//
//	private static int diameter3 = 3; 
//	private static int diameter4 = 6; 
//	private static Point OP1 = new Point (80, 20); 
//	private static Oval oDrawn = new Oval(new Point(70, 70), diameter3, diameter4, Color.BLUE, false);
//	
//	private static int diameter5 = 3; 
//	private static int diameter6 = 6; 
//	private static Point OP2 = new Point (80, 20); 
//	private static Oval oFilled = new Oval(new Point(70, 70), diameter3, diameter4, Color.GREEN, true);
//	//    private static int delta2 = (int) (100 / Math.sqrt(2));
//	//    private static Point left2 = new Point(100, 100);
//	//    private static Point upper2 = new Point((100 + delta2), (100 - delta2));
//	//    private static Point lower2 = new Point((100 + delta2), (100 + delta2));
//	//    private static Point right2 = new Point((100 + 2 * delta2), 100);
//	//
//
//
//	@Test
//	public void testConstructors()
//	{
//		Point[] points1 = cDrawn.getLocation();
//		Assert.assertEquals(1, points1.length);
//		Assert.assertEquals(Color.YELLOW, cDrawn.getColor());
//		Assert.assertEquals(false, cDrawn.isFilled());
//		//
//		
//		Point[] points2 = cFilled.getLocation();
//		Assert.assertEquals(1, points2.length);
//		Assert.assertEquals(Color.ORANGE, cFilled.getColor());
//		Assert.assertEquals(true, cFilled.isFilled());
//		//Assert.assertTrue(ShapeUtils.pointInSet(points, UL));
//		
//		Point[] points3 = oDrawn.getLocation();
//		Assert.assertEquals(1, points3.length);
//		Assert.assertEquals(Color.BLUE, oDrawn.getColor());
//		Assert.assertEquals(false,  oDrawn.isFilled());
//		//
//		
//		Point[] points4 = oFilled.getLocation();
//		Assert.assertEquals(1, points4.length);
//		Assert.assertEquals(Color.GREEN, oFilled.getColor());
//		Assert.assertEquals(true, oFilled.isFilled());
//		//
//		
//	}
//	
//	@Test
//	public void getDiametersTest()
//	{
//		Assert.assertEquals(diameter1, cDrawn.getDiameter()); 
//		Assert.assertEquals(diameter2, cFilled.getDiameter());
//		
//		Assert.assertEquals(diameter3, oDrawn.getDiameter1()); 
//		Assert.assertEquals(diameter4, oDrawn.getDiameter2()); 
//		
//		Assert.assertEquals(diameter5, oFilled.getDiameter1()); 
//		Assert.assertEquals(diameter6, oFilled.getDiameter2()); 
//		
//	}
//	
//	@Test 
//	public void drawTest()
//	{
//		//Assert.assertEquals(cDrawn, oDrawn.draw(oval));
//	}
//}
//
