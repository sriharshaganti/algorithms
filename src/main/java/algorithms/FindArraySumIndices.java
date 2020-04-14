package algorithms;

import java.util.HashMap;
import java.util.Map;

public class FindArraySumIndices {
	
	public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashmap = new HashMap<>();
        for(int i =0; i<nums.length;i++){
            hashmap.put(nums[i],i);
        }
        
        for(int i=0; i<nums.length; i++){
            int remainder = target-nums[i];
            if(hashmap.containsKey(remainder) && hashmap.get(remainder) != i) {
                return new int[] { i, hashmap.get(remainder)};
            }
        }
        throw new IllegalArgumentException("Exception raised");
    }
	
	
	public static void main(String[] args) {
		int[] nums = new int[] {2,7,11,15,20};
		
		int[] nums1 = new int[] {1,3,4,6,10};
		
		int[] nums2 = new int[] {10,11,13,15,50};
		
		int[] nums3 = new int[] {4, 5, 3, 6, 10};
		
		FindArraySumIndices obj = new FindArraySumIndices();
		
		
		int[] result = (obj.twoSum(nums, 26));
		for (int i : result) {
			System.out.print(i+"\t");
		}
		
		
		
		
	}

}
