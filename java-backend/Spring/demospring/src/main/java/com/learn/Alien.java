package com.learn;

public class Alien {
	private int age;
	private Computer com;
	
//	public Alien(int age) {
//		super();
//		this.age = age;
//	}
//
//
//	public Alien(Laptop laptop) {
//		super();
//		this.laptop = laptop;
//	}

	
	public void setAge(int age) {
		System.out.println("Set Age");
		this.age = age;
	}

	
	public Computer getCom() {
		return com;
	}

	public void setCom(Computer com) {
		this.com = com;
	}

	public int getAge() {
		return age;
	}
	
	public void run() {
		com.code();
	}
}
