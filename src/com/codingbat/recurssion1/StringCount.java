package com.codingbat.recurssion1;

public class StringCount {
   
	
	public int strCount(String str, String sub) {
		if(str=="") return 0;
		if(str.length()==sub.length())
		{
			if(str.equalsIgnoreCase(sub))
			{
				return 1;
			}else{
				return 0;
			}
		}
		if(str.substring(0,sub.length()).equalsIgnoreCase(sub)){
			return 1+strCount(str.substring(sub.length()), sub);
		}else{
			return strCount(str.substring(1), sub);
		}
		
		  
	}

	public static void main(String[] args) {
        System.out.println(new StringCount().strCount("catcowcat", "dog"));
	}

}
