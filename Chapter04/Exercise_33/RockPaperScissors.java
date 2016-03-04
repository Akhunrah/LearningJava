import java.util.Scanner;

public class RockPaperScissors{
 public static void main(String[] args){
  
  // Create a scanner.
  Scanner input = new Scanner(System.in);
  
  // Declare variables.
  int playerChoice;
  int compChoice;
  int playerWins=0;
  int compWins=0;
  int winsRequired=0;
  
  // Ask user the number of wins required to win.
  System.out.println("Welcome to this game of Rock, Paper, and Scissors!");
  System.out.print("How many matches must be won? ");
  winsRequired = input.nextInt();
  System.out.println();
  System.out.println("You have chosen " + winsRequired + " matches to win.");
  
  // Now we play.
  while(playerWins < winsRequired && compWins < winsRequired){
   compChoice = (int) (Math.random()*3.0);
   System.out.println(); // Blank line for spacing.
   
   System.out.print("Enter your choice, 0 for Rock, 1 for Paper, 2 for Scissors: ");
   playerChoice = input.nextInt();
   
   if((compChoice == 0 && playerChoice == 1)||(compChoice == 1 && playerChoice == 2)||(compChoice == 2 && playerChoice == 0)){
    // Player wins the match.
    playerWins++;
    System.out.println("You win this match. Current score is " + playerWins + " for you, " + compWins + " for the computer.");
   }
   
   if((compChoice == 1 && playerChoice == 0)||(compChoice == 2 && playerChoice == 1)||(compChoice == 0 && playerChoice == 2)){
    // Computer wins the match.
    compWins++;
    System.out.println("Computer wins this match. Current score is " + playerWins + " for you, " + compWins + " for the computer.");
   }
   
   if(compChoice == playerChoice){
    // Draw.
    System.out.println("Draw! Current score is " + playerWins + " for you, " + compWins + " for the computer.");
   }
  }
  
  // Report the final result
  if(playerWins == winsRequired){
   System.out.println("Congratulations! You won the game.");
  }
  else if(compWins == winsRequired){
   System.out.println("Sorry. The computer won the game.");
  }
   
  
  
 }
}