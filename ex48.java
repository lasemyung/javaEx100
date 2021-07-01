package ex100;

import java.util.Scanner;

public class ex48 {

	public static void main(String[] args) {
		
//		주민등록번호는 생년월일과 성별정보, 지역정보로 이루어진다.
//		여기서 생년월일과 성별정보만 입력으로 받겠다.
//		성별 정보는 1이면 1900년대 출생 남자, 2이면 1900년대 출생 여자, 3이면 2000년대 출생 남자, 4이면 2000년대 출생 여자를 말한다.
//		기준년도는 2018년도이다. 현재 나이를 출력하시오. 
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("생년월일과 성별정보를 입력해 주세요");
		
		int birth = scan.nextInt();
		int gender = scan.nextInt();
		
		int birth_year;
		int[] birthArray = new int[5];
		
		if (gender == 1 || gender == 2) {
			birth_year = 1900 + birth / 10000;
		} else {
			birth_year = 2000 + birth / 10000;
		}
		
		int age = 2021 - birth_year;
		System.out.println("나이 :" + age );
	}
	
	

}
