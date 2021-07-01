package ex100;

import java.util.Scanner;

public class ex46 {

	public static void main(String[] args) {
		
		int car = 170;
		int[] tunnel = new int[3];
		Scanner scan = new Scanner(System.in);
		for ( int i = 0; i < tunnel.length; i++) {
			System.out.println("터널의 높이를 입력하세요");
			tunnel[i] = scan.nextInt();
			
			if ( tunnel[i] > 170 ) { 
				System.out.println("pass");
			} else {
				System.out.println("crash");
			}
		}
	}

}
