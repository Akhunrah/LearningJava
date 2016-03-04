
import java.util.Scanner;

public class DigitSum{
 public static void main(String[] args){
  
  // Create scanner.
  Scanner input = new Scanner(System.in);
  
  // Declare variables.
  int integer;
  int sum = 0;
  
  // Read in the integer.
  System.out.print("Enter the integer whose digits will be summed: ");
  integer = input.nextInt();
  
  // Calculate sum.
  sum = integer%10; // first term in sum
  integer = integer/10; // remove the last digit
  sum = sum + integer%10; // add the next digit to the sum, then repeat.
  integer = integer/10;
  sum = sum + integer%10;
  integer = integer/10;
  sum = sum + integer%10;
  
  // Print the sum.
  System.out.print("The sum of digits is " + sum + ".");
  
 }
}