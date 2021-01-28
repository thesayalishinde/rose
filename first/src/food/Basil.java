package food;

public class Basil extends Plants {

	Leaf l;
	public String getLeafColour() {
		l =new Leaf();
		return l.getLeafType();
		
	}
	public static void main(String[] args) {
		Basil b = new Basil();
		System.out.println(b.getPlantlength());
		System.out.println(b.getLeafColour());

	}

}
