import java.util.Scanner;
public class ScoresIncreasing
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
      boolean b=scoresIncreasing(m);
      System.out.println("");
      System.out.println("The value is "+b);
  	}
	public static boolean scoresIncreasing(int[] scores)
	{
		/*for(int i =1;i<scores.length;i++)
		{
			if(scores[i]<scores[i-1])
				return false;
		}
				return true;*/
		int y=0;
		for(int x:scores)
		{if(x>y)
		y=x;
		else
		return false;}
		return true;
	
			
		
	}
}
