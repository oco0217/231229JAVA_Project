package day13;

import java.util.Scanner;

class Product01 {
	private String name;
	private int price;

	// 생성자
	public Product01() {
	}

	public Product01(String name, int price) {
		this.name = name;
		this.price = price;
	}

	// 메서드
	public void insertProduct(String name, int price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "[상품명]" + name + " " + price + "원";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}

public class 과제_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		// 상품을 등록하시겠습니까(y/n)? y=> 등록 / => 그만
		// n을 누르면 등록한 상품 출력
//		int cnt=0;
//		Product01 p = new Product01("피자", 15000);
//		menu[cnt] = p;
//		cnt++;
//		
//		Product01 p1 = new Product();
//		menu[cnt].insertProduct("물", 2000);
//		menu[cnt]=p1
//		cnt++;
//		
//		for(int i=0; i<cnt; i++) {
//			System.out.println(menu[i]);
//		}
		//Product01 클래스들 담을 수 있는 배열 10칸을 준비
		Product01[] menu = new Product01[10];

		String result = "";
		int cnt = 0;
		String name = "";
		int price = 0;
		do {
			System.out.println("상품을 등록하시겠습니까? y/n ");
			result = scan.next();
			if (result.equals("y")) {
				if(cnt>9) {
					System.out.println("등록할 수 있는 상품이 최대입니다.");
					break;
				}

				System.out.println("상품명 입력 =>");
				name = scan.next();
				System.out.println("가격입력 =>");				
				price = scan.nextInt();

				menu[cnt] = new Product01(name, price);
				cnt++;
			}else if(!result.equals("y")&&!result.equals("n")){
				System.out.println("잘못된 입력값입니다 다시 입력해주세요.");
			}

		} while (!result.equals("n"));
		System.out.println("--등록된 상품--");
		for (int i = 0; i < menu.length; i++) { //이럴땐 cnt를 쓰는게 좋음
			if (menu[i] != null) {
				System.out.println(menu[i]);
			}else if(menu[0]==null){
				System.out.println("등록된 상품이 없습니다.");
				break;
			}
		}
		//
//		char c = 'y';//반복 키워드
//		int cnt=0;//intdex 역할을 하는 변수
//		
//		while(c! ='n') { //(!c.equals("n") => String 일 경우)
//			System.out.println("상품을 등록하시겠습니까?(y/n)");
//			c.scan.next().charAt(0);
//			if(c=='y') {
//				System.out.println("상품명");
//				String name = scan.next();
//				System.out.println("가격");
//				int price = scan.nextInt();
//				
//				객체 생성
//				Product01 p = new Product01(name, price);
//				menu[cnt]=p;
//				cnt++;
//			}else {
//				if(c=='n') {
//					System.out.println("상품 등록 종료");
//				}else {
//					System.out.println("y/n만 가능합니다.");
//				}
//			}
//		}
//		
//		System.out.println("--등록된 상품 리스트--");
//		for(int i=0; i<cnt; i++) {
//			toString 사용 경우
//			System.out.println((i+1)+" "+menu[i]);
//			출력 메서드가 있는경우
//			menu[i].print();
//		}
		//
		scan.close();
	}

}


