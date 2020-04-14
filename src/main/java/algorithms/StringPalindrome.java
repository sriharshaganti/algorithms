package algorithms;

public class StringPalindrome {
	
	public static boolean isPalindrome(String str) {
		
		int start =0;
		int length = str.length()-1;
		
		if(str.isEmpty() || str == null) {
			return false;
		}
		
		while(start<length) {
			if(str.charAt(start)!=str.charAt(length)) {
				return false;
				
			}
			start++;
			length--;
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(isPalindrome("abbca"));
	}

}
