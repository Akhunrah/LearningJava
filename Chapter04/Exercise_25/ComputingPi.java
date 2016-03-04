public class ComputingPi{
 public static void main(String[] args){
  
  // Declare and initialize variables:
  double pi = 0;
  int iter1 = 1;
  int iter2 = 1;
  int iter2Max;
  
  // First calculate pi for various maxima of iterations. Calculation is made from last term to first.
  
  for (iter1=1;iter1<=10;iter1++){

   iter2Max = 10000*iter1; //Redefine the maximum of iterations for this calculation.
   pi = 0.0; //reinitialize if necessary.

   for(iter2 = iter2Max; iter2>=1; iter2--){
    pi += 4.0/(4.0*iter2+1) - 4.0/(4.0*iter2-1);
   }
   
   // After the fractional values are added up, add the term of 4 as well.
   pi+= 4.0;
   
   // Print the result to the screen.
   System.out.println("For " + iter2Max + " iterations, the value of pi is: " + pi + ".");
  }
  
  
  // Now to find out how many terms are needed for pi=3.14159. We need a variable to hold the difference.
  double difference = 4;
  
  // We want to keep adding terms until the difference is less than 0.00001. So, a while loop will be used.
  
  iter1 = 1; // Reinitialize the iterator for this calculation.
  pi = 4.0; // Also reinitialize pi to 4, then add the fractional terms in the while loop.
  
  while(difference >=0.00001){
   pi+= 4.0/(4.0*iter1+1) - 4.0/(4.0*iter1-1); // Add fractional terms.
   difference = Math.abs(pi - 3.14159); // Calculate the difference between pi and 3.14159, then take the absolute value.
   iter1++;
  }
  
  iter1--; // Decrement iterator since it was incremented once too many in the while loop.
  
  // Report the number of iterations needed to get pi = 3.14159.
  System.out.println("The number of digits required for pi = 3.14159 is " + iter1 +".");
  
  
 }
}