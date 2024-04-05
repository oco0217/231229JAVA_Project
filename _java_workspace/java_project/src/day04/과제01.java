package day04;

import java.util.Scanner;

public class 과제01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		
		int random = 0; //주사위값 (랜덤수)를 저장할 변수
		int sum = 0; //거리 누적 값
		int count = 0; //주사위 던진 횟수 누적
		int last = 30;
		
		System.out.println("게임시작!! 아무키나 눌러주세요 =>");
		
		while(sum < last) {  //거리 누적값이 최종 목적지보다 작다면 
			scan.nextLine(); //enter를 이용하여 주사위를 던질 수 있게 해줌
			random = (int)(Math.random()*6)+1;  //1~부터 6까지 랜덤 수 저장
			//발생값 거리 합산
			 sum+= random;
			 count++;
			 System.out.println("주사위 : " + random);
			 System.out.println(random+"칸 전진 => " + (last-sum)+"칸 남았습니다");
			
			
		}
		
		System.out.printf("도착~, 총 이동횟수 : " + count);
		
		scan.close();
	}

}
