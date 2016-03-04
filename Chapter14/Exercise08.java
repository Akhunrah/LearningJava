import java.awt.*;
import javax.swing.*;

public class Exercise08 extends JFrame{
	
	public Exercise08(){
		add(new OctagonPanel());
	}
	
	public static void main(String[] args){
		Exercise08 frame = new Exercise08();
		frame.setTitle("TestPanelDrawing");
		frame.setSize(200,200);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}

class OctagonPanel extends JPanel {
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		
		int x0 = getWidth()/2;
		int y0 = getHeight()/2;
		int r = (int)(Math.min(getWidth(),getHeight())*0.4);
		int offset = (int)(r*Math.cos(Math.PI/4));
		
		Polygon p = new Polygon();
		
		p.addPoint(x0+r,y0);
		p.addPoint(x0+offset,y0+offset);
		p.addPoint(x0,y0+r);
		p.addPoint(x0-offset,y0+offset);
		p.addPoint(x0-r,y0);
		p.addPoint(x0-offset,y0-offset);
		p.addPoint(x0,y0-r);
		p.addPoint(x0+offset,y0-offset);
		
		g.drawPolygon(p);
	}
}