public class Primes{
 public static void main(String[] args){
  
  System.out.println("The primes that are less than 10000 are:");
  printPrimes(10000);
  
 }
  
 public static void printPrimes(int maximum){
  
  final int NUMBER_OF_PRIMES_PER_LINE = 10;// Limit the number of primes per line.
  int primeCount = 0; // Counting the number of primes.
  int number = 2; // Number to be tested for primeness.
  
  // Find prime numbers.
  while(number <= maximum){
   
   if(isPrime(number)){
    // Prints the number if it is prime.
    primeCount++; // iterate the number of primes.

    if(primeCount % NUMBER_OF_PRIMES_PER_LINE == 0 ){

     // Print on a new line if the current line has reached the max.
     System.out.printf("%-6s\n", number);

    }
    else{

     // Otherwise just print the next prime on the same line.
     System.out.printf("%-7s",number);

    }

   }
   
   // Iterate to the next number to be tested.
   number++;
  }
 }
 
 
 public static boolean isPrime(int number){

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