package com.codingbat.recurssion1;

public class Array220 {
	
	public boolean array220(int[] nums, int index) {
		  if(nums.length==0||nums.length==1) return false;
		  if(nums.length==2)
		  {
			  if(nums[0]*10==nums[1]) return true;
			  else return false;
		  }
		  if(index==nums.length-1)
		  {
			  return false;
		  }
		  
		  return array220(nums,index+1)||(nums[index]*10==nums[index+1])?true:false;
		  
		}
 public static void main(String[] args) {
	System.out.println(new Array220().array220(new int[]{20, 2, 21},0));
}

}
