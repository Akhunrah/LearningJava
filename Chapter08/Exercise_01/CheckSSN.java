import java.util.Scanner;

public class checkSSN{
 public static void main(String args[]){
  
  // Create a new scanner for user input.
  Scanner input = new Scanner(System.in);
  
  // Prompt user input in form DDD-DD-DDDD.
  System.out.println("Please enter your SSN in the form DDD-DD-DDDD:");
  String userSSN = input.nextLine();

  
  System.out.println("Is it valid? " + isValidSSN(userSSN));
  
  
  
 }
 
 
 
 public static boolean isValidSSN(String SSN){
  
  char testChar = 'a';
  
  if(SSN.length()!=11){
   return false;
  }
  
  for(int i=0; i<11; i++){
   
   testChar = SSN.charAt(i);
   
   if((i==3||i==6) && testChar!='-'){
    return false;
   }
  
   if(i!=3 && i!=6){
    if(!Character.isDigit(testChar)){
     return false;
    }
   }

  }
  
  return true;
  
 }
}