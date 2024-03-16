package com.pack1;

interface I {
	int a = 10;

	void meth();

}

class Int implements I {
	@Override
	public void meth() {
		System.out.println("Interface");

	}
}

public class Main6 {
	public static void main(String[] args) {
		Int d = new Int();
		d.meth();
	}
}



