package com.vikki.pgm;

class TestCon 
{  
    int i;   
    public TestCon(int k)  
    {  
        i=k;  
    }  
    public TestCon(int k, int m)  
    {  
        System.out.println("Hi I am assigning the value max(k, m) to i");  
        if(k>m)  
        {  
            i=k;   
        }  
        else   
        {  
            i=m;  
        }  
    }  
}  
