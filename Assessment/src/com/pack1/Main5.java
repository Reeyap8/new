package com.pack1;

abstract class D {
	static void meth1() {
		System.out.println("A");
	}

	void meth2() {
		System.out.println("B");
	}

	abstract void meth3();

}

class E extends D {
	@Override
	void meth3() {
		System.out.println("Abstract");

	}
}

public class Main5 {
	public static void main(String[] args) {

		E ob = new E();
		ob.meth2();
		ob.meth3();
		E.meth1();
	}
}

