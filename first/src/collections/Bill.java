package collections;

public class Bill {

	int meterId;
	String name;
	String address;
	
	
	public Bill(int meterId, String name, String address) {
		super();
		this.meterId = meterId;
		this.name = name;
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Bill [meterId=" + meterId + ", name=" + name + ", address=" + address + "]";
	}

	
	@Override
	public int hashCode() {
		return meterId;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bill other = (Bill) obj;
		if (meterId != other.meterId)
			return false;
		return true;
	}

	public static void main(String[] args) {
		Bill b1 = new Bill(101,"Kaz","Mumbai");
		Bill b2 = new Bill(102,"Inej","Pune");
		System.out.println(b1);
		System.out.println(b2);
		System.out.println("The Equals method returns :"+b1.equals(b2));
		System.out.println("The Hashcode of obj1 :"+b1.hashCode());
		System.out.println("The Hashcode of obj2 :"+b2.hashCode());
		
	}

}
