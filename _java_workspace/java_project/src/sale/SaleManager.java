package sale;

import java.util.ArrayList;
import java.util.Scanner;

import day19.Sale;

public class SaleManager {

	private ArrayList<Sale<String, Integer>> menu = new ArrayList<>();
	private ArrayList<Order> order = new ArrayList<>();

	public void addProduct(Scanner scan) { // 제품추가
		// 제품추가
		System.out.println("제품명>");
		String menuName = scan.next();
		System.out.println("가격>");
		int menuPrice = scan.nextInt();
		// 객체 생성 후 추가
		menu.add(new Sale<String, Integer>(menuName, menuPrice));
		System.out.println("제품 추가 완료");
	}

	public void menuDel(Scanner scan) { // 메뉴 삭제
		//list.remove(index) / list.remove(Object)
		System.out.println("제품명>");
		String menuName = scan.next();

		for (Sale<String, Integer> s : menu) {
			if (s.getMenu().equals(menuName)) {
				menu.remove(s); //번지의 객체 삭제0
				
				System.out.println("메뉴 삭제 완료");
				return;
			}
		}
		System.out.println("검색하신 제품이 없습니다.");
	}

	public void menuPrint() {// 메뉴 리스트 보기

		for (Sale<String, Integer> s : menu) {
			System.out.printf("상품명 : %-6s (%,d원)%n", s.getMenu(), s.getPrice());
		}
	}

	// 메뉴 수정(가격수정)
	//list.set.(index,object) : 해당 번지의 객체를 변경
	public void menuAdj(Scanner scan) {

		System.out.println("제품명>");
		String menuName = scan.next();

		for (Sale<String, Integer> s : menu) {
			if (s.getMenu().equals(menuName)) {
				System.out.println("상품명 | 가격");
				System.out.println("수정하실 메뉴 입력>");
				String m = scan.next();
				switch (m) {
				case "상품명":
					System.out.println("수정할 가격 입력>");
					String productName = scan.next();
					s.setMenu(productName);
					System.out.println("가격 수정 완료");
					return;
				case "가격":
					System.out.println("수정할 가격 입력>");
					int price = scan.nextInt();
					s.setPrice(price);
					System.out.println("가격 수정 완료");
					return;
				}
			}
		}
		System.out.println("검색하신 제품이 없습니다.");
	}

	// 주문
	public void addOrder(Scanner scan) {

		System.out.println("주문하실 상품>");
		String menuName = scan.next();
		for (int i = 0; i < menu.size(); i++) {
			if (menu.get(i).getMenu().equals(menuName)) { // 상품명이 메뉴에 존재하는지 확인

				int index = searchOrder(menuName); // order의 메뉴이름 index

				int menuPrice = menu.get(i).getPrice(); // 상품의 기존가격(내가 주문한 메뉴의 가격)

				//주문한 같은 메뉴가 없으면 -1 / 있으면 해당 번지
				if (index != -1) { //해당 메뉴가 있다면
					//기존값에서 count+ / total +
					System.out.println(menuName + "의 수량입력>");

					int exsistPrice = order.get(index).getPrice(); // 기존에 있던 price

					int exsistCount = order.get(index).getCount(); // 기존에 있던 개수

					int count = scan.nextInt();
					order.get(index).setPrice(exsistPrice + (menuPrice * count));
					order.get(index).setCount(exsistCount + count);
					System.out.println("주문 완료");
					return;
				}
				System.out.println(menuName + "의 수량입력>");
				int count = scan.nextInt();
				order.add(new Order(menuName, menuPrice * count, count));
				System.out.println("주문완료");
				return;
			}
		}
		System.out.println("검색결과 없음");
	}

	// 주문내역 출력
	public void orderPirnt() {
		// 주문내역 출력
		// 총 지불금액 출력

		int sum = 0;
		for (Order s : order) {
			sum += s.getPrice();
			System.out.printf("상품명 : %-6s %d개 (%,d원)%n", s.getMenu(), s.getCount(), s.getPrice());
		}
		if (sum <= 0) {
			System.out.println("주문내역이 존재하지 않습니다.");
			return;
		}
		System.out.printf("총 지불금액 : %,d원%n", sum);
	}

	// 똑같은 주문을 추가하는 list값의 index찾기
	public int searchOrder(String name) {

		int index = -1;

		for (int i = 0; i < order.size(); i++) {

			if (order.get(i).getMenu().contains(name)) {
				index = i;
				return index;
			}
		}
		return index;

	}

}
