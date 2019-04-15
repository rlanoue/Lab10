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
	
	public DrawFrame(String title){
		super(title); 
	//	JFrame window = new JFrame("LAB10"); 
		setFont(fB14);
		setSize(600, 700);
		setVisible(true);
		setBackground(Color.LIGHT_GRAY);
		
		drawPanel = new DrawPanel();
		
//		drawPanel.setBackground(Color.GREEN);
		
		Color Brown = new Color(139,69,19); 
		Color LBrown = new Color (181,101,29); 
		Color Gold = new Color(212,175,55); 
		
		Oval body = new Oval(new Point(100, 100), 200, 350, Brown, true);
		Oval bodyO = new Oval(new Point(100, 100), 200, 350, Color.BLACK, false);
		
		Circle head = new Circle(new Point(100, 75), 200, LBrown, true);
		Circle headO = new Circle(new Point(100, 75), 200, Color.BLACK, false);
		
		Diamond lWing = new Diamond(new Point (180, 300), 150, LBrown, true); 
		Diamond rWing = new Diamond(new Point (0, 300), 150, LBrown, true); 
		
		PolyLine lwingDetail = new PolyLine(new Point(260, 140), new Point(400, 290), 100, Brown, true); 
		PolyLine rwingDetail = new PolyLine(new Point(150, 140), new Point(0, 290), 100, Brown, true); 

		RightTriangle lEar = new RightTriangle(new Point(150, 100), 50, -60, Brown, true); 
		RightTriangle rEar = new RightTriangle(new Point(250, 100), -50, -60, Brown, true);
		
		Circle lEye = new Circle(new Point(130, 110), 50, Color.white, true); 
		Circle rEye = new Circle(new Point(220, 110), 50, Color.WHITE, true);

		Circle lPupil = new Circle(new Point(150, 130), 10, Color.black, true); 
		Circle rPupil = new Circle(new Point(240, 130), 10, Color.black, true);

		
		IsoscelesTriangle beak = new IsoscelesTriangle(new Point(175, 175), 55, 60, Gold, true); 
		
		IsoscelesTriangle lfoot = new IsoscelesTriangle(new Point(130, 470), 55, -60, Gold, true); 
		IsoscelesTriangle rfoot = new IsoscelesTriangle(new Point(205, 470), 55, -60, Gold, true);
		
		Rectangle branch = new Rectangle(new Point(0, 470), 500, 40, Brown, true);
		Square trunk = new Square(new Point(470, 0), 5000, Brown, true); 
		
		
		drawPanel.addShape(lWing);
		drawPanel.addShape(lwingDetail);
		drawPanel.addShape(rWing);
		drawPanel.addShape(rwingDetail);
		drawPanel.addShape(lfoot);
		drawPanel.addShape(rfoot);
		drawPanel.addShape(body);
		drawPanel.addShape(bodyO);
		drawPanel.addShape(lEar);
		drawPanel.addShape(rEar);
		drawPanel.addShape(head);
		drawPanel.addShape(headO);
		drawPanel.addShape(beak); 
		drawPanel.addShape(lEye);
		drawPanel.addShape(rEye);
		drawPanel.addShape(lPupil);
		drawPanel.addShape(rPupil);
		drawPanel.addShape(branch);
		drawPanel.addShape(trunk);
		
		
		
		
		
		
		
		//drawPanel.addShape(rec);
		//drawPanel.addShape(diamon);
		
		
		this.add(drawPanel);
	}
	
		public static void main(String[] args) {
			DrawFrame frame = new DrawFrame("Picture"); 
			
			
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	}

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

	
		
//		while(true) 
//		{
//			animation.moveText(); 
//			animation.repaint();  
//			Thread.sleep(50); 
//		}
//	}
//		
//	
//		
//		private void moveText() {
//			xValue1 += 2; 
//			yValue1 += -2; 
//			if (yValue1 == 90 )
//			{
//				yValue1 = 150; 
//				xValue1 = 200; 
//			}
//			xValue2 += 2; 
//			yValue2 += -2; 
//			if (yValue2 == 140 )
//			{
//				yValue2 = 150; 
//				xValue2 = 200; 
//			}
//		
////			@Override
////			public paintComponent(Graphics g)
////			{
////				super.paint(g);
//			Graphics g = null; 
//				Graphics2D g2d = (Graphics2D) g; 
//				g2d.setFont(fB14);
//				g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
//				g2d.drawString("Zzz", xValue1, yValue1);
//				g2d.drawString("Zzz", xValue2, yValue2); 
//			//}
//			
//		
//		
//	}
//		
//
//	//	public static JFrame animatedFrame() throws InterruptedException {
//	//		JFrame frame = new JFrame("Graphics Demo");
//	//		DrawFrame animation = new DrawFrame("Animated!"); 
//	//		frame.add(animation); 
//	//		frame.setSize(400, 400);
//	//		frame.setVisible(true);
//	//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//	//		
//	//		while(true) 
//	//		{
//	//			animation.moveText(); 
//	//			animation.repaint();  
//	//			//Thread.sleep(50); 
//	//		}
//	//	}
//
//	
//	}
////
////	class help extends JPanel{
////
////		private static Font fB14 = new Font("Copperplate Gothic Light", Font.BOLD, 14);
////		
////		static int xValue1 = 200; 
////		static int yValue1 = 150; 
////
////		static int xValue2 = 150; 
////		static int yValue2 = 200; 
////
////		public static void main(String[] args) throws InterruptedException {
////			JFrame frame = new JFrame("Graphics Demo");
////			help animation = new help(); 
////
////			frame.add(animation); 
////			frame.setSize(400, 400);
////			frame.setVisible(true);
////			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
////
////			while(true) 
////			{
////				animation.moveText(); 
////				animation.repaint();  
////				Thread.sleep(50); 
////			}
////		}
////		private void moveText() {
////			xValue1 += 2; 
////			yValue1 += -2; 
////			if (yValue1 == 90 )
////			{
////				yValue1 = 150; 
////				xValue1 = 200; 
////			}
////			xValue2 += 2; 
////			yValue2 += -2; 
////			if (yValue2 == 140 )
////			{
////				yValue2 = 150; 
////				xValue2 = 200; 
////			}
////	}
////	
////	
////
////		@Override
////		public void paint(Graphics g)
////		{
////			super.paint(g);
////			Graphics2D g2d = (Graphics2D) g; 
////			g2d.setFont(fB14);
////			g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
////			g2d.drawString("Zzz", xValue1, yValue1);
////			g2d.drawString("Zzz", xValue2, yValue2); 
////		}
////	}


//private int xValue1 = 200; 
//private int yValue1 = 150; 
//
//private int xValue2 = 150; 
//private int yValue2 = 200; 