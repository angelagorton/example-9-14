import java.awt.Color;
import java.awt.Component;

public class Shape extends Component{
	
	//instance variables
	private int x;
	private int y;
	private int width;
	private int height;
	
	Color color = Color.WHITE;
	
	public Shape(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
		this.width = 50; //this is a default value
		this.height = 50; //this is a default value
	}
	
	/*
	 * to automatically generate getters/setters (the ones below are autogenerated)
	 * 1. got to "Source" at top of screen 2. Click "Generate Getters and Setters"
	 */
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	
	
}