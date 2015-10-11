package com.codingbat.recurssion1;

public class PairStar {
	
	public String pairStar(String str) {
		if(str=="")
		{
			return str;
		}
		  if(str.length()==1)
		  {
		    return str;
		  }
		  return str.charAt(0)+((str.charAt(0)==str.charAt(1)?"*":""))+pairStar(str.substring(1));
	}


	public static void main(String[] args) {
		
		System.out.println(new PairStar().pairStar("aaaa"));
		

	}

}
