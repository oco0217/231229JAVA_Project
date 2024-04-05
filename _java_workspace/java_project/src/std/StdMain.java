package std;

import java.util.Scanner;

public class StdMain {

	public static void main(String[] args) {
		// 메뉴 구성

		Scanner scan = new Scanner(System.in);
		
		StdManager user = new StdManager(); 

		int menu = 0;

		do {
			System.out.println(
					"1.학생추가 | 2.학생리스트 | 3.학생검색\r\n" + "4.학생수정 | 5.학생삭제 | 6.점수추가 \r\n" + "7.점수수정 | 8.점수삭제 | 9.종료");

			System.out.println("메뉴 선택=>");
			menu = scan.nextInt();

			switch (menu) {
			case 1:
				user.addStd(scan);
				break;
			case 2:
				user.printStd();
				break;
			case 3:
				user.seachStd(scan);
				break;
			case 4:
				user.modStd(scan);
				break;
			case 5:
				user.delStd(scan);
				break;
			case 6:
				user.addSub(scan);
				break;
			case 7:
				user.modSub(scan);
				break;
			case 8:
				user.delSub(scan);
				break;
			case 9:
				System.out.println("종료중...");
				break;
			default:
				System.out.println("잘못 입력된 값입니다.");
				break;
			}

		} while (menu != 9);
		
		System.out.println("프로그램이 종료되었습니다.");

		scan.close();

	}

}
