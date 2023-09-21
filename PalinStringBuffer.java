package com.vikki.pgm;

public class PalinStringBuffer {

	public static void main(String[] args) {
		
		String original="Love";
		 StringBuilder sb=new StringBuilder();
	      sb.append(original);
	      sb.reverse();
	      
	      System.out.println("Using StringBuilder "+sb);
	      
	      StringBuffer sf=new StringBuffer();
	      sf.append(original);
	      sf.reverse();
	      
	      System.out.println("Using StringBuffer "+sf);
	}
}
