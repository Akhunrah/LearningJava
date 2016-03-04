import java.util.Scanner;

public class DigitSum{
 public static void main(String[] args){
  
  // Create Scanner.
  Scanner input = new Scanner(System.in);

  // Ask user for an integer.
  System.out.print("Please enter an integer: ");
  long integerForSum = input.nextLong();
  
  System.out.println("The sum of the digits of " + integerForSum + " is " + DigitSum(integerForSum) + ".");
 }
 
 public static long DigitSum(long integer){
  
  long sum = 0;
  
  // While loop to test when the integer has been reduced to nothing
  while(integer != 0){
   
   // Add the digit to the sum.
   sum += integer%10;

   // Remove the last digit from integer.
   integer = integer/10;
  }
  
  return sum;
 }
}