package ex100;

import java.util.Scanner;

public class ex62 {

	public static void  main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("학년을 입력하세요");
		int number1 = scan.nextInt();
		
		System.out.println("반을 입력하세요");
		int number2 = scan.nextInt();
		
		System.out.println("번호를 입력하세요");
		int number3 = scan.nextInt();
		
		System.out.print(number1);
		System.out.printf("%02d", number2);
		System.out.printf("%03d" , number3);
	}

}
