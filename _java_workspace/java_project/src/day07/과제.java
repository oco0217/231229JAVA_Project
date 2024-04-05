package day07;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*계산기 만들기
		 * --메뉴--
		 * 1.덧셈|2.뺄셈|3.곱셈|4.나눗셈|5.나머지|6.종료
		 *>>메뉴선택 1
		 *숫자>>1 5 
		 *숫자>>2 10
		 *결과  : 5+10 =15 
		 *(더하기 메서드를 호출하여 연산 결과를 출력)
		 */ 
		
		Scanner scan = new Scanner(System.in);
		
		
		int menu = 0;
			
		System.out.println("첫번째 정수를 입력해주세요 =>");
		int num1 = scan.nextInt();
		System.out.println("두번째번째 정수를 입력해주세요 =>");
		int num2 = scan.nextInt();
		
		
		do {
			System.out.println("---메뉴---");
			System.out.println("1.덧셈|2.뺄셈|3.곱셈|4.나눗셈|5.나머지|6.종료");
			System.out.print("메뉴 선택 =>");
			menu = scan.nextInt();
			
			switch(menu){
			case 1:
				System.out.printf("%d + %d = %d%n",num1,num2,sum(num1,num2));
				break;
			case 2:
				System.out.printf("%d - %d = %d%n",num1,num2,sub(num1,num2));
				break;
			case 3:
				System.out.printf("%d * %d = %d%n",num1,num2,mul(num1,num2));
				break;
			case 4:
				System.out.printf("%d / %d = %.2f%n",num1,num2,div(num1,num2));
				break;
			case 5:
				System.out.printf("%d / %d = (나머지)%d%n",num1,num2,mod(num1,num2));
				break;
			case 6:
				System.out.println("프로그램 종료중 . . .");
				break;
			default : 
				System.out.println("잘못된 입력값입니다. 다시 입력해주세요.");
				break;
				
			}
			
			
		}while(menu!=6);
		System.out.println("프로그램을 종료합니다.");
		
			scan.close();
		
	}
	public static int sum(int num1,int num2) {
		return num1 + num2;
	}
	public static int sub(int num1,int num2) {
		return num1 -num2;
	}
	public static int mul(int num1,int num2) {
		return num1 * num2;
	}
	public static double div(double num1,double num2) {
		return num1/(double)num2;
	}
	public static int mod(int num1,int num2) {
		return num1%num2;
	}

}
