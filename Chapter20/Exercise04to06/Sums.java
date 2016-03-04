public class Sums{
	public static void main(String[] args){
		System.out.println("The first sum up to 10 terms is " + sum1(10) + ".");
		System.out.println("The second sum up to 10 terms is " + sum2(10) + ".");
		System.out.println("The third sum up to 10 terms is " + sum3(10) + ".");
	}
	
	public static double sum1(int i){
		if(i==1){
			return 1.0;
		}
		else{
			return 1.0/i +sum1(i-1);
		}
	}
	
	public static double sum2(int i){
		if(i==1){
			return 1.0/3.0;
		}
		else{
			return i/(2.0*i+1.0) +sum2(i-1);
		}
	}
	
	public static double sum3(int i){
		if(i==1){
			return 1.0/2.0;
		}
		else{
			return i/(i+1.0) +sum3(i-1);
		}
	}
}