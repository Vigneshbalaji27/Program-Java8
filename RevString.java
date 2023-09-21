package com.vikki.pgm;

import java.util.Scanner;

public class RevString {

	public static void main(String[] args) {
		
		System.out.println("Enter the String");
		
		Scanner sc=new Scanner(System.in);
		
		String s=sc.next();
		
		char ch[]=s.toCharArray();
		
		String rev=" ";
		for(int i=ch.length-1;i>=0;i--)
		{
			rev+=ch[i];
		}
		
		System.out.println("The reversed String is "+rev);
		
		StringBuilder sb=new StringBuilder(s);
		sb.reverse();
		System.out.println("The reversed String using StringBuilder "+sb);
	}
}
