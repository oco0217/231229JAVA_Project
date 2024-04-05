package day04;

import java.util.Scanner;

public class DoWhile03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*숫자 2개를 입력받고,
		 * num1 = 5 / num2 = 3
		 * menu
		 * 1.+ | 2.- 3.* | 4./ |5.% |6.종료
		 * menu에 따라서 두수의 연산 경과를 출력
		 * 1 => 5+3 = 8
		 * 2 => 5-3 =8
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("첫번째 정수를 입력해주세요. >");
		int num1 =scan.nextInt();
		System.out.println("두번째 정수를 입력해주세요. > ");
		int num2 = scan.nextInt();
		
		int menu = 0;
		
		
		do {
			System.out.println("--메뉴--");
			System.out.println("1.더하기 | 2.빼기 | 3.곱하기 | 4.나누기 | 5.나머지 | 6.종료하기");
			System.out.println(">munu선택  > ");
			menu = scan.nextInt();
			
			switch(menu) {
			case 1:
				System.out.printf("%d+%d = %d%n",num1,num2,num1+num2);
				break;
			case 2:
				System.out.printf("%d-%d = %d%n",num1,num2,num1-num2);
				break;
			case 3:
				System.out.printf("%d*%d = %d%n",num1,num2,num1*num2);
				break;
			case 4:
				if(num2==0) {
					System.out.println("잘못 입력된 값입니다. 두번째 정수를 다시 입력해주세요. >");
					num2 = scan.nextInt();
					System.out.println("두번째 정수값이 수정이 되었습니다.");
				}
				System.out.printf("%d/%d = %.3f%n",num1,num2,(double)num1/num2);
				break;
			case 5:
				if(num2==0) {
					System.out.println("잘못 입력된 값입니다. 두번째 정수를 다시 입력해주세요.");
					num2 = scan.nextInt();
					System.out.println("두번째 정수값이 수정이 되었습니다.");
				}
				System.out.printf("%d/%d = %d%n",num1,num2,num1%num2);
				break;
			case 6:
				System.out.printf("종료합니다.");
				break;
			default :
				System.out.println("잘못된 메뉴입니다. 다시입력해주세요.");
				break;

			}
			
			
		}while(menu!=6);
		System.out.println("프로그램을 종료합니다.");
		
		scan.close();
	}
}
