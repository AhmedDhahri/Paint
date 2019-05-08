package paint;

import java.awt.Dimension;
import java.awt.MouseInfo;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.EventListener;

import javax.swing.JFrame;

public class Main extends JFrame implements MouseMotionListener,MouseListener{
	static boolean pressed = false;

	int x = 0, y = 0;
	public Main() {
		setLocation(100,100);
		setPreferredSize(new Dimension(800, 500));
	    addMouseMotionListener(this);  
	    addMouseListener(this);
	}

	

	@Override
	public void mouseDragged(MouseEvent e) {
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		x = (int) MouseInfo.getPointerInfo().getLocation().getX();
		y = (int) MouseInfo.getPointerInfo().getLocation().getY();
		
	}
	public void update() {
		remove(this.getContentPane());
		setContentPane(new Contenent(x-100,y-150,pressed));
		pack();
		setVisible(true);
	}
	


	@Override
	public void mouseClicked(MouseEvent arg0) {
		pressed = true;
		
	}



	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mousePressed(MouseEvent arg0) {
		pressed = true;
		System.out.println(pressed);
		
	}



	@Override
	public void mouseReleased(MouseEvent arg0) {
		pressed = false;
		System.out.println(pressed);
		
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		Main a = new Main();
		while(true) {
			a.update();
			Thread.sleep(0, 100);
		}
	}

}
