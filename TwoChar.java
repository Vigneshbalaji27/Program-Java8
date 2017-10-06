import java.util.Scanner;

public class TwoChar 
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of string : ");
		String  a=s.nextLine();
		System.out.println("Enter the value of index : ");
		int  i=s.nextInt();
		String b=twoChar(a,i);
		System.out.println("The output String is "+b);
	}
	public static String twoChar(String str, int index) 
	{	
		/*if(index>=str.length() || index<0 || (str.length()-index==1))
		{
			return str.substring(0, 2);
		}
		else
			return str.substring(index,index+2);*/
		
		//return (str.length()-1)<=index?str.substring(0,2):str.charAt(index)+""+str.charAt(index+1);
		return (str.length()-index)>=2?(""+str.charAt(index)+str.charAt(index+1)):str.substring(0,2);
	/*
		int l=str.length()-1;
		if(index>l||index<0||index>l-1)
		return str.substring(0,2);
		else
		return str.substring(index,index+2);*/
	}



}
