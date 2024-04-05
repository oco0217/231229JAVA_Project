package day04;

import java.util.Scanner;

public class Break01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*break문 : 반복문을 빠져나오게 하는 키워드
		 * - 반복문에서 조건문(if)을 동반하여 조건에 맞을 때 반복문을 벗어나게 하는 역할
		 */
		/* 1~10까지 출력
		 * 초기값, 증감식, 조건식을 생략하여 무한루프를 생성
		 * break를 이용하여 빠져나오게 
		 */
		
		for(int i=1; ; i++) {
			if(i==11) {
				break;
			}
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("---------------------------------------");
		
		/*한글자를 입력받아 글자를 출력 (반복해서 출력)
		 * y를 입력받으면 종료
		 * a-> a / b->b / c>c /y->종료
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("한글자를 입력해주세요 >" );
		char ar = scan.next().charAt(0);
		
		while(true) {
			System.out.println("입력하신 글자는 " + ar + "입니다.");
			if(ar=='y') {
				System.out.println("종료");
				break;
			}else{
				System.out.println("한글자를 입력해주세요 >" );
				ar = scan.next().charAt(0);
			}
		}
		scan.close();
	}
}
