import javax.swing.*;
import java.awt.event.*;

public class SimpleEventDemoInnerClass extends JFrame{
	public SimpleEventDemoInnerClass(){
		// Create two buttons.
		JButton jbtOK = new JButton("OK");
		JButton jbtCancel = new JButton("Cancel");
		
		// Create a panel to hold buttons.
		JPanel panel = new JPanel();
		panel.add(jbtOK);
		panel.add(jbtCancel);
		
		// Add panel to frame.
		add(panel);
		
		//Register Listeners
		ListenerClass listener = new ListenerClass();
		jbtOK.addActionListener(listener);
		jbtCancel.addActionListener(listener);
	}
	
	public static void main(String[] args){
		JFrame frame = new SimpleEventDemoInnerClass();
		frame.setTitle("Handle Event");
		frame.setSize(200,150);
		frame.setLocation(200,100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	class ListenerClass implements ActionListener{
		public void actionPerformed(ActionEvent e){
			System.out.println("The " + e.getActionCommand() + " button is clicked at\n" + new java.util.Date(e.getWhen()));
		}
	}
}

