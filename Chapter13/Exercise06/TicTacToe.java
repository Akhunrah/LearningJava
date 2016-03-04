import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class TicTacToe extends JFrame {
	private ImageIcon crossIcon = new ImageIcon("cross.gif");
	private ImageIcon notIcon = new ImageIcon("not.gif");
	
	
	public static void main(String[] args){
		TicTacToe frame = new TicTacToe();
		frame.setTitle("Tic-Tac-Toe");
		frame.setSize(300,300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public TicTacToe(){
		Random rand = new Random();
		setLayout(new GridLayout(3,3,5,5));
		for(int i =0; i < 9; i++){
			int num = rand.nextInt(3);
			if(num%3==0){
				add(new JLabel(""));
			}			
			else if(num%3 == 1){
				add(new JLabel(crossIcon));
			}
			else{
				add(new JLabel(notIcon));
			}
			
		}
	}
}