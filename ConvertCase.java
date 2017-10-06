import java.util.Scanner;

public class ConvertCase 
{
	public static void main(String[] args) 
	   {
	      Scanner s=new Scanner(System.in);
	      System.out.println("Enter the String Name ;");
	      String s1=s.nextLine();
	      String b=convertCase(s1);
	      System.out.println("The value of b = "+b);
	   }
	public static String convertCase(String s)
	{
		/*StringBuffer sb=new StringBuffer(s);
		char c[]=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			if(s.upp)
		}
		return sb.toString();
		*/
		/*for(char c: s.toCharArray()){
			if((int)c>=65 && (int)c<=90)
			s=s.replace(c, (char)(c+32));
			if((int)c>=97 && (int)c<=122)
			s=s.replace(c, (char)(c-32));
			}
		return s;*/
		/*
		String str="";
		for(char x:s.toCharArray())
		{
			if((int)x>=97)
			x=Character.toUpperCase(x);
			else
			x=Character.toLowerCase(x);
			str=str+x;
		}
		return str;*/
		
		String str ="";
        char ch[]=s.toCharArray();
      for(int i=0;i<ch.length;i++)
       {
        if(Character.isUpperCase(ch[i]))
             str=str+Character.toLowerCase(ch[i]);
               
         else if(Character.isLowerCase(ch[i]))
              str=str+Character.toUpperCase(ch[i]);
           else
             str=str+ch[i];
     }return str;
		
	}

}
