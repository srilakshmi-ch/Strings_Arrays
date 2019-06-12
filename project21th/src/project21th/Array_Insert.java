package project21th;

import java.util.Scanner;

public class Array_Insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n,ch,ele;
		int arr[]=new int[10];
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of elemrnts into array");
		n=sc.nextInt();
		System.out.println("enter elements into array");
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("enter element to be inserted");
		ele=sc.nextInt();
			System.out.println("enter choice \n 1.inset at ending \n 2.insert at perticular location \n 3.display");
			ch=sc.nextInt();
			
			switch(ch)
			{
			case 1: arr[n]=ele;
			         n=n+1;
			         System.out.println("element inserted");
			         break;
			         
			case 2:  System.out.println("enter position");
			      int pos=sc.nextInt();
				    for(i=n;i>pos;i--)
				    {
				    	arr[i]=arr[i-1];
				    }
			        arr[pos]=ele;
			        n=n+1;
			        System.out.println("element inserted");
			        break;
			
			default :System.out.println("invalid");
			}
		
	 System.out.println("array is");
	
    for(i=0;i<n;i++)
    {
     System.out.println(arr[i]);
    }

			
	}
}
