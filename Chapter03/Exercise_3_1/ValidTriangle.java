import java.util.Scanner;

public class ValidTriangle{
 public static void main(String[] args){
  
  // Create new Scanner.
  Scanner input = new Scanner(System.in);
  
  // Declare variables for three side lengths.
  double a;
  double b;
  double c;
  boolean bool;
  
  // Ask for input.
  System.out.print("Enter three edges: ");
  a = input.nextDouble();
  b = input.nextDouble();
  c = input.nextDouble();
  
  // Validate triangle.
  bool = a+b>c && a+c>b && b+c>a;
  System.out.print("Is the triangle "+ a + ", " + b +", " + c + " valid? " + bool);
 }
}