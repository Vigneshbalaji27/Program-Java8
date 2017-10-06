
import java.util.Scanner;
public class FizzArray2
{
	public static void main(String[] args) 
  	{
      Scanner s=new Scanner(System.in);
      System.out.println("enter the value of k = ");
      int k=s.nextInt();
      String[] a=fizzArray2(k);
      System.out.println("");
      System.out.println("The modified array is ");
      System.out.print("[");
      for(String f:a)
      {
  		System.out.print(f+",");
      }
      System.out.print("]");
  	}
	public static String[] fizzArray2(int n) 
	{
		String[] r=new String[n];
		if(n>0)
		{
			
			for(int i=0;i<n;i++)
			{
				r[i]=i+"";
				r[i]=String.valueOf(i);
			}
		}
		return r;
		/*String [] s= new String[n];
		for(int i=0;i<n;i++)
		{s[i]=""+i;}
		return s;*/
	}
}
