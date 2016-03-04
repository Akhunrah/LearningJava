public class GCD{
	public static void main(String[] args){
		System.out.println("The GCD of 24 and 16 is " + gcd(24,16) + ".");
		System.out.println("The GCD of 255 and 25 is " + gcd(255,25) + ".");
	}
	
	public static int gcd(int m, int n){
		if(m%n==0){
			return n;
		}
		else{
			return gcd(n,m%n);
		}
		
	}
}