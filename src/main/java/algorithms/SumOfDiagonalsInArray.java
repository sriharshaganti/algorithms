package algorithms;

public class SumOfDiagonalsInArray {
	
	public static int sumOfDiagonals(int[][] nums) {
		
		int sum =0;
		if(nums.length==0) {
			return 0;
		}
		
		for(int i =0; i<nums.length;i++) {
			for(int j=0;j<nums.length;j++) {
				if(i == j) {
					sum = sum + nums[i][j];
					
				}
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int[][] nums = { {1,2,3},{4,5,6},{7,8,9}};
		
		System.out.println(sumOfDiagonals(nums));
		
	}

}
