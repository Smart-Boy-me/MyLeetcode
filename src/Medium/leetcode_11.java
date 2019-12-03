package Medium;

public class leetcode_11 {
	public int min(int a, int b) {
		return a<b ? a : b;
	}
	
	public int maxArea(int[] height) {
		int left = 0;
		int right = height.length-1;
		int maxArea = 0;
		int curArea;
		while(left<right) {
			if(height[left] <= height[right]) left++;
			else right--;
			curArea = (right - left) * min(height[left], height[right]);
			if(maxArea < curArea) maxArea = curArea;
		}
        return maxArea;
	}
	// 			5ms 58.83% 39.6MB 92.95% once AC
	//²»ÓÃ¶ÑÕ»:  2ms 99.86% 39.9MB 92.44% once AC
	
	
}
