import static org.junit.Assert.*;

import java.awt.Color;
import java.awt.Point;

import org.junit.Assert;
import org.junit.Test;

public class RectangleTests {

	private Square sd = new Square(new Point(100, 100), 50, Color.DARK_GRAY, false);
	private Square sf = new Square(new Point(100, 100), 75, Color.LIGHT_GRAY, true);

	private Rectangle rd = new Rectangle(new Point(200, 300), 60, 70, Color.MAGENTA, false);
	private Rectangle rf = new Rectangle(new Point(200, 300), 75, 90, Color.RED, true);

	@Test
	public void rectangles(){
		
		Point[] sPoint1 = sd.getLocation(); 
		Assert.assertEquals(Color.DARK_GRAY, sd.getColor()); 
		Assert.assertEquals(false, sd.isFilled());
		Assert.assertEquals(4, sPoint1.length);
		Assert.assertEquals(sPoint1[0], sd.getLocation()[0]);
		Assert.assertEquals(sPoint1[1], sd.getLocation()[1]);	
		Assert.assertEquals(sPoint1[2], sd.getLocation()[2]);
		
		Point[] sPoint2 = sf.getLocation();
		Assert.assertEquals(Color.LIGHT_GRAY, sf.getColor());
		Assert.assertEquals(true, sf.isFilled());
		Assert.assertEquals(4, sPoint1.length);
		Assert.assertEquals(sPoint2[0], sf.getLocation()[0]);
		Assert.assertEquals(sPoint2[1], sf.getLocation()[1]);	
		Assert.assertEquals(sPoint2[2], sf.getLocation()[2]);
	
		Point[] rPoint1 = rd.getLocation(); 
		Assert.assertEquals(Color.MAGENTA, rd.getColor()); 
		Assert.assertEquals(false, rd.isFilled());
		Assert.assertEquals(4, rPoint1.length);
		Assert.assertEquals(rPoint1[0], rd.getLocation()[0]);
		Assert.assertEquals(rPoint1[1], rd.getLocation()[1]);	
		Assert.assertEquals(rPoint1[2], rd.getLocation()[2]);
		
		Point[] rPoint2 = rf.getLocation(); 
		Assert.assertEquals(Color.RED, rf.getColor());	
		Assert.assertEquals(true, rf.isFilled());
		
		Assert.assertEquals(4, rPoint2.length);
		Assert.assertEquals(rPoint2[0], rf.getLocation()[0]);
		Assert.assertEquals(rPoint2[1], rf.getLocation()[1]);	
		Assert.assertEquals(rPoint2[2], rf.getLocation()[2]);
	}
}
