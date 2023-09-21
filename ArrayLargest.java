package com.vikki.pgm;

import java.util.Scanner;

public class ArrayLargest {
	
	public static void main(String[] args) {
		
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		n=sc.nextInt();
		
		int[] ar=new int[n];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		
		System.out.println("The largest element is "+getLargest(ar, n));
	}
	
	
	public static int getLargest(int[] ar,int tot) {
		int temp;
		
		for(int i=0;i<tot;i++)
		{
			for(int j=i+1;j<tot;j++) {
				
				if(ar[i]>ar[j])
				{
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		
		return ar[tot-1];
	}

}
