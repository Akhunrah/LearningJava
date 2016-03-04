
public class Locker{
 public static void main(String[] args){
  
  // Create an array to hold the locker info.
  int[] lockers = new int[100];
  
  // Populate the lockers array. 
  populateLockers(lockers);

  
  // For each student after the first, switch the appropriate lockers, then print the result.
  for(int i=2; i<=lockers.length; i++){
    switchLockers(lockers,i);
  }
  
  // Print the final result.
  printLockers(lockers);
 }
 
 
 
 
 public static void populateLockers(int[] lockers){
  // Populate the lockers with 0's, corresponding to the first student opening all of them.
  for(int i=0; i<lockers.length; i++){
   lockers[i]=0;
  }
 } 





 public static void switchLockers(int[] lockers, int studentNumber){
  // Switch every ith locker, where i is the student's number.
  
  int i=studentNumber-1;
  
  while(i<lockers.length){
   lockers[i]=1-lockers[i];
   i+=studentNumber;
  }
  
 }








 public static void printLockers(int[] lockers){
  // Print the locker pattern.
  System.out.println();
  for(int i=0; i<lockers.length; i++){
   System.out.print(lockers[i]);
   if((i+1)%10==0){
    System.out.println();
   }
  }
 }





 
}