public class Series{
 public static void main(String[] args){
  
  displaySums(20);
  
 }
 
 public static void displaySums(double maximum){
  // Method that prints out a table of series summed up to the ith term.
  
  System.out.println("i          m(i)");

  for(int i=1; i<=maximum; i++){
   System.out.printf("%-2s%14.4f\n",i,computeSeries(i));
  }
  
 }
 
 
 public static double computeSeries(int maximum){
  // Computes the series up to the maximal term.
  
  double sum = 0;
  
  for(int i = maximum; i>=1; i--){
   // Adds terms from last to first.
   sum += (i*1.0)/(i+1.0);
  }
  
  // Return the value of the sum.
  return sum;
 }
}