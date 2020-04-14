package algorithms;

public class StringPermutation {
	
	public static void main(String[] args) {
		String str = "ABCD";
		permute(str, 0,str.length()-1);
	}
	
	private  static void permute(String str, int start, int j) {
		
		
		
		if(start == j) {
			System.out.println(str);
		}
		for(int i = start; i<=j; i++) {
			str = swap(str, start, i);
			permute(str, start+1, j);
			str = swap(str, start, i);
			
		}
		
	}
	
	private static String swap(String str, int i, int j) {
		char temp;
		char[] charArray = str.toCharArray(); 
        temp = charArray[i] ; 
        charArray[i] = charArray[j]; 
        charArray[j] = temp; 
        return String.valueOf(charArray);
	}

}
