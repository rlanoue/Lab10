import javax.swing.JFrame;
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

	public DrawFrame(String title) {

	}
	
	//private static final long serialVersionUID = 1L;
			static int x = 0; 
			static int y = 0; 
	private void moveText() {
		x = x + 1; 
		y = y + 1; 
	}

	public static void main(String[] args) throws InterruptedException {
		

		
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
			Thread.sleep(10); 
		}
	}
}