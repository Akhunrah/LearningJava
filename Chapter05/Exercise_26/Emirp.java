public class Emirp{
 public static void main(String[] args){

  printEmirps(100); // Prints the first 100 emirps.
  
 }




 public static void printEmirps(int maximum){
  final int NUMBER_OF_EMIRPS_PER_LINE = 10;
  int count = 0; // count the number of emirps computed so far.
  int number = 2; // number currently being tested.
  
  System.out.println("The first " + maximum + " emirps are:");

  while(count<=maximum){
   // First test if number is prime, then test if its reverse is also prime. 
   // Print the number if it passes both tests.
   
   if(isPrime(number)){
    if(isPrime(reverse(number))){
     count++;
     if(count%10 == 0){
      System.out.printf("%5s\n", number);
     }
     else{
      System.out.printf("%5s",number);
     }
    }
    
   }
   
   number++; // increment to the next number to be tested.
   
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