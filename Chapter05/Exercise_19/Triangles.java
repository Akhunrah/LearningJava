import java.util.Scanner;

public class Triangles{
 public static void main(String[] args){
  
  // Create scanner and ask for input.
  Scanner input = new Scanner(System.in);
  System.out.print("Enter the first side length: ");
  double side1 = input.nextDouble();
  System.out.print("Enter the second side length: ");
  double side2 = input.nextDouble();
  System.out.print("Enter the third side length: ");
  double side3 = input.nextDouble();

  // Test if the triangle is valid, and compute the area if so.
  
  if(isValid(side1,side2,side3)){
   System.out.println("The triangle is valid. Its area is " + computeArea(side1,side2,side3) +".");
  }
  else{
   System.out.println("Invalid triangle.");
  }
 }


 public static boolean isValid(double side1, double side2, double side3){
  
  // Tests if the triangle is valid.
  
  if(side1+side2 > side3 && side1+side3 > side2 && side2+side3 > side1){
   return true;
  }
  else{
   return false;
  }
 }

 public static double computeArea(double side1, double side2, double side3){
  //Compute the area using the formula given in the exercise.
  
  double s = (side1+side2+side3)/2.0;
  double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
  
  return area;
 }

}