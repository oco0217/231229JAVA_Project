package day20;

import java.util.ArrayList;

public class 과제 {

	public static void main(String[] args) {
		/*
		 * 스트림으로 출력 여행사 상품이 있습니다. 여행 비용은 15세 이상은 100만원, 그미만은 50만원으로 계산 고객 3명이 패키지 여행을
		 * 떠난다고 했을 경우 1.비용 계산 =>출력 , 2고객명단 검색 = 출력 Customer 클래스를 생성하고, ArrayList로 고객관리
		 * 
		 * 예시) 고객정보 -> 고객명단 이름: 이순신, 나이: 40 :100 이름: 신사임동, 나이: 35, 비용:100 이름: 홍기롱, 나이
		 * 10, 비용:50 총 여행 경비 : 250
		 * 
		 * 20대 이상 고객명단 => 이름순으로 정렬 이름 : 신사임당, 나이:35, 비용 100
		 */

		ArrayList<CustomerTrip > list = new ArrayList<CustomerTrip>();

		list.add(new CustomerTrip ("홍길동", 40));
		list.add(new CustomerTrip ("신사임당", 35));
		list.add(new CustomerTrip ("이순신", 10));

		// 비용계산
		int sum = list.stream()
				.mapToInt(n -> n.getPrice())
				.sum();

		// 고객 명단
		System.out.println("-----고객 명단-----");
		list.stream().forEach(n -> {
			System.out.printf("이름: %s 나이:%d세 비용%d만원%n", n.getName(), n.getAge(), n.getPrice());
		});
		System.out.println("총 여행 경비 : " + sum + "만원");

		System.out.println();

		// 20대 이상 고객 명단 이름순으로 정렬
		System.out.println("---20대 이상 고객 명단---");
		
			//익명 클래스 사용할 경우 Comparator 대상(매개변수)2개
			//클래스 내부에서 구현할 경우 Comparable구현 대상(매개변수) 1개
	}	
}

class CustomerTrip {
	private String name;
	private int age;
	private int price;

	// 생성자
	public CustomerTrip() {
	}

	public CustomerTrip(String name, int age) {
		this.age = age;
		this.name = name;
		this.price = age >= 15 ? 100 : 50;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
