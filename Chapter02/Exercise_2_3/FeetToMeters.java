import java.util.Scanner;

public class FeetToMeters{
 public static void main(String[] args){
  
  // Create a Scanner.
  Scanner input = new Scanner(System.in);

  // Declare variables and constants.
  double feet;
  double meters;
  final double FEET_TO_METERS=0.305;
  
  // Read in the length in feet.
  System.out.print("Enter the length in feet: ");
  feet = input.nextDouble();
  
  // Perform the conversion.
  meters = feet*FEET_TO_METERS;
  
  // Output the result.
  System.out.println("The length in meters is " + meters + ".");
  
 } 
}