package day09;

import java.util.Scanner;

public class 가위바위보게임 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*컴퓨터가 가위바위보를 랜덤으로 선택(0가위, 1=바위, 2=보)
		 * 내가 가위바위보중 하나를 선택해서 입력
		 * 승/패/무의 결과를 출력
		 * com = 0(가위)
		 * user = 무승부입니다.
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("--가위바위보게임--");
		System.out.println("-0=가위, 1=바위, 2=보-");
		System.out.println("무엇을 내실건가요 =>");
		int my = scan.nextInt();
		
		
				
			int random = (int)(Math.random()*3);
			System.out.println(random);
			
			
			if((my==0&&random==2)||(my==1&&random==0)||(my==2&&random==1)) {
				System.out.println("이겼습니다. ");
			}else if(random==my) {
				System.out.println("무승부 입니다.");
			}else if(((my==2&&random==0)||(my==0&&random==1)||(my==1&&random==2))){
				System.out.println("졌습니다.");
			}else {
				System.out.println("잘못 입력된 값입니다.");
			}
			
		
		
		scan.close();
	}

}
