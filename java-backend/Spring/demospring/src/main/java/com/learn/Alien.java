package com.learn;

public class Alien {
	private int age;
	private Laptop laptop;
	
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


	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	public int getAge() {
		laptop.code();
		return age;
	}

	
	public void setAge(int age) {
		System.out.println("Set Age");
		this.age = age;
	}
}
