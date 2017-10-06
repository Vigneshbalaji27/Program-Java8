
import java.util.Scanner;
public class SwapEnds
{
	public static void main(String[] args) 
  	{
      Scanner s=new Scanner(System.in);
      System.out.println("enter the length of array = ");
      int k=s.nextInt();
      int[]  m=new int[k];
      for (int i=0;i<m.length;i++) 
      {
         System.out.println("Please Enter the number "+i +" = ");
         m[i]=s.nextInt();
      }
      System.out.println("The given array is ");
      System.out.print("[");
      for(int e:m)
      {
    	  System.out.print(e+",");
      }
      System.out.print("]");
      int[] b=swapEnds(m);
      System.out.println("");
      System.out.println("");
      System.out.println("The modified array is ");
      System.out.print("[");
      for(int f:b)
      {
  		System.out.print(f+",");
      }
      System.out.print("]");
  	}
	public static int[] swapEnds(int[] nums) 
	{
		/*int fnum=nums[0];         
		nums[0]=nums[nums.length-1];
		nums[nums.length-1]=fnum;*/
		nums[0]=nums[0]^nums[nums.length-1];
		nums[nums.length-1]=nums[0]^nums[nums.length-1];
		nums[0]=nums[0]^nums[nums.length-1];
		return nums;
	 }
	
}
