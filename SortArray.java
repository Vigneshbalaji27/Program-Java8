import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
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
		  int[] b=sortArray(m);
		  System.out.println("");
		  System.out.println("The modified array is ");
		  System.out.print("[");
		  for(int f:b)
		  {
		      System.out.print(f+",");
		  }
		  System.out.print("]");
	}
	public static int[] sortArray(int[] arr)
	{
		Arrays.sort(arr);
		return arr;
	}

}
