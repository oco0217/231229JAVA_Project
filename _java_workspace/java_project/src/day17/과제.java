package day17;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/*
		 * 숫자를 입력받아 입력받은 숫자를 list로 구성하고, 출력 합계를 출력 입력 : 45,78,89,97,68,57,48 => String
		 * list에 넣고, 출력 => 합계(인원수) 출력 70이상 점수 개수 출력
		 */

		Scanner scan = new Scanner(System.in);

		List<Integer> list = new ArrayList<>();
		
		String num = "45,78,89,97,68,57,48";

		int sum = 0;
		int count = 0;

		//배열을 List로 구성할 때
		//List<Integer> list1 = new ArrayList<>(Arrays.asList(arr));
		
		System.out.println("숫자를 입력=>");
		String score = scan.next();
		String[] arr = score.split(",");
		for (String s : arr) {
			list.add(Integer.parseInt(s));
			sum += Integer.parseInt(s);
			if (Integer.parseInt(s) >= 70) {
				count++;
			}
		}
		System.out.printf("합계 : %d점(%d명)%n", sum, list.size());
		System.out.printf("70점 이상 : %d명", count);

		scan.close();

	}

}
