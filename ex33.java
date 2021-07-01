package java_ex100;

import java.util.Scanner;

public class ex33 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("월 입력");
		int num1 = scan.nextInt();
		
		switch(num1) {
		
		case 3:
		case 4:
		case 5:
			System.out.println("spring");
			break;
			
		case 6:
		case 7:
		case 8:
			System.out.println("summer");
			break;
			
		case 9:
		case 10:
		case 11:
			System.out.println("fall");
			break;	
		
		case 12 :
		case 1 :
		case 2 :
			System.out.println("winter");
			break;	
		}
	}

}
