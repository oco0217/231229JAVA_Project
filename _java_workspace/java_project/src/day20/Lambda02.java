package day20;

import java.util.HashMap;

public class Lambda02 {


	public static void main(String[] args) {
		//map을 구성하여 forEach를 사용하여 출력
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("길동", 89);
		map.put("영이", 80);
		map.put("순이", 71);
		map.put("철수", 55);
		map.put("영철", 63);
		
		map.forEach((n,a)->{
			System.out.println(n+":"+a);
		});
		
		
		Number sum = (a,b) -> { //함수 구현
			return a+b; 
			};
			
			int hap = sum.add(50, 60);
			
			System.out.println(hap);
		
		System.out.println(sum.add(100, 200));
		
		Number max = (a,b) -> (a>=b) ? a:b; //함수 구현
		
		System.out.println(max.add(50, 90));
		
		
		
	}

}

//함수형 인터페이스 생성
//메서드가 1개여야만 함.
@FunctionalInterface
interface Number{
	 int add(int a, int b);
	 //int max(int a, int b); //메서드가 2개면 error
}


