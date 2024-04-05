package day08;

public class Method07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 메서드로 이용하여 로또 번호 생성
		 * 
		 */

		int lotto[] = new int[7]; // 당첨번호
		int user[] = new int[6]; // 사용자 로또 번호(자동)

		printArray(randomArray(lotto));
		
		System.out.println();
		
		printArray(randomArray(user));
		
	}

	/*
	 * 배열을 매개변수로 받아 1~45까지 랜덤수를 채워서 생성.
	 */

	public static int[] randomArray(int Array[]) {

		for (int i = 0; i < Array.length; i++) {

			int random = (int) (Math.random() * 45) + 1;
			Array[i] = random;
			
		
		}return Array;
	}

	/*
	 * 배열을 매개변수로 받아 배열을 출력하는 메서드
	 */

	public static void printArray(int Array[]) {

		for (int i = 0; i < Array.length; i++) {

			System.out.print(Array[i] + " ");
		}
	}

	/*
	 * 중복 확인 메서드 매개변수 : 배열, 값 
	 * 있으면 true, 없으면 false
	 */

	public static int[] same(int[] Array,int num) {

		for(int i=0; i<Array.length; i++) {
			for(int j=0; j<i; j++) {
				
				if(Array[i]==Array[j]) {
				}
			}
		}
		return Array;
	}

}
