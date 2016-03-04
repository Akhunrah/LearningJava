import java.util.Scanner;

public class ReverseInteger{
 public static void main(String[] args){
  
  // Create Scanner.
  Scanner input = new Scanner(System.in);

  // Ask user for an integer.
  System.out.print("Please enter an integer: ");
  long integerForSum = input.nextLong();
  
  System.out.println("The reverse of " + integerForSum + " is " + Reverse(integerForSum) + ".");
 }
 
 public static long Reverse(long integer){
  
  long reverseInteger = 0;
  
  // While loop to test when the integer has been reduced to nothing
  while(integer != 0){
   
   // Put the last digit of integer at the next position of reverseInteger.
   reverseInteger = 10*reverseInteger + integer%10;

   // Remove the last digit from integer.
   integer = integer/10;
  }
  
  return reverseInteger;
 }
}