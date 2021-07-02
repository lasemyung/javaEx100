package ex100;

import java.util.ArrayList;
import java.util.Scanner;

public class ex74 {

	public static void main(String[] args) {
		

		Scanner scan = new Scanner(System.in);
		ArrayList arr = new ArrayList();
		System.out.println("약수를 구할 숫자 입력");
		
		int num = scan.nextInt();
		for ( int i = 1; i < num+1; i++) {
			if ( num%i == 0 ) {
				System.out.println( " " + i);
			}
	}

}	
}