package com.pack1;

class A
{
	void num(int a){
		System.out.println(a);
	}

	void num(int a, int b){
		System.out.println(a+b);
	}
}


public class Main3 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");

		A ob = new A();
		ob.num(10);
		ob.num(10,20);
	}
}

