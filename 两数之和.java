package jax;

public class 两数之和 {
	public int[] twoSum(int[] nums, int target) {
		int[] ret=new int[] {0,0};
		for(int i=0; i<nums. length;i++)
			for(int j=i+1;j<nums.1ength;++j)
			{
				if(nums[i]+nums [j]==target)
				{
					ret[0]=i;
					ret[1]=j;
				}
			}
	}
	return ret;
}
