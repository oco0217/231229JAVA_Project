package studentManager;

import java.util.Scanner;

public class StudentMain {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
		
		StudentManager user = new StudentManager();
		
		
		int menu = 0;
		do{
			System.out.println("---메뉴---");
			System.out.println("1.학생등록 | 2.학생리스트출력 | 3.학생검색 | 4.수강신청 | 5.수강철회 | 3.종료");
			System.out.print("메뉴중에 원하시는 것을 입력해주세요 =>");
			menu = scan.nextInt();
			
			switch(menu) {
			
			case 1:
				user.insertStudent(scan);
				break;
			case 2:
				user.printStudent();
				System.out.println();
				break;
			case 3:
				user.searchStudent(scan);
				break;
			case 4:
				user.registerSubject(scan);
				break;
			case 5:
				user.deleteSubject(scan);
				break;
			case 6:
				System.out.println("프로그램 종료중...");
				break;
			default:
				System.out.println("잘못된 입력값입니다. 다시 입력해주세요.");
				break;
			}
			
		}while(menu!=6);
		
		System.out.println("프로그램이 종료되었습니다.");
		
		scan.close();
	}

}
