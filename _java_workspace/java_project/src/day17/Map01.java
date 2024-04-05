package day17;

import java.util.HashMap;
import java.util.Iterator;

public class Map01 {

	public static void main(String[] args) {
		/* Map
		 * - 값을 2개 쌍으로 저장, key / value
		 * -key : 중복 불가, value : 중복 가능.
		 * - HashMap을 가장 많이 사용
		 * 
		 * HashMap<클래스,클래스> map = new HashMap<클래스,클래스>();
		 * map은 값이 2개이기 때문에 향상된 for, iterator 사용 불가.
		 * map에 key => set으로 구성 후 출력
		 * 
		 * list, set => add() : 추가
		 * map => put() : 추가
		 * geyKey(), getValue() //추출 가능.
		 */
		
		HashMap<String, Integer> map = new HashMap<>();
		map.put("apple", 2000);
		map.put("banana", 3000);
		map.put("orange", 1000);
		map.put("peach", 4000);
		map.put("kiwi", 3000);
		
		System.out.println(map);
		System.out.println(map.keySet()); //key만 별도로 set 구성
		System.out.println(map.values()); //value만 구성
		
		System.out.println(map.get("apple")); //get("key") => value값 추출
		
		//remove() = key 에 대한 값을 삭제하면서 value를 리턴
		System.out.println(map.remove("apple"));
		System.out.println(map);
		System.out.println(map.remove("a")); //key값이 없는것을 입력하면 null을 리턴
		
		System.out.println(map.remove("banana", 3000)); //삭제가 되었는지 안되었는지 ture / false로 리턴
		System.out.println(map);
		
		for(String key : map.keySet()) {
			System.out.print(key+" : "+map.get(key)+" ");
		}
		System.out.println();
		
		Iterator<String> it = map.keySet().iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			System.out.print(key +" : "+map.get(key));
		}
		System.out.println();
		
		System.out.println("---향상된 for문으로 value의 합을 출력---");
		Integer sum = 0; //합계를 저장할 변수
		
		for(String key : map.keySet()) {
			sum+=map.get(key);
		}
		
	System.out.println(sum+"원");
		
	
	
	}

}
