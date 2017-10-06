import java.util.Scanner;
public class Sum28
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
      Sum28 u=new Sum28();
      boolean b=u.sum28(m);
      System.out.println("The boolean value b = "+b);
  }
  public boolean sum28(int[] nums) 
  {
  		int sum=0;
  		for(int i=0;i<nums.length;i++)
  		{
  			if(nums[i]==2)
  			{
  				sum+=nums[i];
  			}
  		}
  		if(sum==8)
  		{
  			return  true;
  		}
  		return false;
  	
  }
}