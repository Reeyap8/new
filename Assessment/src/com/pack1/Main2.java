package com.pack1;

class Emp1 {
	String name = "Reeya";
	int id = 01;
	double salary = 25000;
	static String comp = "ABC";

	void showInfo() {
		System.out.println(name);
		System.out.println(id);
		System.out.println(salary);
	}

	static void showCompany() {
		System.out.println(comp);
	}

}

public class Main2 {
	public static void main(String[] args) {

		Emp1 emp = new Emp1();
		emp.showInfo();
		Emp1.showCompany();
	}
}
