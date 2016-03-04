import javax.swing.JOptionPane;

public class TicTacToeGame{
 public static void main(String[] args){
  
  // Declare variables to keep track of whether or not x or o wins.
  boolean xwin = false;
  boolean owin = false;
  //Declare a char array to store the player entries
  char[] slots={'_','_','_','_','_','_','_','_','_'};
  
  int run = 0;
  int choice = 0;
  while((!xwin)&&(!owin)&&(run<9)){
   
   // Print the game as it is so far.
   printGame(slots);
   
   // Ask user for next move.
   choice = askInput();
   
   // If the choice is valid, put it in. Otherwise, ask them to choose another.
   if(isValid(slots,choice)){
    slots[choice]=XO(run);
    run++;
   }
   else{
    JOptionPane.showMessageDialog(null, "Invalid! That spot is taken.");
   }
   
   // Check for an xWin.
   xwin = win(slots,'X');
   // Check for an owin.
   owin = win(slots,'O');
   
  }

  // Print the final result
  printGame(slots);
  
  if(xwin){
   JOptionPane.showMessageDialog(null, "X wins!");
  }
  else if(owin){
   JOptionPane.showMessageDialog(null, "O wins!");
  }
  else{
   JOptionPane.showMessageDialog(null, "Draw!");
  }

 }


 
 public static void printGame(char[] array){
  // Module to print out the game
  String message = "Current standings:\ny/x  0   1   2\n"+" 0    " +array[0]+"   "+array[1]+"   "+array[2]+"\n 1    "+array[3]+"   "+array[4]+"   "+array[5]+"\n 2    "+array[6]+"   "+array[7]+"   "+array[8];
  JOptionPane.showMessageDialog(null, message);
 }




 
 public static int askInput(){
  // Ask for x coordinate.
  String xMessage = "Please enter the coordinates of your choice as for x.\nx must be 0, 1, or 2, as indicated by the previous grid:";
  String xChoiceString = JOptionPane.showInputDialog(xMessage);
  int xchoice = Integer.parseInt(xChoiceString);
  
  // Ask for y coordinate.
  String yMessage = "Now enter the coordinates of your choice as for y.:";
  String yChoiceString = JOptionPane.showInputDialog(yMessage);
  int ychoice = Integer.parseInt(yChoiceString);

  // return the result.
  return xchoice+3*ychoice;
 }



 public static char XO(int run){
  int oInt = (int) 'O';
  int diff = (int)'X'-(int)'O';
  char result = (char)(oInt+diff*(run%2));
  return result;  
 }





 public static boolean isValid(char[] slots, int choice){
  // Checks if the choice made by the user is valid.
  if(slots[choice]=='_'){
   return true;
  }
  else{
   return false;
  }
 }



 public static boolean win(char[] slots, char test){
  
  boolean result=false;
  
  if(slots[4]==test){
   if((slots[0]==test)&&(slots[8]==test)){
    // diagonal top-left to bottom-right
    result = true;
   }
   else if((slots[1]==test)&&(slots[7]==test)){
    // middle vertical
    result = true;
   }
   else if((slots[2]==test)&&(slots[6]==test)){
    // diagonal bottom-left to top-right
    result = true;
   }
   else if((slots[3]==test)&&(slots[5]==test)){
    // middle horizontal
    result = true;
   }
  }
  else if(slots[0]==test){
   if((slots[1]==test)&&(slots[2]==test)){
    //top row
    result = true;
   }
   else if((slots[3]==test)&&(slots[6]==test)){
    //left column
    result = true;
   }
  }
  else if(slots[8]==test){
   if((slots[7]==test)&&(slots[6]==test)){
    result = true;
   }
   else if((slots[2]==test)&&(slots[5]==test)){
    result = true;
   }
  }
  
  return result;
 }
}