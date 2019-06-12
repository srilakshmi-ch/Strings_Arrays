package project21th;

import java.util.Scanner;

public class String_reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String rev="";
	     @SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
	     System.out.println("enter string");
	     String str=sc.nextLine();
	     for(int i=str.length();i>0;i--)
	     {
	    	rev+=(str.charAt(i-1));
	     }
	     System.out.println("reverse of a string="+rev);
			
		
	}

}
