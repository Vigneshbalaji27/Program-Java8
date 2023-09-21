package com.vikki.pgm;

import java.util.Scanner;

public class PrintRhombusStars {

	public static void main(String[] args) {
  
System.out.println("Enter the number of rows");
		Scanner sc1=new Scanner(System.in);
		int rows=sc1.nextInt();
		
		System.out.println(" Rhombus of stars for the same");
		rhombusStars(rows);
		
		
	}
public static void rhombusStars(int rows){
		for(int row=1;row<=rows;row++){
			
			for(int colspace=(rows-row);colspace>=1;colspace--){
				System.out.print(" ");
			}
			for(int colstar=1;colstar<=((row*2)-1);colstar++){
				System.out.print("*");
			}
			System.out.println("");
		}
		for(int row=rows-1;row>=1;row--){
			
			for(int colspace=(rows-row);colspace>=1;colspace--){
				System.out.print(" ");
			}
			for(int colstar=((row*2)-1);colstar>=1;colstar--){
				System.out.print("*");
			}
			System.out.println("");
		}

  }
  }