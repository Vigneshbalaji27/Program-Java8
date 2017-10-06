import java.util.Scanner;

public class LastDigit 
{
	public static void main(String[] args) {
	 Scanner s=new Scanner(System.in);
     System.out.println("Enter the number 1");
     int k1=s.nextInt();
     System.out.println("Enter the number 2");
     int k2=s.nextInt();
     boolean b=lastDigit(k1,k2);
     System.out.println("The boolean value is = "+b);
	}
	public static boolean lastDigit(int a, int b) 
	{
		return (a%10==b%10);
	}

}
