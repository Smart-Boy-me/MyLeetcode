package Medium;

import java.util.Arrays;

public class leetcode_16 {
	
	public int threeSumClosest(int[] nums, int target) {
		Arrays.sort(nums);
		int min = nums[0] + nums[1] + nums[2];
		if(min - target == 0) return min;
		for(int i=0;i<nums.length-2;i++) {
			int left = i+1;
			int right = nums.length-1;
			while(left<right) {
				int sum = nums[i] + nums[left] + nums[right];
				if(Math.abs(sum - target) < Math.abs(min - target))
					min = sum;
				if(sum < target) left++;
				else if( sum == target ) return sum;
				else right++;
			}
		}
        return min;
    }

	public static void main(String[] args) {
		leetcode_16 leetcode_16 = new leetcode_16();  
		int[] a = {-1,2,1,-4};
		System.out.println(leetcode_16.threeSumClosest(a, 1));
	}

}
