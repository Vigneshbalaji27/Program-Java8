import java.util.Scanner;

public class TeenSum 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of a ");
		int a=s.nextInt();
		System.out.println("Enter the value of b ");
		int b=s.nextInt();
		int c=teenSum(a,b);
		System.out.println("The output value is "+c);
	}
	public static int teenSum(int a,int b)
	{
		if((a>=13 && a<=19) || (b>=13 && b<=19) )
			return 19;
		else
			return a+b;
	}
}
