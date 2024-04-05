package day09;

import java.util.Scanner;

public class 가위바위보게임Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		String my;
		
		
		do {
			System.out.println("가위,바위,보자기 중 아무거나 입력해주세요.");
			System.out.println("무엇을 내실건가요? =>");
			my = scan.next();

			int random = (int) (Math.random() * 3);
			System.out.println("test : " + random);
			switch (my) {

			case "가위":
				if (random == 1) {
					System.out.println("졌습니다.");
				} else if (random == 0) {
					System.out.println("무승부입니다.");
				} else if (random == 2) {
					System.out.println("이겼습니다.");
				} else {
					System.out.println("잘못된 입력값입니다.");
				}
				break;

			case "바위":
				if (random == 2) {
					System.out.println("졌습니다.");
				} else if (random == 1) {
					System.out.println("무승부입니다.");
				} else if (random == 0) {
					System.out.println("이겼습니다.");
				} else {
					System.out.println("잘못된 입력값입니다.");
				}
				break;

			case "보자기":
				if (random == 0) {
					System.out.println("졌습니다.");
				} else if (random == 2) {
					System.out.println("무승부입니다.");
				} else if (random == 1) {
					System.out.println("이겼습니다.");
				} else {
					System.out.println("잘못된 입력값입니다.");
				}
				break;
			
			case "종료":
				System.out.println("종료 중...");
				break;

			default:
				System.out.println("잘못된 입력 값입니다.");
				break;
			}
		} while("종료" == my);
		System.out.println("게임을 종료합니다.");

		scan.close();

	}

}
