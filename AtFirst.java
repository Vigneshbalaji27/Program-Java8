import java.util.Scanner;
public class AtFirst
{

   public static void main(String[] args) 
   {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the String Name ;");
      String s1=s.nextLine();
      String s2=atFirst(s1);
      System.out.println("The modified String is "+s2);
   }
   public static String atFirst(String str)
   {
	   return str.length()<2?str+"@":str.substring(0,2);
   }
 }

