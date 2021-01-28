package ioexamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Employee implements Comparator<Employee> {
	
	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.getAddress().compareTo(o2.getAddress());
	}

/*public int compareTo(Employee emp) {
	
	if (this.ID==emp.ID)
		return 0;
	else if (this.ID > emp.ID)
		return 1;
	else
		return -1;
	
}
*/
	int ID;
	int EmployeeId;
	int age;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getEmployeeId() {
		return EmployeeId;
	}

	public void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
	}

	String name;
	int yoj;
	int salary;
	String address;
	int noh;
	int roll;
	public static int score;
		

	
	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYoj() {
		return yoj;
	}

	public void setYoj(int yoj) {
		this.yoj = yoj;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void getInfo(int salary, int noh) {
		this.salary = salary;
		this.noh = noh;
	}

	public int addSal() {
		if (salary < 300) {
			salary = salary + 10;
		}
		return salary;
	}

	public int addWork() {
		if (noh > 6) {
			salary = salary + 5;
		}
		return salary;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + EmployeeId;
		result = prime * result + ID;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + noh;
		result = prime * result + roll;
		result = prime * result + salary;
		result = prime * result + yoj;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (EmployeeId != other.EmployeeId)
			return false;
		if (ID != other.ID)
			return false;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (noh != other.noh)
			return false;
		if (roll != other.roll)
			return false;
		if (salary != other.salary)
			return false;
		if (yoj != other.yoj)
			return false;
		return true;
	}

	
	@Override
	public String toString() {
		return "Employee [ID=" + ID + ", EmployeeId=" + EmployeeId + ", age=" + age + ", name=" + name + ", yoj=" + yoj
				+ ", salary=" + salary + ", address=" + address + ", noh=" + noh + ", roll=" + roll + "]";
	}

	public static void main(String[] args) {
		
		

		Employee e1 = new Employee();
		Employee e2 = new Employee();
		System.out.println(e1);
		System.out.println(e2.getClass());
		System.out.println(e2.hashCode());
		System.out.println(e1.equals(e2));
		System.out.println(e1.hashCode());
		
		
		e1.setName("Robert");
		e1.setYoj(1997);
		e1.setAddress("D walls street");
		e1.setSalary(200);
		e1.getInfo(200, 9);
		System.out.println("Name :" + e1.getName() + " YOJ :" + e1.getYoj() + " Address :" + e1.getAddress());
		System.out.println("Original salary is" + e1.getSalary() + "Updated Salary is" + e1.addSal());
		System.out.println("Original salary is" + e1.getSalary() + "Updated Salary is" + e1.addWork());
		System.out.println();

		e1.setName("Sam");
		e1.setYoj(1977);
		e1.setAddress("R walls street");
		e1.setSalary(500);
		e1.getInfo(500, 8);
		System.out.println("Name :" + e1.getName() + " YOJ :" + e1.getYoj() + " Address :" + e1.getAddress());
		System.out.println("Original salary is" + e1.getSalary() + "Updated Salary is" + e1.addSal());
		System.out.println("Original salary is" + e1.getSalary() + "Updated Salary is" + e1.addWork());
		System.out.println();

		e1.setName("John");
		e1.setYoj(1997);
		e1.setAddress("S walls street");
		e1.setSalary(400);
		e1.getInfo(400, 6);
		System.out.println("Name :" + e1.getName() + " YOJ :" + e1.getYoj() + " Address :" + e1.getAddress());
		System.out.println("Original salary is" + e1.getSalary() + "Updated Salary is" + e1.addSal());
		System.out.println("Original salary is" + e1.getSalary() + "Updated Salary is" + e1.addWork());
		System.out.println();

		e2.setName("Robert");
		e2.setYoj(1997);
		e2.setAddress("D walls street");
		e2.setSalary(200);
		e2.getInfo(200, 9);
		System.out.println("Name :" + e2.getName() + " YOJ :" + e2.getYoj() + " Address :" + e2.getAddress());
		System.out.println("Original salary is" + e2.getSalary() + "Updated Salary is" + e2.addSal());
		System.out.println("Original salary is" + e2.getSalary() + "Updated Salary is" + e2.addWork());
		System.out.println();
		
		switch (score/10) {
		case 9:
			System.out.println("The grade is A");
			break;
		case 8:
			System.out.println("The grade is  B");
			break;
		case 7:
			System.out.println("The grade is  C");
			break;
		case 6:
			System.out.println("The grade is  D");
			break;
		default:
			if (score >= 50) {
				System.out.println("The grade is  E");
			}
			else{
				System.out.println("The grade is  F");
			}
			break;
		}
		
		ArrayList<Employee> em = new ArrayList<>();
		Employee e = new Employee();
		Employee ee = new Employee();
		Employee eee = new Employee();
		
		e.setName("Robert");
		e.setYoj(1997);
		e.setAddress("D walls street");
		e.setSalary(200);

		ee.setName("Sam");
		ee.setYoj(1977);
		ee.setAddress("R walls street");
		ee.setSalary(500);

		eee.setName("John");
		eee.setYoj(1997);
		eee.setAddress("S walls street");
		eee.setSalary(400);

		em.add(e);
		em.add(ee);
		em.add(eee);

		//Collections.sort(em);
		for (Employee o: em) {
			System.out.println("Name :" + o.getName() + " YOJ :" + o.getYoj() + " Address :" + o.getAddress()+" Salary :" + o.getSalary());
		}
	}

	
	
}
