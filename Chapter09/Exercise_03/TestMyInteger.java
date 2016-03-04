public class TestMyInteger{
 public static void main(String[] args){
  
  int int1 = 4;
  int int2 = 5;
  MyInteger myInt0 = new MyInteger();
  MyInteger myInt1 = new MyInteger(4);
  MyInteger myInt2 = new MyInteger(4);
  MyInteger myInt3 = new MyInteger(5);
  char[] charArray = {'3','2','1'};

  System.out.println(myInt0.getInt());
  System.out.println();
  
  System.out.println(myInt1.getInt());
  System.out.println(myInt1.isEven());
  System.out.println(myInt1.isOdd());
  System.out.println(myInt1.isPrime());
  System.out.println();

  System.out.println(myInt3.getInt());
  System.out.println(myInt3.isEven());
  System.out.println(myInt3.isOdd());
  System.out.println(myInt3.isPrime());
  System.out.println();

  System.out.println(MyInteger.isEven(int1));
  System.out.println(MyInteger.isOdd(int1));
  System.out.println(MyInteger.isPrime(int1));
  System.out.println();

  System.out.println(MyInteger.isEven(int2));
  System.out.println(MyInteger.isOdd(int2));
  System.out.println(MyInteger.isPrime(int2));
  System.out.println();

  System.out.println(MyInteger.isEven(myInt1));
  System.out.println(MyInteger.isOdd(myInt1));
  System.out.println(MyInteger.isPrime(myInt1));
  System.out.println();

  System.out.println(MyInteger.isEven(myInt3));
  System.out.println(MyInteger.isOdd(myInt3));
  System.out.println(MyInteger.isPrime(myInt3));
  System.out.println();

  System.out.println(myInt1.equals(int1));
  System.out.println(myInt1.equals(int2));
  System.out.println(myInt1.equals(myInt2));
  System.out.println(myInt1.equals(myInt3));
  System.out.println();
  
  System.out.println(MyInteger.parseInt(charArray));
 }
}