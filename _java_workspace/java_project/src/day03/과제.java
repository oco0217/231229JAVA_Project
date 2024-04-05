package day03;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* up down 게임
		 * 
		 * 1~50까지의 랜덤한 수를 생성하여 맞추는 게임
		 * 컴퓨터가 랜덤수 하나를 생성 : 23
		 * 입력> 10
		 * up~!!
		 * 입력>20
		 * up~!!
		 *입력>
		 *down~!!
		 *입력> 23
		 *정답
		 *몇번째 횟수만에 정답
		 *횟수제한
		 */
		
		Scanner scan = new Scanner(System.in);
		
		
		int random = (int)(Math.random()*50+1);       //랜덤한 수 생성
		int out = 0;                                  //입력받는 값
		int count = 1;                                //입력한 횟수
		System.out.println("랜덤한 수가 생성되었습니다 ");
		
		while(true) {
			count ++;
			System.out.println("입력 > ");
			out = scan.nextInt();
			if(out==random) {
				System.out.printf("축하합니다! %d회 만에 맞추셨습니다.정답입니다.",count);
				break;
			}else if(out<random) {
				System.out.println("up");			
			}else if(out>random){
				System.out.println("down");			
			}
		}
		scan.close();
	}
}
