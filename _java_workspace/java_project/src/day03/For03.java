package day03;

import java.util.Scanner;

public class For03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*약수 : 나누어서 떨어지는 수의 집합
		 *6의 약수 : 6/1=0 , 6/2=0 , 6/3=0 , 6/4=2 , 6/5=1 , 6/6=0
		 *6의 약수 : 1,2,3,6
		 */
		
		int num = 100;
		
		//num를 1~num까지 나눈 나머지가 0인 수를 출력
		for(int i=1; i<=num; i++) {
			if(num%i==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		//num1를 입력받아서 약수를 출력
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수를 입력해주세요. =>");
		int num1 = scan.nextInt();
		
		System.out.print(num1 + "의 약수 : ");
		
		for(int i=1; i<=num1; i++) {
			if(num1%i==0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
		scan.close();
	}

}
