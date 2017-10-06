import java.util.Scanner;

public class CopyEvens 
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
	    System.out.println("enter the value of count = ");
	    int count=s.nextInt();
	    int[] b=copyEvens(m, count);
	    System.out.println("The modified array is ");
	    System.out.print("[");
	    for(int f:b)
	    {
	    		  		System.out.print(f+",");
	    }
	    System.out.print("]");
	}
	public static int[] copyEvens(int[] nums, int count) 
	{
		/*int[] r=new int[count];
		int i=0,j=0;
		while(count!=0)
		{
			if(nums[i]%2==0)
			{
				r[j]=nums[i];
				j++;
				count--;
			}
			i++;
		}
		return r;*/
		/*int[] copyEvens=new int[count];
		int i=0;
		for(int a:nums)
		{
			if(a%2==0)
			{
				copyEvens[i]=a;
				i+=1;
			}
			if(i>=count)
			break;
		}
		return copyEvens;  */
		int[]n=new int[count];
		int j=0;
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]%2==0&&j<count)
			{
				n[j]=nums[i];
				j++;
			}
		}
		return n;
	}
	
}
