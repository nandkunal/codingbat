package com.codingbat.recurssion1;

public class CountHi2 {
	
	public int countHi2(String str) {
		if(str==null) return 0;
		if(str=="") return 0;
		if(str.length()<2) return 0;
		if(str.length()==2)
		{
			if(str.equals("hi")) return 1;
			else return 0;
		}
		String newStr=str.substring(1);
		if(str.substring(0,2).equals("hi")) return 1+countHi2(str.substring(2));
		else if(str.charAt(0)=='x' && newStr.substring(0,2).equals("hi")){
			return countHi2(newStr.substring(2));
		}else if(str.charAt(0)!='x' && newStr.substring(0,2).equals("hi")){
			return 1+countHi2(newStr.substring(2));
		}else{
			return countHi2(newStr);
		}
	}


	public static void main(String[] args) {
        System.out.println(new CountHi2().countHi2("hihi"));
	}

}
