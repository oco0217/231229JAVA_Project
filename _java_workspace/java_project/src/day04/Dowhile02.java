package day04;

import java.util.Scanner;

public class Dowhile02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*메뉴 구성
		 * do~while()문을 많이 사용함.
		 * menu 1.저장하기 2.새로만들기 3.종료하기
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int menu = 0;
		
		do {
			System.out.println("--메뉴--");
			System.out.println("1.게임하기 | 종료하기");
			menu = scan.nextInt();
			
			//실제 기능을 구현하는 처리문
			switch(menu) {
			case 1:
				//실제 기능을 구현하는 처리문
				System.out.println("저장되었습니다.");
				break;
			case 2:
				System.out.println("새로 만들었습니다.");
				break;
			case 3:
				System.out.println("종료합니다..");
				break;
			default :
				System.out.println("잘못된된 메뉴입니다..");
				break;

			}
		}while(menu !=3);
		System.out.println("프로그램을 종료합니다.");

		scan.close();
	}

}
