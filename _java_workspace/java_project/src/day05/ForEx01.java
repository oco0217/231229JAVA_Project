package day05;

import java.util.Scanner;

public class ForEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*소수 : 약수가 1과 자기자신만의 수를 가지는 수를 소수라고 한다.
		 *소수 : 3, 5, 7 ,11 ,13, 17, 19 ...
		 *소수의 약수 (1, 나자신) =>약수의 개수가 2개다.
		 *숫자 하나를 입력 받아서 해당 수가 소수인지 아닌지 판별
		 *num = 13
		 *소수입니다.
		 *num = 12
		 *소수가 아닙니다.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("수를 입력해주세요 => ");
		int num = scan.nextInt();
		
		int count = 0;
		
		System.out.print(num+"의 약수 :");
		for(int i=1; i<=num; i++) {
			
			if(num%i==0) {
				count++;
				System.out.print(i + " ");
				}
			}
		System.out.println();
		
		if(count==2) {
			System.out.println("소수 입니다.");
		}else {
			System.out.println("소수가 아닙니다.");
		}
		
		
		//2~100까지의 소수를 모두 출력
		//2중for문 2~100까지 

		scan.close();
		
	}

}
