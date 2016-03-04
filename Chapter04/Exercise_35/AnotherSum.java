public class AnotherSum{
 public static void main(String[] args){
  
  // Declare variables.
  int maximum = 624;
  int iter = 1;
  double sum = 0;
  
  // Perform the requested sum.
  for(iter = 1; iter<=maximum; iter++){
   sum += 1.0/(Math.sqrt(iter*1.0)+Math.sqrt(iter*1.0+1.0));
  }
  
  // Report the result.
  System.out.println("The sum is " + sum +".");
 }
}