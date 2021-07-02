package ex100;

import java.util.Scanner;

public class ex70 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("시작값");
		int a = scan.nextInt();
		
		System.out.println("등비 값");
		int b = scan.nextInt();
		
		System.out.println("몇 번째?");
		int c = scan.nextInt();
		
		int multi = a;
		for ( int i = a; i < c; i ++) {
			multi = multi*b;
			System.out.println(multi);
		}
	}

}
