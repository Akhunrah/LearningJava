import java.util.Scanner;

public class Adding{
 public static void main(String[] args){
  
  // Create Scanner.
  Scanner input = new Scanner(System.in);
  
  // Generate two numbers between 1 and 1000, and compute their sum.
  int number1 = (int)(Math.random()*1000);
  int number2 = (int)(Math.random()*1000);
  int sum = number1+number2;
  
  // Ask user to add numbers;
  System.out.print("What is the sum " + number1 + " + " + number2 +"? ");
  int answer = input.nextInt();

  // Test if answer is correct.
  if(answer == sum){
   System.out.println("Correct!");
  }
  else{
   System.out.println("Incorrect. The answer is " + sum + ".");
  }
  
 }
}