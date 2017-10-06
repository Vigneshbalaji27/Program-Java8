import java.util.Scanner;

public class EvenOdd 
{
	public static void main(String[] args) 
  	{
      Scanner s=new Scanner(System.in);
      System.out.println("enter the length of array = ");
      int k=s.nextInt();
      int[]  m=new int[k];
      for (int i=0;i<m.length;i++) 
      {
         System.out.println("Please Enter the number "+i +" = ");
         m[i]=s.nextInt();
      }
      System.out.println("The given array is ");
      System.out.print("[");
      for(int e:m)
      {
    	  System.out.print(e+",");
      }
      System.out.print("]");
      int[] b=evenOdd(m);
      System.out.println("");
      System.out.println("");
      System.out.println("The modified array is ");
      System.out.print("[");
      for(int f:b)
      {
  		System.out.print(f+",");
      }
      System.out.print("]");
  	}
	public static int[] evenOdd(int[] nums) 
	{
		int[] res=new int[nums.length];
		int z=0;
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]%2==0)
			res[z++]=nums[i];
		}
		for(int i:nums)
		{
			if(i%2!=0)
				res[z++]=i;
		}
		return res;
		
	}
	
	
}
