import java.util.Scanner;

public class Close10 {
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value of a : ");
		int a=s.nextInt();
		System.out.println("enter the value of b : ");
		int b=s.nextInt();
		int c=close10(a,b);
		System.out.println("The value of c "+c);
	}
	public static int close10(int a,int b)
	{
		int d=Math.abs((10-a))-(Math.abs(10-b));
		System.out.println("d = "+d);
		if(d==0)
			return 0;
		else 
			return d<0?a:b;
			
			/*if(Math.abs(a-10)==Math.abs(b-10))
				return 0;
				else
				return a%10>b%10?a:b;*/
		/*int x,y;
		if(a>10)
		x=a-10;
		else
		x=10-a;
		if(b>10)
		y=b-10;
		else
		y=10-b;
		if(x>y)
		return b;
		else if(x<y)
		return a;
		else
		return 0; */
	}
}
