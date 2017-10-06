import java.util.Scanner;
public class Array667
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
      int a=array667(m);
      System.out.println("The count is "+a);
  	}
	public static int array667(int[] nums) 
	{
		int count=0;
		for(int i=0;i<nums.length-1;i++)
		{
			if((nums[i]==6 && nums[i+1]==6)||(nums[i]==6 && nums[i+1]==7))
			{
				count++;
			}
		}
		return count;
		  
	}
}
