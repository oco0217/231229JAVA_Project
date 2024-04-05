package day02;

import java.util.Scanner;

public class IF02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*국어,영어,수학 점수를 입력받아
		 * 합계,평균,평가를 출력
		 * 평가는
		 * 평균이 90이상이면 A
		 * 평균이 80이상이면 B
		 * 평균이 70이상이면 C
		 * 나머지는 D
		 * 입력값이 0보다 작거나 100보다 크면 잘못된 값
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.print("국어 점수를 입력해주세요 > ");
		int kor = scan.nextInt();
		System.out.print("수학 점수를 입력해주세요 > ");
		int math = scan.nextInt();
		System.out.print("영어 점수를 입력해주세요 > ");
		int eng = scan.nextInt();
		
		int sum = kor+math+eng;
		double evg = sum/3.0;
		System.out.println("합계  : " + sum + "  평균 " + evg);
		
		if(100<evg || evg<0) {
			System.out.println("잘못된 값입니다. 다시 입력하여 주세요");
		}else if(evg>=90) {
			System.out.println("평균 90점 이상이네요 A입니다.");
		}else if(evg>=80){
			System.out.println("평균 80점 이상이네요. B입니다. ");
		} else if(evg>=70){
			System.out.println("평균 70점 이상이네요.C입니다.");
		} else {
			 System.out.println("평균 70점미만이네요. D입니다.");
		}
		scan.close();
	}
}
