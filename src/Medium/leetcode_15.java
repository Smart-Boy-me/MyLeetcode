package Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode_15 {
	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> lists = new ArrayList<List<Integer>>();
		Arrays.sort(nums);
		for(int i=0;i<nums.length-2;i++) {
			if(i>0 && nums[i-1] == nums[i]) continue;
			if(nums[i] > 0) break;
			int left = i+1;
			int right = nums.length-1;
			while(left < right) {
				int cur = nums[i] + nums[left] + nums[right];
				if(cur > 0) right--;
				else if (cur < 0) left++;
				else {
					lists.add(Arrays.asList(nums[i],nums[left],nums[right]));
					left++;
					while(left < right && nums[left-1] == nums[left]) left++;
				}
			}
		}
		return lists;
    }
}
