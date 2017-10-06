import java.util.Scanner;

public class ShiftLeft {
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
      System.out.println("The given array is ");
      System.out.print("[");
      for(int f:m)
      {
  		System.out.print(f+",");
      }
      System.out.print("]");
      System.out.println("");
      int[] a=shiftLeft(m);
      System.out.println("The modified array is ");
      System.out.print("[");
      for(int f:a)
      {
  		System.out.print(f+",");
      }
      System.out.print("]");
  	}
	public static int[] shiftLeft(int[] nums) 
	{
		/*int temp=nums[0];
		for(int i=0;i<nums.length-1;i++)
		{
			nums[i]=nums[i+1];
		}
		nums[nums.length-1]=temp;
		return nums;*/
		for(int i=0;i<nums.length-1;i++)
		{
			nums[i]=nums[i]^nums[i+1];
			System.out.println(nums[i]);
			nums[i+1]=nums[i]^nums[i+1];
			System.out.println(nums[i+1]);
			nums[i]=nums[i]^nums[i+1];
			System.out.println(nums[i]);
		}
		return nums;
	}

}
