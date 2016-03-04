import java.awt.*;
import javax.swing.*;

public class Exercise02 extends JFrame {
	
	public Exercise02(){
		setLayout(new FlowLayout());
		add(new OvalButton("OK"));
		add(new OvalButton("Cancel"));
	}
	
	public static void main(String[] args){
		Exercise02 frame = new Exercise02();
		frame.setTitle("Exercise02");
		frame.setSize(200,100);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}

class OvalButton extends JButton{
	public OvalButton(String text){
		super(text);
	}
	
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawOval(0,0, getWidth(),getHeight());
	}
}