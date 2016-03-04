public class CrapsOdds{
 public static void main(String[] args){
  
  int rounds = 10000;
  int wins = numberOfWins(rounds);
  double probability = wins*100.0/rounds;

  System.out.println("Out of " +rounds+ ", " +wins+ " wins were recorded, for a win probability of " +probability+ " percent.");

 }
 



 public static int numberOfWins(int maximumRounds){
  
  int count = 0;
  
  for(int i=1; i<=maximumRounds;i++){
   if(playCrapsRound()){
    count++;
   }
  }
  
  return count;
 }





 public static boolean playCrapsRound(){
  
  boolean result = false;
  
  // Make initial roll.
  int sum1 = diceRollSum();
  int sum2 = 0;
  
  if(sum1 == 7 || sum1 == 11){
   result = true; // Instant win.
  }
  else if(sum1 == 2 || sum1 == 3 || sum1 == 12){
   result = false; // Instant loss.
  }
  else{
   while(sum2 != sum1){    
    sum2 = diceRollSum();
    if(sum2 == 7){
     result = false;
    }
    else if(sum2 == sum1){
     result=true;
    }
   }

  }
  
  return result;
 }



 public static int diceRollSum(){
  // Roll two numbers.
  int num1 = (int)(Math.random()*6+1);
  int num2 = (int)(Math.random()*6+1);
  int sum = num1+num2; // Add them up.
  return sum;
 }
}