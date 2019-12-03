package Medium;

public class L_55 {
	
	public boolean canJump(int[] nums) {
        if(nums[0] == 0) return false;
        int max = 0;
        for(int i=0;i<nums.length;i++) {
        	if(i>max) return false; 
        	if(max < i+nums[i]) max = i + nums[i];
        }
        return true;
    }

	public static void main(String[] args) {
		int[] nums = {3,2,1,0,4} ;
		System.out.println(new L_55().canJump(nums));
	}

}
