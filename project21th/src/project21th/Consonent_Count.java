package project21th;

import java.util.Scanner;

public class Consonent_Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
	     System.out.println("enter String");
	   String  str=sc.nextLine();
	   for(int i=0;i<str.length();i++)
	   {
		   char ch=str.charAt(i);
	   if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' )
	   {
		   
	   }
	   else if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
	   {
		   count=count+1;
	   }
	   
	  
	}System.out.println("consonents in "+str+" are ="+count);
	
	}
}
