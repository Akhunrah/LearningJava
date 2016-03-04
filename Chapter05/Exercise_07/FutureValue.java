import java.util.Scanner;

public class FutureValue{
 public static void main(String[] args){
  
  // Create a scanner and ask for input.
  Scanner input = new Scanner(System.in);
  System.out.print("Enter current value: ");
  double initialValue = input.nextDouble();
  System.out.print("Enter annual interest rate as a percentage: ");
  double annualRate = input.nextDouble()/100.0;
  double monthlyRate = annualRate/12.0;
  
  System.out.println("Years       Future Value");
 
  for(int i = 1; i<=30; i++){
   
   System.out.format("%03d%20.2f%n", i, futureInvestmentValue(initialValue,monthlyRate,i));
  }
  
  
 }
 
 
 public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years){
  
  // Return the value after a certain number of years have passed
  double futureValue = investmentAmount*Math.pow(1+monthlyInterestRate,years*12);
  futureValue = 0.01* (int) (futureValue*100);
  return futureValue;
  
 }
}