import java.util.Scanner;
public class TwoAsOne
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
      	System.out.println("enter the value of a : ");
      	int a=s.nextInt();	
      	System.out.println("enter the value of b : ");
      	int b=s.nextInt();	
      	System.out.println("enter the value of c : ");
      	int c=s.nextInt();	
      	boolean v=twoAsOne(a,b,c);
      	System.out.println("The boolean value is "+v);
      	
	}
	public static boolean twoAsOne(int a, int b, int c) 
	{
		if((a==b+c)||(b==c+a)||(c==a+b))
			return true;
			else
				return false;
	}
}
