package day08;

public class Method07_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 로또 번호 생성
		 */

		int lotto[] = new int[7]; // 당첨번호
		int user[] = new int[6];

		randomArray(lotto); // 로또번호 채우기
		randomArray(user); // 유저번호 채우기
		System.out.println("---당첨번호---");
		printArray(lotto);
		System.out.println("---사용자 번호---");
		printArray(user);
		System.out.println("---당첨 확인---");
		lottoRank(user,lotto);
		
	}

	/*
	 * 배열을 매개변수로 받아 1~45까지 랜덤수를 채워서 생성.(중복 불가능) 매개변수 : 배열 => int arr[] random ==
	 * arr[i] false면 추가
	 */
	public static void randomArray(int arr[]) {
		// 배열을 받아서 배열에 랜덤 값 중복없이 채우기

		int cnt = 0; // while에서 i역할을 할 변수
		while (cnt < arr.length) {
			int r = (int) (Math.random() * 7) + 1;
			if (!isContain(arr, r)) {
				arr[cnt] = r;
				cnt++;
			}
		}
	}

	/*
	 * 배열을 매개변수로 받아 배열을 출력하는 메서드 보너스 번호에 []출력
	 */

	public static void printArray(int arr[]) {


		for (int i = 0; i < arr.length; i++) {

			if (i == 6) {
				System.out.printf("[%d]", arr[i]);
			}else {
				System.out.print(arr[i] + " ");
			}


		}
		System.out.println();
	}

	/*
	 * 중복 확인 메서드 매개변수 : 배열, 값 있으면 true, 없으면 false 리턴 타입 : boolean 메서드명 : isContain
	 */
	public static boolean isContain(int arr[], int random) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == random) {
				return true;
			}
		}

		return false;
	}

	// 등수 확인 메서드
	/*
	 * 매개변수 lotto[] / user[] 리턴타입 : int 메서드명 : lottoRank 
	 * --당첨기준-- 
	 * user번호 기준으로 6개 일치 : 1등  
	 * 5개 일치 + 보너스 번호 : 2등 
	 * 5개 일치 :  3등 
	 * 4개 일치 : 4등 
	 * 3개 일치 : 5등
	 */
	public static void lottoRank(int[] user, int[] lotto) { 
		
		int cnt = 0; // while에서 i역할을 할 변수
		int bonus =0;
			for(int i=0; i<user.length; i++) {
				
				if (isContain(user, lotto[i])) {
					
					cnt++;
					
					if(lotto[lotto.length-1]==user[i]) {
						bonus ++;
					}
				}
			}
			if(cnt==6 &&bonus==0) {
				System.out.println("1등입니다.");	
			}else if(cnt==5 &&bonus==1) {
				System.out.println("2등입니다.");
			}else if(cnt==5 && bonus==0) {
				System.out.println("3등입니다.");
			}else if(cnt==4) {
				System.out.println("4등입니다.");
			}else if(cnt==3) {
				System.out.println("5등입니다.");
			}else {
				System.out.println("꽝입니다."); 
				
			}
	}
}
