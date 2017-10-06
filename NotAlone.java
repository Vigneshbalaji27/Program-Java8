import java.util.Arrays;
import java.util.Scanner;

public class NotAlone {

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
      System.out.println("enter the value of val = ");
	  int val=s.nextInt();
	  int[] b=notAlone(m, val);
	  System.out.println("The modified array is ");
	  System.out.print("[");
	  for(int f:b)
	  {
	      System.out.print(f+",");
	  }
	  System.out.print("]");
  	}
      public static int[] notAlone(int[] nums, int val)
      {
        if(nums.length>2)
        {
        	for(int i=0;i<nums.length;i++)
        	{
        		if(nums[i]==val)
        		nums[i]=Math.max(nums[i-1], nums[i+1]);
        	}
        	
        	/*for(int i=1;i<nums.length-1;i++)
        	{
        		if(nums[i] == val && nums[i] != nums[i-1] && nums[i] != nums[i+1])
        		nums[i]=nums[i]==val?Math.max(nums[i-1],nums[i+1]):nums[i];
        	}*/
        }
        return nums;
    	  /*{int l= nums.length;
    	  for(int i=0;i<l;i++)
    	  {
    	  if(i>0&&i<l-1)
    	  {if(nums[i]==val&&nums[i-1]!=val&&nums[i+1]!=val)
    	  {if(nums[i-1]>nums[i+1])
    	  nums[i]=nums[i-1];
    	  else
    	  nums[i]=nums[i+1];}}
    	  }
    	  return nums;
    	  }*/

      }

}
