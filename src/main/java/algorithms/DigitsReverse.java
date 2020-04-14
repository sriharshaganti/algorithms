package algorithms;

public class DigitsReverse {
	
	public static int digitReverse(int n) {
		
		if(n ==0) {
			return 0;
		}
		int reverse = 0;
		while(n>0) {
			reverse = (reverse*10 ) +  (n%10);
			n = n/10;
		}
		
		return reverse;
		
	}
	
	public static void main(String[] args) {
		System.out.println(digitReverse(102));
	}

}
