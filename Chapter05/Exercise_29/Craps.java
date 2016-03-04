

public class Craps{
 public static void main(String[] args){
  
  
  
  playCrapsRound();
  
 }



 public static void playCrapsRound(){
  
  // Roll two numbers.
  int num1 = (int)(Math.random()*6+1);
  int num2 = (int)(Math.random()*6+1);
  int sum1 = num1+num2;
  int sum2 = 0;
  
  System.out.println("You rolled " +num1+ " + " +num2+ " = " +sum1+ ".");
  
  if(sum1 == 7 || sum1 == 11){
   System.out.println("You Win!");
  }
  else if(sum1 == 2 || sum1 == 3 || sum1 == 12){
   System.out.println("You lose.");
  }
  else{
   while(sum2 != sum1){
    
    num1 = (int)(Math.random()*6+1);
    num2 = (int)(Math.random()*6+1);
    sum2 = num1 + num2;
    
    System.out.println("You rolled " +num1+ " + " +num2+ " = " +sum2+ ".");
    
    if(sum2 == 7){
     System.out.println("You lose.");
     break;
    }
    else if(sum2 == sum1){
     System.out.println("You Win!");
     break;
    }

   }

  }
  
 }
}