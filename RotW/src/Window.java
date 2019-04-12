import java.awt.*;
import javax.swing.JFrame;


public class Window {

	public Window(int width, int height, String title, Game game /* what is this */ ) {
		JFrame frame = new JFrame();	
		frame.setPreferredSize(new Dimension(width, height));
		frame.setMaximumSize(new Dimension(width, height));
		frame.setMinimumSize(new Dimension(width, height));
		
		frame.add(game);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
