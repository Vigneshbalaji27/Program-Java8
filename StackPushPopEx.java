package com.vikki.pgm;

import java.util.*;
public class StackPushPopEx {

	public static void main(String[] args) {
		
	Stack<Integer> stk=new Stack<Integer>();
	System.out.println("stack "+stk);
	
	pushelmnt(stk,20);
	pushelmnt(stk, 13);  
	pushelmnt(stk, 89);  
	pushelmnt(stk, 90);  
	pushelmnt(stk, 11);  
	pushelmnt(stk, 45);  
	pushelmnt(stk, 18);  
	
	popelmnt(stk);  
	popelmnt(stk); 
	
	try {
		popelmnt(stk);
	}
	catch(EmptyStackException e) {
		System.out.println("The stack is empty");
	}
	
	}
	
	static void pushelmnt(Stack stk,int x)
	{
		stk.push(new Integer(x));
		System.out.println("Push-> "+x);
		
		System.out.println("Stack "+stk);
	}
	
	static void popelmnt(Stack stk)
	{
		System.out.println("Pop -> ");
		Integer x1=(Integer) stk.pop();
		System.out.println("x1 is "+x1);
		
		System.out.println("Stack "+stk);
	}
}
