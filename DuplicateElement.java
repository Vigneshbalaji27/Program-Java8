package com.vikki.pgm;

import java.util.Scanner;

public class DuplicateElement {
	
	public static void main(String[] args) {
		
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of elements");
		n=sc.nextInt();
		
		int ar[]=new int[n];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		
		System.out.println("Duplicate elements are");
		for(int i=0;i<ar.length;i++) {
			for(int j=i+1;j<ar.length;j++) {
				if(ar[i]==ar[j])
					System.out.println(ar[j]);
						
			}
		}
	}

}
