import java.util.Arrays;
import java.util.Scanner;

public class CenteredAverage 
{
	public static void main(String[] args) 
  	{
      Scanner s=new Scanner(System.in);
      System.out.println("enter the value of k = ");
      int k=s.nextInt();
      int[]  m=new int[k];
      for (int i=0;i<m.length;i++) 
      {
         System.out.println("Please Enter the number "+i +" = ");
         m[i]=s.nextInt();
      }
	  int b=centeredAverage(m);
	  System.out.println("The Centered Average is "+b);
  	}
	public static int centeredAverage(int[] nums)
	{
		if(nums.length>=3)
		{
			Arrays.sort(nums);
			int sum=0;
			for(int i=1;i<nums.length-1;i++)
			{
				sum=sum+nums[i];
			}
			return sum/(nums.length-2);
		}
		else
			return 0;
		
	}
}
