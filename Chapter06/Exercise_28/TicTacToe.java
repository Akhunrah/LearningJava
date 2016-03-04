public class TicTacToe {
 public static void main(String[] args){
  
  // Create a TicTacToe board.
  int[][] board = new int[3][3];
  
  // Initialize it with 2's.
  for(int i=0; i<=2; i++){
   for(int j=0; j<=2;j++){
    board[i][j] = 2;
   }
  }
 
  // Fill it in with 1's and 0's in random positions.
  int numberFilled = 0; // Keep track of the number of entries.
  int horizontal = 0; // placeholder for the horizontal index.
  int vertical = 0; // placeholder for the vertical index.
  int value = 0; // value to be placed in the board
  
  while(numberFilled<9){
   //Generate random values for the horizontal and vertical indices.
   horizontal = (int) (Math.random()*3);
   vertical = (int) (Math.random()*3);
   value = 1 - numberFilled % 2; // Value is 1 if an even number have been placed, 0 if odd.
   
   if(board[horizontal][vertical]==2){
    // If the value is still 2, change it, then increment the number filled.
    board[horizontal][vertical]=value;
    numberFilled++;
   }
   
   
  }

  // Print the game.
  for(int i=0; i<=2; i++){
   System.out.println();
   for(int j=0; j<=2;j++){
    System.out.print(board[i][j]);
   }
  }
  
  System.out.println();
  // Check for winning row or column.
  
  int sum;
  
  for(int i=0; i<=2; i++){
   sum = board[i][0]+board[i][1]+board[i][2];
   if(sum == 3 || sum==0){
    System.out.println("Row " + i + " is a winning row.");
   }
  }
  for(int i=0; i<=2; i++){
   sum = board[0][i]+board[1][i]+board[2][i];
   if(sum == 3 || sum==0){
    System.out.println("Column " + i + " is a winning column.");
   }
  }
  
  
  
 }
}