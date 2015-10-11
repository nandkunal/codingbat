package com.codingbat.recurssion1;

public class NextParen {
	
	public boolean nestParen(String str) {	if(str==null) return false;
	if(str=="") return true;
if(str.length()<2) return false;
	if(str.length()==2)
	{
		if(str.charAt(0)=='(' && str.charAt(1)==')')
			return true;
		else return false;
	}
	if(str.charAt(0)=='(') {
		if(str.charAt(str.length()-1)==')'){
			return true&& nestParen(str.substring(1,str.length()-1));
		}else{
			return nestParen(str.substring(str.length()-1));
		}
	}else{
		return nestParen(str.substring(1));
	}
	}


	public static void main(String[] args) {
		System.out.println(new NextParen().nestParen("((()()"));

	}

}
