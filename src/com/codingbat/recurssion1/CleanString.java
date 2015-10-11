package com.codingbat.recurssion1;

public class CleanString {
	
	public String stringClean(String str) {
		  if(str==null) return str;
		  if(str=="") return str;
		  if(str.length()==1) return str;
		  String newStr=str.substring(1);
		  if(str.charAt(0)==newStr.charAt(0))
		  {
			  return stringClean(newStr);
		  }else{
			  return str.charAt(0)+stringClean(newStr);
		  }
		  
	}


	public static void main(String[] args) {
		System.out.println(new CleanString().stringClean("aaabbccdd"));

	}

}
