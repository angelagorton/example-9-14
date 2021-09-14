import java.awt.Color;
import java.awt.Graphics;

public class Rectangle extends Shape{
	/*
	 * to autogenerate constructor hover over the error on "rectangle" click
	 * generate constructor
	 */

	public Rectangle(int x, int y, int width, int height) {
		super(x, y, width, height);
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
		g.setColor(Color.BLACK);
		g.drawRect(getX(), getY(), getWidth(), getHeight());
	}
	
	
	

}
