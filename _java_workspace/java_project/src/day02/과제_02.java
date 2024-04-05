package day02;

import java.util.Scanner;

public class 과제_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*카페에 제출 
		 * 정수 2개와 연산자 1개를 입력받아 두 정수의 연산을 출력
		 * ex) 2 3 + => 5
		 * 연산자는 + - * / % 가능
		 */
		
		//연산자 = char(기본자료형) == 비교 가능 / String(객체) == 비교불가능
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자(정수)를 입력해주세요");
		int num1 = sc.nextInt();
		System.out.println("다음숫자(정수)를 입력해주세요");
		int num2 = sc.nextInt();
		System.out.println("연산자를 입력해주세요.");
		char op = sc.next().charAt(0); //한글자 받기
		
		if((op=='%'||op=='/') && num2==0) {
			System.out.println("잘못 입력된 값입니다");
		}else {
		
		
		
		// / , % 일경우 num2가 0이되면 안내문구 띄우기
		switch(op){
			case '+' :
				System.out.println("" + num1+op+num2 +" = " + (num1+num2));
				break;
			case '-' :
				System.out.println("" + num1+op+num2 +" = " + (num1-num2));
				break;
			case '*' :
				System.out.println("" + num1+op+num2 +" = " + (num1*num2));
				break;
			case '/' :
				System.out.println("" + num1+op+num2 +" = " + (num1/(double)num2));
				break;
			case '%' :
				System.out.println("" + num1+op+num2 +" = " + (num1%num2));
				break;
			default :
				System.out.println("잘못된 연산자이니다.");
				break;
			}
		}
		sc.close();
	}

}
