import java.util.Scanner;
public class More14
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
      boolean b=more14(m);
      System.out.println("The boolean value b = "+b);
     }
	public static boolean more14(int[] nums) 
	{
		  /*int c1=0;int c2=0;
		  for(int e:nums)
		  {
			  if(e==1)
				  c1++;
			  else
				 if(e==4)
				 c2++;
		  }
			  if(c1>c2)
				return true;
			  else
				  return false;*/
		int i=0,c=0;
		while(i<nums.length)
		{if(nums[i]==1)
		c++;
		else if(nums[i]==4)
		c--;i++;}
		if(c>0)
		return true;
		else return false;
	}
}

