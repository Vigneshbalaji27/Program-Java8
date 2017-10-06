import java.util.Arrays;
import java.util.Scanner;

public class FindMinimum {
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
		  int b=findMinimum(m);
		  System.out.println("");
		  System.out.println("The minimum in the array is "+b);
	}
	public static int findMinimum(int[] arr)
	{
		/*int min=arr[0];
			for(int i=0;i<arr.length;i++)
			{
				if(min>arr[i])
				{
					min=arr[i];
				}
			}
			return min;*/
		int min=arr[0];
		for(int a:arr){
		min=a<min?a:min;
		}
		return min;
		/*Arrays.sort(arr);
		return arr[0];*/
	}

}
