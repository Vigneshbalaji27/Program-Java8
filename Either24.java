
import java.util.Scanner;
public class Either24
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
      boolean b=either24(m);
      System.out.println("The boolean value b = "+b);
     }
	public static boolean either24(int[] nums) 
	{ 
		 /* boolean count2=false,count4=false;
		  for(int i=0;i<nums.length-1;i++)
		  {
			  if(nums[i]==2 &nums[i+1]==2)
			  {
				count2=true;
			  }
			   else if(nums[i]==4 &&nums[i+1]==4)
			   {
				   count4=true;
			   }
		  }
		  if(count2!=count4)
		  return true;
		  else
			  return false;*/
		int c=0;
		for(int i=0;i<nums.length-1;i++){
		if((nums[i]==2 && nums[i+1]==2) || (nums[i]==4 && nums[i+1]==4))
		c+=1;
		} 
		return (c==1);
	}
}

