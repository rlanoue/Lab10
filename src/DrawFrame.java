import javax.swing.JFrame;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
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
	
	private Font fB14 = new Font("Copperplate Gothic Light", Font.BOLD, 14); 

	static int xValue1 = 200; 
	static int yValue1 = 150; 
	
	static int xValue2 = 150; 
	static int yValue2 = 200; 
	
	void moveText() {
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
	
	public DrawFrame(String title) {

	}
	public static JFrame animatedFrame() {
		JFrame frame = new JFrame("Graphics Demo");
		DrawFrame animation = new DrawFrame("Animated!"); 
		frame.add(animation); 
		frame.setSize(400, 400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		while(true) 
		{
			animation.moveText(); 
			animation.repaint();  
			//Thread.sleep(50); 
		}
	}

	public static void main(String[] args) throws InterruptedException {

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
//			Thread.sleep(50); 
//		}
	}
	
		@Override
		public void paint(Graphics g)
		{
			super.paint(g);
			Graphics2D g2d = (Graphics2D) g; 
			g2d.setFont(fB14);
			g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
			g2d.drawString("Zzz", xValue1, yValue1);
			g2d.drawString("Zzz", xValue2, yValue2); 
	}
}