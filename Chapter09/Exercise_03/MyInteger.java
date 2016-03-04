
public class MyInteger{
 // -value: int; stores int value represented by this object.
 // ============================================================
 // +MyInteger(); Creates a MyInteger object with default value 0.
 // +MyInteger(integer: int); Creates a myInteger object with integer.
 // +getInt(): int; Returns the integer value.
 // +isEven(): bool; Returns true if value is even.
 // +isOdd(): bool ; Returns true if value is odd.
 // +isPrime(): bool;Returns true if value is prime.
 // +isEven(int): bool; Returns true if int is even.
 // +isOdd(int): bool; Returns true if int is odd.
 // +isPrime(int):bool;Returns true if int is prime.
 // +isEven(MyInteger): bool; Returns true if MyInteger object value is even.
 // +isOdd(MyInteger): bool; Returns true if MyInteger object value is odd.
 // +isPrime(MyInteger):bool;Returns true if MyInteger object value is prime.
 // +equals(int):bool; Returns true if value equals int.
 // +equals(MyInteger):bool; Returns true if value equals the value of MyInteger.
 // +parseInt(char[]): void; converts an array of numeric characters to an int value.
 
 private int value;
 
 public MyInteger(){
  this(0);
 }
 
 public MyInteger(int integer){
  this.value = integer;
 }
 
 public int getInt(){
  return value;
 }
 
 public boolean isEven(){
  if(value%2==0){
   return true;
  }
  else{
   return false;
  }
 }
 
 public boolean isOdd(){
  if(value%2==1){
   return true;
  }
  else{
   return false;
  }
 }
 
 public boolean isPrime(){
  int iterator = 2;
  
  while(iterator<=value/2){
   
   if(value%iterator==0){
    return false;
   }
   
   iterator++;
  }
  
  return true;
 }
  
 public static boolean isEven(int integer){
  if(integer%2==0){
   return true;
  }
  else{
   return false;
  }  
 }
 
 public static boolean isOdd(int integer){
  if(integer%2==1){
   return true;
  }
  else{
   return false;
  }
 }
 
 public static boolean isPrime(int integer){
  int iterator = 2;
  
  while(iterator<=integer/2){
   
   if(integer%iterator==0){
    return false;
   }
   
   iterator++;
  }
  
  return true; 
 }
 
 public static boolean isEven(MyInteger myInteger){
  if(myInteger.getInt()%2==0){
   return true;
  }
  else{
   return false;
  }  
 }
 
 
 public static boolean isOdd(MyInteger myInteger){
  if(myInteger.getInt()%2==1){
   return true;
  }
  else{
   return false;
  }
 }
 
 public static boolean isPrime(MyInteger myInteger){
  int iterator = 2;
  
  while(iterator<=myInteger.getInt()/2){
   
   if(myInteger.getInt()%iterator==0){
    return false;
   }
   
   iterator++;
  }
  
  return true; 
 }
 
 public boolean equals(int integer){
  if(value == integer){
   return true;
  }
  else{
   return false;
  }
 }
 
 public boolean equals(MyInteger myInteger){
  if(value == myInteger.getInt()){
   return true;
  }
  else{
   return false;
  }
 }
 
 public static int parseInt(char[] charArray){
  int length = charArray.length;
  int iterator = 0;
  int result = 0;
  int tenFactor = 1;
  
  while(iterator<length){

   tenFactor = 1;
   
   for(int i =length-1; i>iterator; i--){
    tenFactor *= 10;
   }
   
   
   result += Character.getNumericValue(charArray[iterator])*tenFactor;
   iterator++;
  }
  
  return result;
 }
 
 
 
}