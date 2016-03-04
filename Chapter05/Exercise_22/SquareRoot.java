import java.util.Scanner;

public class SquareRoot{
 public static void main(String[] args){
  
  // Create scanner and ask for input.
  Scanner input = new Scanner(System.in);
  System.out.print("Guess the square root of which number: ");
  double number = input.nextDouble();
  
  // Output the square root.
  double squareRoot = ((int) (100000*guessSquareRoot(number,number/2.0)))/100000.0;
  System.out.println("The square root of " + number + " is approximately " + squareRoot +".");
 }
 
 
 
 public static double guessSquareRoot(double number, double lastGuess){
  // A method that attempts to guess the square root and uses recursion until the difference between the
  // last guess and the current guess is less than 0.00001.
  
  double nextGuess = (lastGuess+(number/lastGuess))/2;
  
  if(Math.abs(nextGuess-lastGuess) <=0.00001){
   return nextGuess;
  }
  else{
   return guessSquareRoot(number, nextGuess);
  }
  
  
 }
}