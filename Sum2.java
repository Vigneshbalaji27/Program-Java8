import java.util.Scanner;

public class Sum2 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of k");
		int k=s.nextInt();
		int[] m=new int[k];
		for (int i=0;i<m.length;i++) 
	    {
	        System.out.println("Please Enter the number "+i +" = ");
	        m[i]=s.nextInt();
	    }
		int a=sum2(m);
		System.out.println("The output of addition of 1st 2 numbers is "+a);
	}
	public static int sum2(int[] arr)
	{
		/*if(arr.length>=2)
		{
			return arr[0]+arr[1];
		}
		return arr[0];*/
		return arr.length>1?arr[0]+arr[1]:arr[0];

	}
}
