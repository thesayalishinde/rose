package Test;

public class Person {
	private String Name; 
    private int Age; 
    private int Salary;
    
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}

	public static void main(String[] args) {
		
		Person p = new Person();
		
		p.setName("sayali");
		p.setAge(20);
		p.setSalary(10);
		
		System.out.println("Name: " + p.getName()); 
        System.out.println("Age: " + p.getAge()); 
        System.out.println("Salary: " + p.getSalary()); 

	}

}
