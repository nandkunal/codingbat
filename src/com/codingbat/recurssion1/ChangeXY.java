package com.codingbat.recurssion1;

public class ChangeXY {
	
	public static String changeXY(String str) {

		if(str=="") return str;
		if(str.length()==1)
		{
		  if(str.equals("x"))
		    return "y";
		  else
		    return str;  

		}

		return changeXY(str.substring(0,str.length()-1))+((str.charAt(str.length()-1)=='x')?"y":str.charAt(str.length()-1));
		  
		}
	
	public static void main(String[] args) {
		System.out.println(changeXY("xxx"));
	}

}
