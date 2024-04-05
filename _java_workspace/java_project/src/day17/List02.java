package day17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class List02 {

	public static void main(String[] args) {

		/*
		 * 두 배열을 입력받아서 하나로 합치는 ArrayList 생성 정렬하여 출력
		 */

		String arr1[] = new String[] { "a", "c", "f", "b" };
		String arr2[] = new String[] { "d", "g", "h", "k" };

		List<String> sum = new ArrayList<String>();

//		for (int i = 0; i < arr1.length; i++) {
//
//			sum.add(arr1[i]);
//			sum.add(arr2[i]);
//		}
//		for (int i = 0; i < arr2.length; i++) {
//
//			sum.add(arr2[i]);
//		}
		
		int i=0, j=0;
		
		while(arr1.length+arr2.length>sum.size()) {
			if(i<arr1.length) {
				sum.add(arr1[i]);
				i++;
			}
			if(j<arr2.length) {
				sum.add(arr2[j]);
				j++;
			}
			
		}

		System.out.println("---두 배열 값 sum에 넣기---");
		System.out.println(sum);
		
		System.out.println("---오름차순으로 정렬하여 출력---");
		Collections.sort(sum);
		System.out.println(sum);
		
		System.out.println("---내림차순으로 정렬하여 출력---");
		sum.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		});
		System.out.println(sum);
	}

}
