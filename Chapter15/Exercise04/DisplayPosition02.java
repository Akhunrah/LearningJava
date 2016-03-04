import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DisplayPosition02 extends JFrame{
	public DisplayPosition02(){
		MousePositionPanel panel = new MousePositionPanel();
		
		setLayout(new BorderLayout());
		add(panel);
		
	}
	
	public static void main(String[] args){
		DisplayPosition02 frame = new DisplayPosition02();
		frame.setTitle("DisplayPosition01");
		frame.setSize(200,200);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	static class MousePositionPanel extends JPanel{
		private int x = -20;
		private int y = -20;
		String message = "";
		
		public MousePositionPanel(){
			addMouseListener(new MouseListener(){
				public void mousePressed(MouseEvent e){
					x = e.getX();
					y = e.getY();
					message = "("+x+","+y+")";
					repaint();
				};
				
				public void mouseReleased(MouseEvent e){
					x = e.getX();
					y = e.getY();
					message = "";
					repaint();
				};
				
				public void mouseClicked(MouseEvent e){};
				public void mouseExited(MouseEvent e){};
				public void mouseEntered(MouseEvent e){};
				
				
			});
		}
		
		protected void paintComponent(Graphics g){
			super.paintComponent(g);
			g.drawString(message,x,y);
		}
	}
}