package day09;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 야구게임 컴퓨터가 3자리의 숫자를 생성(각 자리수는 1~9까지의 수) => 배열로 랜덤 저장(중복 불가능) 유저는 3자리의 숫자를 맞추는
		 * 게임 => 직접 입력(중복되지 않게...) 자리와 숫자가 일치하면 strike 숫자만 맞으면 ball 아무것도 안맞으면 out ex)컴퓨터
		 * 생성 번호 : 1 2 3 사용자 번호 : 1 7 8 => 1s 사용자 번호 : 1 3 2 => 1s 2b 사용자 번호 : 7 8 9 =>
		 * out 사용자 번호 : 1 2 3 => 3s정답.
		 */

		Scanner scan = new Scanner(System.in);
		
		int strike = 0;
		int ball = 0;
		int count = 0;
		

		int[] com = new int[3];
		

		while(count<com.length) {
			
			int random = (int)(Math.random()*10)+1;
			
			if(!check(com,random)) {
				
				com[count] = random;
				count++;
			}
		}
		for(int s : com) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		while(strike!=3) {
			
			int[] my = new int[3];
			
			strike = 0;
			ball = 0;
			
			System.out.println("숫자를 각각 3개씩 입력해주세요 =>");
			for(int i=0; i<my.length; i++) {
				my[i] = scan.nextInt();
			}
			
			for(int i=0; i<my.length; i++) {
				for(int j=0; j<my.length; j++) {
					
					if(com[i]==my[j]) {
						ball++;
						if(com[i]==my[i]) {
							strike++;
							ball--;
						}
					}
				}
			}
			if(ball==0&&strike==0) {
				System.out.println("아웃입니다.");
			}else {
			System.out.println("ball : " + ball);
			System.out.println("strike : " + strike);
			}
		}
		
		System.out.println("축하합니다 야구게임에 승리하셨습니다!");
		
		
			

		scan.close();
	}
	
	public static boolean check(int[] arr, int random) {
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==random) {
				return true;
			}
		}
		
		return false;
	}
}
