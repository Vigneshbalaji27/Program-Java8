package com.vikki.pgm;

public class Testcons   
{  
    int test_a, test_b;  
    Testcons(int a, int b)   
    {  
    test_a = a;   
    test_b = b;   
    }  
    public static void main (String args[])   
    {  
    	Testcons test = new Testcons(12,54);   
        System.out.println(test.test_a+" "+test.test_b);  
    }  
}  