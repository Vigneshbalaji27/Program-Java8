import java.util.Scanner;
public class GetAsUnique
{

   public static void main(String[] args) 
   {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the String Name ;");
      String s1=s.nextLine();
      String b=getAsUnique(s1);
      System.out.println("The modified String is = "+b);
   }
   public static String getAsUnique(String s)
   {
	  /*String str="";
	   char [] c=s.toCharArray();
	   for(int i=0;i<s.length();i++)
	   {
		   int count=0;
		   for(int j=0;j<str.length();j++)
			   if(Character.toLowerCase(c[i])==Character.toLowerCase(str.charAt(j)))
			   {
				 System.out.println(str.charAt(j));
				 count++;
			   }
		   if(count==0)
			   str=str+c[i];
	   }
	   return str.replace(" ","");*/
	   
	
	   String str="";
	   char[] ch=s.toCharArray();
	   for(int i=0;i<s.length();i++)
	   {
		   int c=0;
		   for(int j=0;j<str.length();j++)
		   {
			   if(Character.toLowerCase(ch[i])==Character.toLowerCase(str.charAt(j)))
				   c++;
		   }
		   if(c==0)
			   str=str+ch[i];
	   }
	   return str.replace(" ","");
	   
	   
	   
	   
	   
	   
	   
	
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
   }
}
