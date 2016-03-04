public class ReverseInteger{
	public static void main(String[] args){
		System.out.println("The reverse of 12345 is " + reverseInteger(12345) + ".");
	}
	
	public static String reverseInteger(int value){
		if (value <10){
			return Integer.toString(value);
		}
		else{
			String str = Integer.toString(value);
			return str.charAt(str.length()-1) +reverseInteger(value/10);
		}
	}
}