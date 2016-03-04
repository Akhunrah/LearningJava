import java.awt.*;
import javax.swing.*;

abstract class AbstractDrawFunction extends JPanel {
	private Polygon p = new Polygon();
	protected int scale = 50;
	
	
	protected AbstractDrawFunction(){
		//drawFunction();
		System.out.println(super.getWidth()+", "+super.getHeight());
	}
	
	abstract double f(double x);
	
	/* public void drawFunction(){
		int y = 0;
		for(int x = xMin; x < xMax; x++){
			y = (int)(getHeight()/2 - f(x));
			if(y >= yMin && y <=yMax){
				p.addPoint(x+getWidth()/2,y);
			}			
		}
	} */
	
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		
		// y-axis
		g.drawLine(getWidth()/2, getHeight()*9/10, getWidth()/2, getHeight()/10);
		g.drawLine(getWidth()/2, getHeight()*9/10, getWidth()/2+scale/2, getHeight()*9/10-scale/2);
		g.drawLine(getWidth()/2, getHeight()*9/10, getWidth()/2-scale/2, getHeight()*9/10-scale/2);
		g.drawLine(getWidth()/2, getHeight()/10, getWidth()/2+scale/2, getHeight()/10+scale/2);
		g.drawLine(getWidth()/2, getHeight()/10, getWidth()/2-scale/2, getHeight()/10+scale/2);
		for(int y = 1; y < (getHeight()/scale)/2; y++){
			g.drawLine(getWidth()/2,getHeight()/2+y*scale,getWidth()/2-scale/4,getHeight()/2+y*scale);
			g.drawString("-"+y,getWidth()/2-scale/2,getHeight()/2+y*scale);
			g.drawLine(getWidth()/2,getHeight()/2-y*scale,getWidth()/2-scale/4,getHeight()/2-y*scale);
			g.drawString(""+y,getWidth()/2-scale/2,getHeight()/2-y*scale);
		}
			
		// x-axis
		g.drawLine(getWidth()/10,getHeight()/2,getWidth()*9/10,getHeight()/2);
		g.drawLine(getWidth()/10,getHeight()/2,getWidth()/10+scale/2,getHeight()/2+scale/2);
		g.drawLine(getWidth()/10,getHeight()/2,getWidth()/10+scale/2,getHeight()/2-scale/2);
		g.drawLine(getWidth()*9/10,getHeight()/2,getWidth()*9/10-scale/2,getHeight()/2+scale/2);
		g.drawLine(getWidth()*9/10,getHeight()/2,getWidth()*9/10-scale/2,getHeight()/2-scale/2);
		for(int x = 1; x < (getWidth()/scale)/2 ; x++){
			g.drawLine(getWidth()/2+x*scale,getHeight()/2,getWidth()/2+x*scale,getHeight()/2+scale/4);
			g.drawString(""+x,getWidth()/2+x*scale,getHeight()/2+scale/2);
			g.drawLine(getWidth()/2-x*scale,getHeight()/2,getWidth()/2-x*scale,getHeight()/2+scale/4);
			g.drawString("-"+x,getWidth()/2-x*scale,getHeight()/2+scale/2);
		}
		
		// Draw the function
		for(int x = getWidth()/10-getWidth()/2 ; x < getWidth()*9/10-getWidth()/2; x++){
			
			if(getHeight()/2 - (int)f(x) < getHeight()*9/10 && getHeight()/2 - (int)f(x) > getHeight()/10){
				p.addPoint(x+getWidth()/2,getHeight()/2 - (int)f(x));
			}
		}
		
		g.drawPolyline(p.xpoints,p.ypoints,p.npoints);
	}
	
}