import java.util.Scanner;
public class Only14
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
      boolean b=only14(m);
      System.out.println("The boolean value b = "+b);
     }
	public static boolean only14(int[] nums) 
	{
		  boolean flag=true;
		  for(int e:nums)
		  {
			  if(!(e==1||e==4))
					  return false;
		  }
		  return true;
	}
}

