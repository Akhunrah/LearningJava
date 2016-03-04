import java.awt.*;
import javax.swing.*;

public class Exercise11 extends JFrame {
	
	public Exercise11(){
		add(new PlotParabola());
	}
	
	public static void main(String[] args){
		Exercise11 frame = new Exercise11();
		frame.setTitle("TestPanelDrawing");
		frame.setSize(500,500);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}

class PlotParabola extends JPanel{
	private int a = 1;
	private int b = 0;
	private int c = 0;
	
	public PlotParabola(){
	}
	
	public PlotParabola(int A, int B, int C){
		a = A;
		b = B;
		c = C;
	}
	
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		
		// y-axis
		g.drawLine(getWidth()/2,getHeight(),getWidth()/2,getHeight()/10);
		g.drawLine(getWidth()/2,getHeight()/10,getWidth()/2-10,getHeight()/10+20);
		g.drawLine(getWidth()/2,getHeight()/10,getWidth()/2+10,getHeight()/10+20);
		g.drawString("Y",getWidth()/2+10,getHeight()/10);
		
		// x-axis
		g.drawLine(getWidth()/10,getHeight()*9/10,getWidth()*9/10,getHeight()*9/10);
		g.drawLine(getWidth()*9/10,getHeight()*9/10,getWidth()*9/10-20,getHeight()*9/10+10);
		g.drawLine(getWidth()*9/10,getHeight()*9/10,getWidth()*9/10-20,getHeight()*9/10-10);
		g.drawString("X",getWidth()*9/10,getHeight()*9/10+20);
		
		// draw the parabola
		
		Polygon p = new Polygon();
		int y = 0;
		
		for(int x = -100; x < 100;x++){
			y = getHeight()*9/10-(int)((a*x*x+b*x+c)/50);
			if(y>getHeight()/10 && y <getHeight()){
				p.addPoint(x+getWidth()/2,y);
			}
				
		}
		
		g.drawPolyline(p.xpoints,p.ypoints,p.npoints);
	}
}