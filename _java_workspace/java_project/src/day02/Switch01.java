package day02;

import java.util.Scanner;

public class Switch01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*switch문 : 값에 따라 케이스를 달리주는 형식
		 * 
		 * swich(변수 / 식){
		 * case 값1 : 실행문; break;
		 * case 값2 : 실행문; break;
		 * case 값3 : 실행문; break;
		 * case 값4 : 실행문; break;
		 * case 값5 : 실행문; break;
		 * default: 실행문; break;
		 * }
		 * 
		 * break; switch문을 빠져나갈때 사용
		 */
		int num = 200; 
		switch(num%2) {
			case 0:
				System.out.println("짝수");
				break;
			case 1 :
				System.out.println("홀수");
				break;
			default :
				System.out.println("잘못된 값입니다.");
				break;
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("넘버값을 입력 >");
		int num2 = sc.nextInt(); //1, 2, 3 중 하나 
					  //num2의 값에 따라서 1,2,3인지 출력
		
		switch(num2) {
		case 1: 
			System.out.println("1 입니다");
			break;
		case 2:
			System.out.println("2 입니다");
			break;
		case 3:
			System.out.println("3 입니다.");
			break;
		default :
			System.out.println("잘못된 값입니다.");
		}
	}
}
