package com.vikki.pgm;

class Adder{  
static int add(int a,int b){return a+b;}  

}  
class TestOverloading3{  
public static void main(String[] args){  
System.out.println(Adder.add(11,11));//ambiguity  
}}  