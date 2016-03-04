import java.util.Scanner;

public class Div5or6{
 public static void main(String[] args){
  
  // Create scanner.
  Scanner input = new Scanner(System.in);
  
  // Ask for user input.
  System.out.print("Enter an integer: ");
  int number = input.nextInt();
  
  // Tell user if number is divisible by 5 or 6.
  System.out.println("Is " + number + 
   "\n\tdivisible by 5 and 6? " + (number%5==0 && number%6==0) + 
   "\n\tdivisible by 5 or 6? " + (number%5==0 || number%6==0) + 
   "\n\tdivisible by 5 or 6, but not both? " + (number%5==0 ^ number%6==0));
 }
}