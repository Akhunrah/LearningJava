import java.util.Scanner;

public class Sort{
 public static void main(String[] args){
  
  // Create a new scanner.
  Scanner input = new Scanner(System.in);
  
  // Ask user for 3 integers.
  System.out.print("Enter 3 integers: ");
  int num1 = input.nextInt();
  int num2 = input.nextInt();
  int num3 = input.nextInt();
  
  // Output the numbers from least to greatest.
  if(num1 <= num2){
   if(num2 <= num3){
    System.out.println(" The order of numbers is " + num1 + " " + num2 + " " + num3 + ".");
   }
   else if(num2>num3 && num3 >= num1){
    System.out.println(" The order of numbers is " + num1 + " " + num3 + " " + num2 + ".");
   }
   else{
    System.out.println(" The order of numbers is " + num3 + " " + num1 + " " + num2 + ".");
   }
  }
  else{
   if(num1 <= num3){
    System.out.println(" The order of numbers is " + num2 + " " + num1 + " " + num3 + ".");
   }
   else if(num1>num3 && num3 >= num2){
    System.out.println(" The order of numbers is " + num2 + " " + num3 + " " + num1 + ".");
   }
   else{
    System.out.println(" The order of numbers is " + num3 + " " + num2 + " " + num1 + ".");
   }
  }
  
 }
}