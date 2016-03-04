/* A program that computes the sum 1/3+3/5+...
*  +95/97+97/99.
*/

public class OddSum{
 public static void main(String[] args){
  
  // Declare and initialize variables.
  int termMaximum = 49;
  int iter = 1;
  double sum = 0;
  
  // Calculate the sum in question.
  for(iter=1;iter<=termMaximum;iter++){
   sum += (2.0*iter-1.0)/(2.0*iter+1.0);
  }
  
  
  System.out.print("The sum is " + sum +".");
 }
}