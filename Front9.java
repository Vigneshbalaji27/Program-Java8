import java.util.Scanner;
public class Front9
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
      		Front9 h=new Front9();
            boolean b=h.arrayFront9(list);
            System.out.println("The boolean value b = "+b);
      		
	}
	public boolean arrayFront9(int[] nums)
	{
      		
      		for(int i=0;i<4;i++)
      		{
      		if(nums[i]==9)
      		return true;
      		}
      		return false;
	}
			
				
	
}