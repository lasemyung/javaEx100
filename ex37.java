package java_ex100;

import java.util.Scanner;

public class ex37 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("숫자 입력");
		int n = scan.nextInt();

//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < n; j++) {
//				System.out.println("*");
//			}
//
//			System.out.print("*");
//		줄바꿈 표시 안함
		
			for(int i = 0; i<n; i++) {
				for(int j = 0; j<n; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
	}
}
