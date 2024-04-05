package sale;

import java.util.Scanner;


public class SaleMain {

	public static void main(String[] args) {
		/* menu
		 * 1.메뉴추가 | 메뉴삭제 | 메뉴수정(가격수정)
		 * 4.메뉴보기(전체메뉴출력) | 5.주문| 6.주문내역출력(영수증) | 7.종료
		 */
		

		Scanner scan = new Scanner(System.in);

		SaleManager sm = new SaleManager();

		int menu = -1;

		do {
			System.out.println("----------< 메뉴 >----------");
			System.out.println("1.메뉴추가 | 2.메뉴삭제 | 3.메뉴수정\n4.메뉴보기 | 5.주문하기 | 6.주문내역 | 7.종료");
			System.out.println("선택>");
			menu = scan.nextInt();

			switch (menu) {

			case 1:
				sm.addProduct(scan);
				break;
			case 2:
				sm.menuDel(scan);
				break;
			case 3:
				sm.menuAdj(scan);
				break;
			case 4:
				sm.menuPrint();
				break;
			case 5:
				sm.addOrder(scan);
				break;
			case 6:
				sm.orderPirnt();
				break;
			case 7:
				System.out.println("종료 중...");
				break;
			default:
				System.out.println("잘못된 메뉴입니다.");
				break;
			}

		} while (menu != 7);
		
		System.out.println("프로그램 종료");

		scan.close();

	}

}
