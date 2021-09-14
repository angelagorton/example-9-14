import javax.swing.JPanel;

public class ShapeDriver extends JPanel{

	Rectangle rects[]; //rectangle array
	
	public ShapeDriver() {
		rects = new Rectangle[4];
		rects[0] = new Rectangle(45, 100, 80, 40);
		rects[1] = new Rectangle(100, 220, 60, 20);
		rects[2] = new Rectangle(80, 45, 40, 80);
		rects[2] = new Rectangle(220, 100, 20, 60);
		
		for(int i = 0; i < 4; i++) {
			this.add(rects[i]);
		}
		
	}
	
	public static void main(String[] args) {
		

	}

}
