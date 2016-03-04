import javax.swing.*;
import java.awt.*;

public class TestImageIcon extends JFrame {
	private ImageIcon usIcon = new ImageIcon("us.gif");
	private ImageIcon myIcon = new ImageIcon("my.jpg");
	private ImageIcon frIcon = new ImageIcon("fr.gif");
	private ImageIcon ukIcon = new ImageIcon("uk.gif");
	
	public TestImageIcon(){
		setLayout(new GridLayout(1,4,5,5));
		add(new JLabel(usIcon));
		add(new JLabel(myIcon));
		add(new JLabel(frIcon));
		add(new JLabel(ukIcon));
	}
	
	public static void main(String[] args){
		TestImageIcon frame = new TestImageIcon();
		frame.setTitle("TestImageIcon");
		frame.setSize(500,150);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}