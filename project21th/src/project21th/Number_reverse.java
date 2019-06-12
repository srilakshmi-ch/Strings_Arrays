package project21th;

import java.util.Scanner;

public class Number_reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rev=0,n,num,rem=0;
	     @SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
	     System.out.println("enter number");
	     num=sc.nextInt();
	     n=num;
	     while(n!=0)
	     {
	    	 rem=n%10;
	    	 rev=rev*10+rem;
	    	 n=n/10;
	     }
		System.out.println("Reverse of "+num+"is="+rev);
	}

}
