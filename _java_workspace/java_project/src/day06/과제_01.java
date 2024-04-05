package day06;

import java.util.Scanner;

public class 과제_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*숫자를 입력받아서 입력받은 숫자를 거꾸로 출력. 각자리의 합계 출력
		 * ex) 11456 =>65411 => 6+5+4+1+1 => 결과값 출력
		 * ex) 19874 =>47891 => 4+7+8+9+1 => 결과값 출력 
		 * /, %연산자를 이동
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자를 입력해주세요  =>");
		int num = scan.nextInt();
		
		int sum = 0;
		
		//num / 10 = (int)몫 다시 나누는 값으로 사용  
		//num % 10 = 나머지 값을 저장 => 마지막 자리(출력)
		
		while(num > 0) {
			int b = num % 10;   //마지막 자리를 추출
			System.out.print(b+" ");
			
			sum+=b;
			num = num / 10; //정수/정수 =>정수 소수점 버림
		}
		
		System.out.print("합계 : "+sum);
		
		scan.close();
		}

}
