import java.util.Scanner;

public class Diff21
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int n=sc.nextInt();
		int b=diff21(n);
		System.out.println("The final difference is "+b);
	}
	public static int diff21(int n)
	{
		/*int g=Math.abs(n);
		if(g<21)
		return Math.abs(21-g);
		else
		{
		int a=Math.abs(g-21);
		return a*2;
		}*/
		return n>21?2*(n-25):21-n;
	}
}
