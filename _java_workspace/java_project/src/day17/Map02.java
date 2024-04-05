package day17;

import java.util.HashMap;
import java.util.Scanner;

public class Map02 {

	public static void main(String[] args) {
		/*과목과 점수를 입력 받아 (Scanner) Map에 저장 후 출력
		 * 합계, 평균 출력
		 * 종료 키워드가 나올 때 까지 반복 (1=계속 0=종료)
		 * 과목과 점수를 입ㄹ력하주세요 >
		 * 국어 89
		 * 수학 78
		 * 0 종료
		 * map으로 저장 후 출력 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		HashMap<String,Integer> user = new HashMap<>();
		
		int menu = 0; //메뉴
		int sum = 0; //합계
		System.out.println("<과목과 점수를 입력 받아 (Scanner) Map에 저장 후 출력>");
		do {
			System.out.println("1.계속 | 0.종료");
			menu = scan.nextInt();
			
			if(menu==1) {
				System.out.println("과목 입력=>");
				String sub = scan.next();
				System.out.println("점수 입력 =>");
				int score = scan.nextInt();
				user.put(sub, score);
				sum += score;
			}else if(menu!=0){
				System.out.println("잘못 입력된 값입니다. 다시 입력해주세요.");
			}
			
		}while(menu != 0);
		
//		for(String a : user.keySet()) {
//			sum += user.get(a);
//		}
		double vrg = (double)sum/user.size();
		
		System.out.printf("%d개 과목합계 : %d점%n",user.size(),sum);
		System.out.printf("평균 : %.2f점%n",vrg);

			
			scan.close();
	}

}
