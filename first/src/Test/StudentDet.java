package Test;

import java.util.Scanner;

import ioexamples.Employee;

public class StudentDet {

	int Id;
	String Name;
	int roll;
	int score;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many student details you want to store ");
		int count = sc.nextInt();
		Employee e[] = null;
		char choice;
		do {
			System.out.println("....Menu....");
			System.out.println("A. Add student details ");
			System.out.println("B. Print the detail of student ");
			System.out.println("C. Print the detail of student who have grade A : ");
			System.out.println("D. exit : ");
			choice = sc.next().charAt(0);

			switch (choice) {
			case 'A':
				e = new Employee[count];
				for (int i = 0; i < e.length; i++) {
					e[i] = new Employee();
					System.out.println("Enter ID ");
					e[i].setID(sc.nextInt());
					System.out.println("Enter name");
					e[i].setName(sc.next());
					System.out.println("Enter Roll no ");
					e[i].setRoll(sc.nextInt());
					System.out.println("Enter score ");
					e[i].setScore(sc.nextInt());
				}
				
				break;
			case 'B':
				for (int i = 0; i < count; i++) {
					System.out.println(
							"Name :" + e[i].getName() + " Roll :" + e[i].getRoll() + " Score :" + e[i].getScore());
				}
				break;
			case 'C':
				for (int i = 0; i < count; i++) {
					if (e[i].getScore() == 90) {
						System.out.println(
								"Name :" + e[i].getName() + " Roll :" + e[i].getRoll() + " Score :" + e[i].getScore());
					}
				}
				break;
			default:
				System.out.println("okay thanks ");
				break;

			}

		} while (choice != 'D');
		sc.close();
	}
	
}
