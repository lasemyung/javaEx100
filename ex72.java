package ex100;

import java.util.ArrayList;
import java.util.Scanner;

public class ex72 {

	public static void main(String[] args) {
		
//		입력의 개수 n이 입력되고 n개의  데이터가 입력된다.
//
//		이 n개의 데이터 중 최대값을 출력한다.
		
		Scanner scan = new Scanner(System.in);
		
		ArrayList arr = new ArrayList();
		int max = 0;
		
		while(true) {
			System.out.println("숫자 입력");
			int num = scan.nextInt();
			System.out.println();
			arr.add(num);
			for ( int i = 0; i <arr.size(); i++) {
				if(max <(int)arr.get(i)) {
					max = (int)arr.get(i);
				}
				System.out.print( arr.get(i) + " ");
			}
			System.out.println();
			System.out.println("입력받은 숫자의 최대값 :" + max);
		}
	}

}
