package day19;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class SetEx01 {

	public static void main(String[] args) {
		/*
		 * set 중복저장x set에 로또번호 6개 생성 후 출력 랜덤번호 1~45
		 */

		HashSet<Integer> lotto = new HashSet<Integer>();

		// 6번 생성 X : 중복발생 가능성.
		// Set이 6개 찰때까지...

		while (lotto.size() < 6) {

			// lotto.add((int)(Math.random()*45)+1);

			int random = new Random().nextInt(45) + 1; // randomClass사용 방법

			lotto.add(random);
		}

		System.out.println(lotto);

		System.out.println("--------------------");
		// Tree set : set중에서 정렬이 되는 set

		TreeSet<Integer> treeSet = new TreeSet<Integer>();

		while (treeSet.size() < 6) {

			int random = new Random().nextInt(45) + 1;

			treeSet.add(random);
		}
		System.out.println(treeSet);
		
		//first() : 가장 앞에 있는 값, last() : 가장 뒤에있는 값
		System.out.println(treeSet.first());
		System.out.println(treeSet.last());
		
		//headSet : 내가 지정한 값보다 작은 값
		//tailSet : 내가 지정한 값보다 큰 값
		System.out.println(treeSet.headSet(15));
		System.out.println(treeSet.tailSet(15));
		
		//subSet : 내가 지정한 검색 범위 지정 뒤쪽 값은 미포함
		System.out.println(treeSet.subSet(15, 30)); //15~30 / 30은 미포함
	}

}
