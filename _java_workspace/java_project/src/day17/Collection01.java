package day17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Collection01 {

	public static void main(String[] args) {
		/*
		 * 컬렉션 프레임워크 : 표준화된 방식의 자료구조 List, Set, Map =>인터페이스. 반드신 구현 클래스로 객체를 생성 데이터를 묶어서
		 * 관리할 때 사용 주로 배열대신 사용
		 * 
		 * List(배열과 동일) - 값을 하나씩 저장 - 순서를 보장(index) - 중복 허용 -배열 대신에 가장 많이 사용하는 구조
		 * 
		 * Set - 값을 하나씩 저장 - 순서를 보장하지 않음(index가 없음) - 중복허용X (같은 자료가 입력되면 버려짐)
		 * 
		 * Map - 값을 두개씩 저장 key / value 쌍으로 저장 - key 중복이 불가능 / value 중복 가능. - key가 중복되면
		 * value는 덮어쓰게 됨. - 아이디/패스워드와 같이 하나의 자료를 묶어서 저장해야 할 때 사용
		 * 
		 * 배열은 기본자료형,클래스 자료형으로 구성이 가능함. int arr[], String arr[], Student arr[] 다 가능.
		 * 
		 * Collection에서는 기본 자료형은 불가능함. 클래스 자료형만 구성 가능. 기본 자료형에 맞는 클래스 자료형을 사용하면 됨. int
		 * => Integer ,String 나머지는 기본자료형의 첫글자만 대문자로 변환하면 클래스가 됨. long => Long, byte =>
		 * Byte, boolean => Boolean ...
		 * 
		 * 만약 클래스를 지정하지 않으면 Object가 자동 설정됨.
		 * 
		 * List<클래스명> 객체명 new 구현클래스<클래스명>(); List => 구현 클래스 ArrayList, LinkedList
		 * 
		 * ArrayList : 검색할때 유리 (배열과 비슷) - 미리 길이를 지정하지 않음. 추가되면 늘어남. 삭제되면 줄어듬 - 추가, 삭제가
		 * 쉽다. 검색이 쉽다.
		 * 
		 * LinkedList : 추가, 삭제가 많을 경우 유리 - 값을 중간에 끼워넣거나, 빼는게 쉬움. -검색이 느리다.
		 */

		List<Integer> list = new ArrayList<Integer>(); // 부모를 기준으로 생성
		ArrayList<Integer> list1 = new ArrayList<Integer>(); // 자식 기준으로 생성
		ArrayList list2 = new ArrayList(); // object로 생성
		ArrayList<Integer> list3 = new ArrayList<>(); // 뒤에거는 굳이 안적어도 된다. 하지만 앞에 타입은 무조건 적어야된다.

		// add() : 요소를 추가
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list);
		// get(index) : index번지의 요소를 가져오기
		System.out.println(list.get(0));

		// set(index,값) : index 번지의 값을 변경하기
		list.set(0, 5);
		System.out.println(list);

		System.out.println("--for문으로 돌렸을 경우--");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}

		System.out.println();

		// size() : 총개수를 확인
		System.out.println("---사이즈 확인---");
		System.out.println(list.size() + "개");

		// 문자열을 담을 수 있는 ArrayList를 생성
		// 문자열 5개를 저장 한 후 출력.
		// 총 개수가 몇개인지도 출력
		System.out.println("--문자열을 담을 수 있는 ArrayList를 생성--");

		List<String> strList = new ArrayList<>();
		strList.add("컴퓨터");
		strList.add("마우스");
		strList.add("키보드");
		strList.add("스피커");
		strList.add("이어폰");
		System.out.println(strList);

		// 향상된 for문
		for (String a : strList) {
			System.out.print(a + " ");
		}
		System.out.println();

		System.out.println("총 개수 : " + strList.size() + "개");

		// list1에 1부터 10까지 값을 지정 한 후 출력
		System.out.println("--list1에 1부터 10까지 값을 지정 한 후 출력--");
		for (int i = 0; i < 10; i++) {
			list1.add(i + 1);
		}
		System.out.println(list1);

		// set(intdex, 값)0번지 값을 7로 변경 후 출력
		System.out.println("---0번지 값을 7로 변경 후 출력---");
		list1.set(0, 7);
		System.out.println(list1);

		// remove(index) : index 번지의 값을 삭제
		// remove(object) : object의 요소를 삭제
		list1.remove(0);
		System.out.println(list1);
		Integer a = 9;
		list1.remove(a);
		System.out.println(list1);

		// contains(object) : list에 값이 있는지 검사 true / false로 리턴
		Integer b = 2;
		System.out.println(list1.contains(a));
		System.out.println(list1.contains(b));

		// clear() : 리스트를 비움(요소 전부 삭제)
		list1.clear();
		System.out.println(list1);

		// isEmpty() : 리스트 비어있는지 체크 비어있으면 true 비어있지 않으면 false
		System.out.println(list1.isEmpty());

		// ArrayList로 number를 생성 숫자를 저장하는 리스트
		// 1부터 10까지 채운 후 출력 (향상된 for문을 이용하여 출력)

		List<Integer> number = new ArrayList<>();

		System.out.println("--1부터 10까지 채운 후 출력 (향상된 for문을 이용하여 출력)--");
		
		for (int i = 0; i < 10; i++) {
			number.add(i + 1);
		}
		for (int p : number) {
			System.out.print(p + " ");
		}
		System.out.println();
		System.out.println("-------------------------");
		
		/* Iterator : index가 없는 값을 출력하기 위해 사용
		 * List에서는 순서를 보장하기 때문에 get(i)를 사용하여 원하는 index에 접근 가능
		 * set/ map은 순서를 보장하기 않기 때문에 일반 for문을 사용할 수 없음.
		 * 향상된 for, Iterator를 사용
		 * 순서와 상관없이 값을 가져올 수 있는 구문을 사용해야 함.
		 * map은 향상된 for,Iterator 둘다 직접 사용 불가능.
		 */
		
		System.out.println(">>> Iterator 출력");
		
		Iterator<Integer> it = number.iterator();
		
		while(it.hasNext()) { //hasNext() 다음 요소가 있는지 체크 있으면 true 없으면 false
			Integer tmp = it.next(); //next() 다음요소 가져오기
			System.out.print(tmp+" ");	
		}
		System.out.println();
		
		//indexOf(값) : 해당 값이 List에 index 반환 / 없다면 -1리턴
		System.out.println(number.indexOf(a));
		System.out.println(number.contains(a));
		
		//number 리스트를 비우고, 값을 무작위로 5개만 추가하기
		number.clear();
		
		number.add(15);
		number.add(27);
		number.add(3);
		number.add(97);
		number.add(33);
		System.out.println(number);
		
		//정렬
		//Collections.sort() //오름차순만 가능.
		Collections.sort(number);
		System.out.println(number);
		
		//sort(Comparator를 구현한 객체) : 정렬
		//Comparator 인터페이스를 구현한 구현체를 넣어야 함. (익명클래스 사용);
		//compareTo 메서드를 구현하여 객체를 정렬
		// -compareTo- : 사전상 앞에 있으면 -1, 같으면 0, 뒤에 있으면 1
		number.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// o1 - o2 : 오름차순 / o2 - o1 : 내림차순 정렬
				//결과가 -면 앞으로 보내고,  +면 뒤로 보내는 역할
				return o2 - o1;
			}
		});
		
		System.out.println(number);
		
		
		
		
		
		
		
	}
}
