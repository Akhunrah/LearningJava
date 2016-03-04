public class PalindromicPrimes{
 public static void main(String[] args){
  
  printPalindromicPrimes(100);
  
 }




 public static void printPalindromicPrimes(int maximum){
  // Test numbers to see if they are palindromic primes.
  // For every number that passes, print it, up to a maximum number of them.
  
  final int NUMBER_OF_PRIMES_PER_LINE = 10;
  int count = 0; // count the number of palindromic primes found.
  int number = 2; // number to be tested. will be incremented.
  
  System.out.println("The first " + maximum + " palindromic primes are:");

  while(count < maximum){
   
   if(isPrime(number) && isPrime(reverse(number)) && number == reverse(number)){
    count++;
    
    if(count%NUMBER_OF_PRIMES_PER_LINE == 0){
     System.out.printf("%7s\n",number);
    }
    else{
     System.out.printf("%7s",number);
    }
    
   }
   
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




 public static int reverse(int integer){
  
  int reverseInteger = 0;
  
  // While loop to test when the integer has been reduced to nothing
  while(integer != 0){
   
   // Put the last digit of integer at the next position of reverseInteger.
   reverseInteger = 10*reverseInteger + integer%10;

   // Remove the last digit from integer.
   integer = integer/10;
  }
  
  return reverseInteger;
 }
}