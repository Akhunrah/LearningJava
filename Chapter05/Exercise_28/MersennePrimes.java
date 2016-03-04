public class MersennePrimes{
 public static void main(String[] args){
  
  printMersennePrimes(31);
  
 }




 public static void printMersennePrimes(int maximum){
  // Test numbers to see if they are Mersenne primes.
  // For every number that passes, print it, up to a maximum number of them.
  
  int number = 2; // number to be tested. will be incremented.
  
  System.out.println("  p         2^p-1");

  while(number <= maximum){
   
   long mersenneCandidate = (long) Math.pow(2,number)-1;
   
   if(isPrime(number) && isPrime(mersenneCandidate)){

    System.out.printf("%3s%14s\n",number,mersenneCandidate);
      
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