package day02;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*카페에 제출
		 * 정수 2개와 연산자 1개를 입력받아 두 정수의 연산을 출력
		 * ex) 2 3 + => 2+3 = 5
		 * ex) 5 1 - => 5-1 = 4
		 * 연산자는 + - * % /가능
		 * 다른 종류의 연산자가 들어오면 잘못된 연산자로 출력
		 * */
		Scanner scan = new Scanner(System.in);
		System.out.println("첫번째 정수를 입력해주세요. >");
		int num1 = scan.nextInt();
		System.out.println("두번째 정수를 입력해주세요. >");
		int num2 = scan.nextInt();
		System.out.println("연산자를 입력해주세요. >");
		char s = scan.next().charAt(0);  
		
		switch(s) {
		case '+' :
			System.out.println("" + num1  + s + num2 + " = " + (num1+num2));
					break;
		case '-' :
			System.out.println(num1-num2);
					break;
		case '*' :
			System.out.println(num1*num2);
					break;
		case '/' :
			System.out.println((double)num1/num2);
					break;
		case '%' :
			System.out.println(num1%num2);
					break;
		default :
			System.out.println("잘못된 연산자입니다.");
		}
		
		if(s=='+') {
			System.out.println(num1 + num2);
		}else if('-'==s){
			System.out.println(num1-num2);
		}else if('*'==s) {
			System.out.println(num1*num2);
		}else if(s=='/'){
			System.out.println((double)num1/num2);
		}else if(s=='%') {
			System.out.println(num1%num2);
		}

	}

}
