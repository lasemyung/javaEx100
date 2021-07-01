package ex100;

import java.util.Scanner;

public class ex61 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자 입력");
		int number1 = scan.nextInt();
		System.out.println("연산자 입력");
		String cal = scan.next();
		System.out.println("숫자 입력");
		int number2 = scan.nextInt();
		
		switch(cal) {
		case"+" :
			System.out.println(number1 + "+" + number2 + "=" + (number1+number2));
			break;
		case "-" :
		   System.out.println(number1 + "-" + number2 + "=" + (number1-number2));
		   	break;
		case"*" :
			System.out.println(number1 + "*" + number2 + "=" + (number1*number2));
			break;    
		case"/" :
			System.out.println(number1 + "/" + number2 + "=" + ((float)number1/(float)number2));
			break;	
		}
		
	}

}
