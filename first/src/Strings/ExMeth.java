package Strings;

public class ExMeth {
	
	public static void main(String[] args) {

		String s1 = "He saw Anya rise and pick up the little boy.";
		String s2 = "Anya raised her hands and lifted the little boy";
		
		System.out.println(s1.charAt(3)+ "\n" +s1.concat(s2)+ "\n" + s1.equalsIgnoreCase(s2)+ "\n" +s1.length()+ "\n"
		+ s1.replace("and","well")+ "\n" +s2.substring(5)+ "\n" +s2.substring(5, 21)+
		"\n" +s1.toLowerCase()+ "\n" + s2.toUpperCase());
		
		//format strings
		String fs;
		fs = String.format("He saw Anya rise and pick up the little boy"
				+ "He saw Anya rise and pick up the little boy"
				+ "He saw Anya rise and pick up the little boy"
				+ "He saw Anya rise and pick up the little boy");
		System.out.println(fs);
		
		
		
		
		
		
	}
}
