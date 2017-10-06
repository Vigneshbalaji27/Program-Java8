import java.util.Scanner;

public class In3050 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of a ");
		int a=s.nextInt();
		System.out.println("Enter the value of b ");
		int b=s.nextInt();
		boolean b1=in3050(a,b);
		System.out.println("The value of b1 = "+b1);
	}
	public static boolean in3050(int a,int b)
	{/*
		boolean f=false;
		if((a>=30 && b<=40) || (a>=40 && b<=50))
		{
		return true;
		}
		return f;*/
		
		return ((a>=30 && a<=40) && (b>=30 && b<=40 )) || ((a>=40 && a<=50) && (b>=40 && b<=50 ));
	}
}
