import java.awt.*;
import javax.swing.*;

public class PlotFunction extends JFrame {
	
	public PlotFunction(){
		setLayout(new GridLayout(2,2));
		add(new ZeroFunction());
		add(new LineFunction());
		add(new LineFunction(2,-1));
		add(new SquareFunction());
		
	}
	
	public static void main(String[] args){
		PlotFunction frame = new PlotFunction();
		frame.setTitle("PlotFunction");
		frame.setSize(900,900);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}

class ZeroFunction extends AbstractDrawFunction{

	double f(double x){
		return 0;
	}
}

class LineFunction extends AbstractDrawFunction{
	private int scale = super.scale;
	private int m = 1;
	private int b = 0;
	
	public LineFunction(){}
	
	public LineFunction(int M, int B){
		m = M;
		b = B;
	}
	
	double f(double x){
		return m*x+b*scale;
	}
}

class SquareFunction extends AbstractDrawFunction{
	private int scale = super.scale;
	private int a = 1;
	private int b = 0;
	private int c = 0;
	
	public SquareFunction(){}
	
	public SquareFunction(int A, int B, int C){
		a = A;
		b = B;
		c = C;
	}
	double f(double x){
		return a*scale*(x/scale)*(x/scale)+b*x+c*scale;
	}
}