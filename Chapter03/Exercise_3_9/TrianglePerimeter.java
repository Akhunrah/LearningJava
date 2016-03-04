import java.util.Scanner;

public class TrianglePerimeter{
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
  
  // Validate triangle, and calculate perimeter if valid.
  bool = a+b>c && a+c>b && b+c>a;
  double perimeter = a + b + c;
  
  if(bool){
   System.out.println("The perimeter of the triangle is " + perimeter + ".");
  }
  else{
   System.out.println("Invalid triangle!");
  }
 }
}