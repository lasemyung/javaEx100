package ex100;

import java.util.Scanner;

public class ex79 {

	public static void main(String[] args) {
		
//		주어지는 문장의 대문자를 소문자로, 소문자를 대문자로 변경하는 프로그램을 작성하라.

		
	    Scanner scan = new Scanner(System.in);
		System.out.println("입력하세요:");
		String str = scan.nextLine();
		
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			
			if( c >= 'a' && c <= 'z') { //영소문자
				System.out.print( (char)(c - 32) );
			}else if( c >= 'A' && c <= 'Z') {//영대문자
				System.out.print( (char)(c + 32) );
			}else { //숫자나 특수문자
				System.out.print(c);
			}
			
		}
	}

}