import java.util.Scanner;

public class Lucky13 {
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
      boolean a=lucky13(m);
      System.out.println("The boolean value is "+a);
  	}
	public static boolean lucky13(int[] nums)
	{
		boolean c=true;
		for(int i:nums)
		{
			if(i==1 || i==3)
				c=false;
		}
		return c;
	}

}
