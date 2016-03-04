import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class TicTacToe extends JApplet{
	private char whoseTurn = 'X';
	private Cell[][] cells = new Cell[3][3];
	private JLabel jlblStatus = new JLabel("X's turn");
	private JButton jbtNewGame = new JButton("New Game");
	
	
	public TicTacToe(){
		JPanel p = new JPanel(new GridLayout(3,3,0,0));
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				p.add(cells[i][j] = new Cell());
			}
		}
		
		p.setBorder(new LineBorder(Color.black,1));
		jlblStatus.setBorder(new LineBorder(Color.blue,1));
		
		add(jbtNewGame,BorderLayout.NORTH);
		add(p,BorderLayout.CENTER);
		add(jlblStatus,BorderLayout.SOUTH);
		
		jbtNewGame.addActionListener(new NewGameListener());
	}
	
	public boolean isFull(){
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				if(cells[i][j].getToken() == ' '){
					return false;
				}
			}
		}
		return true;
	}
	
	public boolean isWon(char token){
		for(int i = 0; i < 3; i++){
			if((cells[i][0].getToken() == token)&&(cells[i][1].getToken() == token)&&(cells[i][2].getToken() == token)){
				return true;
			}
		}
		for(int j = 0; j < 3; j++){
			if((cells[0][j].getToken() == token)&&(cells[1][j].getToken() == token)&&(cells[2][j].getToken() == token)){
				return true;
			}
		}
		if((cells[0][0].getToken() == token)&&(cells[1][1].getToken() == token)&&(cells[2][2].getToken() == token)){
			return true;
		}
		if((cells[0][2].getToken() == token)&&(cells[1][1].getToken() == token)&&(cells[2][0].getToken() == token)){
			return true;
		}
		return false;
	}
	
	private class NewGameListener implements ActionListener{
		private int numX = 0;
		private int numO = 0;
		
		
		public void actionPerformed(ActionEvent e){
			for(int i = 0; i < 3; i++){
				for(int j = 0; j < 3; j++){
					if (cells[i][j].getToken() == 'X'){
						numX++;
					}
					else if (cells[i][j].getToken() == 'O'){
						numO++;
					}
					cells[i][j].setToken(' ');
				}
			}
			
			repaint();
			
			if(isWon('X') || numX > numO){
				whoseTurn = 'O';
			}
			else if(isWon('O') || numO>numX){
				whoseTurn = 'X';
			}
			else{
				whoseTurn = 'X';
			}
		}
	}
	
	public class Cell extends JPanel {
		private char token = ' ';
	
		public Cell(){
			setBorder(new LineBorder(Color.black,1));
			addMouseListener(new MyMouseListener());
		}
	
		public char getToken(){
			return token;
		}
	
		public void setToken(char c){
			token = c;
			repaint();
		}
	
		protected void paintComponent(Graphics g){
			super.paintComponent(g);
		
			if(token == 'X'){
				g.drawLine(10,10,getWidth()-10,getHeight()-10);
				g.drawLine(getWidth()-10,10,10,getHeight()-10);
			}
			else if(token == 'O'){
				g.drawOval(10,10,getWidth()-20,getHeight()-20);
			}
		}
	
		private class MyMouseListener extends MouseAdapter {
			public void mouseClicked(MouseEvent e){
				if(token == ' ' && whoseTurn != ' '){
					setToken(whoseTurn);
				
					if(isWon(whoseTurn)){
						jlblStatus.setText(whoseTurn + " won!");
						whoseTurn = ' ';
					}
					else if(isFull()){
						jlblStatus.setText("Draw!");
						whoseTurn = ' ';
					}
					else{
						whoseTurn = (whoseTurn == 'X') ? 'O': 'X';
						jlblStatus.setText(whoseTurn + "'s Turn");
					}
				}
			}
		}
	}
}