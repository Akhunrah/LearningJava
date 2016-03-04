import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.BorderLayout;

public class SixButtons extends JFrame{
	public SixButtons(){
		// Set the layout of the frame to BorderLayout.
		setLayout(new BorderLayout(10,10));
		
		// Create the 2 panels.
		JPanel jp01 = new JPanel();
		JPanel jp02 = new JPanel();
		
		// Set the panel layouts to FlowLayout.
		jp01.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
		jp02.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
		
		// Create the six buttons.
		JButton jbt01 = new JButton("Button 1");
		JButton jbt02 = new JButton("Button 2");
		JButton jbt03 = new JButton("Button 3");
		JButton jbt04 = new JButton("Button 4");
		JButton jbt05 = new JButton("Button 5");
		JButton jbt06 = new JButton("Button 6");
		
		// Add the buttons to their respective panels.
		jp01.add(jbt01);
		jp01.add(jbt02);
		jp01.add(jbt03);
		jp02.add(jbt04);
		jp02.add(jbt05);
		jp02.add(jbt06);
		
		// Add the panels to the frame.
		add(jp01,BorderLayout.CENTER);
		add(jp02,BorderLayout.SOUTH);
	}
	
	public static void main(String[] args){
		SixButtons frame = new SixButtons();
		frame.setTitle("Six Buttons!");
		frame.setSize(400,200);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}