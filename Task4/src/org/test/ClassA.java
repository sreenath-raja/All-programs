package org.test;

public class ClassA extends ClassB {

	public ClassA() {
		super("sree");
		System.out.println("Default const...");
		}

		public static void main(String[] args) {
		ClassA a = new ClassA();
		}
}
