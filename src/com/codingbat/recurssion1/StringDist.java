package com.codingbat.recurssion1;

public class StringDist {
	
	public int strDist(String str, String sub) {
		if(str=="") return 0;
		if(str.length()==sub.length()){
			if(str.equalsIgnoreCase(sub))
			{
				return sub.length();
			}else return 0;
		}
		if(str.substring(0, sub.length()).equalsIgnoreCase(sub)&& str.substring(str.length() - sub.length())
	            .equals(sub)){
			return str.length();
			
		}
		if(str.substring(0,sub.length()).equals(sub)) return strDist(str.substring(0,str.length()-1), sub);
		else{
			return strDist(str.substring(1),sub);
		}
		  
	}


	public static void main(String[] args) {
		System.out.println(new StringDist().strDist("catcowcat", "cat"));

	}

}
