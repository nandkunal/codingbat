package com.codingbat.recurssion1;

public class CountAbc {
	
	public int countAbc(String str) {
		
		if(str=="") return 0;
		
		if(str.length()==2)
			return 0;
		
		if(str.length()==3)
		{
			if(str.equals("abc")||(str.equals("aba")))
			{
				return 1;
			}else{
				return 0;
			}
		}
		return (str.substring(0,3).equals("abc"))||(str.substring(0,3).equals("aba"))?1+countAbc(str.substring(1)):0+countAbc(str.substring(1));
		  
	}
 
	public static void main(String[] args) {
		System.out.println(new CountAbc().countAbc("abcaba"));
	}

}
