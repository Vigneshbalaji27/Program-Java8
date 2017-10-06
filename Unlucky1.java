import java.util.Scanner;
public class Unlucky1
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
      boolean b=unlucky1(m);
      System.out.println("The boolean value b = "+b);
     }
	public static boolean unlucky1(int[] nums) {
		/*boolean un=false;
		for(int i=0;i<nums.length-1;i++)
		{
			if(nums[i]==1 && nums[i+1]==3)
				un=true;
		}
		return un;*/
int i=1;
for(int x:nums)
{if(x==i)
{i+=2;
if(i==5)break;}
else
i=1;}
if(i==5)
return true;
else
return false;

		  
	}
}
