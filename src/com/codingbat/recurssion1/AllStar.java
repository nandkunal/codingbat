package com.codingbat.recurssion1;

public class AllStar {
	
	public String allStar(String str) {
		if(str=="")
		{
			return str;
		}
		  if(str.length()==1)
		  {
		    return str;
		  }
		  return str.charAt(0)+"*"+allStar(str.substring(1));
		}
	
	public static void main(String[] args) {
		System.out.println(new AllStar().allStar("hello"));
	}


}
