package com.codingbat.recurssion1;

public class ChangePi {
	
	public static String changePi(String str) {
		  if(str=="")
		    return str;
		  if(str.length()==1)
		    return str;
		  if(str.length()==2)
			  if(str.equals("pi"))
			  {
				  return "3.14";
			  }else{
				  return str;
			  }
		   String s = (str.charAt(0)=='p' && str.charAt(1)=='i')?"3.14":str.charAt(0)+"";
		   int start=(s.equals("3.14"))?2:1;
		   return s+changePi(str.substring(start,str.length())); 
		      
		}
	
	public static void main(String[] args) {
		//System.out.println("xpix".substring(1,4));
		System.out.println(changePi("pip"));
	}

}
