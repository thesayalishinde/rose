package Test;

import java.util.Scanner;

public class Student {
	int Id;
	String Name;
	int roll;
	int score;
	static char grade;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

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

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your ID ");
		System.out.println("Enter your name");
		System.out.println("Enter Your Roll no ");
		System.out.println("Enter Your score ");

		int Id = sc.nextInt();
		// String Name = sc.nextLine();
		String Name = sc.next();
		int roll = sc.nextInt();
		int score = sc.nextInt();

		Student s = new Student();
		s.setId(Id);
		s.setName(Name);
		s.setRoll(roll);
		s.setScore(score);

		/*
		 * if (score >= 90) { grade = 'A'; } else if (score >= 80) { grade = 'B'; } else
		 * if (score >= 70) { grade = 'C'; } else if (score >= 60) { grade = 'D'; } else
		 * { grade = 'F'; }
		 */

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
		System.out.println("Id is" + s.getId() + " \n Name is" + s.getName() + "\n Roll no. is" + s.getRoll());
	sc.close();	
	}

}
