import javax.swing.*;
import java.awt.*;

public class CheckerBoard extends JFrame{
	public static void main(String[] args){
		CheckerBoard frame = new CheckerBoard();
		frame.setTitle("CheckerBoard");
		frame.setSize(200,200);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public CheckerBoard(){
		setLayout(new GridLayout(8,8,0,0));
		for(int i = 0; i < 8; i++){
			for(int j = 0; j < 8; j++){
				JButton jbtn = new JButton();
				if((i+j)%2==0){
					jbtn.setBackground(Color.WHITE);
					add(jbtn);
				}
				else{
					jbtn.setBackground(Color.BLACK);
					add(jbtn);
				}
			}
		}
	}
}