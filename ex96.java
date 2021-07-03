package ex100;

import java.util.Scanner;

public class ex96 {

	public static void main(String[] args) {
		
//		가장 잘 하는 친구에게 물어보기는 질문의 내용이 너무 부끄러워 n명의 친구들 중 
//		정보 성적이 3번째로 높은 친구에게 묻고자 한다.
//		친구들의 성적은 모두 다르다.
//		n명의 친구들의 이름과 정보 성적이 주어졌을 때 성적이 
//		세 번째로 높은 학생의 이름을 출력하시오.		
		
				String[][] students = new String[50][2];
				Scanner scan = new Scanner(System.in);
				int n = 5;
				for(int i=0; i<5; i++) {
					students[i][1] = scan.next();
					students[i][0] = scan.next();
				}
				//내림차순 정렬(성적이 높은 순으로 정렬)
				for(int i=0; i<5; i++) {
					for(int j=i+1; j<5; j++) {
						int score1 = Integer.parseInt(students[i][1]);
						int score2 = Integer.parseInt(students[j][1]);
						if(score2>score1) { //치환해야 됨.
							String temp1 = students[i][0];
							String temp2 = students[i][1];
							students[i][0] = students[j][0];//이름
							students[i][1] = students[j][1];//성적
							students[j][0] = temp1;
							students[j][1] = temp2;
						}
					}
				}
				System.out.println("세번째 학생은");
				System.out.println(students[2][0]);
				System.out.println(students[2][1]);
			}

}
