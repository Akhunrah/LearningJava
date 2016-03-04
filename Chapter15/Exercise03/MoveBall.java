import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MoveBall extends JFrame {
	private JButton jbtRight = new JButton("Right");
	private JButton jbtLeft = new JButton("Left");
	private JButton jbtUp = new JButton("Up");
	private JButton jbtDown = new JButton("Down");
	private BallPanel ballPanel = new BallPanel();
	
	public MoveBall(){
		JPanel panel = new JPanel();
		panel.add(jbtRight);
		panel.add(jbtLeft);
		panel.add(jbtUp);
		panel.add(jbtDown);
		
		this.add(ballPanel,BorderLayout.CENTER);
		this.add(panel,BorderLayout.SOUTH);
		
		jbtRight.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				ballPanel.moveRight();
			}
		});
		jbtLeft.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				ballPanel.moveLeft();
			}
		});
		jbtUp.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				ballPanel.moveUp();
			}
		});
		jbtDown.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				ballPanel.moveDown();
				//System.out.println("Down button pressed.");
			}
		});
	}
	
	
	public static void main(String[] args) {
		JFrame frame = new MoveBall();
		frame.setTitle("MoveBall");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,200);
		frame.setVisible(true);
	}
	
	public class BallPanel extends JPanel {
		private int radius = 6;
		private int x=-10;
		private int y=-10;
	
	
		public void moveRight(){
			x+=radius/2;
			repaint();
		}
	
		public void moveLeft(){
			x-=radius/2;
			repaint();
		}
	
		public void moveUp(){
			y-=radius/2;
			repaint();
		}
	
		public void moveDown(){
			y+=radius/2;
			repaint();
		}
	
		protected void paintComponent(Graphics g){
			super.paintComponent(g);
			//Center on screen initially
			if (x==-10 && y == -10){
				x = getWidth()/2;
				y = getHeight()/2;
			}
			// Keep circle in bounds.
			if(x>getWidth()){
				x-=radius/2;
			}
			if(x<0){
				x+=radius/2;
			}
			if(y>getHeight()){
				y-=radius/2;
			}
			if(y<0){
				y+=radius/2;
			}
			g.drawOval(x-radius,y-radius,2*radius,2*radius);
	}
}
	
}

