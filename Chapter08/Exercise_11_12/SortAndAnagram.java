import java.util.Scanner;

public class SortAndAnagram{
 public static void main(String args[]){
  
  // New Scanner.
  Scanner input = new Scanner(System.in);
  
  // Prompt user input.
  System.out.println("Please enter two strings:");
  String s1 = input.next();
  String s2 = input.next();
  
  // Sort them.
  System.out.println("The sorted strings are " + sortCharacters(s1) + " and " +sortCharacters(s2) +".");
  
  // Test anagram.
  System.out.println("Are they anagrams? " + isAnagram(s1,s2));
 }
 
 public static String sortCharacters(String string){
  
  StringBuilder sortedString = new StringBuilder();
  sortedString.append(string.toLowerCase());
  char char1;
  char char2;
  
  for(int i=0; i<string.length(); i++){
   for(int j=i; j<string.length(); j++){
    
    char1 = sortedString.charAt(i);
    char2 = sortedString.charAt(j);
    
    if(char1 > char2){
     sortedString.deleteCharAt(j);
     sortedString.insert(i,char2);
     j=i;
    }
   }
  }
  
  return sortedString.toString();
  
 }
 
 
 public static boolean isAnagram(String s1, String s2){
  
  String sortedString1 = sortCharacters(s1);
  String sortedString2 = sortCharacters(s2);
  
  if(sortedString1.equals(sortedString2)){
   return true;
  }
  else{
   return false;
  }
 }
 
}