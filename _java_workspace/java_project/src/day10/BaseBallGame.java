package day10;

import java.util.Scanner;

import day08.Mthod07_Ex02;

public class BaseBallGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 야구게임을 메서드화 사용자번호는 직접 입력 번호는 랜덤 생성(1~9, 중복x) 중복안되게 하는 메서드 isContain을 호출하여 사용
		 */

		Scanner scan = new Scanner(System.in);
		int comNum[] = new int[3];
		int myNum[] = new int[3];
		
		check(comNum);
		
		for(int a : comNum) {
			System.out.print(a+ " ");
		}
		System.out.println();

		// 사용자 번호 입력
		while(strike(comNum,myNum)!=3) {
			System.out.println("숫자 입력 => ");
			String myStr = scan.next();
			String[] myNumStr = myStr.split("");
			for(int i=0; i<myNum.length; i++) {
				myNum[i] = Integer.parseInt(myNumStr[i]);
			}
			if(strike(comNum,myNum)==0&&ball(comNum,myNum)==0) {
				System.out.println("아웃입니다.");
			}else {
			System.out.println("스트라이크 :" + strike(comNum,myNum));
			System.out.println("볼 : " + ball(comNum,myNum));
			}
		}

		// 결과 출력
		System.out.println("축하합니다! 야구게임에 승리하였습니다.!");

		scan.close();
	}

	// 랜덤으로 배열을 중복되지 않게 생성
	// Method7의 isContain 가져와서 사용

	public static void check(int[] arr) {
		int random=0;
		//Mthod07_Ex02.isContain(arr, random);
		int cnt = 0;
		while (cnt < arr.length) {
			random = (int) (Math.random() * 9) + 1;
			if (!Mthod07_Ex02.isContain(arr, random)) {
				arr[cnt] = random;
				cnt++;
			}
		}
	}

	// 스트라이크 개수를 카운트하는 메서드
	/*
	 * com, myNum를 주고 번호와 위치가 일치하면 count하는 메서드 리턴타입 : int couont를 리턴
	 */
	public static int strike(int[] com, int[] user) {
		int count = 0;
		for (int i = 0; i < user.length; i++) {
			if (com[i] == user[i]) {
				count++;
			}
		}
		return count;
	}

	// 볼 캐수를 카운트한느 메서드
	// **com, myNum를 주고 번호만 일치하면 count하는 메서드
	// 리턴 타입 : int count를 리턴
	
	public static int ball(int[]com, int[] user) {
		int b =0;
		for(int i=0; i<user.length; i++) {
			for(int j=0; j<com.length; j++) {
				if(com[i]==user[j]) {
					b++;
					if(com[i]==user[i]) {
						b--;
					}
				}
			}
		}
		return b;
	}
	

}
