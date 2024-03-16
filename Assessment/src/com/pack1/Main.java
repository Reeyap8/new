package com.pack1;


class Emp {
	String name = "Reeya";
	int id = 1;
	double salary = 30000;
	String add = "Kandivali";

	void showInfo() {
		System.out.println(name);
		System.out.println(id);
		System.out.println(salary);
		System.out.println(add);
	}


}

public class Main {
	public static void main(String[] args) {

		Emp emp = new Emp();
		emp.showInfo();
		
	}
}
