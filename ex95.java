package ex100;

import java.util.Scanner;

public class ex95 {

	public static void main(String[] args) {

		int[] counts = new int[26];
		// counts[0] <- a갯수
		// counts[1] <- b갯수
		String str = "Elice! watch out!";
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c >= 'a' && c <= 'z') {
				int index = c - 97;// a -> 0
				System.out.println("i" + index);
				counts[index]++;
			}
		}
		for (int i = 0; i < counts.length; i++) {
			System.out.println((char) ('a' + i) + ":" + counts[i]);
		}

	}

}
