import java.util.Scanner;

public class ZeroMax 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the num of elements in array :");
		int k=s.nextInt();
		int[] a=new int[k];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter the element "+ i +" = ");
			a[i]=s.nextInt();
		}
		int[] b=zeroMax(a);
	      System.out.println("The modified array is ");
	      System.out.print("[");
	      for(int f:b)
	      {
	  		System.out.print(f+",");
	      }
	      System.out.print("]");
	}
	public static int[] zeroMax(int[] nums)
	{
		/*int odd=0;
		for(int i=nums.length-1;i>=0;i--)
		{
			if(nums[i]==0)
				nums[i]=odd;
			if(nums[i]%2==1 )
				odd=odd>nums[i]?odd:nums[i];
				odd=Math.max(odd,nums[i];
		}
		return nums;*/
		
        int odd=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                odd=0;
                for(int j=(i+1);j<nums.length;j++){
                    if((nums[j]%2)==1 && nums[j]>odd)
                        odd=nums[j];
                }
                nums[i]=odd;
            }
        }
        return nums;
	}
}
