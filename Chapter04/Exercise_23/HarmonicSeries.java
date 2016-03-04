import java.util.Scanner;

public class HarmonicSeries{
 public static void main(String[] args){
  
  // Create a new scanner.
  Scanner input = new Scanner(System.in);
  
  // Ask user for maximum number of terms in sum.
  System.out.print("Enter the maximum number of terms in the sum: ");
  int maximumTerms = input.nextInt();
  
  // Calculate sum from right to left.
  
  int iter = 1; //Initialize iterator to 1.
  double rightSum= 0; 
  double leftSum=0; //Initialize sums to 0.
  
  for(iter=1; iter<=maximumTerms;iter++){
   rightSum += 1.0/iter; 
  }

  // Now calculate the left sum.
  for(iter=maximumTerms; iter>=1; iter--){
   leftSum += 1.0/iter;
  }
  
  // Print the results.
  System.out.println("Summing from 1 to 1/maximum: " + rightSum +".");
  System.out.println("Summing from 1/maximum to 1: " + leftSum +".");
  
 }
}