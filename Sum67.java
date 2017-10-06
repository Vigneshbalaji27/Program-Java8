import java.util.Scanner;
public class Sum67
{
	public static void main(String[] args) 
	{
			Scanner s=new Scanner(System.in);
      		System.out.println("enter the value of k = ");
      		int k=s.nextInt();
      		int[] list=new int[k];
      		for (int i=0;i<list.length;i++) 
      		{
         		System.out.println("Please Enter the number "+i +" = ");
         		list[i]=s.nextInt();
      		}
            int b=sum67(list);
            System.out.println("The sum of value b = "+b);
	}
	public static int sum67(int[] nums)
	{
		/*int res=0;
		boolean f=false;
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]==6)
			f=true;
			if(f==false)
				res+=nums[i];
			if(nums[i]==7)
				f=false;
			
		}
		return res;*/
		/*int sum=0;
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]==6)
			{
				while(i<nums.length)
				{
					if(nums[i]==7)
					break;
					i++;
				}
				sum+=0;
			}
		else
			sum+=nums[i];
		} 
		return sum;
	}*/
		boolean found6=false;
		int sum=0;
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]!=6 && !found6)
				sum=sum+nums[i];
			if(nums[i]==6)
				found6=true;
			if(nums[i]==7)
				found6=false;
		}
		return sum;
		}
}
