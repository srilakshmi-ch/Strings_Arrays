package project21th;

import java.util.Scanner;

public class Array_reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[],i,n,j=0;
	
		arr=new int[10];
		int res[]=new int[10];
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of elemrnts into array");
		n=sc.nextInt();
		System.out.println("enter elements int array");
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(i=n;i>0;i--,j++)
		{
			res[j]=arr[i-1];
		}
		System.out.println("array reverse is");
		  for(i=0;i<n;i++)
		    {
		     System.out.println(res[i]);
		    }

	}

}
