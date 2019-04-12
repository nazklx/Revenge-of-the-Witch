import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Box  /*Test Class */ extends GameObject{

	public Box(int x, int y) {
		super(x, y);
		
	}

	@Override
	public void tick() {
		x += velX;
		y += velY;
		
	}

	@Override
	public void render(Graphics g) {
		g.setColor(Color.blue);
		g.fillRect(x, y, 32, 32 );
		
	}

	@Override
	public Rectangle getBounds() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}