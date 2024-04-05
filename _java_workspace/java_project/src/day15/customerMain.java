package day15;

import java.util.Scanner;

public class customerMain {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Customer c1 = new Customer(01, "철수");
		Customer g1 = new GoldCustomer(02, "훈이");
		Customer v1 = new VIP(03, "짱구");

		Customer[] cusList = new Customer[3];
		cusList[0] = c1;
		cusList[1] = g1;
		cusList[2] = v1;

		int menu = 0;

		do {

			int index = -1;
			String name ="";

			System.out.println("---이용하실 메뉴를 선택해 주세요---");
			System.out.println("1.구매하기 | 2.고객정보 | 3.종료하기");
			menu = scan.nextInt();

			switch (menu) {
			case 1:
				System.out.println("이용자 성명을 입력해주세요 =>");
				name = scan.next();
				for (int i = 0; i < cusList.length; i++) {
					if (cusList[i].getCustomerName().equals(name)) {
						index = i;
					}
				}
				if(index==-1) {
					System.out.println("검색하신 이름이 없습니다.");
					break;
				}
				System.out.println("구매하실 상품명을 입력해주세요=>");
				String product = scan.next();
				System.out.println("상품의 가격을 입력해주세요 =>");
				int price = scan.nextInt();
				cusList[index].calcPrice(price);
				System.out.println("구매가 완료되었습니다~");
				System.out.println(cusList[index].getCustomerName()+"님은 "+cusList[index].getCustomerGrade()+"등급이십니다.");
				System.out.println((price*cusList[index].getBonusRatio())+"point 적립되셧습니다.");
				break;
			case 2:
				System.out.println("이용자 성명을 입력해주세요 =>");
				name = scan.next();
				for (int i = 0; i < cusList.length; i++) {
					if (cusList[i].getCustomerName().equals(name)) {
						index = i;
					}
				}
				if(index==-1) {
					System.out.println("검색하신 이름이 없습니다.");
					break;
				}
				cusList[index].customerInfo();
				break;
			case 3:
				System.out.println("종료 중");
				break;
			default:
				break;

			}

		} while (menu != 6);

		scan.close();

	}

}
