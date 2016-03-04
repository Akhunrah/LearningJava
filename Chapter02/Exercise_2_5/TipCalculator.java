import java.util.Scanner;

public class TipCalculator{
 public static void main(String[] args){
  
  // Create scanner.
  Scanner input = new Scanner(System.in);
  
  // Declare variables.
  double subtotal;
  double gratuityRate;
  double total;

  // Read in subtotal and gratuityRate.
  System.out.print("Enter subtotal ($): ");
  subtotal = input.nextDouble();
  System.out.print("Enter gratuity rate (%): ");
  gratuityRate = input.nextDouble();

  // Calculate the total.
  total = subtotal*(1+gratuityRate/100.0);
  total = (int)(total*100)/100.0;

  // Report the total.
  System.out.print("Your total bill is $" + total +".");  
 }
}