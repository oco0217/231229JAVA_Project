package day20;

import java.util.ArrayList;

public class Stream03 {

	public static void main(String[] args) {
		//Student 클래스로 리스트 구성
		// add로 5명 추가
		
		ArrayList<Student> list = new ArrayList<>();
		
		list.add(new Student("길동", 98));
		list.add(new Student("영희", 41));
		list.add(new Student("길순", 87));
		list.add(new Student("오미", 71));
		list.add(new Student("애드", 68));
		
		//스트림을 이용하여 콘솔에 출력 Ex) : 홍길동 : 98
		list.stream().forEach(Student -> { 
			 
		System.out.println(Student);
	});
		
		System.out.println();
		
		list.stream().forEach(info -> {
			System.out.println(info.getName() +" : "+info.getScore());
		});
		
		//list의 점수 합계 / 전체 인원수 출력
		int s = list.stream()
				.mapToInt(n -> n.getScore())
				.sum();
		
		long cnt = list
				.stream()
				.count();
		
		System.out.println("점수 합계 : "+s);
		
		System.out.println("전체 인원수 : "+cnt);
		
	}

}
