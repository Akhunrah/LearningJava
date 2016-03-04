import java.util.Scanner;

public class SubstringCheck{
 public static void main(String args[]){
  
  // Make new scanner.
  Scanner input = new Scanner(System.in);
  
  // Prompt input.
  System.out.println("Enter two strings delimited by a space:");
  String s1 = input.next();
  String s2 = input.next();
   
  //Output result.
  System.out.println("Is " + s1 + " a substring of " + s2 + "? " + isSubstring(s1,s2));
  
  
 }
 
 
 
 public static boolean isSubstring(String s1, String s2){
  //Tests if s1 is a substring of s2.
  
  if(s2.indexOf(s1)>=0){
   return true;
  }
  else{
   return false;
  }
 }
}