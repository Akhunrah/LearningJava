public class SumOfDigits{
	public static void main(String[] args){
		System.out.println("The sum of digits of 12345 is " + sumDigits(12345) + ".");
		System.out.println("The sum of digits of 99999 is " + sumDigits(99999) + ".");
	}
	
	public static long sumDigits(long n){
		if (n/10==0){
			return n;
		}
		else{
			return n%10+sumDigits(n/10);
		}
	}
}