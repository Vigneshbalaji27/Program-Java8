package com.vikki.pgm;

class TestAnnonymousInner1{  
	 public static void main(String args[]){  
	 Eatable e=new Eatable(){  
	  public void eat(){System.out.println("nice fruits 1");}  
	 };  
	 e.eat();  
	 }  
	}  