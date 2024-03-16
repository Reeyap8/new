package com.pack1;

class C
{
	void num(int a){
		System.out.println(a);
	}
}

class B extends C
{
	void num(int a){
		System.out.println(a);
		
	}
}


public class Main4 
{
	public static void main(String[] args) 
	{
		B ob = new B();
		ob.num(40);
	}
}

