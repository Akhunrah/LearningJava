import javax.swing.*;
import java.awt.Graphics;

public class TestGetGraphics extends JFrame {
	private JLabel jlblBanner = new JLabel("Banner");
	
	public TestGetGraphics(){
		add(jlblBanner);
		System.out.println(jlblBanner.getGraphics());
	}
	
	public static void main(String[] args){
		TestGetGraphics frame = new TestGetGraphics();
		frame.setTitle("TestPanelDrawing");
		frame.setSize(200,100);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		JOptionPane.showMessageDialog(null,"Delay on purpose.\n Click OK to dismiss.");
		Graphics graphics = frame.jlblBanner.getGraphics();
		graphics.drawLine(0,0,50,50);
	}
}