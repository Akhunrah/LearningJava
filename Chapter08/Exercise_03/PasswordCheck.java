import java.util.Scanner;

public class PasswordCheck{
 public static void main(String args[]){

  Scanner input = new Scanner(System.in);
  
  // Prompt password input.  
  System.out.println("Please enter a password:");
  String password = input.next();

  // Tell if password is valid
  if(isValid(password)){
   System.out.println("Valid password");
  }
  else{
   System.out.println("Invalid password");
  }
 }
  
 
 
 public static boolean isValid(String pass){
  
  if(pass.length()<8){
   return false;// Must be at least 8 characters long.
  }
  
  // there must be at least two digits. this counts them.
  int digitNumber = 0;
  
  for(int i=0; i<pass.length(); i++){
   if(Character.isDigit(pass.charAt(i))){
    digitNumber++; // increment the digitNumber if the character is a digit.
   }
   else if(!Character.isLetter(pass.charAt(i))){
    return false; // If the character is neither digit nor letter, return false.
   }
  }
  
  if(digitNumber<2){
   return false;
  }
  
  return true;
  
 }
}