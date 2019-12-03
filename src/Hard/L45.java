package Hard;

public class L45 {
	
	public int jump(int[] nums) {
		int cur = 0;
		int count = 0;
		int tar = nums.length-1;
		
		while(cur < tar) {
			int max = cur + nums[cur];
			int temp = 0;
			if(max >= tar) {
				count++;
				break;
			}
			for(int i=cur;i<=( cur+nums[cur] );i++) {
				if(max < i + nums[i]) {
					max = i + nums[i];
					temp = i;
				}
			}
			cur = temp;
			count++;
		}
		
        return count;
    }

	public static void main(String[] args) {
		L45 l45 = new L45();
		int[] nums = {2,3,1};
		System.out.println(l45.jump(nums));
	}

}
