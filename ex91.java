package ex100;

import java.util.Iterator;
import java.util.Scanner;

public class ex91 {
	// n개의 수를 입력받고 출력형식으로 출력하시오.
	// 1 2 3 4 5
	// 2 3 4 5 1
	// 3 4 5 1 2
	// 4 5 1 2 3
	// 5 1 2 3 4
	
	
	public static void main(String[] args) {
		System.out.println( "숫자 입력");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] nums = new int[1000];
		for (int i = 0; i < n; i++) {
			nums[i] = scan.nextInt();
		}
			
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				System.out.print(nums[j] + " ");
			}
			for (int k = 0; k < i; k++) {
				System.out.print(nums[k] + " ");
			}
			System.out.println();
		}
		
			}
		}
