package Strings;

public class StrBuiEx {
	public static void main(String[] args) {
		StringBuilder ss = new StringBuilder();
		ss.append("Phewwww");
		ss.append(false);
		ss.append('A');
		char chr[] = new char[2];
		chr[0]='a';
		chr[1]='b';
		ss.append(chr);
		ss.append("AFJHKJHIHIH");
		ss.append(2.67);
		System.out.println(ss.toString());
		StringBuilder s1 = new StringBuilder("Mister Brekker, I hope you’re not feeling too poorly.");
		StringBuilder s2 = new StringBuilder(20);
		StringBuilder s3 = new StringBuilder(s1);
		System.out.println(s1+ "\n" +s2.capacity()+ "\n" +s3);
		System.out.println("Length Before "+s1.length());
		s1.setLength(67);
		System.out.println("Length After setLength(): " + s1.length()+ "\t" +s1);
		s1.setLength(20);
		System.out.println("Length After setLength(): " + s1.length()+ "\t" +s1);
		s1.ensureCapacity(20);
		s1.delete(15, 20);
		System.out.println("Length After delete(): " + s1.length()+ "\t" +s1);
		s1.deleteCharAt(13);
		System.out.println("Length After deleteCharAt(): " + s1.length()+ "\t" +s1);
		
		
		
		StringBuffer SS = new StringBuffer();
		SS.append("Phewwww");
		SS.append(false);
		SS.append('A');
		SS.append(chr);
		SS.append("AFJHKJHIHIH");
		SS.append(2.67);
		System.out.println(SS.toString());
		StringBuffer S1 = new StringBuffer("Mister Brekker, I hope you’re not feeling too poorly.");
		StringBuffer S2 = new StringBuffer(20);
		StringBuffer S3 = new StringBuffer(s1);
		System.out.println(S1+ "\n" +S2.capacity()+ "\n" +S3);
		System.out.println("Length Before "+s1.length());
		S1.setLength(67);
		System.out.println("Length After setLength(): " + S1.length()+ "\t" +S1);
		S1.setLength(20);
		System.out.println("Length After setLength(): " + S1.length()+ "\t" +S1);
		S1.ensureCapacity(20);
		S1.delete(15, 20);
		System.out.println("Length After delete(): " + S1.length()+ "\t" +S1);
		S1.deleteCharAt(13);
		System.out.println("Length After deleteCharAt(): " + S1.length()+ "\t" +S1);
		
		
	}
}
