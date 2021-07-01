package java_ex100;

import java.util.Scanner;

public class ex32 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("문자 입력");
		char a = scan.next().charAt(0);
		
		switch(a) {
		case 'A' :
			System.out.println ( "best!");
			break;
		case 'B' :
			System.out.println ( "good!");
			break;
		case 'C' :
			System.out.println ( "run!");
			break;
		case 'D' :
			System.out.println ( "slowly~");
			break;
		default :
			System.out.println ( "what?");
			break;
		}
	}

}
