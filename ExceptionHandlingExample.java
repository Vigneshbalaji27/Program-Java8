package com.vikki.pgm;

public class ExceptionHandlingExample {  
public static void main(String args[])  
{  
    try  
    {  
        int a = 1/0;  
        System.out.println("a = "+a);  
    }  
    catch(Exception e){System.out.println(e);}  
   
}  
}  