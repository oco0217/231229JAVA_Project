package day04;

import java.util.Scanner;

public class 과제 {
	public static void main(String[] args) {
		
		/*주사위 게임
		 * 주사위를 던져서 총 30칸을 이동
		 * 주사위는 랜덤으로 생성(1~6까지 생성)
		 * 주사위 : 3
		 * 3칸전진 => 27칸 남았습니다.
		 * 주사위 : 1
		 * 1칸 전진 => 26칸 남았습니다.
		 * 주사위 : 6
		 * 6칸 전직  => 20칸 남았습니다.
		 * ...
		 * 도착~!! 총 이동 횟수 : 10번 => 주사위를 던진 횟수
		 */
		
		
		Scanner scan =new Scanner(System.in);
		
		int sum =0;
		int count = 0;
		
		System.out.println("주사위 굴리기 ");
		System.out.println("-----------------------");
		
		for(;;) {
			
			int random = (int)(Math.random()*6)+1;  //주사위 1~6
			System.out.printf("주사위를 굴리시려면 %n아무키나 누르신 후 엔터를 눌러주세요. =>");
			String enter = scan.nextLine();
			
			count++;
			sum+=random;
			
			
			if(sum<30) {
				System.out.printf("%d칸 전진 => %d칸 남았습니다.",random,30-sum);
				enter = scan.nextLine();
			}else{
				System.out.printf("도착~!! %n총 이동횟수 : %d번(주사위를 던진 횟수)%n",count );
				break;
			}
		}

		scan.close();
	}
}
