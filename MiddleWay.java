import java.util.Scanner;
public class MiddleWay
{
	public static void main(String[] args) 
  	{
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the value of 1st array k = ");
      int k=s.nextInt();
      int[]  m=new int[k];
      for (int i=0;i<m.length;i++) 
      {
         System.out.println("Please Enter the number "+i +" = ");
         m[i]=s.nextInt();
      }
      System.out.println("Enter the value of 2nd array l = ");
      int l=s.nextInt();
      int[]  n=new int[l];
      for (int i=0;i<n.length;i++) 
      {
         System.out.println("Please Enter the number "+i +" = ");
         n[i]=s.nextInt();
      }
      int[] t=middleWay(m, n);
      System.out.println("The modified array is ");
      System.out.print("[");
      for(int t1:t)
      {
  		System.out.print(t1+",");
      }
      System.out.print("]");
  	}
	public static int[] middleWay(int[] a,int[] b)
	{
		int mid1=(a.length/2);
		int mid2=(b.length/2);
		int[] c=new int[2];
		c[0]=a[mid1];
		c[1]=b[mid2];
		return c;
	}
}
      
