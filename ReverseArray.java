import java.util.Scanner;

import javax.sound.sampled.LineListener;

public class ReverseArray {
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
    System.out.println("enter the value of k = ");
    int k=s.nextInt();
    int[]  m=new int[k];
    for (int i=0;i<m.length;i++) 
    {
       System.out.println("Please Enter the number "+i +" = ");
       m[i]=s.nextInt();
    }
    System.out.println("The given array is ");
    System.out.print("[");
	  for(int f:m)
	  {
	      System.out.print(f+",");
	  }
	  System.out.print("]");    	
	  int[] b=reverseArray(m);
	  System.out.println("");
	  System.out.println("The modified array is ");
	  System.out.print("[");
	  for(int f:b)
	  {
	      System.out.print(f+",");
	  }
	  System.out.print("]");
	}
	public static int[] reverseArray(int[] b)
	{
		/*int reverse[]=new int[b.length];
		int k=0;
		for(int i=b.length-1;i>=0;i--)
		{
			reverse[k++]=b[i];
		}
		return reverse;*/
		int  j=b.length-1;
		for(int i=0;i<=(b.length/2)-1;i++)
		{
			b[i]=b[i]+ b[j-i];
			b[j-i]=b[i]-b[j-i];
			b[i]=b[i]-b[j-i];}
		return b;
		}
}
