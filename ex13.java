package java_ex100;

import java.util.Scanner;

public class ex13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		float num = scan.nextFloat();
		float num2 = Math.round( num * 1000) / 1000.0f;
		System.out.println(num2);
	}

}
