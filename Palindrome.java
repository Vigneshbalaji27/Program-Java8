package com.vikki.pgm;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {
		int r,sum=0,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check");
		int n=sc.nextInt();
		
		temp=n;
		while(n>0) {
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		
		System.out.println("The reversed number is "+sum);
		if(temp==sum)
			System.out.println("The given number "+temp +" is palindrome");
		else
			System.out.println("The given number "+temp +" is not palindrome");
		
	}

}
