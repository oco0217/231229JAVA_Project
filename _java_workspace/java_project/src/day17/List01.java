package day17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class List01 {

	public static void main(String[] args) {
		/*하루 일과를 저장하는 list를 생성
		 * 출력 for / 향상된for문 / Iterator 출력
		 * import 단축키 ctrl+shift+o
		 */
		
		List<String> rutin = new ArrayList<String>();
		
		rutin.add("일어나기");
		rutin.add("씻기");
		rutin.add("점심밥먹기");
		rutin.add("학원가기");
		rutin.add("집가기");
		rutin.add("저녁밥먹기");
		rutin.add("자기");
		System.out.println("---for문으로 출력---");
		for(int i=0; i<rutin.size(); i++) {
			System.out.print(rutin.get(i)+" ");
		}
		System.out.println();
		System.out.println("---향상된 for문으로 출력---");
		for(String r : rutin) {
			System.out.print(r+ " ");
		}
		System.out.println();
		System.out.println(rutin.get(0)+"dfdfd");
		
		System.out.println("---Iterator로 출력---");
		
		Iterator<String> it = rutin.iterator();
		
		while(it.hasNext()) {
			
			String tmp = it.next();
			System.out.print(tmp+" ");
		}
		System.out.println();
		
		//정렬 
		Collections.sort(rutin);
		System.out.println(rutin);
		
		rutin.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				//숫자는 (크다/작다) -/+의 값이 출력
				//문자는 compareTo메서드를 활용하여 정렬
				//o1.compareTo(o2) : 오름차순
				return o2.compareTo(o1); //내림차순
			}
		});
		
	}

}
