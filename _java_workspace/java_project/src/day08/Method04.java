package day08;

public class Method04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 최대공약수, 최소공배수 리턴
		 * 
		 */

		int gcd = max(12,8);
		System.out.println("최대 공약수 : " + max(12, 8)); 

		System.out.println("최소 공배수 : " + min(15, 30)); 
		
		int lim2 = min2(15,30);
		
		System.out.println(lim2);
	}

	/*
	 * 두 정수를 매개변수로 받아, 최대 공약수를 리턴하는 메서드
	 * 매개변수 : 두 정수 (int num1, int num2)
	 * 리턴타입 : 최대공약수 (int)
	 * 메서드명 : max
	 */

	public static int max(int max1, int max2) {
		int sum = 0; //공약수가 들어올 변수

		for (int i = 1; i <= max1; i++) {
			if (max1 % i == 0 && max2 % i == 0) {
				sum = i; //최대공약수
			}
			
		}
		return sum;
	}

	/*
	 * 두 정수를 매개변수로 받아, 최소공배수를 리턴하는 메서드
	 * 매개변수 : 두 정수(int num1, int num2)
	 * 리턴타입 : 최소공배수(int)
	 * 메서드명 : min
	 * 
	 * 
	 */
	public static int min(int min1, int min2) {
		int sum = 0;

		for (int i = min1; ; i += min1) {
			if (i % min1 == 0 && i % min2 == 0) {
				sum = i;
				return i;
				//break; //return을 해주면 for문이 자체적으로 끝나기때문에 break문을 굳이 안넣어도 됌
			}
		}
	}
	
	//최소공배수 규칙 : 두 수를 곱한 후 최대 공약수로 나누면 최소공배수.
	// 10 15 = 150/5 = 30 
	//메서드안에서 메서드를 호출하여 리턴값을 사용
	public static int min2(int num1,int num2) {
		return num1 * num2 / max(num1,num2);
	}

}
