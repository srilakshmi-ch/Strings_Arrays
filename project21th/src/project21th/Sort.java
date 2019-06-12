package project21th;

import java.util.Scanner;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[],i,p,temp,n,j;
		
		a=new int[10];
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of elemrnts into array");
		n=sc.nextInt();
		System.out.println("enter elements int array");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for (i = 0; i < n - 1; i++) 
		{ 
		p = i; 
		for (j=i+1; j < n; j++)
		{ 
		if (a[p]>a[j]) 
		p=j; 
		 
		} 
		temp=a[p];
		a[p]=a[i];
		a[i]=temp;
		 
		} 
		
	for(i=0; i < n; i++)
	{
	 
	System.out.print(a[i]+" ");
	}
	 
			
		
	}

}
