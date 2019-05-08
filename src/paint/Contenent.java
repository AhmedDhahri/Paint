package paint;

import java.awt.Graphics;

import javax.swing.JPanel;

public class Contenent extends JPanel{
	int x, y;
	boolean pressed;

	public Contenent(int x, int y,boolean pressed) {
		this.x = x;
		this.y = y;
		this.pressed = pressed;
	}
	public void paintComponent(Graphics g) {
		
		if(pressed) {
			g.drawOval(x, y, 20, 20); 
			g.fillOval(x, y, 20, 20);
			g.dispose();
		}
		
	  }

}
