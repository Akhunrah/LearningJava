import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DisplayPosition01 extends JFrame{
	public DisplayPosition01(){
		MousePositionPanel panel = new MousePositionPanel();
		
		setLayout(new BorderLayout());
		add(panel);
		
	}
	
	public static void main(String[] args){
		DisplayPosition01 frame = new DisplayPosition01();
		frame.setTitle("DisplayPosition01");
		frame.setSize(200,200);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	static class MousePositionPanel extends JPanel{
		private int x = 20;
		private int y = 20;
		
		public MousePositionPanel(){
			addMouseListener(new MouseListener(){
				public void mouseClicked(MouseEvent e){
					x = e.getX();
					y = e.getY();
					repaint();
				}
				
				public void mouseExited(MouseEvent e){};
				public void mouseEntered(MouseEvent e){};
				public void mouseReleased(MouseEvent e){};
				public void mousePressed(MouseEvent e){};
			});
		}
		
		protected void paintComponent(Graphics g){
			super.paintComponent(g);
			g.drawString("("+x+","+y+")",x,y);
		}
	}
}