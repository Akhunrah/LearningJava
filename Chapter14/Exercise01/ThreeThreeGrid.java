import javax.swing.*;
import java.awt.*;

public class ThreeThreeGrid extends JFrame{
	public ThreeThreeGrid(){
		add(new NewPanel());
	}
	
	public static void main(String[] args){
		ThreeThreeGrid frame = new ThreeThreeGrid();
		frame.setTitle("TestPanelDrawing");
		frame.setSize(200,100);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
class NewPanel extends JPanel{
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.RED);
		g.drawLine(getWidth()/3,0,getWidth()/3,getHeight());
		g.setColor(Color.RED);
		g.drawLine(getWidth()*2/3,0,getWidth()*2/3,getHeight());
		g.setColor(Color.BLUE);
		g.drawLine(0,getHeight()/3,getWidth(),getHeight()/3);
		g.setColor(Color.BLUE);
		g.drawLine(0,getHeight()*2/3,getWidth(),getHeight()*2/3);
		
	}
}