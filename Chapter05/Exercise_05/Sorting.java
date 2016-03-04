import java.util.Scanner;

public class Sorting{
 public static void main(String[] args){
 
  // Create new scanner and ask for input.
  Scanner input = new Scanner(System.in);
  
  System.out.print("Please enter the first number: ");
  double number1 = input.nextDouble();
  System.out.print("Please enter the second number: ");
  double number2 = input.nextDouble();
  System.out.print("Please enter the third number: ");
  double number3 = input.nextDouble();
  
  // Call the sorting function.
  sort(number1, number2, number3);
 }




 public static void sort(double num1, double num2, double num3){
  
  // Massive if structure to sort the 3 numbers.
  if(num1 >= num2 && num1 >= num3){
   if(num2 >= num3){
    System.out.print("From greatest to least: " + num1 +", " +num2+ ", " +num3+ ".");
   } else {
    System.out.print("From greatest to least: " + num1 +", " +num3+ ", " +num2+ ".");
   }
  }else if(num2 >= num1 && num2 >= num3){
   if(num1 >= num3){
    System.out.print("From greatest to least: " + num2 +", " +num1+ ", " +num3+ ".");
   } else {
    System.out.print("From greatest to least: " + num2 +", " +num3+ ", " +num1+ ".");
   }
  }else if(num3 >= num1 && num3 >= num2){
   if(num1 >= num2){
    System.out.print("From greatest to least: " + num3 +", " +num1+ ", " +num2+ ".");
   } else {
    System.out.print("From greatest to least: " + num3 +", " +num2+ ", " +num1+ ".");
   }
  }
  
 }
}