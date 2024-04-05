package day18;

import java.util.HashMap;

public class MapEx01 {

	public static void main(String[] args) {
		/*Map을 이용하여 상품과 가격을 추가하여 합계를 구하시오.
		 * 상품을 Map에 추가하는 작업은 메서드를 활용
		 * 1. Map을 main에 생성해 놓고, 매개변수로 받아 map의 데이터를 채우는 메서드
		 * 2. Map을 메서드 내부에서 생성하여 main으로 리턴하는 메서드
		 * 
		 * 가위 2500원
		 * 크레파스 4000원
		 * 물감 5000원
		 * 합계?
		 */

		//1번 case
		MapEx01 ex = new MapEx01();
		
		HashMap<String, Integer> product = new HashMap<String, Integer>();
		
		ex.put(product);
		
		int sum = 0;
		
		for(String a : product.keySet()) {
			sum += product.get(a);
		}
		System.out.println("---1번 case 출력---");
		System.out.println("물건명 :"+product);
		System.out.println("1번째 합계 : " + sum+"원");
		
		System.out.println("----------------------------------------------");
		System.out.println("---메서드로 출력---");
		ex.printMap(product);
		
		System.out.println("----------------------------------------------");
		
		//2번 case
		
		HashMap<String, Integer> map1 = ex.out2(); //HashMap을 생성후 메서드로 값을 넣어줌
		
		int sum2 = 0;
		
		MapEx01 ex2 = new MapEx01();  //객체 생성
		
		ex2.out2(); //객체에 내부에서 생성한 map메서드 넣기
		
		for(String b : map1.keySet()) {
			sum2 += map1.get(b);
		}
		System.out.println("---2번 case 출력---");
		System.out.println("물건명"+map1);
		System.out.println("2번째 합계 :" + sum2+"원");
		
		System.out.println("----------------------------------------------");
		System.out.println("---메서드로 출력---");
		ex2.printMap(ex2.out2());
		
	}
	
	//Map을 매개변수로 받는 케이스
	
	public void put(HashMap<String,Integer> i) {
		
		i.put("가위",2500);
		i.put("크레파스", 4000);
		i.put("물감",5000);
		
		
	}
	
	//Map을 내부에서 생성하여 리턴하는 케이스
	public HashMap<String,Integer> out2() {
		
		HashMap<String, Integer> product = new HashMap<String, Integer>();
		
		product.put("가위", 5000);
		product.put("크레파스", 6000);
		product.put("물감", 5000);
		
		return product;
	}
	
	//map을 받아서 출력하는 메서드
	
	public void printMap(HashMap<String,Integer> var) {
		
		int sum = 0;
		for(String p : var.keySet()) {
			
			sum += var.get(p);
			System.out.printf("상품명 : %s - %d원%n",p,var.get(p));
		}
		System.out.println("총합 : "+sum+"원");
	}
}
