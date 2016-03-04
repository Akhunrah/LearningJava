/* Calculates e from the sum
*  e = 1 + 1/1! + 1/2! + 1/3! + ...
*  up to various maxima.
*/

public class ComputeE{
 public static void main(String[] args){
  
  // Initialize variables.
  double e = 1;
  double term = 1;
  int iter1 = 1;
  int iter2 = 1;
  int iter2Max;
  
  
  // Calculate e for various iterations.
  for(iter1 = 1; iter1<=10; iter1++){
   
   iter2Max = iter1*10000; // Declare a new maximum for iter2.
   term = 1; // Reinitialize the term variable.
   e = 1; // Reinitalize the e variable.

   for(iter2 = 1; iter2<=iter2Max; iter2++){
    term = term/(1.0*iter2); // Calculate the next term in the series, using the previous term.
    e += term; // Add this term to the e variable.
   }

   // Report the result.
   System.out.println("For " + iter2Max + " iterations, e equals " + e +".");
   
  }
 }
}