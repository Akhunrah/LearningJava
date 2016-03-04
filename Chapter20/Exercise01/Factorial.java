import java.math.*;

public class Factorial{

	public static void main(String[] args){
		BigInteger fact100 = factorial(100);
		System.out.println(fact100);
	}
	
	public static BigInteger factorial(int n){
		if(n==0){
			return BigInteger.ONE;
		}
		else{
			BigInteger current = new BigInteger(n+"");
			return current.multiply(factorial(n-1));
		}
	}
}