import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MoveCircle extends JFrame {
	private CirclePanel circlePanel = new CirclePanel();
	
	public MoveCircle(){
		add(new CirclePanel());
	}
	
	public static void main(String[] args){
		JFrame frame = new MoveCircle();
		frame.setTitle("MoveCircle");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,400);
		frame.setVisible(true);
	}
	
	static class CirclePanel extends JPanel {
		private int radius = 10;
		private int x = -20;
		private int y = -20;
		private int offset;
		private boolean drag = false;
		
		
		public CirclePanel(){
			addMouseMotionListener(new MouseMotionAdapter(){
				public void mouseDragged(MouseEvent e){
					if(drag){
						x = e.getX();
						y = e.getY();
						repaint();
					}
					
				}
			});
			
			addMouseListener(new MouseAdapter() {
				public void mousePressed(MouseEvent e){
					
					offset = (e.getX()-x)*(e.getX()-x)+(e.getY()-y)*(e.getY()-y);
					if(offset <radius*radius){
						drag = true;
						x = e.getX();
						y = e.getY();
						repaint();
					}
					else{
						drag = false;
					}
				}
			});
		}
		
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			
			//Initial position in center.
			if(x==-20 && y == -20){
				x = getWidth()/2;
				y = getHeight()/2;
			}
			
			g.drawOval(x-radius,y-radius,2*radius,2*radius);
		}
	}
}