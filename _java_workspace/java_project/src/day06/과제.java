package day06;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*숫자를 입력받아서 입력받은 숫자를 거꾸로 출력. 각자리의 합계 출력
		 * ex) 11456 =>65411 => 6+5+4+1+1 => 결과값 출력
		 * ex) 19874 =>47891 => 4+7+8+9+1 => 결과값 출력 
		 */
		
		Scanner scan = new Scanner(System.in);
		

		
		int[] num = new int[5];
		
		int sum = 0;
		
		System.out.print("숫자를 입력해주세요 =>");
		
		
		
		for(int i=0; i<num.length; i++) {
			
			
			num[i] = scan.nextInt();
			
			sum+= num[i];
	
		}
		System.out.print("거꾸로 출력된 값 : ");
		
		for(int i=num.length-1; i>=0; i--) {
			
			System.out.print(num[i]+" ");
		}
		System.out.println();
		System.out.println("각 자리의 합계 : " + sum);
	}

}
