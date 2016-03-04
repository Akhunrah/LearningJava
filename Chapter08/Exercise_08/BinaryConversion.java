import java.util.Scanner;

public class BinaryConversion{
 public static void main(String args[]){
  
  // New scanner.
  Scanner input = new Scanner(System.in);
  
  // Prompt for input.
  System.out.println("Enter a binary number:");
  String binaryNumber = input.next();
  
  // Convert to decimal and report the result.
  System.out.println("The number " + binaryNumber + " in base 10 is " +binaryToDecimal(binaryNumber)+".");
 }
 
 
 public static int binaryToDecimal(String binNum){
  
  int decNum=0;
  
  for(int i=0; i<binNum.length(); i++){
   decNum += Character.getNumericValue(binNum.charAt(i))*Math.pow(2,i);
  }
  
  return decNum;
 }


}