import java.util.Scanner;
public class ModThree
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
      ModThree h=new ModThree();
      boolean b=h.modThree(m);
      System.out.println("The boolean value b = "+b);
  }
  public boolean modThree(int[] nums)
  {
    /*boolean result=false;
    for(int i=0;i<nums.length;i++)
    {
      if((i+2)<nums.length)
      {
        if(nums[i]%2==0 && nums[i+1]%2==0 && nums[i+2]%2==0)
        {
          result=true;
        }
        else
            if(nums[i]%2!=0 && nums[i+1]%2!=0 && nums[i+2]%2!=0)
            {
              result=true;
            }
      }
    }
    return result;*/
    boolean flag=false;
    for(int i=0;i<nums.length-2;i++)
    {
        if((nums[i]%2)==(nums[i+1]%2) && (nums[i]%2)==(nums[i+2]%2))
        flag=true;
    }
      return flag;  
  }
}