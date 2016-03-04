import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MoveMessageDemo extends JFrame {
	public MoveMessageDemo() {
		MoveableMessagePanel p = new MoveableMessagePanel("Welcome to Java.");
		
		setLayout(new BorderLayout());
		add(p);
	}
	
	public static void main(String[] args){
		MoveMessageDemo frame = new MoveMessageDemo();
		frame.setTitle("MoveMessageDemo");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(200,100);
		frame.setVisible(true);
	}
	
	static class MoveableMessagePanel extends JPanel {
		private String message = "Welcome to Java.";
		private int x = 20;
		private int y = 20;
		
		public MoveableMessagePanel(String s){
			message = s;
			addMouseMotionListener(new MouseMotionAdapter() {
				public void mouseDragged(MouseEvent e){
					x = e.getX();
					y = e.getY();
					repaint();
				}
			});
		}
		
		protected void paintComponent(Graphics g){
			super.paintComponent(g);
			g.drawString(message,x,y);
		}
	}
}