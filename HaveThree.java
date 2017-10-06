import java.util.Scanner;
public class HaveThree
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
      //HaveThree h=new HaveThree();
      boolean b=haveThree(m);
      System.out.println("The boolean value b = "+b);
     }
    public static boolean haveThree(int[] nums) 
    {
    	/*int count=0;
  		for(int i=0;i<nums.length;i++)
  		{
  			if(nums[i]==3 && nums[i+1]!=3)
  			{
  				count++;
  			}
  		}
  		if(count==3)
  		return true;
  		else
  		return false;*/
  		/*int count=0;
		for(int i=0;i<nums.length;i++)
		{
   			if(nums[i]==3)
   			{
     			count++;
   			}
		}
		if(count==3)
		return true;
		else
		return false;*/
		/*int count=0;
		for(int i=0;i<nums.length-1;i++)
		{
			if(nums[i]==3 && nums[i+1]!=3)
			count+=1;
		}
			if(nums[nums.length-1]==3)
			count+=1;
			return count==3;*/
			int count=0;
			for(int i=0;i<nums.length-1;i++)
			{	
				if(nums[i]==3&&nums[i+1]!=3)
				{
					count++;
				}
			}
			if(nums[nums.length-1]==3 && nums[nums.length-2]!=3)
			{
				count++;
			}
			if(count==3)
			{
				return true;
			}
				return false;
  
	}
}