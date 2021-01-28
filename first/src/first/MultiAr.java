package first;

import java.util.Scanner;

public class MultiAr {
	static int[][] arr = { { 1, 2 }, { 3, 4 } };
	static int[][] multiDimensionalArr = new int[3][2];

	public void arr() {
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
		
	}

	void initializeElements() {
		Scanner sc = new Scanner(System.in);
		for (int outer = 0; outer < multiDimensionalArr.length; outer++) {
			for (int inner = 0; inner < multiDimensionalArr[outer].length; inner++) {
				multiDimensionalArr[outer][inner] = sc.nextInt();
			}
		}
		sc.close();
	}

	void printNew() {
		for (int outer = 0; outer < multiDimensionalArr.length; outer++) {
			for (int inner = 0; inner < multiDimensionalArr[outer].length; inner++) {
				System.out.print(multiDimensionalArr[outer][inner]+ " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		System.out.println(arr[0][1]);
		MultiAr a = new MultiAr();
		a.arr();
		System.out.println("Enter array elems");
		a.initializeElements();
		a.printNew();

	}
}
