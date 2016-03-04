import java.util.Scanner;

public class BeanCounter{
 public static void main(String[] args){
  
  // Declare some variables and arrays. Initialize later.
  int balls;
  int direction;
  int slots; 
  int maximum;
  int[] path;
  int[] slotPopulation;
  
  // Create a scanner
  Scanner input = new Scanner(System.in);
  
  // Ask for the number of balls and the number of slots.
  System.out.println("Please enter the number of balls:");
  balls = input.nextInt();
  System.out.println("Please enter the number of slots:");
  slots = input.nextInt();
  
  // Create the arrays using these as lengths.
  path = new int[slots-1]; // Path has slots-1 changes in direction.
  slotPopulation = new int[slots];

  // Initialize the slotPopulation array.
  for(int i =0; i<slots; i++){
   slotPopulation[i]=0;
  }
  
  // Find the path of each ball.
  for(int i=1; i<=balls; i++){
   System.out.println();
   
   for(int j=0; j< path.length; j++){
    path[j] = (int)(Math.random()*2);
    if(path[j]==0){
     System.out.print("L");
    }
    else{
     System.out.print("R");
    }
   }
   
   // Increment the appropriate slot number based on the sum of the path array.
   slotPopulation[intArraySum(path)]++;
  }

  // Find the maximum number of balls in a slot;
  maximum=0;
  for(int i=0; i<slotPopulation.length; i++){
   if(slotPopulation[i]>maximum){
    maximum = slotPopulation[i];
   }
  }

  // Print the histogram.
  for(int i=maximum; i>0; i--){
   System.out.println();
   for(int j=0; j<slotPopulation.length;j++){
    if(slotPopulation[j]>=i){
     System.out.print(0);
    }
    else{
     System.out.print(" ");
    }
   }
  }

  
 }
 
 public static int intArraySum(int[] array){
  // Sum the elements in an array.
  int sum=0;
  for(int i=0; i<array.length; i++){
   sum += array[i];
  }
  return sum;
 }
}