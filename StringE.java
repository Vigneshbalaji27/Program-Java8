import java.util.Scanner;
public class StringE
{

   public static void main(String[] args) 
   {
      Scanner s=new Scanner(System.in);
      System.out.println("enter the String Name ;");
      String s1=s.nextLine();
      String s2=s1.toLowerCase();
      StringE t=new StringE();
      boolean b=t.stringE(s2);
      System.out.println("boolean b = "+b);
      
  }
  public boolean stringE(String s)
  {
      int count=0;
      for (int i=0;i<s.length();i++ )
      {
      		char c=s.charAt(i);
      		if(c=='e')
      		{
      			count++;
      		}
      }
      		if(count==1 || count ==3)
  			{
  				return true;
  			}
  			return false;
      
  }
}