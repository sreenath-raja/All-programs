package org.test;

public class Hello {
public Hello() {
this("JAVA");
System.out.println("Default const...");
}

public Hello(int id) {
this(3456.5678f);
System.out.println(id);
}

public Hello(String name) {
this(12);
System.out.println(name);
}

public Hello(float sal) {
System.out.println(sal);
}

public static void main(String[] args) {
Hello a = new Hello();
}
}
