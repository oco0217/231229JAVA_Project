package day03;

import java.util.Scanner;

public class 과제_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//랜덤수 생성
		int random = (int)(Math.random()*50)+1;
		System.out.println("컴퓨터가 랜덤수를 생성하였습니다. 입력> ");
		int num = sc.nextInt(); //사용자 입력값
				int count = 0; //횟수
				while(num != random) {
					System.out.println("입력>");
					num = sc.nextInt();
					count++;
					if(num>random) {
						System.out.println("down" + count + "회");
						num = sc.nextInt();
						
					}else if(num<random) {
						System.out.println("up" + count + "회");
						num = sc.nextInt();
						
					}else {
						System.out.println("정답입니다!" + count + "회");
					}
					
				}
		sc.close();
	}

}
