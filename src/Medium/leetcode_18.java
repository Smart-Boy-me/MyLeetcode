package Medium;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode_18 {

	public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> lists = new ArrayList<>();
        Arrays.sort(nums);
        for(int one=0;one<nums.length-3;one++) {
        	if(one>0 && nums[one] == nums[one-1]) continue;
        	for(int two=one+1;two<nums.length-2;two++) {
        		if(two>one+1 && nums[two]==nums[two-1]) continue; 
        		int left = two+1;
        		int right = nums.length-1;
        		int gap = target - nums[one] - nums[two];
        		while(left<right) {
        			int cur = nums[left] + nums[right];
        			if(cur < gap) left++;
        			else if(cur > gap) right--;
        			else {
        				List<Integer> list = new ArrayList<>();
        				list.add(nums[one]);
        				list.add(nums[two]);
        				list.add(nums[left]);
        				list.add(nums[right]);
        				lists.add(list);
        				left++;
        				right--;
        				while(nums[left-1] == nums[left] && left < right) left++;
        				while(nums[right+1] == nums[right] && left < right) right--;
        			}
        		}
        	}
        }
        return lists;
    }

}
