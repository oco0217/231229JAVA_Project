package day19;

import java.util.ArrayList;
import java.util.Scanner;

public class SaleManager {
	// 제네릭 클래스 처리
	private ArrayList<Sale<String, Integer>> menu = new ArrayList<>();
	private ArrayList<Sale<String, Integer>> order = new ArrayList<>();

	public void add(Scanner scan) {
		// 제품추가
		System.out.println("제품명>");
		String menuName = scan.next();
		System.out.println("가격>");
		int menuPrice = scan.nextInt();
		// 객체 생성 후 추가
		menu.add(new Sale<String, Integer>(menuName, menuPrice));
		System.out.println("제품 추가 완료");

	}

	public void menuPrint() {
		// 제품 리스트 보기
		// System.out.println(menu);

		for (Sale<String, Integer> s : menu) {
			System.out.printf("상품명 : %s (%,d원)%n", s.getMenu(), s.getPrice());
		}

	}

	public void orderPick(Scanner scan) {
		// 입력받는 값은 제품명,수량
		// 제품명 가격*수량(지불금액)
		// 햄버거 5 => 25000

		
		menuPrint();
		System.out.println("주문하실 상품 입력>");
		String menuName = scan.next();
		for (int i=0; i<menu.size(); i++) {
			
			int index = searchOrder(menuName);
			
			if (menu.get(i).getMenu().contains(menuName)) {
				System.out.println("수량입력>");
				int count = scan.nextInt();
				
				//String productName = menu.get(i).getMenu();
				int productPrice = order.get(index).getPrice();
				int price = menu.get(i).getPrice()*count;
				
				if(index!= -1) {
					order.get(index).setPrice(productPrice+(price));
					System.out.println("추가 완료");
					return;
				}
				order.add(new Sale<String, Integer>(menuName,productPrice*count));
			}
		}
	}
	
	public int searchOrder(String name) {
		
		int index = -1;
		
		for(int i=0; i<order.size(); i++) {
			
			if(order.get(i).getMenu().contains(name)) {
				index = i;
				return index;
			}
		}
		return index;
		
	}
	
	public void orderPirnt() {
		// 주문내역 출력
		// 총 지불금액 출력

		int sum = 0;
		for (Sale<String, Integer> s : order) {
			sum += s.getPrice();
			System.out.printf("상품명 : %s (%,d원)%n", s.getMenu(), s.getPrice());
		}
		if (sum <= 0) {
			System.out.println("주문내역이 존재하지 않습니다.");
			return;
		}
		System.out.printf("총 지불금액 : %,d원%n",sum);
	}
}
