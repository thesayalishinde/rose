package operators;

public class InstanceO {
	
	public static void main(String[] args) {

        SuperClass obj1 = new SuperClass();
        SuperClass obj2 = new Child();

        System.out.println("obj1 instanceof Parent: "
            + (obj1 instanceof SuperClass));
        System.out.println("obj1 instanceof Child: "
            + (obj1 instanceof Child));
        System.out.println("obj1 instanceof MyInterface: "
            + (obj1 instanceof ExInter));
        System.out.println("obj2 instanceof Parent: "
            + (obj2 instanceof SuperClass));
        System.out.println("obj2 instanceof Child: "
            + (obj2 instanceof Child));
        System.out.println("obj2 instanceof MyInterface: "
            + (obj2 instanceof ExInter));
    }
}
class SuperClass {}
class Child extends SuperClass implements ExInter {}
interface ExInter {}