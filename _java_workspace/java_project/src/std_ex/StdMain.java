package std_ex;

import java.util.Scanner;

public class StdMain {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		StdManager sm = new StdManager();
		sm.add();

		int menu = 0;

		do {

			System.out.println("----------------menu----------------");
			System.out.println(
					"1.학생추가 | 2.학생리스트 | 3.학생검색\r\n" + "4.학생수정 | 5.학생삭제| " + "6.점수추가 \r\n7.점수수정 | 8.점수삭제 | 9.종료");
			System.out.println("메뉴>");
			menu = scan.nextInt();

			switch (menu) {

			case 1:
				sm.addStd(scan);
				break;
			case 2:
				sm.printStudent();
				break;
			case 3:
				sm.seachStd(scan);
				break;
			case 4:
				sm.modStd(scan);
				break;
			case 5:
				sm.delStd(scan);
				break;
			case 6:
				sm.addSub(scan);
				break;
			case 7:
				sm.modSub(scan);
				break;
			case 8:
				sm.delSub(scan);
				break;
			case 9:
				System.out.println("종료 중");
				break;
			default:
				break;
			}

		} while (menu != 9);

		System.out.println("프로그램이 종료되었습니다.");
		
		scan.close();

	}

}
