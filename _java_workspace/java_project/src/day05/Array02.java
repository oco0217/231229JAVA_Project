package day05;

import java.util.Scanner;

public class Array02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 5명의 점수를 입력할 수 있는 배열을 생성
		 * 5명의 점수를 입력받아서 배열에 저장
		 * 점수를 출력 => 평균
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int[] score = new int[5];
		
		int sum = 0;
		for(int i=0; i<1; i++) {

			System.out.println(i+1+"번째의 점수를 입력해주세요 =>");
				System.out.println(score[i] + "점 ");
				score[i] = scan.nextInt();
				sum+=score[i];
		}
		
		double avg = (double)sum/score.length;
		System.out.printf("점수 합계 : %d점%n평균 : %.2f점%n",sum,avg);
		
		scan.close();
	}

}
