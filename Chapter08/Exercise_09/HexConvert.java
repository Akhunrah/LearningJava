import java.util.Scanner;

public class HexConvert{
 public static void main(String args[]){
  
  // New scanner.
  Scanner input = new Scanner(System.in);
  
  // Ask for an integer.
  System.out.println("Please enter an integer:");
  int integer = input.nextInt();
  
  // Convert to hexadecimal.
  System.out.println("The number " + integer + " in hexadecimal form is " +convertDecimalToHexadecimal(integer)+ ".");
 }
 
 
 public static StringBuilder convertDecimalToHexadecimal(int integer){
  
  StringBuilder hexadecimal = new StringBuilder();
  int tempInt = 0;
  
  while(integer > 0){
   tempInt = integer%16;
   integer = (integer - tempInt)/16;
   
   if(tempInt>=0 && tempInt<=9){
    hexadecimal.append(Integer.toString(tempInt));
   }
   
   switch (tempInt){
    case 10 : hexadecimal.append('A');
              break;
    case 11 : hexadecimal.append('B');
              break;
    case 12 : hexadecimal.append('C');
              break;
    case 13 : hexadecimal.append('D');
              break;
    case 14 : hexadecimal.append('E');
              break;
    case 15 : hexadecimal.append('F');
              break;
   }
  }
  
  hexadecimal.reverse();
  
  return hexadecimal;
  
 }
} 