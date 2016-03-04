import java.util.Scanner;

public class UpperToLower{
 public static void main(String[] args){

  // Create a new scanner.
  Scanner input = new Scanner(System.in);
   
  // Ask for user input of an uppercase letter.
  System.out.print("Enter an uppercase letter: ");
  char letter = input.next(".").charAt(0);
  
  // Convert to lowercase.
  letter = UpperToLower(letter);
  System.out.println("The lowercase is " + letter + ".");
 }
 
 public static char UpperToLower(char letter){
  
  int upperCaseUnicode = (int) letter;

  // Tests if the input is Uppercase, and converts if so. If not, input is left alone.
  if(upperCaseUnicode >= (int)'A' && upperCaseUnicode <= (int)'Z' ){

   int offset = (int)'a' - (int)'A';  
   int lowerCaseUnicode = offset + upperCaseUnicode;
   return (char) lowerCaseUnicode;

  } else return letter;
  
 }
}