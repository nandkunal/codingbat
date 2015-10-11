package com.codingbat.recurssion1;

public class StringCopies {
	
	public boolean strCopies(String str, String sub, int n) {
		if(str=="") return false;
		if(str.length()<sub.length()&&n==0) return true;
		else if(str.length()<sub.length()&&n!=0) return false;
		if(str.length()==sub.length())
		{
			if(str.equalsIgnoreCase(sub))
			{
				if(n==1) return true;
				else return false;
			}
		}
		if(str.substring(0,sub.length()).equalsIgnoreCase(sub)){
			return true && strCopies(str.substring(1), sub,n-1);
		}else{
			return strCopies(str.substring(1), sub,n);
		}
		  
	}


	public static void main(String[] args) {
		System.out.println(new StringCopies().strCopies("iiijjj", "ii", 2));

	}

}
