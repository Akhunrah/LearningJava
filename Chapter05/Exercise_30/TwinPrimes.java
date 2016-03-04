public class TwinPrimes{
 public static void main(String[] args){
  
  printTwinPrimes(1000);
  
 }




 public static void printTwinPrimes(int maximum){
  // Test numbers to see if they are Mersenne primes.
  // For every number that passes, print it, up to a maximum number of them.
  
  int number = 2; // number to be tested. will be incremented.
  int secondNumber;
  

  while(number <= maximum){
   
   secondNumber = number + 2;
   if(isPrime(number) && isPrime(number+2)){
    System.out.println("(" +number+ ", " +secondNumber+ ")");
   }
   
   number++;
   
  }
  
  
  
 }




 public static boolean isPrime(long number){

  for(int divisor = 2; divisor <= Math.sqrt(number); divisor++){
   // Tests number for primeness by dividing the number by divisor and checking to see if the remainder is zero.
   // We only need divisor to go up to the square root of the number. Mathematically proven.
   // Listing 5.6 uses divisor<= number/2. This method uses too many numbers. My method should take a little less time.
   
   if(number%divisor == 0){
    return false; // number is not prime if condition is true.
   }
   

  }

  return true; // If number passed the above test, it is prime.
  
 }



}