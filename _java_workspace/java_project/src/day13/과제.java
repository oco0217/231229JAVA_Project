package day13;

import java.util.Scanner;

import day11.Card;

/*product 클래스 생성 : 상품을 등록하는 클래스
 * 상품명,가격을 멤버변수로 생성
 * 상품추가 메서드
 * 상품출력 메서드(toString으로 생성 가능)
 */
class Product {
	private String[] name = new String[10];
	private int[] price = new int[10];
	private int cnt;


	// 상품 추가 메서드
	public void add(String name, int price) {
		if(cnt<this.name.length) {
			this.name[cnt] = name;
			this.price[cnt] = price;
			System.out.println("상품이 추가되었습니다.");
			cnt++;
		}else if(cnt<10) {
			System.out.println("더이상 상품등록 불가");
		}
	}

	// 상품출력 메서드
	public void printProduct() {
		for(int i=0; i<name.length; i++) {
			if(name[i]!=null) {
				System.out.println("상품명 : " + getName()[i] + "("+getPrice()[i]+"원)");
			}
		}
	}
	

	public String[] getName() {
		return name;
	}

	public void setName(String[] name) {
		this.name = name;
	}
	
	public int[] getPrice() {
		return price;
	}

	public void setPrice(int[] price) {
		this.price = price;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

}

public class 과제 {

	public static void main(String[] args) {
		// 상품을 10개 등록 가능한 배열 생성
		// 스케너를 이용하여 상품을 등록받기
		// 등록한 상품 출력
		int menu = 0;
		Scanner scan = new Scanner(System.in);

		Product regit = new Product();

		do {
			System.out.println("--메뉴--");
			System.out.println("1.물건 등록하기 | 2.등록한 상품 보기  |3.종료하기" );
			menu = scan.nextInt();
			String name = "";
			int price = 0;
			
			switch (menu) {
			case 1:
				System.out.println("상품 이름을 입력 =>");
				name = scan.next();
				System.out.println("상품 가격을 입력=>");
				price = scan.nextInt();
				regit.add(name, price);
				break;
			case 2:
				regit.printProduct();
				break;
			case 3:
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
				System.out.println("잘못된 메뉴입니다.");
				break;

			}
		} while (menu != 3);
		System.out.println("프로그램을 종료합니다.");

		scan.close();
	}

}
