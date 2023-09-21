package com.vikki.pgm;
public class TestByte
{  
	TestByte(int a, int b)  
    {  
        System.out.println("a = "+a+" b = "+b);  
    }  
    TestByte(int a, float b)  
    {  
        System.out.println("a = "+a+" b = "+b);  
    }  
    public static void main (String args[])  
    {  
        byte a = 10;   
        byte b = 15;  
        TestByte test = new TestByte(a,b);  
    }  
}  