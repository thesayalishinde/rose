package first;

abstract class Employee {

	int employeeId;
	String employeeName;
	//private int age;
	//public int salary;
	String location;
	
	final int getEmployeeId() {
		return employeeId;
	}
	final void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	/*static String getEmployeeName() {
		return employeeName;
	}
	static void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}*/
	abstract int setAge (int a);
	
	/*public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {

		this.age = age;
	}*/

	
}
class Manager extends Employee {
	
		private String Department;

		public String getDepartment() {
			return Department;
		}

		public void setDepartment(String department) {
			Department = department;
		}
		public int setAge(int a) {
			return a;
		}

		public static void main(String[] args) {
			/*		Employee e = new Employee();
			 e.setEmployeeId(1);
			 e.setEmployeeName("sayali");
			 e.setAge(20);
			 
			 System.out.println("ID"+e.getEmployeeId()+ "/Name" +e.getEmployeeName()+ 
					 "/Age" +e.getAge());
	*/	   
		     Manager m = new Manager();
			 m.setEmployeeId(1);
			 //m.setEmployeeName("sayali");
			 //m.setAge(20);
			 //m.setDepartment("HR");
			 System.out.println("ID"+m.getEmployeeId());
			 System.out.println("/ Department" +m.getDepartment());
			 //System.out.println("/Name" +m.getEmployeeName());
			 System.out.println(m.setAge(20));
		
		}
		 
}

