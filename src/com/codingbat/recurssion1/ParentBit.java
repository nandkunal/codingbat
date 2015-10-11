package com.codingbat.recurssion1;

public class ParentBit {
	
	public String parenBit(String str) {
		if(str==null) return str;
		if(str=="") return str;
	   
		
		if(str.charAt(0)=='('){
			if(str.charAt(str.length()-1)==')')
			{
				return str;
			}else{
				return parenBit(str.substring(0, str.length()-1));
			}
			
	     
		}else{
			return parenBit(str.substring(1));
		}
		
		  
	}


	public static void main(String[] args) {
       
		System.out.println(new ParentBit().parenBit("x(hello)"));
	}

}
