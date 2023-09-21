package com.vikki.pgm;

import java.util.LinkedList;
import java.util.Scanner;

public class NarcissisticNumber {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range");
		long ran=sc.nextLong();
		
		for(long i=1;i<ran;i++)
		{
			long n=i;
			LinkedList<Long> data=new LinkedList<Long>();
			
			while(n>0)
			{
				data.push(n%10);
				n=n/10;
			}
			
			long sum=0;
			
			for(Long num:data) {
				sum+=Math.pow(num, data.size());
			}
			
			if(i==sum) {
				System.out.println(i);  
			}
		}
	}

}
