package day02;

import java.util.Scanner;

public class IF02_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수입력(0~100) : 국어,영어,수학 순으로 입력 >");
		
		int kor = scan.nextInt();
		int math = scan.nextInt();
		int eng = scan.nextInt();
		
		if(kor <0 || kor >100) {
			System.out.println("국어 점수의 범위가 벗어났습니다.");
		}
		if(math <0 || math >100) {
			System.out.println("수학 점수의 범위가 벗어났습니다.");
		}
		if(eng <0 || eng >100) {
				System.out.println("영어 점수의 범위가 벗어났습니다.");
			}
			
			int sum = kor+eng +math;
			double avg = sum /3.0;
			
			System.out.println("합계 : " + sum + "평균 : " + avg );
			
			char result = 'D';
			if(avg>100||avg<0) {
				System.out.println("잘못된 성적입니다.");
			}else if(avg>=90) {
				result = 'A';
			}else if(avg>=80) {
				result = 'B';
			}else if(avg>=70){
				result = 'C';
			}else {
				result = 'D';
			}
			System.out.println("평가 : " + result);
		scan.close();
	}
}
