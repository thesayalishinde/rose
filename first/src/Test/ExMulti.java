package Test;

public class ExMulti {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();
		a.setName("sayali");
		System.out.println("Class A is here \n "+a.getName());
		b.print();
		b.setName("Rose");
		System.out.println(b.getName());
		c.print();
		c.setName("Sun");
		System.out.println(c.getName());
	}
}

class A {
	String name;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}

class B extends A {
	public void print() {
		System.out.println("Class B Extends A here.");
	}

	String name;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}

class C extends B {
	String name;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void print() {
		System.out.println("Class C Extends B here.");
	}

}