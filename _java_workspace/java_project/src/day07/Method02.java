package day07;

public class Method02 {
	
	//메서드 선언 위치

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* + - * / % 메서드를 생성
		 * main에서 호출하여 확인
		 */

		System.out.println("sum : "+sum(10,20));
		System.out.println("sub : "+sub(35,41));
		System.out.println("mul : "+mul(8,9));
		System.out.println("div : "+div(15,24));
		System.out.println("mod : "+mod(22,4));
	}

	//메서드 선언 위치
	//두 정수의 합을 알려주는 메서드 sum 
	public static int sum(int sum1,int sum2) {
		return sum1+sum2;
	}
	//두 정수의 차를 알려주는 메서드 sub
	public static int sub(int sub1,int sub2) {
		return sub1-sub2;
	}
	
	//두 정수의 곱을 알려주는 메서드 mul
	public static int mul(int mul1,int mul2) {
		return mul1*mul2;
	}
	
	//두 정수의 나눗셈을 알려주는 메서드 div
	public static double div(double div1, double div2) {
		return (double)div1/div2;
	}
	
	//두 정수의 나머지를 알려주는 메서드 mod 
	public static int mod(int mod1,int mod2) {
		return mod1%mod2;
	}
	
}
