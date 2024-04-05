package day08;

public class Method05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isPrime(7));
		
		//2부터 100까지의 소수를 출력하고, 소수의 합계를 출력
		
		int sum = 0;
		for(int i=2; i<=100; i++) {
			if(isPrime(i)) { //true
				sum+=i;
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println("2~100까지의 소수 합계 :" + sum);

	}

	/* 
	 * 정수 하나가 주어지면 이 정수가 소수인지 아닌지 판별(true /false) 리턴타입 : boolean 매개변수 : int num 메서드명
	 * : so
	 * 
	 */
	public static boolean isPrime(int num1) {

		int count = 0;

		for (int i = 1; i <= num1; i++) {

			if (num1 % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			return true;
		} else {
			return false;
		}
	}

}
