import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import javax.swing.JPanel; 
/**
 * 
 * @author Jordan Lanoue
 *
 */
public class DrawFrame extends JFrame {

	//instance object of the drawpanel class
	private DrawPanel drawPanel; 

	private static Font fB14 = new Font("Copperplate Gothic Light", Font.BOLD, 14); 

	//	static int xValue1 = 200; 
	//	static int yValue1 = 150; 
	//
	//	static int xValue2 = 150; 
	//	static int yValue2 = 200; 
	//
	//	void moveText() {
	//		xValue1 += 2; 
	//		yValue1 += -2; 
	//		if (yValue1 == 90 )
	//		{
	//			yValue1 = 150; 
	//			xValue1 = 200; 
	//		}
	//		xValue2 += 2; 
	//		yValue2 += -2; 
	//		if (yValue2 == 140 )
	//		{
	//			yValue2 = 150; 
	//			xValue2 = 200; 
	//		}
	//
	//	}

	public DrawFrame(String title) {
		super(title); 
		JFrame window = new JFrame("LAB10"); 
		window.setFont(fB14);
		window.setSize(500, 500);
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		DrawPanel drawpanel = new DrawPanel();
		
		Circle circle1 = new Circle(new Point(0, 6), 6, Color.RED, true); 
	
	}
	//	public static JFrame animatedFrame() throws InterruptedException {
	//		JFrame frame = new JFrame("Graphics Demo");
	//		DrawFrame animation = new DrawFrame("Animated!"); 
	//		frame.add(animation); 
	//		frame.setSize(400, 400);
	//		frame.setVisible(true);
	//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//		
	//		while(true) 
	//		{
	//			animation.moveText(); 
	//			animation.repaint();  
	//			//Thread.sleep(50); 
	//		}
	//	}

	public static void main(String[] args) {
		DrawFrame frame = new DrawFrame("Picture"); 
		
		
		
	}

	public static class help extends JPanel{


		static int xValue1 = 200; 
		static int yValue1 = 150; 

		static int xValue2 = 150; 
		static int yValue2 = 200; 

		public static void main(String[] args) throws InterruptedException {
			JFrame frame = new JFrame("Graphics Demo");
			help animation = new help(); 

			frame.add(animation); 
			frame.setSize(400, 400);
			frame.setVisible(true);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			while(true) 
			{
				animation.moveText(); 
				animation.repaint();  
				Thread.sleep(50); 
			}
		}
		private void moveText() {
			xValue1 += 2; 
			yValue1 += -2; 
			if (yValue1 == 90 )
			{
				yValue1 = 150; 
				xValue1 = 200; 
			}
			xValue2 += 2; 
			yValue2 += -2; 
			if (yValue2 == 140 )
			{
				yValue2 = 150; 
				xValue2 = 200; 
			}
	}
	}
}

	//	@Override
	//	public void paint(Graphics g)
	//	{
	//		super.paint(g);
	//		Graphics2D g2d = (Graphics2D) g; 
	//		g2d.setFont(fB14);
	//		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
	//		g2d.drawString("Zzz", xValue1, yValue1);
	//		g2d.drawString("Zzz", xValue2, yValue2); 
	//	}
