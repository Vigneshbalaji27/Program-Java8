import java.util.Scanner;

public class MakeAbba 
{
	public static void main(String[] args) 
	{	
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of string a : ");
		String  a=s.nextLine();
		System.out.println("Enter the value of string b : ");
		String  b=s.nextLine();
		String  c=makeAbba(a,b);
		System.out.println("The modified string is "+c);
	}
	public static String makeAbba(String a, String b) 
	{
		  return a+b+b+a;
	}

}
